package com.thiagoas.listmaker.sharedPreferences

import android.os.Parcel
import android.os.Parcelable

class TaskList(
    val name: String,
    val tasks: ArrayList<String> = ArrayList<String>()
): Parcelable{
    constructor(source: Parcel) : this(
        source.readString(),
        source.readArrayList()
    )
}