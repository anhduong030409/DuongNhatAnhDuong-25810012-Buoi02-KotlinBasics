package com.example.dicerollerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFE8F1F5)
                ) {
                    DiceRollerApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableIntStateOf(1) }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Khối hiển thị mặt xúc xắc tự vẽ (không lo thiếu ảnh)
        Card(
            modifier = Modifier
                .size(160.dp)
                .shadow(8.dp, RoundedCornerShape(24.dp))
                .border(3.dp, Color(0xFF002B49), RoundedCornerShape(24.dp)),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                DiceFace(number = result)
            }
        }

        Spacer(modifier = Modifier.height(48.dp))

        // Nút bấm đổ xúc xắc
        Button(
            onClick = { result = (1..6).random() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF005A9C)
            ),
            shape = RoundedCornerShape(12.dp),
            contentPadding = PaddingValues(horizontal = 32.dp, vertical = 14.dp)
        ) {
            Text(
                text = "Roll",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

// Hàm hỗ trợ vẽ các chấm tròn cho xí ngầu từ 1 đến 6
@Composable
fun DiceFace(number: Int) {
    when (number) {
        1 -> SingleDot()
        2 -> DoubleDot()
        3 -> TripleDot()
        4 -> FourDot()
        5 -> FiveDot()
        6 -> SixDot()
    }
}

@Composable
fun Dot() {
    Box(
        modifier = Modifier
            .size(20.dp)
            .background(Color(0xFF002B49), CircleShape)
    )
}

@Composable
fun SingleDot() {
    Dot()
}

@Composable
fun DoubleDot() {
    Row(horizontalArrangement = Arrangement.spacedBy(32.dp)) {
        Dot(); Dot()
    }
}

@Composable
fun TripleDot() {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Dot(); Dot(); Dot()
    }
}

@Composable
fun FourDot() {
    Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
        Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) { Dot(); Dot() }
        Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) { Dot(); Dot() }
    }
}

@Composable
fun FiveDot() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.size(100.dp)) {
        FourDot()
        Dot()
    }
}

@Composable
fun SixDot() {
    Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) { Dot(); Dot(); Dot() }
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) { Dot(); Dot(); Dot() }
    }
}