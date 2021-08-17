package com.nsikakthompson.bamboocompose.ui.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nsikakthompson.bamboocompose.R
import com.nsikakthompson.bamboocompose.tools.dividerColor
import com.nsikakthompson.bamboocompose.ui.disableScrolling
import com.nsikakthompson.bamboocompose.ui.widgets.Chip
import com.nsikakthompson.bamboocompose.ui.widgets.StockItem
import com.nsikakthompson.bamboocompose.ui.widgets.WalletView
import com.nsikakthompson.bamboocompose.ui.widgets.stockItem

val stockGroup = listOf(
    "All-Stocks",
    "Technology",
    "Medical",
    "Entertainment"
)
val colors = listOf(
    Color(0xFFDB5DBD),
    Color(0xFF025889),
    Color(0xFFAB75FB),
    Color(0xFFED1D23)

)
var dummyStocks = listOf(
    StockItem(R.drawable.facebook, "Facebook", "FB", "$30.78"),
    StockItem(R.drawable.slack, "Slack Technologies", "SLK", "$100.78"),
    StockItem(R.drawable.google, "Google", "GO", "$110.78"),
    StockItem(R.drawable.tesla, "Tesla", "TSLA", "$500.78"),
    StockItem(R.drawable.facebook, "Facebook", "FB", "$30.78"),
    StockItem(R.drawable.slack, "Slack Technologies", "SLK", "$100.78"),
    StockItem(R.drawable.google, "Google", "GO", "$110.78"),
    StockItem(R.drawable.tesla, "Tesla", "TSLA", "$500.78")
)


@Composable
fun chipList() {
    val scrollState = rememberLazyListState()
    LazyRow(state = scrollState) {
        items(count = stockGroup.size) { index ->
            Chip(
                text = stockGroup[index],
                color = colors[index]
            )
        }
    }

}

@Composable
fun stockView() {
    Column(
        modifier = Modifier
            .padding(15.dp),
    ) {
        chipList()
        Spacer(Modifier.height(20.dp))
        Text(
            "My Stocks",
            style = MaterialTheme.typography.h1.copy(fontSize = 16.sp)
        )
        Spacer(Modifier.height(10.dp))


    }

}

@Preview(showBackground = true)
@Composable
fun WalletScreen() {
    val scrollListState = rememberLazyListState()
    LazyColumn(state = scrollListState) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                WalletView()


            }
        }
        item {
            stockView()
        }
        items(count = dummyStocks.size) { index ->
            Divider(color = dividerColor, thickness = 0.5.dp)
            stockItem(
                stockImage = dummyStocks[index].icon,
                name = dummyStocks[index].name,
                symbol = dummyStocks[index].symbol,
                amount = dummyStocks[index].amount
            )
            Divider(color = dividerColor,  thickness = 0.5.dp)
        }
        item {
            Spacer(Modifier.height(40.dp))
        }
    }
}
