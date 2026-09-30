// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    val diemTrungBinh: Double = 8.7

    // Bắt buộc dùng when kết hợp Range
    val xepLoai = when (diemTrungBinh) {
        in 8.5..10.0 -> "Xuất sắc"
        in 8.0..<8.5 -> "Giỏi"
        in 6.5..<8.0 -> "Khá"
        in 5.0..<6.5 -> "Trung bình"
        in 0.0..<5.0 -> "Yếu"
        else -> "Điểm số không hợp lệ"
    }

    println("Điểm trung bình: $diemTrungBinh")
    println("Xếp loại học lực: $xepLoai")
}