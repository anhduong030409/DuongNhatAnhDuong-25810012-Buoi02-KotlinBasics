// Họ và tên: [Họ và Tên] - MSSV: [MSSV]

// Khai báo 2 tham số bắt buộc đứng trước, 3 tham số mặc định đứng sau
fun dinhDangDiaChi(
    soNha: String,
    tenDuong: String,
    phuongXa: String = "Phường Bến Nghé",
    quanHuyen: String = "Quận 1",
    thanhPho: String = "TP. Hồ Chí Minh"
): String {
    return "$soNha $tenDuong, $phuongXa, $quanHuyen, $thanhPho"
}

fun main() {
    // Gọi hàm và bắt buộc dùng Named Arguments cho các tham số mặc định
    val diaChi1 = dinhDangDiaChi(
        soNha = "123",
        tenDuong = "Lê Lợi",
        quanHuyen = "Quận 3"
    )

    val diaChi2 = dinhDangDiaChi(
        soNha = "456",
        tenDuong = "Nguyễn Huệ",
        thanhPho = "Hà Nội"
    )

    println("Địa chỉ 1: $diaChi1")
    println("Địa chỉ 2: $diaChi2")
}