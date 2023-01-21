package com.agh_navigation_component_android_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private val args: WelcomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewUsername: TextView = view.findViewById(R.id.text_view_username)
        textViewUsername.text = args.username

        val textViewPassword: TextView = view.findViewById(R.id.text_view_password)
        textViewPassword.text = args.password

        val buttonOk: Button = view.findViewById(R.id.button_ok)
        buttonOk.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}