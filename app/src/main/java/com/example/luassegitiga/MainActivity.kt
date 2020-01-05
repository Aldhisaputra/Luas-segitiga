package com.example.luassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var pedestal: EditText? = null
    var height: EditText? = null
    var hitung: Button? = null
    var result: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pedestal = findViewById(R.id.edt_pedestal)
        height = findViewById(R.id.edt_height)
        hitung = findViewById(R.id.btn_hitung)
        result = findViewById(R.id.edt_result)

        hitung?.setOnClickListener {
            var pedestal = pedestal?.text.toString()
            var height = height?.text.toString()

            if (pedestal == "") {
                Toast.makeText(this@MainActivity, "Panjang Alas  harus di isi", Toast.LENGTH_SHORT)
                    .show()
            } else if (height == "") {
                Toast.makeText(this@MainActivity, "Tinggi harus di isi", Toast.LENGTH_SHORT).show()
            } else {
                var large = 0.5 * pedestal.toInt() * height.toInt()
                result?.setText("$large")
            }

        }

    }
}
