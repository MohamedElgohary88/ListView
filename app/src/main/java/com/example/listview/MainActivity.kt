package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
// اولا عملنا مصفوفة من العناصر وضعنا فيها العناصر
    var mPerson = arrayOf("Ahmed","Amin","Abdulazim","Abdulaziz","AadAllah","AbdulWahab"
        ,"Abdulrahmman","Ibrahim","Reda","Moaaz","Mostafa","Mossad","Mahmoud","Mohamed","Yasser")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Person بعد كده عملنا متغير نوعه ArrayList  ونوعه
        val personlist = ArrayList<Person>()
// وبعد كده ضفنا العناصر داخل personlist
        personlist.add(Person("Ahmed","des_0",R.drawable.profile))
        personlist.add(Person("Mohamed","des_1",R.drawable.profile_1))
        personlist.add(Person("AadAllah","des_2",R.drawable.profile_2))
        personlist.add(Person("Mahmoud","des_3",R.drawable.profile_3))
        personlist.add(Person("Abdulrahman","des_4",R.drawable.profile_4))
        personlist.add(Person("Abdulaziz","des_5",R.drawable.profile_5))
        personlist.add(Person("AbdulWahab","des_6",R.drawable.profile_6))
        personlist.add(Person("Reda","des_7",R.drawable.profile_7))
        personlist.add(Person("Ibrahim","des_8",R.drawable.profile_8))
        personlist.add(Person("Moaaz","des_9",R.drawable.profile_9))
        personlist.add(Person("Mostafa","des_10",R.drawable.profile_10))
        personlist.add(Person("Mossad","des_11",R.drawable.profile_11))
        personlist.add(Person("Abdulazim","des_12",R.drawable.profile_12))
        personlist.add(Person("Amin","des_13",R.drawable.profile_13))
        personlist.add(Person("Yasser","des_14",R.drawable.profile_14))

// هنا بقى عملنا متغير اسمه myAdapter وده بيرث من كلاس PersonAdapter وبياخد 2 باراميتر
        val myAdapter = PersonAdapter(this,personlist)
        //وبعد كده استدعينا   myListView.adapter
        myListView.adapter = myAdapter
        // هنا عشان لما ندوس على عنصر فلى ليست فيو يحصل حدث
        myListView.onItemClickListener = AdapterView.OnItemClickListener{parent,view,position,id ->

            when(position){
                0 -> startActivity(Intent(this,AhmedActivity2::class.java))
                else -> Toast.makeText(this,"Nothing",Toast.LENGTH_SHORT).show()
            }

        }
    }
}