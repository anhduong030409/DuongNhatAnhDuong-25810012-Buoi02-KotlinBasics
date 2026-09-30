// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

class KhachHang(var ho: String, var ten: String) {
    // Custom getter và setter cho hoTen
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split(" ")
            if (parts.size >= 2) {
                ho = parts.first()
                ten = parts.subList(1, parts.size).joinToString(" ")
            }
        }
}

fun main() {
    val kh = KhachHang("Nguyễn", "An")
    println("Họ tên ban đầu: ${kh.hoTen}")

    // Đổi giá trị ten và kiểm tra hoTen
    kh.ten = "Bình"
    println("Sau khi đổi tên thành Bình -> hoTen: ${kh.hoTen}")

    // Gán hoTen bằng một chuỗi mới và kiểm tra ho, ten
    kh.hoTen = "Trần Văn Cường"
    println("Sau khi gán hoTen = 'Trần Văn Cường':")
    println("Họ: ${kh.ho}")
    println("Tên: ${kh.ten}")
}