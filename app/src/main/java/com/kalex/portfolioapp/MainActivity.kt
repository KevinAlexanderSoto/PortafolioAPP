package com.kalex.portfolioapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView =  findViewById<BottomNavigationView>(R.id.bottomNavigation)

        val navController= findNavController(R.id.fragmentContainerView)

        bottomNavigationView.setupWithNavController(navController)

       /* val appBarConfiguration = AppBarConfiguration(setOf(R.id.mainFragment ,R.id.tecnoFragment,R.id.proyecFragment))

setupActionBarWithNavController(navController,appBarConfiguration)*/

        //navegar a otra pantalla
        /*val tecnologias_btn = findViewById<Button>(R.id.tecnologias_btn)
        tecnologias_btn.setOnClickListener {
            val intent = Intent(this,Tecnologias::class.java)
            startActivity(intent)
        }*/

    }
}