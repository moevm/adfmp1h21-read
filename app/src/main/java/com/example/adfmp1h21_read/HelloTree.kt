package com.example.adfmp1h21_read

import android.os.Bundle
import android.view.ViewManager
import android.widget.Button
import android.widget.TextView
import java.util.Map.entry


class HelloTree : Navigation() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_tree)
        super.init(
            findViewById(R.id.drawerLayout),
            findViewById(R.id.nav_view),
            findViewById(R.id.toolBar),
            "Правила"
        )

        var button = findViewById<Button>(R.id.buttonAc)
        var textTitle = findViewById<TextView>(R.id.textTitle)
        var textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            (textTitle.parent as ViewManager).removeView(textTitle)
            (button.parent as ViewManager).removeView(button)
            textView.setText(
                "Как\n поэт Высоцкий\n реализовал себя прежде\n всего в жанре авторской песни.\n Первые\n из написанных\n им произведений относятся\n к началу\n 1960-х годов.\n Вначале они исполнялись\n в кругу\n друзей, позже\n получили широкую известность\n благодаря\n распространявшимся\n по стране магнитофонным\n записям. Поэзия Высоцкого\n отличалась\n многообразием тем\n (уличные, лагерные, военные,\n сатирические,\n бытовые, сказочные,\n «спортивные» песни), остротой\n смыслового\n подтекста и акцентированной\n социально-нравственной\n позицией автора. В его произведениях,\n рассказывающих\n о внутреннем выборе людей,\n поставленных\n в экстремальные\n обстоятельства, прослеживались\n экзистенциальные\n мотивы. Творческая эволюция\n Высоцкого\n прошла несколько\n этапов. В его раннем\n творчестве преобладали уличные\n и\n дворовые\n песни. С середины\n 1960-х годов тематика\n произведений начала расширяться,\n а\n песенные\n циклы — складываться\n в новую «энциклопедию русской\n жизни».\n В 1970-х\n годах значительную\n часть творчества Высоцкого\n составляли песни и стихотворения\n исповедально-философского\n характера, поэт часто обращался к\n вечным\n вопросам бытия."
            )
            textView.textSize=16.toFloat()
            supportActionBar!!.title = "Здравствуй, елка";
        }
    }
}