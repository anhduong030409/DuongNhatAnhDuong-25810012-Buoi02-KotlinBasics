package com.example.bookshelf.data

import com.example.bookshelf.network.BookItem
import com.example.bookshelf.network.BooksApiService

interface BooksRepository {
    suspend fun getBooks(query: String): List<BookItem>
}

class NetworkBooksRepository(
    private val booksApiService: BooksApiService
) : BooksRepository {
    override suspend fun getBooks(query: String): List<BookItem> {
        return booksApiService.searchBooks(query).items ?: emptyList()
    }
}