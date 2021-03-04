package com.example.adfmp1h21_read

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout


class ShulteActivity : Navigation() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shulte)

        var intent: Intent = intent
        super.init(
            findViewById(R.id.drawerLayout),
            findViewById(R.id.nav_view),
            findViewById(R.id.toolBar),
            intent.getStringExtra("title").toString()
        )

        val size: Int = 4
        var data = Array(size * size) { x -> (x + 1).toString() }
        var gridLayout = findViewById<GridLayout>(R.id.gridLayout)
        gridLayout.columnCount = size
        for (i in data) {
            val lp = GridLayout.LayoutParams()
            lp.width = 0
            lp.height = ViewGroup.LayoutParams.WRAP_CONTENT
            lp.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f)
            lp.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f)
            gridLayout.addView(generateGridTextButton(i), lp)
        }
        setSingleEvent(gridLayout)

        var imageView = findViewById<ImageView>(R.id.imageView)

        imageView.setOnClickListener {
            Log.d("TAG", "press img")
        }
    }

    private fun setSingleEvent(gridLayout: GridLayout?) {
        for (i in 0 until gridLayout!!.childCount) {
            var button: Button = gridLayout.getChildAt(i) as Button
            button.setOnClickListener {
                Log.d("TAG", button.text.toString())
            }
        }
    }

    private fun generateGridTextButton(name: String): View {
        var button = Button(this)
        button.textSize = 20.toFloat()
        button.text = name
        return button
    }
}