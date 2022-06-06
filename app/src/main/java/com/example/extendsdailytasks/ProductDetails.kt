package com.example.extendsdailytasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.extendsdailytasks.model.Product
import com.example.extendsdailytasks.ui.theme.ExtendsDailyTasksTheme

@Composable
fun ProductDetailView(product: Product, onClick : () -> Unit){

    Column() {
        Image(painter = painterResource(id = R.drawable.dimmed_heart),
            contentDescription = "Share",modifier =
            Modifier.align(Alignment.End).width(18.dp).height(24.dp)
                .padding(end = 24.dp))

        Image(painter = painterResource(id = R.drawable.kitkat),
            contentDescription =null )
        Row() {
            Text(text = product.name)
            Text(text = product.wieght)
        }
        Text(text = product.calories)
        Text(text = product.type)
        Row() {
            Text(text = product.price)
            Text(text = "Including VAT")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDetailsPreview() {
    ExtendsDailyTasksTheme {
        val product1 = Product(1,
    "https:\\/\\/www.themealdb.com\\/images\\/category\\/beef.png" ,
    "Product", "122", "300", "400", "Choclate")
    ProductDetailView(product = product1) {}
        }
}