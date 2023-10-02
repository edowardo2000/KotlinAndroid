package com.example.aplikasiandroidsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.aplikasiandroidsederhana.adapter.ArticleAdapter
import com.example.aplikasiandroidsederhana.adapter.OnItemArticleClick
import com.example.aplikasiandroidsederhana.model.Article

class MainActivity : AppCompatActivity() {

    private lateinit var articles: List<Article>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setTitle("10 Model Indonesia");


        // Contoh data
        articles = listOf(
            // (Sesuaikan dengan sumber daya gambar Anda)
            Article(R.drawable.chelsea, "Chelsea Islan", "Tak hanya memiliki paras yang cantik, Chelsea Islan juga mempunyai segudang prestasi", "Aktris muda cantik yang berprestasi serta baru saja dilamar oleh Rob Clinton ini merupakan seorang wanita keturunan Amerika Serikat. Memiliki wajah blasteran yang begitu cantik, tidak heran jika Chelsea Islan kemudian sukses masuk sebagai salah satu nominasi perempuan tercantik versi TC Candler selama tiga tahun berturut-turut, yaitu pada tahun 2018, 2019, dan 2020."),
            Article(R.drawable.lyorda,"Lyorda Ginting","Lyodra Ginting adalah salah satu aktris yang berhasil masuk ke dalam daftar 100 wajah tercantik pada tahun 2021 dari versi TC Candler","Selain memiliki paras yang cantik, ia juga merupakan pemenang pada ajang pencarian bakat Indonesian Idol di tahun 2020. Setelah mengetahui dirinya masuk ke dalam daftar tersebut, Lyodra juga memberikan respons melalui unggahan pada akun instagramnya."),
            Article(
                R.drawable.citra_kirana,
                "Citra Kirana",
                "Citra Kirana dikenal sebagai salah satu aktris papan atas Indonesia dengan wajah yang cantik.",
                "Citra Kirana, yang dikenal luas dengan nama Citra Kirana atau Ciki, adalah seorang aktris dan model berkebangsaan Indonesia. Debutnya di dunia akting dimulai dengan bermain dalam sinetron. Dengan bakat dan kecantikannya, Citra Kirana berhasil menarik perhatian banyak penggemar serta produser film. Selain itu, kehidupan pribadinya dengan Rezky Aditya, seorang aktor ternama, juga kerap menjadi sorotan media."
            ),
            Article(
                R.drawable.ayu_ting_ting,
                "Ayu Ting Ting",
                "Dikenal dengan suara khas dan pesona Jawa-nya, Ayu Ting Ting memikat banyak hati.",
                "Ayu Rosmalina, lebih dikenal dengan nama Ayu Ting Ting adalah seorang penyanyi dangdut, presenter, dan aktris Indonesia. Salah satu lagunya yang berjudul 'Alamat Palsu' menjadi hit besar di industri musik Indonesia."
            ),
            Article(
                R.drawable.raisa,
                "Raisa Andriana",
                "Raisa, dengan suara emasnya, telah menjadi salah satu diva pop Indonesia.",
                "Raisa Andriana adalah seorang penyanyi serta penulis lagu Indonesia. Dengan hits seperti 'Kali Kedua' dan 'LDR', ia memenangkan banyak penghargaan musik."
            ),
            Article(
                R.drawable.maudy,
                "Maudy Ayunda",
                "Maudy tidak hanya dikenal sebagai penyanyi, tetapi juga sebagai aktris muda berbakat.",
                "Maudy Ayunda adalah seorang penyanyi, aktris, dan aktivis pendidikan Indonesia. Ia juga dikenal sebagai mahasiswa lulusan dari salah satu universitas ternama di dunia, yaitu Oxford."
            ),
            Article(
                R.drawable.velove,
                "Velove Vexia",
                "Velove Vexia, aktris dengan wajah khas, menunjukkan kemampuan aktingnya dalam berbagai film.",
                "Velove Vexia Kaligis adalah seorang aktris Indonesia yang telah membintangi berbagai film layar lebar dan sinetron populer. Ia dikenal memiliki talenta akting yang luar biasa."
            ),
            Article(
                R.drawable.pevita_pearce,
                "Pevita Pearce",
                "Pevita Pearce memikat banyak orang dengan wajahnya yang cantik dan kemampuan aktingnya.",
                "Pevita Cleo Eileen Pearce adalah seorang aktris dan penyanyi Indonesia. Ia mulai dikenal setelah bermain dalam film 'Denias, Senandung di Atas Awan'."
            ),
            Article(
                R.drawable.sandrinna_michelle,
                "Sandrinna Michelle",
                "Sandrinna Michelle, bintang cilik yang tumbuh menjadi aktris muda berbakat.",
                "Sandrinna Michelle Skornicki adalah seorang aktris berkebangsaan Indonesia. Sejak kecil, ia sudah aktif di dunia hiburan dan berhasil memenangkan beberapa penghargaan akting."
            ),
            Article(
                R.drawable.wilona,
                "Natasha Wilona",
                "Dikenal lewat sinetron, Natasha Wilona kini menjadi salah satu aktris muda paling populer.",
                "Natasha Wilona adalah seorang aktris Indonesia yang mulai dikenal setelah bermain dalam sinetron 'Anak Jalanan'. Dengan talenta dan pesonanya, ia menjadi salah satu aktris muda paling dicari di industri hiburan."
            )


        )

        val recyclerView = findViewById<RecyclerView>(R.id.listArticle)

        //Lengkapi kode disini
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ArticleAdapter(articles, object: OnItemArticleClick{
            override fun onItemClick(article: Article){
                intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("article", article)
                startActivity(intent)
            }
        })

    }

    // Tombol untuk membuka halaman About
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, 1, 0, "About").apply {
            setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
            setOnMenuItemClickListener {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
                true
            }

        }
        return super.onCreateOptionsMenu(menu)
    }

}
