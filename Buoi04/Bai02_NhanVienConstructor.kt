// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

// maNhanVien không có val/var -> chỉ là tham số constructor, không phải thuộc tính class
class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {

    // Constructor phụ gọi constructor chính qua từ khóa this
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV01", "Nguyễn Văn A", 15000000.0)
    val nv2 = NhanVien("Trần Thị B")

    // nv1.maNhanVien 
    // Ghi chú giải thích: Dòng trên nếu bỏ comment sẽ bị LỖI BIÊN DỊCH vì maNhanVien được khai báo trong constructor chính mà không có từ khóa val hoặc var, do đó nó chỉ đóng vai trò là tham số khởi tạo thông thường chứ không trở thành thuộc tính (property) của object để truy cập từ bên ngoài.

    println("NV1 - Tên: ${nv1.ten}, Lương: ${nv1.luongThang}")
    println("NV2 - Tên: ${nv2.ten}, Lương: ${nv2.luongThang}")
}