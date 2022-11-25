package com.example.eventhub.feature_onboarding.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LoginViewModel() : ViewModel() {
        class LoginViewModelFactory() : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(LoginViewModel: Class<T>): T {
                return LoginViewModel() as T        }
        }
    }