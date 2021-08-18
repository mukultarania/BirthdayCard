package com.api.birthdaycard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card.*

class CardActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        supportActionBar?.hide()
        val name = intent.getStringExtra(NAME_EXTRA)
        name_extra.text = "Happy Birthday "+name

    }
}