// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    val canNangKg: Double = 50.0
    val chieuCaoM: Double = 1.58

    val bmi: Double = canNangKg / (chieuCaoM * chieuCaoM)
    val phanLoai: String

    // Sử dụng if else if nhiều nhánh
    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 24.9) {
        phanLoai = "Bình thường"
    } else if (bmi < 29.9) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Chiều cao: $chieuCaoM m, Cân nặng: $canNangKg kg")
    println("Chỉ số BMI: %.2f".format(bmi))
    println("Phân loại: $phanLoai")
}