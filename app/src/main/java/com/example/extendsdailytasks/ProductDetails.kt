package com.example.extendsdailytasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extendsdailytasks.model.Product
import com.example.extendsdailytasks.ui.theme.ExtendsDailyTasksTheme
import com.example.extendsdailytasks.ui.theme.dividerColor

@Composable
fun ProductDetailView(product: Product, onClick : () -> Unit){

    var checked by remember {
        mutableStateOf(false)
    }

        Column() {
            Image(painter =    if (checked)
                painterResource(id = R.drawable.red_heart)
            else painterResource(id =R.drawable.ic_dimmed_heart),
                contentDescription = "Share",modifier =
                Modifier
                    .align(Alignment.End).padding(top = 12.dp, end = 24.dp)
                    .width(24.dp)
                    .height(32.dp)
                    .clickable {
                        checked = !checked
                    })

            Image(painter = painterResource(id = R.drawable.kitkat),
                contentDescription =null, modifier = Modifier.size(380.dp),)
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = product.name, fontSize = 18.sp,
                modifier = Modifier.padding(start = 24.dp, top = 18.dp))
                Text(text = "- ${product.wieght} x 12", fontSize = 18.sp,
                    modifier = Modifier.padding(top = 18.dp, start = 4.dp,end = 24.dp))
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = product.calories, fontSize = 12.sp,
                    modifier = Modifier.padding(start = 24.dp, top = 12.dp),
                color = Color.Black)
                Text(text = "  SR per unit", fontSize = 12.sp,
                    modifier = Modifier.padding(top = 12.dp),
                color = Color.Black)
            }
            Text(text = product.type, fontSize = 18.sp,
                modifier = Modifier.padding(start = 24.dp, top = 12.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement =
            Arrangement.SpaceBetween) {

                Text(text = product.price, fontSize = 24.sp,
                    modifier = Modifier.padding(start = 26.dp, top = 12.dp),
                    color = Color.Black)

                Text(text = "Including VAT", fontSize = 16.sp,
                    modifier = Modifier.padding(end = 24.dp, top = 12.dp),
                    color = dividerColor)
            }
        }

    }

@Preview(showBackground = true)
@Composable
fun ProductDetailsPreview() {
    ExtendsDailyTasksTheme {
        val product1 = Product(1,
    "https:\\/\\/www.themealdb.com\\/images\\/category\\/beef.png" ,
    "Kikate CHoclate Flavored", "122", "300", "400", "Choclate")
    ProductDetailView(product = product1) {}
        }
}
