package com.sirius.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewTags: RecyclerView = findViewById(R.id.tag_list)
        recyclerViewTags.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL, false
        )
        recyclerViewTags.adapter = TagsAdapter(tagList())

        val recyclerViewReviews: RecyclerView = findViewById(R.id.reviews_list)
        recyclerViewReviews.setNestedScrollingEnabled(false);
        recyclerViewReviews.layoutManager = LinearLayoutManager(this)
        recyclerViewReviews.adapter = ReviewsAdapter(reviewList())
    }
}

private fun reviewList(): List<ReviewModel> {
    val reviews: List<ReviewModel> = listOf(
        ReviewModel(
            userImage = "https://ibb.co/WcJMjSw",
            userName = "Auguste Conte",
            date = "February 14, 2019",
            message = "“Once you start to learn its secrets, there’s a wild and exciting variety of play " +
                    "here that’s unmatched, even by its peers.”"
        ),
        ReviewModel(
            userImage = "https://ibb.co/p1q4QZr",
            userName = "Jang Marcelino",
            date = "February 14, 2019",
            message = "“Once you start to learn its secrets, there’s a wild and exciting variety " +
                    "of play here that’s unmatched, even by its peers.”"
        )
    )
    return reviews
}


private fun tagList(): List<String> {
    val data = mutableListOf("MOBA", "MULTIPLAYER", "STRATEGY")
    return data
}