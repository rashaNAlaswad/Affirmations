package com.rns.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rns.affirmations.adapter.ItemAdapter
import com.rns.affirmations.data.Datasource
import com.rns.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ItemAdapter(Datasource().loadAffirmations())
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
    }
}