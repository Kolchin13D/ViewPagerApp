package com.example.viewpagerapp.adapters

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerapp.MainActivity
import com.example.viewpagerapp.fragments.fragment1
import com.example.viewpagerapp.fragments.fragment2
import com.example.viewpagerapp.fragments.fragment3

class myAdapter(mainActivity: MainActivity) : FragmentStateAdapter(mainActivity) {

    private val size = 3
    override fun getItemCount(): Int {
        return this.size
    }

    override fun createFragment(position: Int): Fragment {

        when (position) {

            0 -> {
                return fragment1()
            }

            1 -> {
                return fragment2()
            }

            2 -> {
                return fragment3()
            }
        }

        return fragment1()

    }

}