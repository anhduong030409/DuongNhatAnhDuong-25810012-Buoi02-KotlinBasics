// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    // Khởi tạo mảng chứa 10 điểm
    val diemSinhVien: Array<Double> = arrayOf(7.5, 8.0, 5.5, 9.0, 4.0, 6.5, 8.5, 10.0, 3.5, 7.0)

    var tongDiem = 0.0
    var diemCaoNhat = diemSinhVien[0]
    var diemThapNhat = diemSinhVien[0]

    // Tự viết vòng lặp so sánh (Không dùng hàm min/max)
    for (diem in diemSinhVien) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTB = tongDiem / diemSinhVien.size

    println("Điểm trung bình cả lớp: %.2f".format(diemTB))
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}