package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import android.widget.TextView
import com.example.myapplication.R

class NotificationFragment: Fragment(R.layout.fragment_notification) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView2)

        textView.text = NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()

    }

}