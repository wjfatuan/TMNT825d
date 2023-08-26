package co.edu.uan.android.tmnt825d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.edu.uan.android.tmnt825d.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // creando el binding de la actividad
        setContentView(binding.root) // usar el layout contenido en el binding
        binding.btnMikey.setOnClickListener {
            showTurtle(R.drawable.mikey)
        }
        binding.btnRaf.setOnClickListener {
            showTurtle(R.drawable.raf)
        }
        binding.btnLeo.setOnClickListener {
            showTurtle(R.drawable.leo)
        }
        binding.btnDonatello.setOnClickListener {
            showTurtle(R.drawable.donatello)
        }
    }

    fun showTurtle(img: Int) {
        binding.imgTurtle.setImageResource(img)
    }
}