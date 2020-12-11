package com.example.newapplication.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.newapplication.R

class RandomFragment: Fragment(R.layout.fragment_random) {
    private lateinit var button2: Button
    private lateinit var textview4: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button2 = view.findViewById(R.id.button2)
        textview4 = view.findViewById(R.id.textView4)

        button2.setOnClickListener{

            textview4.text = "Objective reached!......I couldn't come up with anything worthwhile so it's just this -_-"

     }
    }
}