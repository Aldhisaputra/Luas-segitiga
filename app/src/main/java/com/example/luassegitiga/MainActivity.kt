package com.example.luassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var edt_LongPedestal: EditText? = null
    var edt_Height: EditText? = null
    var btn_Hitung: Button? = null
    var edt_Result: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_LongPedestal = findViewById(R.id.edt_LongPedestal)
        edt_Height = findViewById(R.id.edt_Height)
        btn_Hitung = findViewById(R.id.btn_Hitung)
        edt_Result = findViewById(R.id.edt_Result)

        btn_Hitung?.setOnClickListener {
            var Long = edt_LongPedestal?.text.toString()
            var Height = edt_Height?.text.toString()
            var new =


        if (Long == "")   {
            Toast.makeText(this@MainActivity, "Panjang Alas  harus di isi", Toast.LENGTH_SHORT).show()


        }else if (Height == "")  {
            Toast.makeText(this@MainActivity, "Tinggi harus di isi", Toast.LENGTH_SHORT).show()
        }else{
            var large = Long.toInt()  * Height.toInt()
            edt_Result?.setText("$large")
        }








        }


    }
}
