package com.example.eventhub.feature_onboarding.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class OnboardingViewModel () : ViewModel() {

//         insert your logic here
        class OnboardingViewModelFactory() :
            ViewModelProvider.Factory {
            override fun <T : ViewModel> create(OnboardingViewModel: Class<T>): T {
                return OnboardingViewModel() as T        }
        }
}