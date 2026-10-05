package com.example.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Grain
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 1. Data Class mô tả thông tin Chủ đề/Khóa học
data class Topic(
    val name: String,
    val availableCourses: Int,
    val imageRes: Int = R.drawable.ic_launcher_foreground
)

// 2. Danh sách dữ liệu mẫu
object DataSource {
    val topics = listOf(
        Topic("Architecture", 58),
        Topic("Crafts", 121),
        Topic("Business", 78),
        Topic("Culinary", 118),
        Topic("Design", 423),
        Topic("Fashion", 92),
        Topic("Film", 165),
        Topic("Gaming", 164),
        Topic("Drawing", 326),
        Topic("Lifestyle", 305),
        Topic("Music", 212),
        Topic("Painting", 172),
        Topic("Photography", 321),
        Topic("Tech", 118)
    )
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFE8F1F5) // Tông màu xanh pastel dịu mắt
                ) {
                    TopicGridApp()
                }
            }
        }
    }
}

@Composable
fun TopicGridApp() {
    TopicGrid(
        topicList = DataSource.topics,
        modifier = Modifier.padding(8.dp)
    )
}

// 3. Grid hiển thị danh sách dạng lưới 2 cột (LazyVerticalGrid)
@Composable
fun TopicGrid(topicList: List<Topic>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Cấu hình 2 cột
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(topicList) { topic ->
            TopicCard(topic = topic)
        }
    }
}

// 4. Component thẻ hiển thị thông tin từng khóa học
@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = modifier
    ) {
        Row {
            Box {
                Image(
                    painter = painterResource(id = topic.imageRes),
                    contentDescription = topic.name,
                    modifier = Modifier
                        .size(width = 68.dp, height = 68.dp)
                        .clip(RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp))
                        .background(Color(0xFFB3CDE0)), // Nền icon xanh nhạt
                    contentScale = ContentScale.Crop
                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
            ) {
                Text(
                    text = topic.name,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF002B49), // Màu chữ xanh Navy đậm
                    maxLines = 1
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Grain,
                        contentDescription = null,
                        tint = Color(0xFF005A9C),
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = topic.availableCourses.toString(),
                        fontSize = 12.sp,
                        color = Color(0xFF555555)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopicGridPreview() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFE8F1F5)
        ) {
            TopicGridApp()
        }
    }
}