package com.example.bookshelf.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookResponse(
    val items: List<BookItem>? = emptyList()
)

@Serializable
data class BookItem(
    val id: String,
    val volumeInfo: VolumeInfo
)

@Serializable
data class VolumeInfo(
    val title: String? = "No Title",
    val imageLinks: ImageLinks? = null
)

@Serializable
data class ImageLinks(
    @SerialName("thumbnail")
    val thumbnail: String? = null
) {
    // Đổi HTTP thành HTTPS để Coil không bị lỗi bảo mật khi load ảnh
    val httpsThumbnail: String?
        get() = thumbnail?.replace("http://", "https://")
}