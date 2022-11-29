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

    var isAllFieldsChecked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // register buttons with their proper IDs.
        bProceed = findViewById(R.id.signUpButton)
//        bCancel = findViewById(R.id.cancelButton)

        // register all the EditText fields with their IDs.
        etName = findViewById(R.id.nameSignUpInputEditText)
        etEmail = findViewById(R.id.emailSignUpInputEditText)
        etPassword = findViewById(R.id.passwordSignUpInputEditText)

        // handle the PROCEED button
        bProceed.setOnClickListener(object : DialogInterface.OnClickListener() {
            fun onClick(v: View?) {

                // store the returned value of the dedicated function which checks
                // whether the entered data is valid or if any fields are left blank.
                isAllFieldsChecked = CheckAllFields()

                // the boolean variable turns to be true then
                // only the user must be proceed to the activity2
                if (isAllFieldsChecked) {
                    val i = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(i)
                }
            }
        })

        // function which checks all the text fields
        // are filled or not by the user.
        // when user clicks on the PROCEED button
        // this function is triggered.
        private fun CheckAllFields(): Boolean {
            if (etName!!.length() == 0) {
                etFirstName!!.error = "This field is required"
                return false
            }
            }
            if (etEmail!!.length() == 0) {
                etEmail!!.error = "Email is required"
                return false
            }
            if (etPassword!!.length() == 0) {
                etPassword!!.error = "Password is required"
                return false
            }

            // after all validation return true.
            return true
        }
    }

        // if user presses the cancel button then close the
        // application or the particular activity.
//        bCancel.setOnClickListener(object : View.OnClickListener() {
//            fun onClick(v: View?) {
//                finish()
//                System.exit(0)
//            }
//        })
    }

    private fun finish() {
        TODO("Not yet implemented")
    }

    class SignUpViewModelFactory() : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return SignUpViewModel() as T        }
    }
}