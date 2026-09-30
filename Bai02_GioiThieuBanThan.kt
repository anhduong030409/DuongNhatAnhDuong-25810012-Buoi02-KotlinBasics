// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    val hoTen: String = "Dương Nhật Ánh Dương"
    val namSinh: Int = 2003
    val namHienTai: Int = 2026

    val tuoi: Int = namHienTai - namSinh

    // Sử dụng string template với dấu $ để chèn biến vào chuỗi
    println("Xin chào, tôi tên là $hoTen. Năm nay tôi $tuoi tuổi (sinh năm $namSinh).")
}