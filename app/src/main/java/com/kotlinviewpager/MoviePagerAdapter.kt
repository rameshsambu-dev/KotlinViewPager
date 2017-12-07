package com.kotlinviewpager


import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class MoviePagerAdapter(fragmentManager: FragmentManager, private val movies: ArrayList<MovieModel>) :
    FragmentStatePagerAdapter(fragmentManager) {

  // Return the Fragment associated with the object located at the specified position 
  override fun getItem(position: Int): Fragment {
    return MovieFragment.newInstance(movies[position])
  }

  // Return the number of objects in the array.  
  override fun getCount(): Int {
    return movies.size
  }
}
