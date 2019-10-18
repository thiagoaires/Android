package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    // The current word
    var word = ""

    // The current score
    var score = 0

    // The list of words - the front of the list is the next word to guess
    lateinit var wordList: MutableList<String>

    override fun onCleared() {
        super.onCleared()

        Log.i("GameViewModel", "GameViewModel DESTROYEEED!")
    }
}