package com.example.eventhub.feature_onboarding.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Surface
import androidx.compose.material.MaterialTheme
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.example.eventhub.R
import com.example.eventhub.databinding.ActivityOnboardingBinding
import java.lang.reflect.Modifier

class OnboardingActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_onboarding)
//    }

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}