// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    val sv1 = SinhVien("21110001", "Nguyễn Văn A", 8.5)
    val sv2 = SinhVien("21110001", "Nguyễn Văn A", 8.5)

    // 1. In toString() tự sinh
    println("Object sv1 (toString tự sinh): $sv1")

    // 2. So sánh bằng == (equals tự sinh)
    println("sv1 == sv2 ?: ${sv1 == sv2}") // Kết quả trả về true

    // 3. Dùng copy() chỉ thay đổi diemTrungBinh
    val sv3 = sv1.copy(diemTrungBinh = 9.0)
    println("Object sv3 (copy từ sv1 đổi điểm): $sv3")
}