package com.example.keep.ViewModel
import android.widget.EditText
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    fun validateForm(emailEntered: EditText, passwordEntered: EditText){
3
        if(emailEntered.text.isEmpty()){
            emailEntered.error = "Please enter email fields!!"
        }
        if(passwordEntered.text.isEmpty()){
            passwordEntered.error = "Please enter valid password!!"
        }


    }
}