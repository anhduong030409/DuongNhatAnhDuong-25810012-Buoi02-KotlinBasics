package com.example.bookshelf.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.bookshelf.network.BookItem

@Composable
fun HomeScreen(
    booksUiState: BooksUiState,
    modifier: Modifier = Modifier
) {
    when (booksUiState) {
        is BooksUiState.Loading -> Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Đang tải danh sách sách...")
        }
        is BooksUiState.Success -> BooksGridScreen(
            books = booksUiState.books,
            modifier = modifier.fillMaxSize()
        )
        is BooksUiState.Error -> Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Lỗi kết nối hoặc không thể tải dữ liệu!")
        }
    }
}

@Composable
fun BooksGridScreen(
    books: List<BookItem>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(120.dp),
        modifier = modifier.padding(8.dp),
        contentPadding = PaddingValues(4.dp)
    ) {
        items(items = books, key = { book -> book.id }) { book ->
            BookCard(
                book = book,
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth()
                    .height(180.dp)
            )
        }
    }
}

@Composable
fun BookCard(book: BookItem, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current)
                .data(book.volumeInfo.imageLinks?.httpsThumbnail)
                .crossfade(true)
                .build(),
            contentDescription = book.volumeInfo.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}