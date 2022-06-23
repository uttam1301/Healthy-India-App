package com.uttamsaha.healthyindia
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

lateinit var cdMenu : CardView
lateinit var cdRequirements : CardView
lateinit var cdStudents : CardView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cdMenu = findViewById(R.id.cdMenu)
        cdRequirements = findViewById(R.id.cdRequirements)
        cdStudents = findViewById(R.id.cdStudents)

        cdMenu.setOnClickListener{
            val intent = Intent(this@MainActivity,MenuActivity::class.java);
            startActivity(intent);
        }
        cdRequirements.setOnClickListener{
            val intent = Intent(this@MainActivity,RequirementsActivity::class.java);
            startActivity(intent);
        }
        cdStudents.setOnClickListener{
            val intent = Intent(this@MainActivity,StudentsActivity::class.java);
            startActivity(intent);
        }
    }
}