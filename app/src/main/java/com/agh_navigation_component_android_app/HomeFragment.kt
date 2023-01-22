package com.agh_navigation_component_android_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {

    // sets up the fragment's views and their interactions
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loginButton: Button = view.findViewById(R.id.button_login)
        loginButton.setOnClickListener {

            // Creates an action that will navigate to the LoginFragment.
            // This method name is generated from the ID of action in NavGraph.
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()

            // move to second fragment
            findNavController().navigate(action)
        }
    }
}