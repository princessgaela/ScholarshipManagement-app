package com.example.scholarshipmanagementsystem

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.educational_discount_for_goverment_employees.*

class EducationalDiscountForGovermentEmployees : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.educational_discount_for_goverment_employees)

        val spinner: Spinner = findViewById(R.id.EDGEspinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.EDGE_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
        EDGEapplybttn.setOnClickListener{
            startActivity(Intent(this, ApplicationForm::class.java))
        }
    }
}