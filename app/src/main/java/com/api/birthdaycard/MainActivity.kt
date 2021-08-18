package com.api.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun cardView(view: View) {
        val name = etName.editableText.toString()
        val intent = Intent(this, CardActivity::class.java)
        intent.putExtra(CardActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}