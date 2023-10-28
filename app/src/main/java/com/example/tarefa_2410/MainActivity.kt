package com.example.tarefa_2410

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tarefa_2410.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.binding.btnConverter.setOnClickListener {
            if(this.binding.etAno.text.isBlank() || this.binding.etMes.text.isBlank() ||
                this.binding.etDia.text.isBlank()){
                Toast.makeText(this@MainActivity, "Todos os campos devem ser preenchidos",
                    Toast.LENGTH_SHORT).show()
            } else {
                val anoEmDias = (2023 * 360) - (this.binding.etAno.text.toString().toInt() * 360)
                val mesEmdias = (this.binding.etMes.text.toString().toInt() * 30)
                val idadeEmDia = anoEmDias + mesEmdias + this.binding.etDia.text.toString().toInt()

                Intent(this, ResultActivity::class.java).also{
                    it.putExtra("IDADE_EXTRA", idadeEmDia)
                    startActivity(it)
                }
            }
        }
    }
}