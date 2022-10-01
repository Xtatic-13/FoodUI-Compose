package com.xtatix13.foodui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xtatix13.foodui.opsans


@Composable
fun CustomCard(restoname: String, painter: Painter, desc: String, rating: Double, start_price: Int, modifier: Modifier = Modifier){
    Card(
        modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = 12.dp
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
            contentAlignment = Alignment.BottomStart

        ) {
            Image(painter = painter, contentDescription = restoname, contentScale = ContentScale.Crop)
            Box(
                Modifier
                    .height(78.dp)
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Column(Modifier.fillMaxSize()) {
                    Row(
                        Modifier
                            .weight(1f)
                            .padding(top = 8.dp, bottom= 4.dp, start = 10.dp, end = 10.dp)
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(restoname, style = TextStyle(color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold), fontFamily = opsans)
                        Card (
                            Modifier
                                .height(32.dp)
                                .width(46.dp),
                            shape = RoundedCornerShape(4.dp)

                                ){
                            Box(
                                Modifier
                                    .background(Color(0xFF008881))
                                    .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Row(
                                    Modifier
                                        .padding(4.dp)
                                        .fillMaxSize(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(text = rating.toString(), style = TextStyle(Color.White))
                                    Icon(imageVector = Icons.Filled.Star, contentDescription = "rating", tint = Color.Yellow)
                                }
                            }
                        }

                    }
                    Row (
                        Modifier
                            .weight(1f)
                            .fillMaxSize()
                            .padding(top = 4.dp, bottom= 8.dp, start = 10.dp, end = 10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                            ){
                        Text(desc, overflow = TextOverflow.Ellipsis, modifier = Modifier.size(200.dp, 10.dp), maxLines = 1)
                        Text("₹" + start_price.toString() + " for one", style = TextStyle(Color.Black, fontSize = 11.sp), modifier = Modifier.padding(top = 2.dp))

                    }
                }
            }
        }

    }
}