package com.dicoding.mountainina

object MountainData {
    private val MountainNames = arrayOf("Jayawijaya - Papua",
    "Kerinci - Jambi",
    "Rinjani - Lombok",
    "Semeru - Jatim",
    "Sanggar - Lombok",
    "Latimojong - Sulsel",
    "Selamet - Jateng",
    "Sumbing - Jateng",
    "Raung - Jatim",
    "Lawu - Jateng",
    "Merbabu - Jateng",
    "Ciremai - Jabar")


    private val mountainDetails = arrayOf("Ketinggian: 4.884 mdpl, Puncak Jaya yang dikenal juga dengan nama Cartenz Pyramid adalah bagian dari pegunungan Sudirman di Papua dan merupakan puncak tertinggi di Indonesia. Menjadi salah satu dari tujuh puncak dunia, di puncak gunung tertinggi di Indonesia ini kamu juga bisa menemukan satu-satunya gletser tropika di Indonesia",
    "Ketinggian: 3.805 mdpl, Di deretan kedua gunung paling tinggi di Indonesia terdapat Gunung Kerinci yang berada di Provinsi Jambi. Merupakan salah satu gunung berapi aktif, gunung tertinggi di pulau Sumatera ini jadi salah satu destinasi pendakian favorit, khususnya pendaki yang telah berpengalaman.",
    "Ketinggian: 3.762 mdpl, Gunung tertinggi di Indonesia selanjutnya berada di gugusan kepulauan Nusa Tenggara, tepatnya di pulau Lombok. Selain menantang, pendakian Gunung Rinjani menawarkan panorama alam yang sangat menakjubkan, menjadikannya salah satu destinasi pendakian populer dan favorit.",
    "Ketinggian: 3.676 mdpl, Menjadi gunung tertinggi di pulau Jawa, Gunung Semeru merupakan salah satu gunung paling tinggi yang ada di Indonesia. Gunung berapi kerucut ini sangat populer, terutama ketika menjadi latar belakang cerita pada film 5 cm yang menceritakan tentang perjalanan pendakian sekelompok sahabat untuk men capai puncak Mahameru",
    "Ketinggian: 3.564 mdpl, Gunung tertinggi di Indonesia selanjutnya juga berada di Lombok. Meskipun tidak sepopuler Gunung Rinjani, Gunung Sanggar memiliki ketinggian mencapai 3.564 mdpl, menjadikannya salah satu dari lima gunung tertinggi di Indonesia. Soal pemandangan alam, Gunung Sanggar menawarkan keindahan yang tak kalah indah dari gunung-gunung lainnya yang ada di kawasan kepulauan Nusa Tenggara.",
    "Ketinggian: 3.478 mdpl, Berada di tengah-tengah Sulawesi Selatan, Gunung Latimojong adalah gunung tertinggi di Indonesia selanjutnya. Gunung tertinggi di Sulawesi ini memiliki puncak tertinggi bernama Bulu Rante Mario. Tertarik mendaki salah satu gunung paling tinggi di Indonesia ini? Untuk bisa mencapai ke kaki gunung ini kamu harus menempuh jarak tempuh sekitar 10 jam dari pusat kota Makassar.",
    "Ketinggian: 3.428 mdpl, Salah satu gunung tertinggi di Indonesia ini merupakan gunung paling tinggi di pulau Jawa kedua setelah Gunung Semeru. Jalur pendakian gunung ini dikenal sebagai salah satu medan pendakian yang sulit.",
    "Ketinggian: 3.371 mdpl, Gunung paling tinggi di Indonesia selanjutnya adalah Gunung Sumbing yang juga merupakan destinasi pendakian yang cukup populer. Terdapat tiga jalur pendakian untuk mencapai puncak dari salah satu gunung paling tinggi yang ada di Indonesia ini yakni jalur cepit parakan, jalur bogowongso, dan juga jalur desa garung.",
    "Ketinggian: 3.344 mdpl, Gunung tertinggi di Indonesia lainnya masih berada di daratan pulau Jawa, tepatnya di Jawa Timur melintasi Bondowoso, Jember, dan juga Banyuwangi. Terdapat empat puncak di Gunung Raung yakni Puncak Bendera, Puncak 17, Puncak Tusuk Gigi, dan Puncak Sejati yang merupakan puncak tertinggi gunung ini.",
    "Ketinggian: 3.265 mdpl, Masih berada di Jawa, Gunung Lawu adalah salah satu gunung tertinggi di Indonesia yang berlokasi di perbatasan antara Magetan, Jawa Timur dan Karanganyar, Jawa Tengah. Populer sebagai salah satu tujuan pendakian, gunung ini memiliki tiga buah pujncah tertinggi yang disakralkan oleh masyarakat setempat.",
    "Ketinggian: 3.145 mdpl, Termasuk salah satu tujuan pendakian populer karena jalurnya yang cukup mudah ditaklukan dibandingkan gunung-gunung tertinggi di Indonesia sebelumnya, Gunung Merbabu adalah gunung yang terletak di Magelang, Boyolali, Salatiga, dan Semarang.",
    "Ketinggian: 3.078 mdpl, Termasuk dalam kawasan Taman Nasional Gunung Ciremai, Gunung Ciremai adalah gunung tertinggi di Jawa Barat dan merupakan salah satu yang tertinggi di Indonesia. Gunung ini juga termasuk gunung berkawah ganda.",
    )


    private val mountainImages = intArrayOf(R.drawable.jayawijaya,
    R.drawable.kerinci,
    R.drawable.rinjani,
    R.drawable.semeru,
    R.drawable.sanggar,
    R.drawable.latimojong,
    R.drawable.selamet,
    R.drawable.sumbing,
    R.drawable.raung,
    R.drawable.lawu,
    R.drawable.merbabu,
    R.drawable.ciremai
    )

    val listData: ArrayList<Mountain>
    get() {
        val list = arrayListOf<Mountain>()
        for (position in MountainNames.indices) {
            val mountain = Mountain()
            mountain.name = MountainNames[position]
            mountain.detail = mountainDetails[position]
            mountain.photo = mountainImages[position]
            list.add(mountain)
        }
        return list
    }



}