package com.example.assigmnet_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assigmnet_card.ui.theme.Assigmnet_CardTheme

class Card : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding->
                ProfileBody(innerPadding)

            }
        }
    }
}

@Composable
fun ProfileBody(innerPadding: PaddingValues) {
    Column ( modifier =  Modifier.padding(innerPadding)
        .fillMaxSize().background(color = Color(0xFF00C781)).padding(16.dp)){
        Row(modifier = Modifier.padding(end = 16.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically){
            Image(
                painter = painterResource(R.drawable.ronaldo),
//                tint =  Color.Black,
                contentDescription = null, contentScale = ContentScale.Crop,
                modifier = Modifier.size(36.dp).
                clip(CircleShape)

            )
        }
        Column {
            Text( text = "Card", style = TextStyle(fontSize = 25.sp,
                fontWeight = FontWeight.Bold,)
            )

        }
        Column {
            Text( text = "Simple and easy to use app", style = TextStyle(fontSize = 15.sp))
        }
        Row ( modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 10.dp, vertical = 10.dp)){
        Card(modifier = Modifier.height(170.dp).weight(1f)) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.text),
                    contentDescription = "Image description",
                    modifier = Modifier.size(64.dp)
                )
                Text(text = "Text", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))


            }

        }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier.height(170.dp).weight(1f)){
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.address),
                        contentDescription = "Image description",
                        modifier = Modifier.size(64.dp)
                    )
                    Text(text = "Address", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))


                }

            }
    }
        Row ( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)){
            Card(modifier = Modifier.height(170.dp).weight(1f)) {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.character),
                        contentDescription = "Image description",
                        modifier = Modifier.size(64.dp)
                    )

                    Text(text = "Character", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))


                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier.height(170.dp).weight(1f)){
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.bank),
                        contentDescription = "Image description",
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = "bank", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))


                }
            }
        }
        Row ( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)){
            Card(modifier = Modifier.height(170.dp).weight(1f)) {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = "Image description",
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = "Password", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))


                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier.height(170.dp).weight(1f)){
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.logistic),
                        contentDescription = "Image description",
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = "Logistics", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))


                }

            }
        }
        Row { Card(modifier = Modifier.height(100.dp).width(600.dp)){
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.setting),
                    contentDescription = "Image description",
                    modifier = Modifier.size(64.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Setting", style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold))


            }
        } }



    }


}

@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}