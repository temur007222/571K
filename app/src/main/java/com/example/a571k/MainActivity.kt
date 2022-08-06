package com.example.a571k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
   private lateinit var  recyclerView: RecyclerView
    lateinit var  recyclerView1: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

  private fun initViews(){
        recyclerView = findViewById(R.id.rv)
      recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
      getAdapter(data())

      recyclerView1 = findViewById(R.id.rv1)
      recyclerView1.layoutManager = GridLayoutManager(this, 1)
      refreshFeedAdapter(getAllFeeds())
    }

    private fun data(): ArrayList<filter> {

        val contents = ArrayList<filter>()
        contents.add(filter("SpiderMan"))
        contents.add(filter("Masha and The Bear"))
        contents.add(filter("Technology"))
        contents.add(filter("News"))
        contents.add(filter("Mix"))
        contents.add(filter("Songs"))
        contents.add(filter("Trending"))

        return contents
    }

    private fun getAdapter(list: ArrayList<filter>) {
        val adapter = FilterAdapter(this, list)
        recyclerView.adapter = adapter
    }

    private fun refreshFeedAdapter(feeds: ArrayList<Feed>) {
        val adapter = FeedAdapter(this, feeds)
        recyclerView1.adapter = adapter
    }

    private fun getAllFeeds(): ArrayList<Feed>{
        val feed: ArrayList<Feed> = ArrayList()

        feed.add(Feed(R.drawable.birds, R.drawable.hpones))
        feed.add(Feed(R.drawable.nat, R.drawable.mac))
        feed.add(Feed(R.drawable.hpones, R.drawable.hpones))
        feed.add(Feed(R.drawable.birds, R.drawable.birds))
        feed.add(Feed(R.drawable.birds, R.drawable.hpones))
        feed.add(Feed(R.drawable.birds, R.drawable.hpones))
        feed.add(Feed(R.drawable.nat, R.drawable.mac))
        feed.add(Feed(R.drawable.hpones, R.drawable.hpones))
        feed.add(Feed(R.drawable.birds, R.drawable.birds))
        feed.add(Feed(R.drawable.birds, R.drawable.hpones))
        feed.add(Feed(R.drawable.birds, R.drawable.hpones))
        feed.add(Feed(R.drawable.nat, R.drawable.mac))
        feed.add(Feed(R.drawable.hpones, R.drawable.hpones))
        feed.add(Feed(R.drawable.birds, R.drawable.birds))
        feed.add(Feed(R.drawable.birds, R.drawable.hpones))
        return  feed
    }
}