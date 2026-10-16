package com.example.bookshelf.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookshelf.data.BooksRepository
import com.example.bookshelf.data.NetworkBooksRepository
import com.example.bookshelf.network.BookItem
import com.example.bookshelf.network.BooksApi
import kotlinx.coroutines.launch

sealed interface BooksUiState {
    data class Success(val books: List<BookItem>) : BooksUiState
    object Error : BooksUiState
    object Loading : BooksUiState
}

class BooksViewModel(
    private val booksRepository: BooksRepository = NetworkBooksRepository(BooksApi.retrofitService)
) : ViewModel() {

    var booksUiState: BooksUiState by mutableStateOf(BooksUiState.Loading)
        private set

    init {
        getBooks("android") // Từ khóa tìm kiếm sách mặc định
    }

    fun getBooks(query: String) {
        viewModelScope.launch {
            booksUiState = BooksUiState.Loading
            booksUiState = try {
                BooksUiState.Success(booksRepository.getBooks(query))
            } catch (e: Exception) {
                e.printStackTrace()
                BooksUiState.Error
            }
        }
    }
}