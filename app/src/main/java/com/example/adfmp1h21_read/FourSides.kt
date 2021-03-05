package com.example.adfmp1h21_read

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import java.util.*
import java.util.Collections.shuffle

class FourSides : Navigation() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_sides)
        super.init(
            findViewById(R.id.drawerLayout),
            findViewById(R.id.nav_view),
            findViewById(R.id.toolBar),
            "Правила"
        )

        var button = findViewById<Button>(R.id.buttonAc)
        var task3 = findViewById<TextView>(R.id.task3)
        val size: Int = 5
        var data = Array(size * size) { x -> (x + 1).toString() }
        data.shuffle()
        var pos: Int = data.indexOf("1")
        var value = data[12]
        data[12] = "1"
        data[pos] = value
        button.setOnClickListener {

            (button.parent as ViewManager).removeView(button)
            (task3.parent as ViewManager).removeView(task3)


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
            gridLayout.visibility = View.VISIBLE
            supportActionBar!!.title = "На все четыре стороны";
        }
    }

    private fun generateGridTextButton(name: String): View {
        var button = Button(this)
        button.textSize = 20.toFloat()
        button.text = name
        return button
    }
}