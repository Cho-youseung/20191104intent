package com.tjoeunit.a20191104intent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private var Intent.Action_Dal: Any
    get() {}

class MainActivity : AppCompatActivity() {

    phoneDialBin.setOnClickListener {

        var uri = Uri.parse( uriString.'tel:01032107776')
        var intent = (intent.Action_Dal.uri)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
