fun main(){

    //tipe data number
    var age: Byte = 30
    var jarijari: Int = 70
    var height: Int = 60
    var distance: Short = 123
    //L di blakang ini untuk memaksa variable balance di treat sebagai variable dengan data type Long.
    var balance: Long = 100000L

    //underscore ini ga impact apa2, jadi cuman biar value nya enak di baca atau mempermudah
    //dalam membaca angka.
    var gaji: Long = 100_000_000_000L

    var PI: Double = 3.14

    // sama dengan var balance, var sample ini menggunakan akhiran F untuk memaksa var sample
    // ini menggunakan tipe data Float
    var sample: Float = 10.10F

    var total = (height + height) * 2 + balance

    //conversi
    var number: Int = 100

    var numberByte: Byte = number.toByte()
    var numberFloat: Float = number.toFloat()
    var numberLong: Long = number.toLong()
    var numberString: String = number.toString()
    var numberDouble: Double = number.toDouble()

    println(total)
    println(PI*(jarijari*jarijari))

    //tipe data character
    var myName: String = "Adi Nugroho"
    var myChar: Char = 'A'
    var newMyName: String = myName.substring(3,myName.length)
    println(newMyName)

    //tipe data Boolean
    var isTrue: Boolean = true

    println("is True " + !isTrue)

    //Tipe Data String.
    var namadepan: String = "adi"
    var namablakang: String = "nugroho"
    var displayName: String = "$namadepan $namablakang"
    var lorem: String = """
        lorem ipsum dolor sit amet
        lorem ipsum dolor sit amet
        lorem ipsum dolor sit amet
    """.trimIndent()

    println("Halo nama saya adalah ${displayName}")
    println(namadepan+" "+namablakang)
    println(lorem)

    //tipe data Array
    val members: Array<String> = arrayOf("adi","budi","ani")
    val nilai: Array<Int> = arrayOf(100,20,4,30,45,26)
    println("nama : ${members[0]} , nilainya ${nilai[3]}")
    members.set(2,"bagas")
    nilai.set(5,63)
    println("nama : ${members[2]} , nilainya ${nilai[5]}")

    //tipe data range. untuk membuat array yang berisi data yang angka nya berurutan.
    val adiRange = 1..100
    //adiRange.count() -> untuk mendapatkan total data di range
    //adiRange.contains(value) -> untuk mengecek apakah terdapat value tersebut
    //adiRange.first -> untuk mendapatkan nilai pertama
    //adiRange.last -> untuk mendapatkan nilai terakhir
    //adiRange.step -> untuk mendapatkan nilai tiap kenaikan.
    println(adiRange)

}