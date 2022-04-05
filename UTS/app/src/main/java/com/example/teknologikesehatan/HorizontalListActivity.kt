package com.example.teknologikesehatan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teknologikesehatan.ListTeknologiAdapter
import com.example.teknologikesehatan.databinding.ActivityVerticalListBinding

class VerticalListActivity {
    class VerticalListActivity : AppCompatActivity() {
        private lateinit var binding: ActivityVerticalListBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityVerticalListBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.verticalrv.setHasFixedSize(true)

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }
}