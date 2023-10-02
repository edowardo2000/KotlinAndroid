package com.example.aplikasiandroidsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.aplikasiandroidsederhana.adapter.ArticleAdapter
import com.example.aplikasiandroidsederhana.model.Article

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setTitle("10 Model Indonesia");

        supportFragmentManager.beginTransaction()
            .replace(R.id.frmFragment, ListArtisFragment.newInstance("",""))
            .commit()

    }

    // Tombol untuk membuka halaman About
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, 1, 0, "About").apply {
            setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
            setOnMenuItemClickListener {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
                true
            }
        }
        return super.onCreateOptionsMenu(menu)
    }

}