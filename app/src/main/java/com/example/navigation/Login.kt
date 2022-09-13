package com.example.navigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    private var txtuser: EditText? = null
    private var txtpass: EditText? = null
    private var botonlogin: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        txtuser = findViewById(R.id.edtuser)
        txtpass = findViewById(R.id.edtclave)
        botonlogin = findViewById(R.id.btnlogin)
    }

    fun login(view: View?) {
        val username = txtuser!!.text.toString().trim { it <= ' ' }
        val password = txtpass!!.text.toString().trim { it <= ' ' }
        //Toast.makeText(getApplicationContext(),"Error:"+username+" / "+password,Toast.LENGTH_LONG).show();
        if (username == "" || password == "") {
            Toast.makeText(applicationContext, "Ingresar Datos:", Toast.LENGTH_LONG).show()
        } else {
            if (username == user && password == pass) {
                Toast.makeText(applicationContext, "Bienvenido", Toast.LENGTH_LONG).show()
                val intent = Intent(applicationContext, MainActivity::class.java)
                intent.putExtra("pupil", user)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Datos Incorrectos", Toast.LENGTH_LONG).show()
            }
        }
    }

    companion object {
        //const val user = "admin@gmail.com"
        //const val pass = "3ntr4r"
        const val user = "1"
        const val pass = "2"
    }
}
