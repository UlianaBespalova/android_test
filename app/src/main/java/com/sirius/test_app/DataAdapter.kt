package com.sirius.test_app

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class TagsAdapter (private val tags: List<String>) :
    RecyclerView.Adapter<TagsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tagItemView: TextView = itemView.findViewById(R.id.tag_item)
    }

    override fun getItemCount() = tags.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d("ivan","ok create vh")
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.tag_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("ivan","ok ${tags[position]}")
        Log.d("ivan", tags.toString())
        holder.tagItemView.text = tags[position]
    }
}


class ReviewsAdapter (private val reviews: List<ReviewModel>) :
    RecyclerView.Adapter<ReviewsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: CircleImageView = itemView.findViewById(R.id.profile_image)
        val profileName: TextView = itemView.findViewById(R.id.profile_name)
        val profileDate: TextView = itemView.findViewById(R.id.profile_date)
        val profileReview: TextView = itemView.findViewById(R.id.profile_review)
    }

    override fun getItemCount() = reviews.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.review_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.profileName.text = reviews[position].userName
        holder.profileDate.text = reviews[position].date
        holder.profileReview.text = reviews[position].message
        holder.profileImage.setImageResource(R.drawable.mock_avatar)
    }
}