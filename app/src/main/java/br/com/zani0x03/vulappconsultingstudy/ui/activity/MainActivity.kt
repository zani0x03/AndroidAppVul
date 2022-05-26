package br.com.zani0x03.vulappconsultingstudy.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.zani0x03.vulappconsultingstudy.BuildConfig
import br.com.zani0x03.vulappconsultingstudy.R
import br.com.zani0x03.vulappconsultingstudy.model.ClasseNaoOfuscada
import br.com.zani0x03.vulappconsultingstudy.model.ClasseOfuscada
import com.scottyab.rootbeer.RootBeer


class MainActivity : AppCompatActivity() {

    private var appName = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configuraBtnPinningActivity()
        configuraBtnRootActivity()

        val classeNaoOfuscada = ClasseNaoOfuscada()
        val classeOfuscada = ClasseOfuscada()

        Log.i("VulApp", classeNaoOfuscada.nome)
        Log.i("VulApp", classeNaoOfuscada.idade.toString())
        Log.i("VulApp", classeNaoOfuscada.dataNascimento.toString())

        Log.i("VulApp", classeOfuscada.nome)
        Log.i("VulApp", classeOfuscada.idade.toString())
        Log.i("VulApp", classeOfuscada.dataNascimento.toString())


//        if (BuildConfig.DEBUG){
//            Log.i(appName,"Debugging")
//        }
    }

    private fun configuraBtnPinningActivity(){
        val btnPinningActivity = findViewById<Button>(R.id.activity_main_btn_go_pinning)
        btnPinningActivity.setOnClickListener{
            vaiParaPinningActivity()
        }
    }

    private fun vaiParaPinningActivity() {
        val intent = Intent(this, PinningActivity::class.java)
        startActivity(intent)
    }

    private fun configuraBtnRootActivity(){
        val btnGoRoot = findViewById<Button>(R.id.activity_main_btn_go_root)
        btnGoRoot.setOnClickListener{
            val rootBeer = RootBeer(this)
            if (rootBeer.isRooted) {
                Log.i("VulAppConsultingStudy","root")
            } else {
                Log.i("VulAppConsultingStudy","não root")
                //we didn't find indication of root
            }
        }
    }


}