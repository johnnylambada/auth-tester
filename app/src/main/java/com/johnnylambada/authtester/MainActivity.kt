package com.johnnylambada.authtester

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.johnnylambada.authtester.tokenstore.TokenStoreFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logout.setOnClickListener {
            TokenStoreFactory.build(this).clear()
            finish()
        }
    }
}
