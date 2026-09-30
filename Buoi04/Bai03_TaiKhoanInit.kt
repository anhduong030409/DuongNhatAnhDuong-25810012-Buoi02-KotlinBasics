// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

class TaiKhoanNganHang(soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    // Khối init kiểm tra điều kiện ngay khi khởi tạo
    init {
        if (soDuBanDau < 0) {
            println("Số dư không hợp lệ cho tài khoản $soTaiKhoan!")
        } else {
            println("Tạo tài khoản $soTaiKhoan thành công với số dư ban đầu: $soDuBanDau VNĐ")
        }
    }
}

fun main() {
    println("--- Khởi tạo tài khoản 1 ---")
    val tk1 = TaiKhoanNganHang("123456", 1000000.0)

    println("\n--- Khởi tạo tài khoản 2 ---")
    val tk2 = TaiKhoanNganHang("654321", -500000.0)
}