package com.example.eventhub.feature_onboarding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eventhub.R
import com.example.eventhub.databinding.FragmentSignupBinding
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
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}