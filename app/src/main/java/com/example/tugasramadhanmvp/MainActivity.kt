package com.example.tugasramadhanmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.tugasramadhanmvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var  binding : ActivityMainBinding
    private lateinit var mvp : MainViewPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mvp = MainViewPresenter(this)

        binding.btnHitung.setOnClickListener {
              val bil1 =  binding.bil1.text.toString().toInt()
                val bil2 = binding.bil2.text.toString().toInt()
                val bilangan = JumlahBilangan(bil1, bil2)
                mvp.penjumlahan(bilangan)
                mvp.pengurangan(bilangan)
        }
    }

        override fun hasil(hasil: Int) {
            binding.tvHasil.text = "Hasil: $hasil"
        }

        override fun clear() {
            binding.bil1.text.clear()
            binding.bil2.text.clear()
        }

        override fun showToast(text: String) {
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }
    }
