package cl.getcolors.scrapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cl.getcolors.scrapp.authentication.Signup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val signup = Intent(this, Signup::class.java)
        signup.flags = Intent.FLAG_ACTIVITY_NEW_TASK or  Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(signup)
    }
}
