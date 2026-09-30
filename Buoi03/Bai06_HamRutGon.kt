// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

// 1. Tính bình phương một số
fun tinhBinhPhuongDayDu(n: Int): Int {
    return n * n
}
fun tinhBinhPhuongRutGon(n: Int): Int = n * n

// 2. Tính chu vi hình vuông
fun chuViHinhVuongDayDu(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

// 3. Kiểm tra số chẵn
fun kienTraSoChanDayDu(n: Int): Boolean {
    return n % 2 == 0
}
fun kienTraSoChanRutGon(n: Int): Boolean = n % 2 == 0

fun main() {
    println("Bình phương của 5 (đầy đủ vs rút gọn): ${tinhBinhPhuongDayDu(5)} - ${tinhBinhPhuongRutGon(5)}")
    println("Chu vi hình vuông cạnh 4.5: ${chuViHinhVuongDayDu(4.5)} - ${chuViHinhVuongRutGon(4.5)}")
    println("Số 8 là số chẵn?: ${kienTraSoChanDayDu(8)} - ${kienTraSoChanRutGon(8)}")
}