package com.xtatix13.foodui

import SearchBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.xtatix13.foodui.widgets.CustomCard


val opsans = FontFamily((Font(R.font.op_regular,FontWeight.Thin)),Font(R.font.op_bold,FontWeight.Bold))

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier.fillMaxSize()
            ) {
                SearchBar()
                LazyColumn(){
                    item { CustomCard(restoname = "Capital Grille", painter = painterResource(id = R.drawable.image2), desc = demo_disc, rating = 4.1, start_price = 200, modifier = Modifier.height(250.dp)) }
                    item { CustomCard(restoname = "Cafe Moonlight", painter = painterResource(id = R.drawable.cafe), desc = demo_disc, rating = 4.1, start_price = 200, modifier = Modifier.height(250.dp)) }
                    item { CustomCard(restoname = "Island Grill", painter = painterResource(id = R.drawable.duff), desc = demo_disc, rating = 4.1, start_price = 200, modifier = Modifier.height(250.dp)) }
                    item { CustomCard(restoname = "Munchbox", painter = painterResource(id = R.drawable.jav), desc = demo_disc, rating = 4.1, start_price = 200, modifier = Modifier.height(250.dp)) }
                    item { CustomCard(restoname = "Next Level", painter = painterResource(id = R.drawable.fine), desc = demo_disc, rating = 4.1, start_price = 200, modifier = Modifier.height(250.dp)) }

                }
            }
        }
    }
}

val demo_disc : String = "Fine Dining, Great Ambience and Best Food"
val demo_name : String = "Restaurant Name"



