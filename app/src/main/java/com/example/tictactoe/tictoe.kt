package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_tictoe.*

class tictoe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tictoe)
    }
    fun StartGame(view: View) {
        val intent= Intent(this,tictoeBoard::class.java)
        intent.putExtra("player1Name",player1Name.text.toString())
        intent.putExtra("player2Name",player2Name.text.toString())
        startActivity(intent)
    }
}