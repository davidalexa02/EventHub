package com.example.eventhub.feature_onboarding.viewmodels

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.eventhub.R


class SignUpViewModel(): ViewModel() {

    init {
        //logica
    }

    private fun finish() {
        TODO("Not yet implemented")
    }

    class SignUpViewModelFactory() : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return SignUpViewModel() as T        }
    }
}