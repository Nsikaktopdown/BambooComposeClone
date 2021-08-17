package com.nsikakthompson.bamboocompose.ui.widgets

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun balanceLayout() {
    ConstraintLayout(
    ) {

        val (currency, balance, trailing) = createRefs()


        Text(
            "$", Modifier.constrainAs(currency) {
                //top.linkTo(parent.top, margin = 16.dp)
                bottom.linkTo(balance.bottom, margin = 4.dp)

            },
            style = MaterialTheme.typography.body1,
            color = Color.White
        )
        Text(
            "4,000", Modifier.constrainAs(balance) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(currency.end)
            },
            style = MaterialTheme.typography.h1,
            color = Color.White
        )
        Text(
            ".0", Modifier.constrainAs(trailing) {
                start.linkTo(balance.end)
                bottom.linkTo(balance.bottom,margin = 4.dp)
            },
            style = MaterialTheme.typography.body1,
            color = Color.White
        )


    }
}

@Composable
fun WalletView() {

    Column(

        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colors.primary),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        balanceLayout()
        Row() {
            Text(
                "$0.00",
                color = Color.White,
                style = MaterialTheme.typography.h3,
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                "(0.00%)",
                color = Color.White,
                style = MaterialTheme.typography.h3,
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                "TODAY",
                color = Color.White,
                style = MaterialTheme.typography.body2,
            )
        }
        Text(
            "PORTFOLIO VALUE",
            color = Color.White,
            style = MaterialTheme.typography.body2,
        )
        Spacer(modifier = Modifier.height(5.dp))
        Divider(
            color = Color.White,
            thickness = 1.dp,
            modifier = Modifier.width(100.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Text(
                "$0.00",
                color = Color.White,
                style = MaterialTheme.typography.h3,
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                "BUYING POWER",
                color = Color.White,
                style = MaterialTheme.typography.body2,
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White
        ), onClick = { /*TODO*/ }) {
            Text("Deposit Money", color = MaterialTheme.colors.primary)


        }
        Spacer(modifier = Modifier.height(30.dp))
    }



}