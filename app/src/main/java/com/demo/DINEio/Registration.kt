package com.demo.DINEio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import android.content.Intent
import com.demo.DINEio.databinding.ActivityRegistrationBinding
import com.demo.DINEio.models.User


class Registration : AppCompatActivity() {

    private lateinit var binding:ActivityRegistrationBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.Loginnow.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        binding.registerbtn.setOnClickListener {
            val email = binding.email.text.toString()
            val pass = binding.password.text.toString()
            val confirmPass = binding.confirmpass.text.toString()
            val fullName = binding.fullname.text.toString()
            val dob = binding.dob.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
                if (pass == confirmPass) {

                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {

                            val user = User(fullName, email, dob)
                            val uid = firebaseAuth.currentUser?.uid

                            databaseReference = FirebaseDatabase.getInstance().getReference("Users")

                            if (uid != null){

                                databaseReference.child(uid).setValue(user).addOnCompleteListener {
                                    Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                                }
                            }
                            val intent = Intent(this, Login::class.java)
                            startActivity(intent)
                        }else {

                            Toast.makeText(this, it.exception?.message.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }else {

                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                }
            }else {

                Toast.makeText(this, "Some fields are empty", Toast.LENGTH_SHORT).show()
            }
        }
    }
}