package com.app.milipictures.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.app.milipictures.R
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        setSupportActionBar(toolbar)

        val navigationController = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupWithNavController(navigationView, navigationController)
        NavigationUI.setupActionBarWithNavController(this, navigationController, homeDrawerLayout)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            Navigation.findNavController(this, R.id.fragment),
            homeDrawerLayout
        )
    }
}
