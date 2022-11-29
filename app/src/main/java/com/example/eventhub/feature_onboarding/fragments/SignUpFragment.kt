package com.example.eventhub.feature_onboarding.fragments

import android.os.Bundle
import android.util.Log
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.navigation.fragment.findNavController
import com.example.eventhub.R
import com.example.eventhub.databinding.FragmentSignupBinding
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SignUpFragment : Fragment() {

private var _binding: FragmentSignupBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      _binding = FragmentSignupBinding.inflate(inflater, container, false)



      return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.wantToLogin.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        setUpButton()
    }

    private fun setUpButton(){
        binding.signUpButton.setOnClickListener{ sendDataToServer()}
    }

    private fun sendDataToServer() {
        if(validateForm()){
            val dataStr ="Name: ${binding.nameSignUpInputEditText.text.toString()},"+
                    "Email: ${binding.emailSignUpInputEditText.text.toString()},"+
                    "Password: ${binding.passwordSignUpInputEditText.text.toString()}"
            Log.i("data sent",dataStr)

        Snackbar.make(binding.root , getString(R.string.form_snackbar_msg_success), Snackbar.LENGTH_LONG)
            .setAction(getString(R.string.form_snackbar_action)){ activity?.finish()}
            .show()
    }}

    private fun validateForm(): Boolean {
        var isValid =true
        with(binding){
            if(nameSignUpInputEditText.text.toString().isBlank()){
                isValid = false
                nameSignUpInputLayout.error = getString(R.string.required)
            }
        }
        return isValid
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}