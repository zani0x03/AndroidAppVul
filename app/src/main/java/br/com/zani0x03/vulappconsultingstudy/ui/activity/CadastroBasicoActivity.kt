package br.com.zani0x03.vulappconsultingstudy.ui.activity

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import br.com.zani0x03.vulappconsultingstudy.R
import br.com.zani0x03.vulappconsultingstudy.const.Constants
import br.com.zani0x03.vulappconsultingstudy.model.ClasseNaoOfuscada
import br.com.zani0x03.vulappconsultingstudy.model.ClasseOfuscada
import java.time.LocalDate

class CadastroBasicoActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_basico)
        configuraBotaoSalvar()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun configuraBotaoSalvar(){
        val btnSalvar = findViewById<Button>(R.id.activity_cadastro_basico_btn_salvar)
        btnSalvar.setOnClickListener{

            val nome = findViewById<EditText>(R.id.activity_cadastro_basico_edt_nome).text.toString()
            val data =
                findViewById<EditText>(R.id.activity_cadastro_basico_edt_data).text.toString()


            val classeNaoOfuscada = ClasseNaoOfuscada(nome, LocalDate.parse(data))
            val classeOfuscada = ClasseOfuscada(nome, LocalDate.parse(data))


            Log.i(Constants.ApplicationName, classeNaoOfuscada.maiorDeIdade().toString())
            Log.i(Constants.ApplicationName, classeOfuscada.maiorDeIdade().toString())
        }
    }
}