package com.example.loginandregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginandregistration.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    companion object {
        // the values to send in intents are called Extras
        // and have the EXTRA_BLAH format for naming the key
        val EXTRA_USERNAME = "username"
        val EXTRA_PASSWORD = "password"
    }

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // launch the registration activity
        binding.textViewRegistrationSignup.setOnClickListener {
            // 1. Create an Intent object with the current activity
            // and the destination activity's class
            val registrationIntent = Intent(this, RegistrationActivity::class.java)
            // 2. optionally add information to send with the intent
            // key-value pairs just like with Bundles
            registrationIntent.putExtra(EXTRA_USERNAME, binding.editTextLoginUsername.text.toString())
            registrationIntent.putExtra(EXTRA_PASSWORD, binding.editTextLoginPassword.text.toString())
            // 3. launch the new activity using the intent
            startActivity(registrationIntent)
        }
    }

//    private fun setListeners() {
//        val soundBoardListener = SoundBoardListener()
//        binding.buttonMainA.setOnClickListener(soundBoardListener)
//    }
//
//    private fun initializeSoundPool() {
//
//        this.volumeControlStream = AudioManager.STREAM_MUSIC
//        soundPool = SoundPool(10, AudioManager.STREAM_MUSIC, 0)
////        soundPool.setOnLoadCompleteListener(SoundPool.OnLoadCompleteListener { soundPool, sampleId, status ->
////           // isSoundPoolLoaded = true
////        })
//        aNote = soundPool.load(this, R.raw.scalea, 1)
////        playSong = soundPool.load() // don't know what to do with this
//
//        // maps  use key-value pairs (just like the Bundle)
//        noteMap["Bb"] = bbNote
//    }
////
//    private inner class SoundBoardListener : View.OnClickListener {
//        override fun onClick(v: View?) {
//            when(v?.id) {
//                R.id.button_main_a -> playNotes(aNote)
//            }
//        }
//    }
}