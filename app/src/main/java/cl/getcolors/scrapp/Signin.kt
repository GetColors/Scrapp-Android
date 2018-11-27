package cl.getcolors.scrapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Signin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
    }

    fun redirectToRegister(view : View){

        val register = Intent(this, MainActivity::class.java);
        startActivity(register);
    }
}
