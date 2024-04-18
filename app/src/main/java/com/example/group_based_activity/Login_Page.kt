package com.example.group_based_activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login_Page : AppCompatActivity() {
    private lateinit var editTextRegNumber: EditText
    private lateinit var editTextDOB: EditText
    private lateinit var editTextCGPA: EditText
    private lateinit var editTextSpecialization: EditText
    private lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        editTextRegNumber = findViewById(R.id.editTextRegNumber)
        editTextDOB = findViewById(R.id.editTextDOB)
        editTextCGPA = findViewById(R.id.editTextCGPA)
        editTextSpecialization = findViewById(R.id.editTextSpecialization)
        buttonSave = findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener {
            val regNumber = editTextRegNumber.text.toString()
            val dob = editTextDOB.text.toString()
            val cgpa = editTextCGPA.text.toString()
            val specialization = editTextSpecialization.text.toString()

            // Assuming MyProfileActivity is the next activity to show the saved details
            val intent = Intent(this@Login_Page, MainActivity::class.java)
            intent.putExtra("reg_number", regNumber)
            intent.putExtra("dob", dob)
            intent.putExtra("cgpa", cgpa)
            intent.putExtra("specialization", specialization)
            startActivity(intent)
        }
    }
}