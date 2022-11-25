package com.example.eventhub.feature_onboarding.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class SignUpViewModel(): ViewModel() {
    class SignUpViewModelFactory() : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(SignUpViewModel: Class<T>): T {
            return SignUpViewModel() as T        }
    }
}