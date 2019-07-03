package com.gmail.akakom16.eko.ankolayout


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayout {
            orientation = LinearLayout.VERTICAL

            editText {
                hint = "Name"
            }.lparams(width = matchParent, height = wrapContent)

            button("Say Hello") {
            }.lparams(width = matchParent, height = wrapContent)
        }
        linearLayout {
            orientation = LinearLayout.VERTICAL

            val myEdt = editText {
                hint = "Name"
            }.lparams(width = matchParent, height = wrapContent)

            button("Say Hello") {
                onClick {
                    val message = if (myEdt.text.toString().isBlank()) {
                        "Hello world"
                    } else {
                        "Hello ${myEdt.text}"
                    }

                    UI {
                        toast(message)
                    }
                }
            }.lparams(width = matchParent, height = wrapContent)
        }
    }
}
