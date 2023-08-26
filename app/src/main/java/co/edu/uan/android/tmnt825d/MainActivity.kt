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
        when (name) {
            "mikey" -> {
                binding.imgTurtle.setImageResource(R.drawable.mikey)
                binding.txtDescription.text = resources.getText(R.string.turtle_mikey).toString()
            }
            "leo" -> {
                binding.imgTurtle.setImageResource(R.drawable.leo)
                binding.txtDescription.text = resources.getText(R.string.turtle_leo).toString()
            }
            "raf" -> {
                binding.imgTurtle.setImageResource(R.drawable.raf)
                binding.txtDescription.text = resources.getText(R.string.turtle_raf).toString()
            }
            else -> {
                binding.imgTurtle.setImageResource(R.drawable.donatello)
                binding.txtDescription.text = resources.getText(R.string.turtle_donatello).toString()
            }
        }
    }
}