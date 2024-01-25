package eu.tutorials.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

@Composable
fun FirstScreen(,navigationToSecondScreen:(String,Int)->Unit){
    val name =remember{ mutableStateOf("") }
    val age =remember{ mutableStateOf(1) }
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(text = "this your first page")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = name.value, onValueChange ={name.value =it})
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = age.value.toString(), onValueChange ={age.value=it.toIntOrNull()?:1})
        Button(onClick = { navigationToSecondScreen(name.value,age.value) }) {
            Text(text = "go to 2nd Screen")
        }
    }
}

