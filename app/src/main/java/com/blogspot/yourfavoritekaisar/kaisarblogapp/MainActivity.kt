package com.blogspot.yourfavoritekaisar.kaisarblogapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutwebview.settings.javaScriptEnabled
        layoutwebview.loadUrl("https://yourfavoritekaisar.blogspot.com/")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when (item?.itemId) {

        R.id.profilWeb -> {
            layoutwebview.loadUrl("https://yourfavoritekaisar.blogspot.com/2018/03/profil-aya.html")
            true
        }

        R.id.about -> {
            layoutwebview.loadUrl("https://yourfavoritekaisar.blogspot.com/2018/11/blog-post.html")
            true

        }
        else -> {
            super.onOptionsItemSelected(item)
        }

    }
}
