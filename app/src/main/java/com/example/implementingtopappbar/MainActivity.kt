package com.example.implementingtopappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)

        toolbar.overflowIcon = AppCompatResources.getDrawable(this@MainActivity, R.drawable.baseline_more_vert_24)

        toolbar.setNavigationOnClickListener {

            Toast.makeText(applicationContext, "navigation Icon is clicked", Toast.LENGTH_SHORT).show()
        }

        //the individual actions will depend on the application functionalities and demands of the app
        //for now we will just display toasts to the output to show that the menu items do respond adequately 
        toolbar.setOnMenuItemClickListener { item ->
            when(item.itemId){
                R.id.share ->             Toast.makeText(applicationContext, "Share Icon is clicked", Toast.LENGTH_SHORT).show()
                R.id.edit ->             Toast.makeText(applicationContext, "Edit Icon is clicked", Toast.LENGTH_SHORT).show()
                R.id.settings ->             Toast.makeText(applicationContext, "Settings Icon is clicked", Toast.LENGTH_SHORT).show()

                else ->   Toast.makeText(applicationContext, "SignOut Icon is clicked", Toast.LENGTH_SHORT).show()


            }
            return@setOnMenuItemClickListener true
        }

    }
}