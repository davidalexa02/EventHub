package com.example.eventhub.feature_home.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.eventhub.R

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf("Chapter One","Chapter Two","Chapter Three","Chapter Four","Chapter Five","Chapter Six","Chapter Seven","Chapter Eight")

    private var date = arrayOf("26 OCT","26 OCT","26 OCT","26 OCT","26 OCT","26 OCT","26 OCT","26 OCT")

    private var time = arrayOf("17:00","17:00","17:00","17:00","17:00","17:00","17:00","17:00")

    private var numbers = arrayOf(R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one)

    private var images= intArrayOf(R.drawable.van_gogh_image,R.drawable.van_gogh_image,R.drawable.van_gogh_image,R.drawable.van_gogh_image,R.drawable.van_gogh_image,R.drawable.van_gogh_image,R.drawable.van_gogh_image,R.drawable.van_gogh_image)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDate.text = date[position]
        holder.itemTime.text = time[position]
        holder.itemNumber.setImageResource(numbers[position])
        holder.itemImage.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDate: TextView
        var itemTime: TextView
        var itemNumber: ImageView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemNumber = itemView.findViewById(R.id.item_number)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDate= itemView.findViewById(R.id.item_date)
            itemTime= itemView.findViewById(R.id.item_time)

//            itemView.setOnClickListener{
//                @Suppress("DEPRECATION") val position: Int = adapterPosition
//
//                Toast.makeText(itemView.context,"you clicked on ${titles[position]}", Toast.LENGTH_LONG).show()
//            }
        }
    }

}