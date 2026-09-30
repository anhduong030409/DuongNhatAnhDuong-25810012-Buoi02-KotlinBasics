// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    val soDuBanDau: Double = 5000000.0
    var soDuHienTai: Double = soDuBanDau

    println("Số dư ban đầu: $soDuBanDau VNĐ")

    // Gửi thêm 2,000,000 VNĐ
    val tienGui: Double = 2000000.0
    soDuHienTai += tienGui
    println("Sau khi gửi thêm $tienGui VNĐ, số dư là: $soDuHienTai VNĐ")

    // Rút 1,500,000 VNĐ
    val tienRut: Double = 1500000.0
    soDuHienTai -= tienRut
    println("Sau khi rút $tienRut VNĐ, số dư là: $soDuHienTai VNĐ")
}