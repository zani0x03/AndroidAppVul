package br.com.zani0x03.vulappconsultingstudy.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class ClasseNaoOfuscada {
    var nome: String = "defaultValue"
    var idade: Int = 18
    @RequiresApi(Build.VERSION_CODES.O)
    var dataNascimento = LocalDate.of(2018, 12, 31)
}
