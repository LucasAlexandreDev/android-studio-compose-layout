package com.example.composelayoutpt2

import android.R
import android.R.attr.height
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelayoutpt2.ui.theme.ComposeLayoutPt2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLayoutPt2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Chama a função criada no @composable
                    LayoutScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun LayoutScreen(modifier: Modifier = Modifier) {

    // Componente(parâmetros de configuração) { escopo com os componentes filhos }
    // Column    (                          ) {                                  }

    // Criação do elemento COLUNA (vertical)
    Column(modifier = modifier

        // .background(color = Color.Magenta)   // Color - propriedade do background - cores sólidas
        .background(color = Color(0xFFEFE7DA))  // 0xFF (# hexadecimal)
        .fillMaxSize(),                         // preenchimento total da página

        horizontalAlignment = Alignment.CenterHorizontally  // centraliza horizontalmente

    ){
        // Criação do elemento COLUNA (vertical)
        Column(modifier = Modifier

            .background(color = Color.Yellow)
            .weight(1f)  // Na Column, o weight controla a altura - height
                         // Na Row, o weight controla a largura   - width
            .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){

            Text(
                text = "IMG",
                color = Color.Black,
                fontSize = 40.sp,
                textAlign = TextAlign.Center
            )

            Text("Teste 02")
            Text("Teste 03")
        }

        Row(modifier = Modifier

            .background(color = Color.Gray)
            .weight(1f)
            .fillMaxSize(),

            verticalAlignment     = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceAround
        ){

            Text(
                text = "IMG",
                color = Color.Black,
                fontSize = 40.sp,
                textAlign = TextAlign.Center
            )

            Text("Teste 02")
            Text("Teste 03")
        }
    }


}

