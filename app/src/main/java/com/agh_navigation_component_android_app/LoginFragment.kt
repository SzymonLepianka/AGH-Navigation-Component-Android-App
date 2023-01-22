package com.agh_navigation_component_android_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment(R.layout.fragment_login) {

    // sets up the fragment's views and their interactions
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val confirmButton: Button = view.findViewById(R.id.button_confirm)
        confirmButton.setOnClickListener {

            // gets the text from the EditText fields
            val usernameEditText: EditText = view.findViewById(R.id.edit_text_username)
            val usernameString = usernameEditText.text.toString()
            val passwordEditText: EditText = view.findViewById(R.id.edit_text_password)
            val passwordString = passwordEditText.text.toString()

            // this method name is generated from the ID of action in NavGraph
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(
                usernameString, passwordString
            )

            // move to another fragment
            findNavController().navigate(action)
        }
    }

}