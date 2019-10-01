package com.app.milipictures.ui

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.app.milipictures.R
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity()/*, NavigationView.OnNavigationItemSelectedListener*/ {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setupToolbar()
        setupNavigationDrawer()
    }

    private fun setupToolbar() {
        toolbar.title = resources.getString(R.string.app_name)
        setSupportActionBar(toolbar)
    }

    private fun setupNavigationDrawer() {
        val actionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer){}

        drawer_layout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        val navController = Navigation.findNavController(this, R.id.fragment)
        navigation_view.setupWithNavController(navController)
    }
}
