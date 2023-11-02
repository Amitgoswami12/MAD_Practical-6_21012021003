package com.example.mad_practical_6_21012021003

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.mad_practical_6_21012021003.databinding.ActivityMainBinding
import kotlinx.coroutines.NonCancellable.start


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonPlay: FloatingActionButton = findViewById(R.id.playbtn)
        buttonPlay.setOnClickListener {
            playPause()
        }

        val buttonStop: FloatingActionButton = findViewById(R.id.stop_btn)
        buttonStop.setOnClickListener {
            stop()
        }
    }



    fun playPause(){
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply { startService(this) }
    }
    fun stop(){
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply { stopService(this) }

    }
}
