package com.example.aplikasiandroidsederhana.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.aplikasiandroidsederhana.R
import com.example.aplikasiandroidsederhana.model.Article
import de.hdodenhof.circleimageview.CircleImageView

class ArticleAdapter(val articles: List<Article>, val clickListener: OnItemArticleClick) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind(article: Article) {
//            //Lengkapi kode disini
//        }
        val gambarArticle = itemView.findViewById<CircleImageView>(R.id.articleImage)
        val judulArticle = itemView.findViewById<TextView>(R.id.articleTitle)
        val overviewArticle = itemView.findViewById<TextView>(R.id.articleOverview)
//        val deskripsi = itemView.findViewById<TextView>(R.id.articleDetailDescription)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load(articles[position].imageResourceId).into(holder.gambarArticle)
        holder.judulArticle.text = articles[position].title
        holder.overviewArticle.text = articles[position].overview
//        holder.deskripsi.text = articles[position].description!!

        holder.itemView.setOnClickListener(View.OnClickListener {
            clickListener.onItemClick(articles[position])
        })
    }

    override fun getItemCount() = articles.size
}
