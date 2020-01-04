package com.example.luassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var edt_pedestal: EditText? = null
    var edt_height: EditText? = null
    var btn_hitung: Button? = null
    var edt_result: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_pedestal = findViewById(R.id.edt_pedestal)
        edt_height = findViewById(R.id.edt_height)
        btn_hitung = findViewById(R.id.btn_hitung)
        edt_result = findViewById(R.id.edt_result)

        btn_hitung?.setOnClickListener {
            var pedestal = edt_pedestal?.text.toString()
            var height = edt_height?.text.toString()

        if (pedestal == "")   {
            Toast.makeText(this@MainActivity, "Panjang Alas  harus di isi", Toast.LENGTH_SHORT).show()
        }else if (height == "")  {
            Toast.makeText(this@MainActivity, "Tinggi harus di isi", Toast.LENGTH_SHORT).show()
        }else{
            var large = 0.5 * pedestal.toInt() * height.toInt()
            edt_result?.setText("$large")
        }

        }

    }
}
