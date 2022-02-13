package com.ejemplo1.fortune_cookies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var button: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        var ListMens: List<String> = listOf("Tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.\n",
            "Concéntrate en lo que quieres lograr y ganaras. No lo olvides.\n",
            "El cielo sera tu limite, pues grandes acontecimientos te sucederán.\n",
            "Te sentirás feliz como un niño y veras al mundo con sus ojos.\n",
            "Vivirás tu vejez con comodidades y riquezas materiales.\n",
            "Vivirás tu vejez con comodidades y riquezas materiales.\n",
            "Confía en tu suerte, que es mucha y te rodeara de prosperidad.\n",
            "No todo el mundo puede recibir las mismas cosas. Se practico.\n",
            "Te aguarda una larga y feliz vida.\n",
            "Hoy es el momento de explorar: no temas.\n",
            "Muy pronto seras incluido en muchas reuniones, fiestas y tertulias.\n",
            "Cuando busques lo que mas deseas, recuerda hacer tu mejor esfuerzo.\n",
            "Tienes por delante un maravilloso día para triunfar; disfrútalo y compártelo.\n",
            "Hoy seras reconocido por tus dones especiales y lograras ser feliz por muchas horas.\n",
            "Tu corazón estallara de alegría con la llegada de buenas noticias.\n",
            "Mañana puede ser muy tarde para disfrutar lo que tienes hoy.\n",
            "Seras promovido en tu trabajo debido a tus logros y capacidades.\n")

        val RandomInt = Random.nextInt(until = 17)
        textView.text = ListMens.get(RandomInt)

    }
}