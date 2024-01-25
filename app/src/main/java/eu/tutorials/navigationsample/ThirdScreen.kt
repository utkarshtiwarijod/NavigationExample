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
fun ThirdScreen(navigationToFirstScreen:()->Unit){
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(text = "this your Third page")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "welcome")
        Button(onClick = { navigationToFirstScreen() }) {
            Text(text = "GO to First Screen")

        }
    }
}
@Composable
@Preview(showBackground= true)
fun ThirdScreenPreview(){
    ThirdScreen({})
}