// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    // Khai báo kiểu Function Type tường minh: (String) -> Boolean
    val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

    val mk1 = "12345"
    val mk2 = "admin123"
    val mk3 = "kotlincode2026"

    println("Mật khẩu '$mk1' hợp lệ? -> ${kiemTraDoDai(mk1)}")
    println("Mật khẩu '$mk2' hợp lệ? -> ${kiemTraDoDai(mk2)}")
    println("Mật khẩu '$mk3' hợp lệ? -> ${kiemTraDoDai(mk3)}")
}