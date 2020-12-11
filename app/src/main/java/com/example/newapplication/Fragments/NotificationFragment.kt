package com.example.newapplication.Fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.newapplication.R

class NotificationFragment: Fragment(R.layout.fragment_notification) {
   private lateinit var textview: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textview = view.findViewById(R.id.textView2)

        textview.text = NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()



    }
}