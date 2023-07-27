package com.example.keep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.keep.databinding.ActivityListBinding

class ListNotes : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityListBinding.inflate(layoutInflater)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<Note>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(Note("Note " + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = NoteRecyclerView(data)

        // Setting the Adapter with the recyclerview
        binding.recyclerView.adapter = adapter
        setContentView(binding.root)



    }




}