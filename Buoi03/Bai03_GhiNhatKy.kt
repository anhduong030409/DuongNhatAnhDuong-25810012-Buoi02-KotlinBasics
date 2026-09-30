// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

// Phiên bản 1: Khai báo tường minh kiểu trả về là Unit
fun ghiNhatKyTuongMinh(hanhDong: String): Unit {
    println("[LOG LOGGED]: $hanhDong")
}

// Phiên bản 2: Bỏ qua khai báo kiểu trả về Unit
fun ghiNhatKyAn(hanhDong: String) {
    println("[LOG LOGGED]: $hanhDong")
}

fun main() {
    ghiNhatKyTuongMinh("Đăng nhập vào hệ thống thành công")
    ghiNhatKyAn("Đăng nhập vào hệ thống thành công")
}