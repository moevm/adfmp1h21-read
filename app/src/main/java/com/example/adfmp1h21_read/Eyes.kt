package com.example.adfmp1h21_read

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView


class Eyes : Navigation() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eyes)
        super.init(
            findViewById(R.id.drawerLayout),
            findViewById(R.id.nav_view),
            findViewById(R.id.toolBar),
            "Правила"
        )

        var button = findViewById<Button>(R.id.buttonAc)
        var textView = findViewById<TextView>(R.id.textView6)
        var txLine = findViewById<View>(R.id.txLine)
        var txLine1 = findViewById<View>(R.id.txLine1)

        button.setOnClickListener {
            (button.parent as ViewManager).removeView(button)
            textView.setText("Термин «AAA» начал использоваться в конце 1990-х годов, когда некоторые американские разработчики видеоигр начали включать его в пользовательские соглашения[2].\n" +
                    "\n" +
                    "К седьмому поколению игровых консолей (конец 2000-х) разработка игр AAA-класса для Xbox 360 и PlayStation 3 обычно обходилась в пару десятков миллионов долларов (от 15 до 20), однако бюджет некоторых сиквелов заметно превышал эти цифры — так, бюджет Halo 3 оценивается в 30 миллионов долларов на разработку и 40 миллионов долларов на маркетинг[3]. Согласно белой книге, опубликованной EA Games, на седьмом поколении виден спад количества компаний, разрабатывающих AAA-тайтлы, примерно со 125 до 25, однако наблюдается соответствующее четырёхкратное повышение трудозатрат, требуемых для создания игр такого класса[4].\n" +
                    "\n" +
                    "В это время AAA-игры сопровождались маркетинговыми кампаниями такого же уровня, какие проводились для фильмов-блокбастеров. Выход игр сопровождался рекламой на телевидении, афишах и в газетах; в целях снижения рисков повышался упор на сиквелы, переиздания и связанную с франшизами интеллектуальную собственность. К концу седьмого поколения консолей стоимость отдельных игр возросла до сотен миллионов долларов, и их бюджеты сравнялись с бюджетами голливудских фильмов-блокбастеров: например, Grand Theft Auto V оценивается в 265 миллионов долларов. Эти условия привели к расцвету индустрии низкобюджетных инди-игр, где низкая стоимость разработки способствовала инновациям и принятию рисков[5]. К 2010-м годам поляризация рынка, движение в сторону либо массовых дорогостоящих AAA-игр, либо дешевых, но нишевых инди-игр привела к упадку игр «среднего» класса, с бюджетами большими, чем у инди-игр, но меньшими, чем у ААА; так, в 2011 году глава Epic Games Клифф Блезински заявлял, что средний класс компьютерных игр «мертв», и что игры в этой категории, если они ничем не выделяются на фоне других, ждет коммерческий провал[6].\n" +
                    "\n" +
                    "Выход восьмого поколения игровых консолей (PlayStation 4, Xbox One, Wii U) показал дальнейший рост стоимости и необходимых трудозатрат — в компании Ubisoft в разработке AAA-игр с открытым миром было задействовано от 400 до 600 человек из разных стран[7].\n" +
                    "\n" +
                    "Низкая рентабельность заставляет издателей искать альтернативные бизнес-модели, в которых игроки продолжают вносить доход после покупки, в том числе приобретением премиум-аккаунтов, DLC, онлайн-абонементов[en] и других видов подписки[8]. В середине 2010-х крупные игровые издатели начали фокусироваться на играх, рассчитанных на длинный хвост прибыли от отдельных потребителей, что приближает их к ММО-играм. Сюда входят игры с дополнениями или сезонными абонементами (англ. season pass), например, Destiny или серии игр Battlefield и Call of Duty; или же игры с внутриигровыми покупками, иногда чисто косметическими, например, Overwatch или League of Legends[9]. Игры этого типа иногда называют «AAA+».")
            txLine.visibility = View.VISIBLE
            txLine1.visibility = View.VISIBLE
            supportActionBar!!.title = "Широко расставленные глаза";

        }
    }
}
