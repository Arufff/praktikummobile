package com.example.konversimatauang

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konversimatauang.databinding.ActivityMainBinding
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import java.text.NumberFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.konversi.setOnClickListener { hitung() }
        binding.teksInput.setOnKeyListener{ view, keyCode, _ ->
            handleKeyEvent(view, keyCode)
        }
    }

    private fun hitung(){
        val inputAwal = binding.teksInput.text.toString()
        val inputNilai = inputAwal.toFloat()

        if (inputNilai == null){
            binding.hasil.text = ""
            return
        }

        val pilihan = when (binding.radio.checkedRadioButtonId){
            R.id.euro -> 15603.4
            R.id.usd -> 14344.0
            R.id.yen -> 114.46
            else -> 3825.3
        }

        var hasil = inputNilai * pilihan

        val indonesianLocale = Locale("in", "ID")
        val formatHasil = NumberFormat.getCurrencyInstance(indonesianLocale).format(hasil)
        binding.hasil.text = "Nilai Rupiah $formatHasil"
    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER){
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}