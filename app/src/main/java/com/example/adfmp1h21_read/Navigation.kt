package com.example.adfmp1h21_read

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

open class Navigation : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var toolbar: Toolbar

    fun init(
        drawerLayout: DrawerLayout,
        navigationView: NavigationView,
        toolbar: Toolbar,
        title: String
    ) {
        this.drawerLayout = drawerLayout
        this.navigationView = navigationView
        this.toolbar = toolbar
        this.navigationView.bringToFront()
        setSupportActionBar(toolbar)
        var toogle =
            ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
        navigationView.setNavigationItemSelectedListener(this)
        supportActionBar!!.title = title;
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(getResources().getColor(R.color.blue)))
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.main -> {
                startActivity(Intent(this, MainActivity::class.java))
                return true
            }
            R.id.statistics -> {
                startActivity(Intent(this, StatisticsActivity::class.java))
                return true
            }
            R.id.settings -> {
                startActivity(Intent(this, SettingsActivity::class.java))
                return true
            }
            R.id.exit -> {
                finishAffinity()
                return true
            }
            else -> return true
        }
    }
}