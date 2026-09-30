// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int

    fun moTa() {
        println("Phương tiện này có tốc độ tối đa là $tocDoToiDa km/h")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 120
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 200
}

fun main() {
    val xm = XeMay()
    val oto = OTo()

    print("Xe máy: ")
    xm.moTa()

    print("Ô tô: ")
    oto.moTa()
}