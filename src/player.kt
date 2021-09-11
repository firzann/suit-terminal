class Pemain(var pilihanpemain:String) {
    var nama:String = pilihanpemain
    lateinit var nilai:String

    fun input():Unit{
        do {
            print("Masukan Pilihan $nama : ")
            nilai = readLine().toString()

            val valid = validasi(nilai)
        } while (!valid)
    }

}