// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

// Khai báo 3 thuộc tính bằng val ngay trong phần đầu class, soLuongTonKho có giá trị mặc định là 0
class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    // Object 1: Truyền đủ 3 tham số
    val sp1 = SanPham("Điện thoại Samsung", 15000000.0, 50)

    // Object 2: Chỉ truyền 2 tham số bắt buộc bằng named arguments
    val sp2 = SanPham(tenSanPham = "Tai nghe Bluetooth", gia = 500000.0)

    // In thông tin qua truy cập dấu chấm
    println("--- Sản phẩm 1 ---")
    println("Tên: ${sp1.tenSanPham} | Giá: ${sp1.gia} VNĐ | Tồn kho: ${sp1.soLuongTonKho}")

    println("\n--- Sản phẩm 2 ---")
    println("Tên: ${sp2.tenSanPham} | Giá: ${sp2.gia} VNĐ | Tồn kho: ${sp2.soLuongTonKho}")
}