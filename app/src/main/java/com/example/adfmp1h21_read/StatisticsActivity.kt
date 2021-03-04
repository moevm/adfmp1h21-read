package com.example.adfmp1h21_read

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

class StatisticsActivity : Navigation() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)
        super.init(
            findViewById(R.id.drawerLayout),
            findViewById(R.id.nav_view),
            findViewById(R.id.toolBar),
            "Статистика"
        )
    }
}