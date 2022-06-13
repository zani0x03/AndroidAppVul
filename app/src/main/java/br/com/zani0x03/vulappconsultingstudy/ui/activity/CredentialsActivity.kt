package br.com.zani0x03.vulappconsultingstudy.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import br.com.zani0x03.vulappconsultingstudy.R
import com.scottyab.rootbeer.RootBeer

class CredentialsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credentials)
        configuraBtnRootActivity()
    }


    private fun configuraBtnRootActivity(){
        val btnViewSecretActivity = findViewById<Button>(R.id.activity_credentials_btn_view_secret)
        btnViewSecretActivity.setOnClickListener{
            vaiParaSecretCredentialsActivity()
        }
    }

    private fun vaiParaSecretCredentialsActivity(){
        val intent = Intent(this, SecretCredentialsActivity::class.java)
        startActivity(intent)
    }
}