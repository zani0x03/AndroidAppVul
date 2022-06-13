package br.com.zani0x03.vulappconsultingstudy.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.util.*

class ClasseNaoOfuscada(nome:String, dataNascimento: LocalDate){
    var nome = nome
    @RequiresApi(Build.VERSION_CODES.O)
    var idade = LocalDate.now().year - dataNascimento.year
    var dataNascimento = dataNascimento

    public fun maiorDeIdade(): Boolean {
        return idade >= 18
    }
}