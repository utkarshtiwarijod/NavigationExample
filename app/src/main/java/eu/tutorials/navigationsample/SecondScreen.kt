package eu.tutorials.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreen(name:String,age:Int,navigationToFirstScreen:(String,Int)->Unit){

    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(text = "This your second page")
        Text(text = "WELCOME $name")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "welcome")

       Button(onClick = { navigationToFirstScreen(name,12) }) {
            Text(text = "go to third screen")
        }
        
    }
}

