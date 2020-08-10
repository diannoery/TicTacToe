package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_tictoe_board.*


class tictoeBoard : AppCompatActivity() {
    var player=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tictoe_board)
        val player1Name = intent.getStringExtra("player1Name")
        namePlayer.text="$player1Name turn"
    }

    fun handleTicTacToe(view: View) {
        val player1Name = intent.getStringExtra("player1Name")
        val player2Name = intent.getStringExtra("player2Name")
        var buttonTurn =
            arrayOf(button1, button2, button3, button4, button5, button6, button7, button8, button9)
        for (i in buttonTurn.indices) {
            if (buttonTurn[i].tag == view.tag) {
                if (player == 0) {
                    buttonTurn[i].text = "X"
                    buttonTurn[i].isEnabled=false
                    namePlayer.text="$player1Name turn"
                    player = 1

                } else {
                    buttonTurn[i].text = "O"
                    buttonTurn[i].isEnabled=false
                    namePlayer.text="$player2Name turn"
                    player = 0

                }
            }
        }
    }
}