package com.example.aplikasiandroidsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.setTitle("About Developer");

        findViewById<TextView>(R.id.txtNama).text="Nama : Edowardo "
        findViewById<TextView>(R.id.txtEmail).text="Email : edowardotan@gmail.com"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, 1, 0, "Back to Article").apply {
            setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
            setOnMenuItemClickListener {
                val intent = Intent(this@AboutActivity, MainActivity::class.java)
                startActivity(intent)
                true
            }

        }
        return super.onCreateOptionsMenu(menu)
    }
}