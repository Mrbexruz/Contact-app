package com.likobehruz.contakt19

import android.content.Intent
import android.content.Intent.ACTION_DIAL
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.likobehruz.contakt19.databinding.ActivityMainBinding
import com.likobehruz.contakt19.databinding.ItemRvBinding
import com.likobehruz.contakt19.utils.Mydata
import com.likobehruz.contakt19.utils.models.User

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root )

        loadData()
        for (user in Mydata.list){
        val rvBinding= ItemRvBinding.inflate(layoutInflater)
            rvBinding.tvName.text= user.name
            rvBinding.tvNumber.text= user.number
            rvBinding.root.setOnClickListener{
                Toast.makeText(this, "{user.number}", Toast.LENGTH_SHORT).show()
                val intent =Intent(Intent.ACTION_DIAL)
            }

            binding.linearContainer.addView(rvBinding.root)


    }

     }

    private fun loadData() {

            Mydata.list.add(User("Halilokam","+998 90 383 12 14  "))
        Mydata.list.add(User("Akam ","+7 982 505 41 44  "))
        Mydata.list.add(User("ALisher ","+998 91 105 53 05 "))
        Mydata.list.add(User("Muhidin ","+998 91 56 30 42  "))
        Mydata.list.add(User("Enam","+998 93 374 09 59  "))
        Mydata.list.add(User("Opoqim  ","+998 93 972 62 71  "))
        Mydata.list.add(User("Onajonim ","+998 87 778 87 14 "))
        Mydata.list.add(User("Dadajonim ","+998 90 242 17 47  "))
        Mydata.list.add(User("Codial ","+998 99 821 44 32  "))
        Mydata.list.add(User("ilhomaka IT","+998 99 602 15 02  "))
        Mydata.list.add(User("Hayrullohaka  ","+998 97 215 50 01 "))





    }
}