package cl.getcolors.scrapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun redirectToSignin(view : View){

        val signIn = Intent(this, Signin::class.java);
        startActivity(signIn);
    }
}
