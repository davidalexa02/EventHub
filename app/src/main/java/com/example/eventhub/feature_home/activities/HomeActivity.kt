package com.example.eventhub.feature_home.activities

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.view.Surface
import android.widget.Button
import androidx.compose.material.MaterialTheme
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eventhub.R
import com.example.eventhub.commons.BaseActivity
import com.example.eventhub.databinding.ActivityHomeBinding
import com.example.eventhub.feature_home.fragments.HomeFragment
import com.example.eventhub.feature_home.fragments.RecyclerAdapter
import com.example.eventhub.feature_organiseevent.fragments.OrganiseEventFragment
import com.example.eventhub.feature_profile.fragments.ProfileFragment
import com.example.eventhub.feature_search.fragments.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.text.DateFormat
import java.util.*

class HomeActivity : BaseActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navController = findNavController(R.id.nav_host_fragment_home)
        val navView: BottomNavigationView = findViewById(R.id.bottomBar)
        navView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if(destination.id == R.id.OrganiseEventFragment) {
                navView.visibility = View.GONE
            } else {

                navView.visibility = View.VISIBLE
            }
        }
//        navView.setOnNavigationItemReselectedListener {
//            when (it.itemId) {
//                R.id.HomeItem -> {
//                    loadFragment(HomeFragment())
//                    return@setOnNavigationItemReselectedListener
//                }
//                R.id.SearchItem -> {
//                    loadFragment(SearchFragment())
//                    return@setOnNavigationItemReselectedListener
//                }
//                R.id.ProfileItem -> {
//                    loadFragment(ProfileFragment())
//                    return@setOnNavigationItemReselectedListener
//                }
//            }
//        }
    }

//    private  fun loadFragment(fragment: Fragment){
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.nav_host_fragment_home,fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle item selection
//        return when (item.itemId) {
//            R.id.HomeItem -> {
//                loadFragment()
//                true
//            }
//            R.id.SearchItem -> {
//                R.id.action_homeFragment_to_SearchFragment
//                true
//            }
//            R.id.ProfileItem -> {
//                R.id.action_homeFragment_to_profileFragment
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }


//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
}