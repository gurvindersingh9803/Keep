package com.example.keep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.keep.Repository.UserRepository
import com.example.keep.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    private val userRepository: UserRepository by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root
        setContentView(view)

        binding.submit.setOnClickListener(View.OnClickListener {
            userRepository.printSomeInfo()
        })

    }
}