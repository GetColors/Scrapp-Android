package cl.getcolors.scrapp.authentication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.JsonWriter
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import cl.getcolors.scrapp.R
import org.json.JSONObject

class Signup : AppCompatActivity() {

    private lateinit var usernameField : EditText
    private lateinit var emailField : EditText
    private lateinit var passwordField : EditText

    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        usernameField = findViewById(R.id.username_field)
        emailField = findViewById(R.id.email_field)
        passwordField = findViewById(R.id.password_field)
    }

    fun redirectToSignin(view : View){

        val signIn = Intent(this, Signin::class.java)
        signIn.flags  = Intent.FLAG_ACTIVITY_NEW_TASK or  Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(signIn)
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finishAffinity()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Si quieres salir presiona atrás nuevamente.", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)
    }

    fun register(view : View){

        val username = usernameField.text.toString()
        if (username.isEmpty()){
            usernameField.setError("Ingresa un nombre de usuario")
            return
        }

        val email = emailField.text.toString()
        if (email.isEmpty()){
            emailField.setError("Ingresa tu correo electrónico")
            return
        }

        val password = passwordField.text.toString()
        if (password.isEmpty()){
            passwordField.setError("Ingresa una contraseña")
            return
        }

        var jsonPreparer = JSONObject()
        jsonPreparer.put("username", username)
        jsonPreparer.put("email", email)
        jsonPreparer.put("password", password)



    }
}
