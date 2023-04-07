//contoh constant variable
const val APP = "Belajar Kotlin"
const val VERSION = 1.3

fun main(){
    /*
    * variable ada 2 jenis, mutable(bisa di ubah value nya) dan immutable (tidak bisa di ubah value nya).
    * untuk membuat variable mutable bisa menggunakan variable var
    * untuk membuat variable immutable bisa menggunakan variable val
    *
    * pola deklarasi variable : val/var namaVariable: TipeDate = data
    *
    * di rekomendasikan jika kita menggunakan variable menggunakan immutable karena value nya tidak berubah ubah.
    *
    * secara standart variable di kotlin harus di deklarasikan/di inisialisasikan nilai nya.
    *
    * variable constant : immutable data yang bisa di akses untuk keperluan global. jadi bisa di akses dimana pun.
    * cara membuatnya tinggal di tambahkan prefix const di sebelum val dan nama variablenya UPPERCASE . constant ini wajib pake val.
    * */

    //mutable
    var firstName: String = "adi"
    var lastname: String = "nugroho"
    var displayname = "$firstName $lastname"

    //immutable
    val tahunLahir: Int = 1994

    //nullable
    var name: String? = null
    println(name)
    println(name?.length)

    println("Welcome to $APP version $VERSION")

}