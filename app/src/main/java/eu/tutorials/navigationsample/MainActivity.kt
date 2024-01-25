package eu.tutorials.navigationsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import eu.tutorials.navigationsample.ui.theme.NavigationSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        Myapp()
                }
            }
        }
    }
}
@Composable
fun Myapp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "firstScreen"){
        composable("firstScreen"){
            FirstScreen {   name,age->
                navController.navigate("secondScreen/$name/$age")
            }
        }
        composable(route="secondScreen/{name}/{age}"){
            val name = it.arguments?.getString("name")?:"no name"
            val age=it.arguments?.getInt("age")?:1
            SecondScreen({}) {
               navController.navigate("firstScreen")
            }
        }
       /* composable("thirdScreen"){
            ThirdScreen {
                navController.navigate("firstScreen")
            }

        }*/

    }
}
