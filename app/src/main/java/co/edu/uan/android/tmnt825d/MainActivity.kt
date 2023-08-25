package co.edu.uan.android.tmnt825d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import co.edu.uan.android.tmnt825d.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater) // creando el binding de la actividad
        setContentView(binding.root) // usar el layout contenido en el binding

        //val btn = findViewById<Button>(R.id.btnHello) -- no se necesita con el binding
        binding.btnHello.text = "Boton Hola"
        binding.btnHello.setOnClickListener {
            println("Clic en el boton hola")
        }
    }
}