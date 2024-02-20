package com.shivani.chat_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shivani.chat_application.databinding.ActivityMainBinding

class ChatActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var AlertDialog:AlertDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd?.setOnClickListener {
            androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Are you sure to send message")
                .setCancelable("False")
                .setPositiveButton("true-->")
                .setPositiveButton("Close") { _,_->
                    Toast.makeText(this, "Yes", Toast.LENGTH_SHORT)
                        .show()
                }
                .setNegativeButton("Negative") { _, _ ->
                    Toast.makeText(this, "NO", Toast.LENGTH_SHORT)
                        .show()
        }
    }
}

}
