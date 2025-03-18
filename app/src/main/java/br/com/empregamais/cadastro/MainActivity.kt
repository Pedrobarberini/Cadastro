package br.com.empregamais.cadastro

import android.R.attr.value
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.empregamais.cadastro.ui.theme.CadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CadastroTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Cadastro(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Cadastro(modifier: Modifier) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Image(
        painter = painterResource(id = R.drawable.back_03),
        contentDescription = ("imagem de fundo"),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
    )
    Image(

        painter = painterResource(id = R.drawable.logo_emprega),
        contentDescription = ("Logo da empresa , Emprega+"),
        modifier = Modifier
            .size(440.dp)
            .padding(start = 250.dp, top = 30.dp, bottom = 320.dp, end = 20.dp)


    )

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            text = "Cadastre-se",
            modifier = Modifier
                .padding(start = 20.dp, top = 100.dp)

        )

        OutlinedTextField(
            placeholder = { Text(
                text = "Nome",
                color = Color.White

            ) },
            value = name,
            onValueChange = { name = it },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                cursorColor = Color.White
            ),
            modifier = Modifier
                .padding(start = 50.dp, top = 30.dp)
                .fillMaxWidth(0.8f)

        )
        Box (
            modifier = Modifier
                .padding(start = 50.dp)
                .fillMaxWidth(0.8f)
                .height(2.dp)
                .background(Color(0xFF00BCD4)) ){
        }
        OutlinedTextField(
            placeholder = { Text(
                text = "Email",
                color = Color.White
            ) },
            value = email,
            onValueChange = { email = it },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            modifier = Modifier
                .padding(start = 50.dp, top = 30.dp)
                .fillMaxWidth(0.8f)

        )
        Box (
            modifier = Modifier
                .padding(start = 50.dp)
                .fillMaxWidth(0.8f)
                .height(2.dp)
                .background(Color(0xFF00BCD4)) ){
        }

        OutlinedTextField(
            placeholder = { Text(
                text = "Telefone",
                color = Color.White
            ) },
            value = telefone,
            onValueChange = { telefone = it },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            modifier = Modifier
                .padding(start = 50.dp, top = 30.dp)
                .fillMaxWidth(0.8f)

        )
        Box (
            modifier = Modifier
                .padding(start = 50.dp)
                .fillMaxWidth(0.8f)
                .height(2.dp)
                .background(Color(0xFF00BCD4)) ){
        }
        OutlinedTextField(
            placeholder = { Text(
                text = "CPF",
                color = Color.White
            ) },
            value = cpf,
            onValueChange = { cpf = it },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            modifier = Modifier
                .padding(start = 50.dp, top = 30.dp)
                .fillMaxWidth(0.8f)

        )
        Box (
            modifier = Modifier
                .padding(start = 50.dp)
                .fillMaxWidth(0.8f)
                .height(2.dp)
                .background(Color(0xFF00BCD4)) ){
        }
        OutlinedTextField(

            placeholder = { Text(
                text = "Senha",
                color = Color.White
            ) },
            value = senha,
            onValueChange = { senha = it },
            visualTransformation = PasswordVisualTransformation(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            modifier = Modifier

                .padding(start = 50.dp, top = 30.dp)
                .fillMaxWidth(0.8f)

        )
        Box (
            modifier = Modifier
                .padding(start = 50.dp)
                .fillMaxWidth(0.8f)
                .height(2.dp)
                .background(Color(0xFF00BCD4)) ){
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(start = 125.dp)
        ) {
            Button(
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFC107)
                ),
                shape = RoundedCornerShape(8.dp),
                onClick = {/*TODO*/ },
                modifier = Modifier

                    .fillMaxWidth(0.5f)
                    .padding(top = 20.dp , start = 10.dp)

            ) {
                Text(
                    fontSize = 20.sp,
                    color = Color.White,
                    text = "Cadastrar"
                )
            }
        }
    }
    Image(
        painter = painterResource(id = R.drawable.redes_sociais),
        contentDescription = ("imagem de fundo"),
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .padding(start = 70.dp, top = 620.dp)
            .size(250.dp),
    )


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCadastro() {
    Cadastro(
        modifier = Modifier
    )
}