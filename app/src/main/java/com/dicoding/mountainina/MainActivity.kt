package com.dicoding.mountainina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMountain: RecyclerView
    private var list: ArrayList<Mountain> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMountain = findViewById(R.id.rv_mountain)
        rvMountain.setHasFixedSize(true)

        list.addAll(MountainData.listData)
        showRecyclerList()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.icn_about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun showRecyclerList() {
        rvMountain.layoutManager = LinearLayoutManager(this)
        val listMountainAdapter = ListMountainAdapter(list)
        rvMountain.adapter = listMountainAdapter

        listMountainAdapter.setOnItemClickCallback(object : ListMountainAdapter.OnItemClickCallback {
            override fun onItemClicked(data : Mountain) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                with(intent) {
                    val data_name = data.name
                    val data_detail = data.detail
                    val data_photo = data.photo

                    putExtra(DetailActivity.EXTRA_MOUNTAIN_NAME, data_name)
                    putExtra(DetailActivity.EXTRA_MOUNTAIN_DETAIL, data_detail)
                    putExtra(DetailActivity.EXTRA_MOUNTAIN, data_photo)

                    startActivity(intent)
                }

            }
        })
    }
}