package com.example.scholarshipmanagementsystem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.external_scholarships.*

class ExternalScholarships:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.external_scholarships)

        tesbttn.setOnClickListener{
            startActivity(Intent(this, Tertiary_Education_Subsidy::class.java))
        }
        chedbttn.setOnClickListener{
            startActivity(Intent(this, CommisionOnHigherEducation::class.java))
        }
        EDGEbttn.setOnClickListener{
            startActivity(Intent(this, EducationalDiscountForGovermentEmployees::class.java))
        }
    }
}