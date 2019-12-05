package com.dicoding.picodiploma.temanggungku;

import java.util.ArrayList;

public class WisataData {
    private static String[] wisataNames = {
            "Posong",
            "Pasar Papringan",
            "Alun-alun Temanggung",
            "Jumprit",
            "Pikatan Waterpark",
            "Embung Kledung",
            "Alam Sewu",
            "Curug Trocoh",
            "Curug Onje",
            "Pendakian Gudung Sindoro",
            "Pendakian Gunung Sumbing"
    };
    private static String[] wisataDescription = {
            "Posong merupakan wisata alam yang berada di lereng Gunung Sindoro. Keunikan lokasi ini adalah menyediakan pemandangan alam dari ketinggian 2000 mdpal yang memungkinkan wisatawan melihat hamparan dataran kabupaten Temanggung hingga Magelang. Melalui tempat ini wisatawan bisa melihat puncak Gunung Sindoro dari dekat, keseluruhan gunung Sumbing di sebelahnya, hingga gunung api lainnya dari kejauhan mulai dari Gunung Merapi, Merbabu, hingga Ungaran. Wisata ini dapat diakses dengan kendaraan motor maupun mobil pribadi dengan tempat parkir yang cukup luas. Letaknya pun tak jauh dari jalan utama, sekitar 15 menit melewati jalan menanjak yang disusun dengan batu yang cukup rapih. Wisata ini memiliki fasilitas yang sudah lengkap, bahkan telah disediakan camping ground yang disewakan untuk pengunjung yang ingin menikmati lautan bintang dimalam hari maupun sunrise diatas lautan awan didini harinya.",
            "Merupakan pasar yang menyediakan aneka makanan dan jajanan khas Jawa, khususnya Jawa Tengah. Pasar ini unik karena bertempat diantara pepohonan bambu. Pertunjukan seperti gamelan dan pertunjukkan budaya lain juga digelar setiap kali pasar ini dibuka. Yang unik dan menjadi daya tarik wisata ini adalah alat tukar barang yang menggunakan koin bambu yang bisa dibeli ketika awal memasuki pasar ini. Pasar ini hanya dibuka setiap hari Minggu Wage (35 hari sekali) dan selama ini cukup banyak pengunjung yang tertarik. Pasar ini mulai dikembangkan akhir tahun 2015.",
            "Sejak tahun 2018 pemerintah Kabupaten Temanggung melakukan pembenahan infrastruktur dan kebersihan daerah termasuk alun-alun kota. Saat ini alun-alun Temanggung sudah menjadi salah satu destinasi wisata malam khususnya bagi warga lokal. Bangunan yang tertata, pernak-pernik lampu, air mancur, serta lokasinya yang strategis dikelilingi tempat makan dan fasilitas umum menjadikan tempat ini ramai didatangi anak muda setiap malamnya.",
            "Jumprit sebenarnya adalah lokasi yang disucikan oleh umat Budha di Indonesia. Pada tempat ini terdapat mata air dimana setiap upacara Trisuci Waisak di Candi Borobudur, air keberkahan selalu diambil dari mata air Jumprit ini. Area ini terletak di lerang Gunung Sindoro, keberadaan bangunan candi dan pepohonan pinus menjadi daya tarik wisata terhadap lokasi ini. Saat ini dibangun serangkaian perlengkapan outbond untuk mendukung perkembangan wisata alam Jumprit. Tak jarang lokasi ini dijadikan tempat resepsi pernikahan oleh kaum muda kekinian.",
            "Merupakan waterpark yang letaknya tak jauh dari pusat Kabupaten Temanggung. Pikatan sebenarnya adalah sumber mata air bersejarah. Nama Pikatan diambil dari Rakai Pikatan (Mpu Manupu) yang merupakan raja keenam kerajaan Mataram Kuno (Medang) yang juga menjadi asal usul daerah Temanggung. Air yang digunakan bersumber dari mata air sehingga cukup dingin. Harga yang ditawarkan pun cukup murah hal tersebut yang membuat tempat ini selalu ramai setiap harinya.",
            "Merupakan danau buatan yang cukup luas yang awal mulanya digunakan untuk irigasi. Pemandangan yang cukup menarik berupa latarbelakang Gunung Sindoro maupun Gunung Sumbing serta pepohonan pinus menjadi daya tarik lokasi ini sehingga dikembangkan menjadi tempat wisata.",
            "Merupakan wisata pemandangan alam dari lerang Gunung Sindoro. Wisata ini hampir seperti Posong namun tempat ini memiliki keindahannya tersendiri. Walaupun letaknya lebih rendah dari Posong, keberadaan kabut yang menyelimuti daerah dibawahnya mampu menyuguhkan pemandangan yang menyejukkan sekaligus spot menarik untuk berfoto.",
            "Merupakan air terjun yang berapa dibawah Gunung Prau dan juga dikenal dengan nama curug Surodipo. Keunikan air terjun ini adalah pemandangannya yang cukup bagus dan masih terjaga dari aktivitas manusia karena letaknya yang cukup jauh dari permukiman walaupun disekitarnya sudah terdapat ladang milik warga. Di Temanggung terdapat banyak wisata air terjun yang masih bisa dipilih lagi.",
            "Air terjun ini memiliki bentuk yang cukup eksotik. Letaknya memang jauh dari permukiman dan wisatawan harus berjalan cukup jauh namun objek yang disuguhkan cukup menarik. Letaknya yang tidak berada di lereng melainkan di kaki gunung membuat medan yang dilalui cukup datar.",
            "Gunung Sindoro memiliki ketinggian 3153 mdpal. Gunung Sindoro merupakan gunung berapi aktif berkarakter gunung kerucut tipe Strato, dan terakhir sekali meletus tahun 1971 silam. Pendakian Gunung Sindoro dapat dilakukan via Kledung. Hamparan edelweis menjadi daya tarik tersendiri pada jalur pendakian gunung Sindoro.",
            "Gunung Sumbing memiliki ketinggian 3371 mdpal. Gunung Sumbing merupakan gunung tertinggi ketiga di Pulau Jawa setelah Gunung Semeru dan Gunung Slamet. Pendakian Gunung Sumbing dapat dilakukan via Banaran, Temanggung."
    };
    private static String[] wisataFee = {
            "Rp.10.000,00",
            "Gratis",
            "Gratis",
            "Rp.5000,00",
            "Rp.15.000,00",
            "Rp.5000,00",
            "Rp.5000,00",
            "Rp.5000,00",
            "Rp.5000,00",
            "Rp.15.000,00 (pendaftaran)",
            "Rp.10.000,00 (pendaftaran)"
    };
    private static String[] wisataTime = {
            "04.00 - 17.00 WIB",
            "Minggu, 06.00 - 12.00 WIB",
            "Tidak ada jam operasional khusus",
            "Tidak ada jam operasional khusus",
            "07.00 - 17.00 WIB",
            "06.00 - 17.15 WIB",
            "Tidak ada jam operasional khusus",
            "07.00 - 16.00 WIB",
            "07.00 - 15.00 WIB",
            "Tidak ada jam operasional khusus",
            "Tidak ada jam operasional khusus"
    };
    private static String[] wisataAddress = {
            "Lembah, Jl. Sindoro, Area Sawah, Tlahap, Temanggung, Temanggung Regency, Central Java 56264",
            "Dusun Ngadiprono, Ngadiprono, Ngadimulyo, Kedu, Temanggung Regency, Central Java 56252",
            "Suronatan, Temanggung II, Kec. Temanggung, Kabupaten Temanggung, Jawa Tengah",
            "Ngadirejo, Jumprit, Tegalrejo, Temanggung, Kabupaten Temanggung, Jawa Tengah 56255",
            "Komplek Pikatan Water Park, Jl. Raya Pikatan, RT.5/RW.5, Mudal, Kec. Temanggung, Kabupaten Temanggung, Jawa Tengah 56228",
            "Jl. Raya Parakan - Wonosobo No.KM.12, Area Sawah, Kledung, Kec. Kledung, Kabupaten Temanggung, Jawa Tengah 56264",
            "Area Sawah, Giripurno, Ngadirejo, Temanggung Regency, Central Java 56255",
            "Tawangsari, Wonoboyo, Temanggung Regency, Central Java 56259",
            "Tanjungsari, Duren, Bejen, Temanggung Regency, Central Java 56258",
            "Jl. Campur Salam No.7, Kledung, Kec. Kledung, Kabupaten Temanggung, Jawa Tengah 56264",
            "Banaran, Tembarak, Temanggung Regency, Central Java 56261"
    };

