package com.example.extendsdailytasks

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainViewBottomSheet(){

        val bottomSheetScaffoldState = rememberBottomSheetScaffoldState()
        val scope = rememberCoroutineScope()
        BottomSheetScaffold(
            sheetContent = {
                BottomSheetContent()
            },
            scaffoldState = bottomSheetScaffoldState,
            sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
            sheetBackgroundColor = colorResource(id = R.color.white),
            // sheetPeekHeight = 0.dp,
            // scrimColor = Color.Red,  // Color for the fade background when you open/close the bottom sheet
        ) {
            /* Add code later */
        }
    }




@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainScreen(scope: CoroutineScope, state: BottomSheetScaffoldState) {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(id = R.color.white),
                contentColor = Color.White
            ),
            onClick = {
                scope.launch {
                    if (state.bottomSheetState.isCollapsed) {
                        state.bottomSheetState.expand()
                    } else {
                        state.bottomSheetState.collapse()
                    }
                }
            }) {
            if (state.bottomSheetState.isCollapsed) {
                Text(text = "Open Bottom Sheet Scaffold")
            } else {
                Text(text = "Close Bottom Sheet Scaffold")
            }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState()
    val scope = rememberCoroutineScope()
    MainScreen(scope = scope, state = bottomSheetScaffoldState)
}


@Composable
fun BottomSheetContent() {
    val context = LocalContext.current
    Column(modifier = Modifier.clip(
        shape = RoundedCornerShape(
        topStart = 24.dp, topEnd = 34.dp))) {
        BottomSheetListItem(
            icon = R.drawable.ic_u_subject,
            title = "Share",
            onItemClick = { title ->
                Toast.makeText(
                    context,
                    title,
                    Toast.LENGTH_SHORT
                ).show()
            })
        BottomSheetListItem(
            icon = R.drawable.ic_u_sort_amount_down,
            title = "Get link",
            onItemClick = { title ->
                Toast.makeText(
                    context,
                    title,
                    Toast.LENGTH_SHORT
                ).show()
            })
        BottomSheetListItem(
            icon = R.drawable.ic_u_sort_amount_up,
            title = "Edit name",
            onItemClick = { title ->
                Toast.makeText(
                    context,
                    title,
                    Toast.LENGTH_SHORT
                ).show()
            })
    }
}

@Preview(showBackground = true)
@Composable
fun BottomSheetContentPreview() {
    BottomSheetContent()
}

@Composable
fun BottomSheetListItem(icon: Int, title: String,
                        onItemClick: (String) -> Unit) {
    var checked by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = {
                onItemClick(title)
                checked = true
            })
            .height(55.dp)
            .background(color = colorResource(id = R.color.white))
            .padding(start = 15.dp),
    ) {
        Image(painter = painterResource(id = icon),
            contentDescription = "Share",modifier =
                    Modifier.align(Alignment.CenterStart))
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = title, color = Color.Black,
            modifier = Modifier.padding(start = 45.dp)
                .align(Alignment.CenterStart))
        Image(painter =
        if (checked) painterResource(id = R.drawable.ic_group_60421)
        else painterResource(id =R.drawable.ic_group_60421_2),
            contentDescription = "Share", modifier =
            Modifier.align(Alignment.CenterEnd).padding(end = 8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun BottomSheetListItemPreview() {
    BottomSheetListItem(icon = R.drawable.ic_u_subject,
        title = "Share", onItemClick = { })
}