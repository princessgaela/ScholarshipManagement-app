package com.example.scholarshipmanagementsystem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.internal_scholarships.*

class InternalScholarships:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
    super.onCreate(savedInstanceState)
    setContentView(R.layout.internal_scholarships)

        HKbttn.setOnClickListener{
            startActivity(Intent(this, HandogKaibigan::class.java))
        }
        Studentassistancebttn.setOnClickListener{
            startActivity(Intent(this, StudentAssistance::class.java))
        }
        PHINMAscholarbttn.setOnClickListener{
            startActivity(Intent(this, PHINMAScholarship::class.java))
        }
    }
}
