package com.thiagoas.listmaker.sharedPreferences

import android.content.Context
import android.preference.PreferenceManager

class ListDataManager(val context: Context) {

    fun saveList(taskList: TaskList){
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context).edit()
        sharedPreferences.putStringSet(taskList.name, taskList.tasks.toHashSet())
        sharedPreferences.apply()
    }

    fun readList(): ArrayList<TaskList>{
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        val sharePreferencesAll = sharedPreferences.all
        val taskLists = ArrayList<TaskList>()
        for (shared in sharePreferencesAll){
            val itemList = shared.value as HashSet<String>
            val list = TaskList(shared.key, ArrayList(itemList))
            taskLists.add(list)
        }
        return taskLists
    }
}