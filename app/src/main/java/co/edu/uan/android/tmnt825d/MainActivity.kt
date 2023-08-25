package co.edu.uan.android.tmnt825d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // cargar el archivo de layout de la actividad

        val btn = findViewById<Button>(R.id.btnHello)
        btn.text = "Boton Hola"
        btn.setOnClickListener {
            println("Clic en el boton hola")
        }
    }
}