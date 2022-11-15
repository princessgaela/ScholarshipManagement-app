package com.example.scholarshipmanagementsystem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.type_of_scholarship.*

class TypeOfScholarship: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.type_of_scholarship)

        internalbttn.setOnClickListener{
            startActivity(Intent(this, InternalScholarships::class.java))
        }
        externalbttn.setOnClickListener{
            startActivity(Intent(this, ExternalScholarships::class.java))
        }
    }
}