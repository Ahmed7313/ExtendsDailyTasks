package com.example.extendsdailytasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extendsdailytasks.model.Product

//val product1 = Product(1,
//    "https:\\/\\/www.themealdb.com\\/images\\/category\\/beef.png" ,
//    "Product", "122", "300")
//val product2 = Product(1,
//    "https:\\/\\/www.themealdb.com\\/images\\/category\\/beef.png" ,
//    "Product", "122", "300")
//val product3 = Product(1,
//    "https:\\/\\/www.themealdb.com\\/images\\/category\\/beef.png" ,
//    "Product", "122", "300")
//val product4 = Product(1,
//    "https:\\/\\/www.themealdb.com\\/images\\/category\\/beef.png" ,
//    "Product", "122", "300")
//val product5 = Product(1,
//    "https:\\/\\/www.themealdb.com\\/images\\/category\\/beef.png" ,
//    "Product", "122", "300")
//val listOfProducts = listOf<Product>(product1,
//    product2,
//    product3,
//    product4,
//    product5)
//@Composable
//fun ProductScreen(
//    onItemClicked : (String) -> Unit
//){
////    val viewModel = ViewModelCompat.getViewModel<CategoryViewModel>()
////    val viewModel : CategoryViewModel by viewModel()
//
//    //val viewState by remember { viewModel.viewState }
//
//    LazyRow(  horizontalArrangement = Arrangement.spacedBy(4.dp),
//        contentPadding = PaddingValues(horizontal = 24.dp),
//        modifier = Modifier
//    ){
//        items(listOfProducts){ item ->
//            SingleTaskItem(product = item){ product ->
//                onItemClicked(product)
//            }
//        }
//    }
//}
//
//@Composable
//fun SingleTaskItem (
//    product: Product,
//    onclick : (String) -> Unit
//){
//    Card(modifier = Modifier
//        .padding(8.dp)
//        .fillMaxWidth()
//        .clickable { onclick("") },
//        elevation = 8.dp) {
//        Column (modifier = Modifier.padding(16.dp)){
//            Image(
//                modifier = Modifier.size(80.dp),
//                painter = rememberAsyncImagePainter(model = product.image),
//                contentDescription = null)
//
//            Text(text = product.name, fontSize = 14.sp)
//
//            Text(text = product.wieght, fontSize = 10.sp)
//
//            Text(text = product.price,
//                fontSize = 16.sp,
//                color = Red700)
//        }
//    }
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun preview(){
//    ProductScreen{}
//}