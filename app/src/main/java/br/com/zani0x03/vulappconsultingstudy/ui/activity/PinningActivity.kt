package br.com.zani0x03.vulappconsultingstudy.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.com.zani0x03.vulappconsultingstudy.R
import br.com.zani0x03.vulappconsultingstudy.const.Constants
import okhttp3.*
import java.io.IOException

class PinningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pinning)
        ConfigBtnPinning()
    }

    private fun ConfigBtnPinning(){
        val btnEnviarSolicitacao = findViewById<Button>(R.id.pinning_activity_btn_enviar_solicitacao)
        btnEnviarSolicitacao.setOnClickListener{
            RequestSSLPinning()
        }
    }

    private fun RequestSSLPinning(){

        val edtUrl = findViewById<EditText>(R.id.activity_pinning_edt_url)
        val edtPattern = findViewById<EditText>(R.id.activity_pinning_edt_pattern)
        val edtPinning = findViewById<EditText>(R.id.activity_pinning_edt_pinning)


        val certificatePinner = CertificatePinner.Builder().add(
            edtPattern.text.toString(),
            edtPinning.text.toString()
        ).build()

        val client = OkHttpClient.Builder().certificatePinner(certificatePinner).build()

        //val client = OkHttpClient.Builder().build()

        val request = Request.Builder()
            .url(edtUrl.text.toString())
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e(Constants.ApplicationName,e.message.toString())
            }
            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string().toString()
                Log.i(Constants.ApplicationName,body)
            }
        })
    }


}