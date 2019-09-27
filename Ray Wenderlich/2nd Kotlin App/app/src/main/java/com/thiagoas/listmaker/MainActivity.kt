package com.thiagoas.listmaker

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiagoas.listmaker.adapter.ListSelectionRecyclerViewAdapter
import com.thiagoas.listmaker.sharedPreferences.ListDataManager
import com.thiagoas.listmaker.sharedPreferences.TaskList

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_LIST_KEY = "intent_list_key"
    }

    lateinit var listRecyclerView: RecyclerView

    val listDataManager: ListDataManager = ListDataManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lists = listDataManager.readList()
        listRecyclerView = findViewById(R.id.lists_recyclerview)
        listRecyclerView.layoutManager = LinearLayoutManager(this)
        listRecyclerView.adapter = ListSelectionRecyclerViewAdapter(lists)

        fabAddList.setOnClickListener{
            showDialog()
        }
    }

    private fun showDialog(){
        val titleDialog = getString(R.string.name_of_list)
        val positiveButtonDialog = getString(R.string.create_list)

        val etListContent = EditText(this)
        etListContent.inputType = InputType.TYPE_CLASS_TEXT

        val builder = AlertDialog.Builder(this)
        builder.setTitle(titleDialog)
        builder.setView(etListContent)

        builder.setPositiveButton(positiveButtonDialog, {dialog,  i ->
            val newListItem = TaskList(etListContent.text.toString())
            val recyclerAdapter = listRecyclerView.adapter as ListSelectionRecyclerViewAdapter
            recyclerAdapter.addList(newListItem)
            dialog.dismiss()

        })
        builder.create().show()
    }

    private fun openListDetail(list: TaskList){
        val intentListDetail = Intent(this, ListDetailActivity::class.java)
        intent.putExtra(INTENT_LIST_KEY, list)
        startActivity(intentListDetail)
    }
}
