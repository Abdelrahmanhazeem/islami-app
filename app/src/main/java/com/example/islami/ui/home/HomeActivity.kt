package com.example.islami.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.islami.R
import com.example.islami.databinding.ActivityHomeBinding
import com.example.islami.ui.home.hadith.HadithFragment
import com.example.islami.ui.home.quran.QuranFragment
import com.example.islami.ui.home.radio.RadioFragment
import com.example.islami.ui.home.tasbeh.TasbehFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNav: BottomNavigationView
    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNav = findViewById(R.id.navigation_home)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_quran -> {
                    showTab(QuranFragment())
                }

                R.id.navigation_hadith -> {
                    showTab(HadithFragment())
                }

                R.id.navigation_radio -> {
                    showTab(RadioFragment())
                }

                R.id.navigation_sebha -> {
                    showTab(TasbehFragment())
                }
            }


            return@setOnItemSelectedListener true
        }
        bottomNav.selectedItemId = R.id.navigation_quran
    }

    fun showTab(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}