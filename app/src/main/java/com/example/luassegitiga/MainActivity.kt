package com.example.luassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var pedestalEdt: EditText? = null
    var heightEdt: EditText? = null
    var hitungBtn: Button? = null
    var resultEdt: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pedestalEdt = findViewById(R.id.edt_pedestal)
        heightEdt = findViewById(R.id.edt_height)
        hitungBtn = findViewById(R.id.btn_hitung)
        resultEdt = findViewById(R.id.edt_result)

        hitungBtn?.setOnClickListener {
            var pedestal = pedestalEdt?.text.toString()
            var height = heightEdt?.text.toString()

            if (pedestal == "") {
                Toast.makeText(this@MainActivity, "Panjang Alas  harus di isi", Toast.LENGTH_SHORT)
                    .show()
            } else if (height == "") {
                Toast.makeText(this@MainActivity, "Tinggi harus di isi", Toast.LENGTH_SHORT).show()
            } else {
                var large = 0.5 * pedestal.toInt() * height.toInt()
                resultEdt?.setText("$large")
            }

        }

    }
}
