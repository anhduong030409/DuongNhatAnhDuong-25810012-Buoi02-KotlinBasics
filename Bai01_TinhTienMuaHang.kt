// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    val soLuong: Int = 5
    val donGia: Double = 150000.0

    // Bắt buộc ép kiểu soLuong sang Double trước khi nhân với donGia
    val tienHang: Double = soLuong.toDouble() * donGia
    val thue: Double = tienHang * 0.08
    val tongTien: Double = tienHang + thue

    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VNĐ")
    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế (8%): $thue VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
}