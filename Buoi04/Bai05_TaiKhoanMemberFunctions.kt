// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

class TaiKhoanNganHangMember(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    fun napTien(soTien: Double) {
        if (soTien > 0) {
            soDu += soTien
            println("Nạp thành công $soTien VNĐ. Số dư hiện tại: $soDu VNĐ")
        }
    }

    fun rutTien(soTien: Double): Boolean {
        return if (soTien <= soDu) {
            soDu -= soTien
            println("Rút thành công $soTien VNĐ. Số dư còn lại: $soDu VNĐ")
            true
        } else {
            println("Rút thất bại! Số dư không đủ ($soDu VNĐ không đủ để rút $soTien VNĐ)")
            false
        }
    }
}

fun main() {
    val tk = TaiKhoanNganHangMember("999999", 2000000.0)

    tk.napTien(1000000.0)
    tk.rutTien(1500000.0)
    tk.rutTien(2000000.0) // Thất bại
}