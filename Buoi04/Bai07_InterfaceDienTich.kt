// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    val hv = HinhVuong(4.0)
    val ht = HinhTron(3.0)

    println("Diện tích Hình vuông (cạnh 4.0): ${hv.tinhDienTich()}")
    println("Diện tích Hình tròn (bán kính 3.0): %.2f".format(ht.tinhDienTich()))
}