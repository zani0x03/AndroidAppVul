package br.com.zani0x03.vulappconsultingstudy.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.zani0x03.vulappconsultingstudy.R
import br.com.zani0x03.vulappconsultingstudy.const.Constants
import com.scottyab.rootbeer.RootBeer


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configuraBtnPinningActivity()
        configuraBtnRootActivity()
        configuraBntCredentialsActivity()
        configuraBtnCadastroBasicoActivity()
//        if (BuildConfig.DEBUG){
//            Log.i(appName,"Debugging")
//        }
    }

    private fun configuraBntCredentialsActivity(){
        val btnCredentialActivity = findViewById<Button>(R.id.activity_main_btn_go_credentials)
        btnCredentialActivity.setOnClickListener{
            vaiParaCredentialsActivity()
        }
    }

    private fun configuraBtnPinningActivity(){
        val btnPinningActivity = findViewById<Button>(R.id.activity_main_btn_go_pinning)
        btnPinningActivity.setOnClickListener{
            vaiParaPinningActivity()
        }
    }

    private fun configuraBtnRootActivity(){
        val btnGoRoot = findViewById<Button>(R.id.activity_main_btn_go_root)
        btnGoRoot.setOnClickListener{
            val rootBeer = RootBeer(this)
            if (rootBeer.isRooted) {
                Log.i(Constants.ApplicationName,"root")
            } else {
                Log.i(Constants.ApplicationName,"não root")
                //we didn't find indication of root
            }
        }
    }

    private fun configuraBtnCadastroBasicoActivity(){
        val btnGoCadastroBasico = findViewById<Button>(R.id.activity_main_btn_go_cadastro_basico)
        btnGoCadastroBasico.setOnClickListener{
            vaiParaCadastroBasicoActivity()
        }
    }

    private fun vaiParaCredentialsActivity(){
        val intent = Intent(this, CredentialsActivity::class.java)
        startActivity(intent)
    }

    private fun vaiParaPinningActivity() {
        val intent = Intent(this, PinningActivity::class.java)
        startActivity(intent)
    }

    private fun vaiParaCadastroBasicoActivity(){
        val intent = Intent(this, CadastroBasicoActivity::class.java)
        startActivity(intent)
    }

}