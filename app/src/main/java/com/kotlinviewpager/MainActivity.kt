package com.kotlinviewpager

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    // Views
    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: MoviePagerAdapter
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the list of movies from the JSON file
        val movies = MovieHelper.getMoviesFromJson("movies.json", this)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        // Initialize the MoviePagerAdapter
        pagerAdapter = MoviePagerAdapter(supportFragmentManager, movies)

        // Set the Adapter and the TabLayout for the ViewPager
        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
