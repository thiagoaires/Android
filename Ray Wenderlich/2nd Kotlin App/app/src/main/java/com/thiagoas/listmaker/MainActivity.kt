package com.thiagoas.listmaker

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

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var listRecyclerView: RecyclerView

    var listTitles = arrayOf("tuto tooo", "tutti aoow", "androidTutorials")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listRecyclerView = findViewById(R.id.lists_recyclerview)
        listRecyclerView.layoutManager = LinearLayoutManager(this)
        listRecyclerView.adapter = ListSelectionRecyclerViewAdapter(listTitles)

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
            dialog.dismiss()
        })
        builder.create().show()
    }
}
