// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

// Class cha đánh dấu open
open class DongVat(val ten: String) {
    open fun keu(): String {
        return "Tiếng kêu động vật"
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu!"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo!"
    }
}

fun main() {
    val danhSachDongVat: List<DongVat> = listOf(
        Cho("Cậu Vàng"),
        Meo("Mèo Miu"),
        Cho("Cún Bông")
    )

    for (dv in danhSachDongVat) {
        println("Tên: ${dv.ten} | Tiếng kêu: ${dv.keu()}")
    }
}