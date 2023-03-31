package com.example.onlinestore.activity

import android.content.Context
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley


object VolleySingleton{
    //creating the null queue
    var volleyRequestQueue:RequestQueue?=null
    fun initializeRequestQueue(context: Context)
    {
        volleyRequestQueue= Volley.newRequestQueue(context)
    }
}