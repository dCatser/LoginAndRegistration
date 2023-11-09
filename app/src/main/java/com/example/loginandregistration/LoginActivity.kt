package com.example.loginandregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//import com.example.loginandregistration.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // launch the registration activity
        binding.textViewLoginSignup.setOnClickListeners {
            // 1. Create an Intent object with the current activity
            // and the destination activity's class
            val registrationIntent = Intent()
        }
    }

//    private fun setListeners() {
//        val soundBoardListener = SoundBoardListener()
//        binding.buttonMainA.setOnClickListener(soundBoardListener)
//    }
//
//    private inner class SoundBoardListener : View.OnClickListener {
//        override fun onClick(v: View?) {
//            when(v?.id) {
//                R.id.button_main_a -> playNotes(aNote)
//            }
//        }
//    }
}