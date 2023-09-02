package co.edu.uan.android.tmnt825d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import co.edu.uan.android.tmnt825d.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val turtleNames = arrayListOf<String>("leo", "raf")
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
        binding.radioMikey.setOnClickListener {
            showTurtle("mikey")
        }
        binding.radioRaf.setOnClickListener {
            showTurtle("raf")
        }
        binding.radioLeo.setOnClickListener {
            showTurtle("leo")
        }
        binding.radioDonatello.setOnClickListener {
            showTurtle("donatello")
        }
        // 1: actividad, 2: layout con el q se mostrararn los datos, 3: los datos
        val myAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, turtleNames)
        binding.lvTurtles.adapter = myAdapter

        binding.lvTurtles.setOnItemClickListener { parent, view, position, id ->
            println("parent: $parent \n view: $view \n position: $position \n id: $id")
            val tv = view as TextView
            showTurtle(tv.text.toString().lowercase())
        }

    }

    fun showTurtle(name: String) {
        val imgId = resources.getIdentifier(name, "drawable", packageName)
        binding.imgTurtle.setImageResource(imgId)
        val textId = resources.getIdentifier("turtle_$name", "string", packageName)
        binding.txtDescription.text = resources.getText(textId).toString()
        binding.radioLeo.isChecked = true
    }
}