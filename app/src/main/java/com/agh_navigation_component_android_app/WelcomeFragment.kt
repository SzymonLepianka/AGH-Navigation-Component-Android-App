package com.agh_navigation_component_android_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    // access the arguments passed to the fragment when navigating to it
    private val args: WelcomeFragmentArgs by navArgs()

    // sets up the fragment's views and their interactions
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // sets the text of two TextView
        val textViewUsername: TextView = view.findViewById(R.id.text_view_username)
        textViewUsername.text = args.username
        val textViewPassword: TextView = view.findViewById(R.id.text_view_password)
        textViewPassword.text = args.password

        // sets up a button click listener that navigates back to the HomeFragment when clicked.
        val buttonOk: Button = view.findViewById(R.id.button_ok)
        buttonOk.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}