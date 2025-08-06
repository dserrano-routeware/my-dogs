package com.martserra.mydogs.doglist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.martserra.mydogs.databinding.ActivityDogListBinding
import com.martserra.mydogs.model.DogListViewModel

class DogListActivity : AppCompatActivity() {

    private val dogListViewModel: DogListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityDogListBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val dogRecycler = binding.dogRecycler
        dogRecycler.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val dogAdapter = DogAdapter()
        dogRecycler.adapter = dogAdapter

        dogListViewModel.dogList.observe(this) {
            dogList -> dogAdapter.submitList(dogList)
        }
    }
}