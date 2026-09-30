// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    val tuoi = 20

    // Gán trực tiếp biểu thức if-else cho một val duy nhất, không dùng var
    val loaiVe = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi in 12..59) {
        "Vé người lớn"
    } else {
        "Vé cao tuổi"
    }

    println("Tuổi khách hàng: $tuoi")
    println("Loại vé tương ứng: $loaiVe")
}