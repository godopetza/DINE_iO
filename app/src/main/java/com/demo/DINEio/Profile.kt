package com.demo.DINEio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import com.demo.DINEio.databinding.ActivityProfileBinding
import com.demo.DINEio.models.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var databaseReference: DatabaseReference
    private lateinit var user: User
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        progressBar = binding.progressBar
        bottomNavView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> startActivity(Intent(this, MainActivity::class.java))
            }
            true
        }

        firebaseAuth = FirebaseAuth.getInstance()

        val uid = firebaseAuth.currentUser?.uid

        databaseReference = FirebaseDatabase.getInstance().getReference("Users")

        if (uid != null) {
            getUserData()
        }else{
            Toast.makeText(this, "Please add more info", Toast.LENGTH_SHORT).show()
        }

        binding.updatebtn.setOnClickListener{

            progressBar.visibility = View.VISIBLE

            val fullName = binding.fullnameEditable.text.toString()
            val email = binding.email.text.toString()
            val dob = binding.dob.text.toString()

            val user = User(fullName, email, dob)
            if (uid != null){

                databaseReference.child(uid).setValue(user).addOnCompleteListener {

                    if(it.isSuccessful) {

                        progressBar.visibility = View.INVISIBLE
                        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                    }else{

                        progressBar.visibility = View.INVISIBLE
                        Toast.makeText(this, it.exception?.message.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                progressBar.visibility = View.INVISIBLE
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
        }

        binding.Logout.setOnClickListener {
            firebaseAuth.signOut()
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }

    private fun getUserData() {
        progressBar.visibility = View.VISIBLE

        val uid = firebaseAuth.currentUser?.uid.toString()

        databaseReference = FirebaseDatabase.getInstance().getReference("Users")

        databaseReference.child(uid).addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                user = snapshot.getValue(User::class.java)!!

                binding.fullnameEditable.setText(user.fullname)
                binding.fullname.text = user.fullname
                binding.email.setText(user.email)
                binding.dob.setText(user.dob)

                progressBar.visibility = View.INVISIBLE
                Toast.makeText(this@Profile, "Profile loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onCancelled(error: DatabaseError) {

                progressBar.visibility = View.INVISIBLE
                Toast.makeText(this@Profile, "Error", Toast.LENGTH_SHORT).show()
            }

        })
    }
}