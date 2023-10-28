package com.example.tarefa_2410

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tarefa_2410.databinding.ActivityResultBinding

class ResultActivity: AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        this.binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val idadeEmDias = intent.getIntExtra("IDADE_EXTRA", 0)
        setSupportActionBar(binding.toolbar)
        //tem que ser null safety
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.tvResultado.text = "Você tem $idadeEmDias dias de vida"

    }
}