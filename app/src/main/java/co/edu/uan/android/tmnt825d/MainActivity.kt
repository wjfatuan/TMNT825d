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
            showTurtle("mikey")
        }
        binding.btnRaf.setOnClickListener {
            showTurtle("raf")
        }
        binding.btnLeo.setOnClickListener {
            showTurtle("leo")
        }
        binding.btnDonatello.setOnClickListener {
            showTurtle("donatello")
        }
    }

    fun showTurtle(name: String) {
        val imgId = resources.getIdentifier(name, "drawable", packageName)
        binding.imgTurtle.setImageResource(imgId)
        val textId = resources.getIdentifier("turtle_$name", "string", packageName)
        binding.txtDescription.text = resources.getText(textId).toString()
    }
}