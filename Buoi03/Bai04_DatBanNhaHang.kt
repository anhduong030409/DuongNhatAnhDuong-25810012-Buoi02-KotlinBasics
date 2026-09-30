// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Bàn thường") {
    println("Đặt bàn thành công cho khách: $tenKhachHang | Số lượng: $soLuongKhach | Loại bàn: $loaiBan")
}

fun main() {
    // Cách 1: Dùng giá trị mặc định cho tham số loaiBan
    datBan("Nguyễn Văn A", 2)

    // Cách 2: Truyền đủ các tham số theo đúng thứ tự
    datBan("Trần Thị B", 4, "Bàn VIP")

    // Cách 3: Truyền tham số bằng tên (Named Arguments)
    datBan(soLuongKhach = 6, loaiBan = "Bàn ngoài trời", tenKhachHang = "Lê Văn C")
}