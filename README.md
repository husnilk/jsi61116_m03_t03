# Tugas M03: Class Tabungan

Buatlah class berikut `Tabungan` yang memiliki property

* `nama` untuk Nama Nasabah
* `no_rek` : Nomor Rekening
* `status_rek` Status Rekening (0: tidak aktif, 1: aktif, 2 : blokir)
* `saldo` : Saldo

Kelas tersebut memiliki method berikut ini
* Constructor yang digunakan untuk menset nama dan nomor rekening
* Constructor yang digunakan untuk menset nama, nomor rekening dan saldo
* Method `tabung()` untuk menambah saldo. Method ini memiliki argumen berupa jumlah uang yang ditabung.
* Method `tarik()` untuk menarik tabungan (akan mengurangi saldo). Method ini memiliki argumen berupa jumlah uang yang ditarik
* `Getter` & `Setter` untuk properti status. Status tidak boleh selain dari 3 property tersebut
* Method `hitung()` untuk menghitung bunga tabungan yaitu 2.5% dari total saldo.
* Method `toString()` untuk menampilkan informasi Nama, Nomor Rekening, Status Rekening dan Saldo tabungan.
