package com.example.androidcourses2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.androidcourses2022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        val controller =
            (supportFragmentManager.findFragmentById(R.id.host_fragment) as NavHostFragment)
                .navController

        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(
                R.id.homeFragment,
                R.id.chatFragment,
                R.id.settingsFragment,
                R.id.gamesFragment,
                R.id.profileFragment
            ),
            fallbackOnNavigateUpListener = ::onSupportNavigateUp
        )

        findViewById<Toolbar>(androidx.appcompat.R.id.action_bar)
            .setupWithNavController(controller, appBarConfiguration)

        binding?.bnvMain?.setupWithNavController(controller)
    }
}