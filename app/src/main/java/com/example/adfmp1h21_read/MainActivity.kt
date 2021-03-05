package com.example.adfmp1h21_read


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : Navigation() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        super.init(
            findViewById(R.id.drawerLayout),
            findViewById(R.id.nav_view),
            findViewById(R.id.toolBar),
            "Главная"
        )

        var button: Button = findViewById<Button>(R.id.button)
        var button2: Button = findViewById<Button>(R.id.button2)
        var button3: Button = findViewById<Button>(R.id.button3)
        var button4: Button = findViewById<Button>(R.id.button4)
        var button5: Button = findViewById<Button>(R.id.button5)
        var button6: Button = findViewById<Button>(R.id.button6)
        var button7: Button = findViewById<Button>(R.id.button7)

        var buttons = arrayOf(button, button2, button3, button4, button5, button6, button7)

        var button9: Button = findViewById<Button>(R.id.button9)

        var intent: Intent = Intent(this, ShulteActivity::class.java)


        button.setOnClickListener {
            intent.putExtra("title", button.text.toString())
            startActivity(intent)
        }
        button2.setOnClickListener {
            intent.putExtra("title", button2.text.toString())
            startActivity(intent)
        }
        button3.setOnClickListener {
            intent.putExtra("title", button3.text.toString())
            startActivity(intent)
        }
        button4.setOnClickListener {
            intent.putExtra("title", button4.text.toString())
            startActivity(intent)
        }
        button5.setOnClickListener {
            intent = Intent(this, Eyes::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            intent = Intent(this, FourSides::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            intent = Intent(this, HelloTree::class.java)
            startActivity(intent)
        }

        button9.setOnClickListener {
            var num = (buttons.indices).random()
            var exButton: Button = buttons[num]
            Log.d("tag",num.toString())
            exButton.callOnClick()
        }
    }
}