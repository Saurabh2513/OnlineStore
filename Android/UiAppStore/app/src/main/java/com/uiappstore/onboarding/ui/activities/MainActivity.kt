package com.uiappstore.onboarding.ui.activities

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Website.URL
import android.widget.MediaController
import androidx.databinding.DataBindingUtil
import com.uiappstore.R
import com.uiappstore.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch {
            initVideoView()        }

    }
    private fun initVideoView()
    {
        val path:String="Android.Resources"
       val uri=Uri.parse(path)
        binding.video.setVideoURI(uri)
        val mediaController=MediaController(this)
        binding.video.setMediaController(mediaController)
    }

}