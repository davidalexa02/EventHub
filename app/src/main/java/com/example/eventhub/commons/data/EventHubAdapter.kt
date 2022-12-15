package com.example.eventhub.commons.data

//import android.annotation.SuppressLint
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import android.widget.ListAdapter
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.RecyclerView
//import java.util.*
//
//class EventHubAdapter (private val onItemClicked: (User) -> Unit) : ListAdapter<User, EventHubAdapter.EventHubViewHolder>(DiffCallback){
//
//    inner class EventHubViewHolder(private var binding: UserItemBinding): RecyclerView.ViewHolder(binding.root) {
//        @SuppressLint("SimpleDateFormat")
//        fun bind(user: User) {
//            binding.nameTextView.text = user.name
//            binding.emailTextView.textEmail = user.email
//            binding.passwordTextView.textPassword = user.password
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventHubViewHolder {
//        val viewHolder = EventHubViewHolder(
//            UserItemBinding.inflate(
//                LayoutInflater.from( parent.context),
//                parent,
//                false
//            )
//        )
//        viewHolder.itemView.setOnClickListener {
//            val position = viewHolder.adapterPosition
//            onItemClicked(getItem(position))
//        }
//        return viewHolder
//    }
//
//    override fun onBindViewHolder(holder: EventHubViewHolder, position: Int) {
//        holder.bind(getItem(position))
//    }
//
//    companion object {
//        private val DiffCallback = object : DiffUtil.ItemCallback<User>() {
//            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
//                return oldItem.name == newItem.name
//            }
//
//            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
//                return oldItem == newItem
//            }
//        }
//    }
//}