    private static String[] wisataMap = {
            "https://www.google.com/maps/place/Taman+Wisata+Alam+Posong/@-7.3169508,110.0345534,12z/data=!4m5!3m4!1s0x0:0x9d2ba82030a65e8!8m2!3d-7.3181661!4d110.0247985?hl=id",
            "https://www.google.com/maps/place/Pasar+Papringan+Ngadiprono/@-7.2618952,110.1639268,15z/data=!4m5!3m4!1s0x0:0x6523e3fe607dde54!8m2!3d-7.2618952!4d110.1639268?hl=id",
            "https://www.google.com/maps/place/Alun-Alun+Temanggung,+Suronatan,+Temanggung+II,+Kec.+Temanggung,+Kabupaten+Temanggung,+Jawa+Tengah/@-7.3162162,110.1733353,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a829ccee6204d:0xd4ce425f6bf084e3!8m2!3d-7.3161436!4d110.1754391?hl=id",
            "https://www.google.com/maps/place/Jumprit/@-7.254414,110.016952,15z/data=!4m5!3m4!1s0x0:0xadd871964c2dd983!8m2!3d-7.254414!4d110.016952?hl=id",
            "https://www.google.com/maps/place/Pikatan+Water+Park/@-7.3383428,110.1846625,15z/data=!4m5!3m4!1s0x0:0xe28f35e14f5f64de!8m2!3d-7.3383428!4d110.1846625?hl=id",
            "https://www.google.com/maps/place/Embung+Kledung/@-7.3320886,110.0332265,16.54z/data=!4m5!3m4!1s0x0:0xacef31f48434fcf2!8m2!3d-7.334117!4d110.0318809?hl=id",
            "https://www.google.com/maps/place/Alam+Sewu/@-7.2774138,110.0139926,15z/data=!4m5!3m4!1s0x0:0xd43e8512b45757f2!8m2!3d-7.2774138!4d110.0139926?hl=id",
            "https://www.google.com/maps/place/Curug+Surodipo/@-7.2099472,109.9919173,17z/data=!3m1!4b1!4m5!3m4!1s0x2e707307e4422137:0x5e401e3a2922ae8f!8m2!3d-7.2099472!4d109.994106?hl=id",
            "https://www.google.com/maps/place/Curug+onje/@-7.1251522,110.1373356,15z/data=!4m5!3m4!1s0x0:0x797d2424754bcbf6!8m2!3d-7.1251522!4d110.1373356?hl=id",
            "https://www.google.com/maps/place/Basecamp+Sindoro+Via+Kledung/@-7.3404347,110.0323489,15z/data=!4m5!3m4!1s0x0:0x122c92e46e371eaf!8m2!3d-7.3404347!4d110.0323489?hl=id",
            "https://www.google.com/maps/place/Basecamp+Sumbing+East+Route/@-7.3624516,110.1288027,15z/data=!4m5!3m4!1s0x0:0xe03d7831add722de!8m2!3d-7.3624516!4d110.1288027?hl=id"
    };

    private static int[] wisataPhoto = {
            R.drawable.kledung_posong,
            R.drawable.papringan,
            R.drawable.alun_alun,
            R.drawable.jumprit,
            R.drawable.pikatan,
            R.drawable.embung_kledung,
            R.drawable.alam_sewu,
            R.drawable.curug_trocoh,
            R.drawable.curug_onje,
            R.drawable.sindoro,
            R.drawable.sumbing
    };
    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setName(wisataNames[position]);
            wisata.setDescription(wisataDescription[position]);
            wisata.setFee(wisataFee[position]);
            wisata.setTime(wisataTime[position]);
            wisata.setAddress(wisataAddress[position]);
            wisata.setPhoto(wisataPhoto[position]);
            wisata.setMap(wisataMap[position]);
            list.add(wisata);
        }
        return list;
    }
}
