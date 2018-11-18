package com.ricardogwill.tictactoe
// This app was designed by Ricky W.

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addOnClickListeners()

    }

    override fun onClick(v: View?) {

        count++

        // Not necessary, but I'll leave it.
        if (count == 10) {
            count = 0;
        }


        if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
//            toast("This is an odd number")
            when (v) {
                b1 -> {b1.setText("X"); b1.isClickable = false}
                b2 -> {b2.setText("X"); b2.isClickable = false}
                b3 -> {b3.setText("X"); b3.isClickable = false}
                b4 -> {b4.setText("X"); b4.isClickable = false}
                b5 -> {b5.setText("X"); b5.isClickable = false}
                b6 -> {b6.setText("X"); b6.isClickable = false}
                b7 -> {b7.setText("X"); b7.isClickable = false}
                b8 -> {b8.setText("X"); b8.isClickable = false}
                b9 -> {b9.setText("X"); b9.isClickable = false}
                else -> toast("There is some problem with adding an X.")
            }

        } else if (count == 0 || count == 2 || count == 4 || count == 6 || count == 8) {
//            toast("This is an even number")
            when (v) {
                b1 -> {b1.setText("O"); b1.isClickable = false}
                b2 -> {b2.setText("O"); b2.isClickable = false}
                b3 -> {b3.setText("O"); b3.isClickable = false}
                b4 -> {b4.setText("O"); b4.isClickable = false}
                b5 -> {b5.setText("O"); b5.isClickable = false}
                b6 -> {b6.setText("O"); b6.isClickable = false}
                b7 -> {b7.setText("O"); b7.isClickable = false}
                b8 -> {b8.setText("O"); b8.isClickable = false}
                b9 -> {b9.setText("O"); b9.isClickable = false}
                else -> toast("There is some problem with adding an O.")
            }
        } else {
            toast("There is some problem.")
        }

        if (count == 9) {
            winTV.setText("Tie!")
        }

        findWinner()

    }

    fun addOnClickListeners() {
        b1.setOnClickListener(this)
        b2.setOnClickListener(this)
        b3.setOnClickListener(this)
        b4.setOnClickListener(this)
        b5.setOnClickListener(this)
        b6.setOnClickListener(this)
        b7.setOnClickListener(this)
        b8.setOnClickListener(this)
        b9.setOnClickListener(this)

        startB.setOnClickListener() {
            b1.setText("")
            b2.setText("")
            b3.setText("")
            b4.setText("")
            b5.setText("")
            b6.setText("")
            b7.setText("")
            b8.setText("")
            b9.setText("")
            winTV.setText("")
            b1.isClickable = true
            b2.isClickable = true
            b3.isClickable = true
            b4.isClickable = true
            b5.isClickable = true
            b6.isClickable = true
            b7.isClickable = true
            b8.isClickable = true
            b9.isClickable = true
            count = 0
        }
    }

    fun findWinner() {

        if (
            b1.text == "X" && b2.text == "X" && b3.text == "X" ||
            b4.text == "X" && b5.text == "X" && b6.text == "X" ||
            b7.text == "X" && b8.text == "X" && b9.text == "X" ||
            b1.text == "X" && b4.text == "X" && b7.text == "X" ||
            b2.text == "X" && b5.text == "X" && b8.text == "X" ||
            b3.text == "X" && b6.text == "X" && b9.text == "X" ||
            b1.text == "X" && b5.text == "X" && b9.text == "X" ||
            b3.text == "X" && b5.text == "X" && b7.text == "X"
                ) {
            winTV.setText("X Wins!")
            disableButtons()
        } else if (
            b1.text == "O" && b2.text == "O" && b3.text == "O" ||
            b4.text == "O" && b5.text == "O" && b6.text == "O" ||
            b7.text == "O" && b8.text == "O" && b9.text == "O" ||
            b1.text == "O" && b4.text == "O" && b7.text == "O" ||
            b2.text == "O" && b5.text == "O" && b8.text == "O" ||
            b3.text == "O" && b6.text == "O" && b9.text == "O" ||
            b1.text == "O" && b5.text == "O" && b9.text == "O" ||
            b3.text == "O" && b5.text == "O" && b7.text == "O"
                ) {
            winTV.setText("O Wins!")
            disableButtons()
        }

    }

    fun disableButtons() {
        b1.isClickable = false
        b2.isClickable = false
        b3.isClickable = false
        b4.isClickable = false
        b5.isClickable = false
        b6.isClickable = false
        b7.isClickable = false
        b8.isClickable = false
        b9.isClickable = false
    }

}
