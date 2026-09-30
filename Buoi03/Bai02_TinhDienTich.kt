// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

// Khai báo hàm trực tiếp ở cấp cao nhất của file (Top-level function), không đặt trong hàm main
fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

fun main() {
    // Gọi hàm lần 1
    val dt1 = tinhDienTich(5.0, 3.5)
    println("Diện tích HCN (5.0 x 3.5): $dt1")

    // Gọi hàm lần 2
    val dt2 = tinhDienTich(10.2, 4.0)
    println("Diện tích HCN (10.2 x 4.0): $dt2")
}