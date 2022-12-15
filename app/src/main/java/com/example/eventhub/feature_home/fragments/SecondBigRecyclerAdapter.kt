package com.example.eventhub.feature_home.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eventhub.R

class SecondBigRecyclerAdapter: RecyclerView.Adapter<SecondBigRecyclerAdapter.ViewHolder>() {
    private var titles = arrayOf("Ziua porților deschise la Muzeu Național de Artă","Ziua porților deschise la Muzeu Național de Artă","Ziua porților deschise la Muzeu Național de Artă","Ziua porților deschise la Muzeu Național de Artă","Ziua porților deschise la Muzeu Național de Artă","Ziua porților deschise la Muzeu Național de Artă","Ziua porților deschise la Muzeu Național de Artă","Ziua porților deschise la Muzeu Național de Artă")

    private var time = arrayOf("17:00","17:00","17:00","17:00","17:00","17:00","17:00","17:00")

    private var date = arrayOf("01 DEC","01 DEC","01 DEC","01 DEC","01 DEC","01 DEC","01 DEC","01 DEC")

    private var location = arrayOf("Muzeul National de Arta","Muzeul National de Arta","Muzeul National de Arta","Muzeul National de Arta","Muzeul National de Arta","Muzeul National de Arta","Muzeul National de Arta","Muzeul National de Arta")

    private var partic = arrayOf("2.5k participanti","2.5k participanti","2.5k participanti","2.5k participanti","2.5k participanti","2.5k participanti","2.5k participanti","2.5k participanti")

    private var images= intArrayOf(
        R.drawable.splash_screen,
        R.drawable.splash_screen,
        R.drawable.splash_screen,
        R.drawable.splash_screen,
        R.drawable.splash_screen,
        R.drawable.splash_screen,
        R.drawable.splash_screen,
        R.drawable.splash_screen)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondBigRecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.second_big_card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: SecondBigRecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDate.text = date[position]
        holder.itemImage.setImageResource(images[position])
        holder.itemTime.text = time[position]
        holder.itemLoc.text = location[position]
        holder.itemPartic.text = partic[position]
    }

    inner class ViewHolder(itemView2: View): RecyclerView.ViewHolder(itemView2) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDate: TextView
        var itemTime: TextView
        var itemPartic: TextView
        var itemLoc: TextView

        init {
            itemImage = itemView2.findViewById(R.id.item_image3)
            itemTitle = itemView2.findViewById(R.id.item_title3)
            itemDate= itemView2.findViewById(R.id.item_date3)
            itemTime= itemView2.findViewById(R.id.item_time3)
            itemPartic= itemView2.findViewById(R.id.item_partic3)
            itemLoc= itemView2.findViewById(R.id.item_location3)

//            itemView2.setOnClickListener{
//                @Suppress("DEPRECATION") val position: Int = adapterPosition
//
//                Toast.makeText(itemView2.context,"you clicked on ${titles[position]}", Toast.LENGTH_LONG).show()
//            }
        }
    }
}