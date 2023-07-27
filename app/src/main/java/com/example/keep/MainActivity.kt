package com.example.keep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.keep.ViewModel.UserViewModel
import com.example.keep.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    private val userViewModel: UserViewModel by inject()
    private lateinit var enteredEmail: EditText
    private lateinit var enteredPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root
        enteredEmail = binding.email
        enteredPassword = binding.password
        setContentView(view)

        binding.submit.setOnClickListener {
            startActivity(Intent(this@MainActivity, com.example.keep.ListNotes::class.java))
            }
        }
    }

