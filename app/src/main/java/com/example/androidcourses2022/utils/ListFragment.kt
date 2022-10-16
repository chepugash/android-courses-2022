package com.example.androidcourses2022.utils

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.androidcourses2022.R
import com.example.androidcourses2022.adapter.PlayerAdapter
import com.example.androidcourses2022.adapter.SpaceItemDecorator
import com.example.androidcourses2022.databinding.FragmentListBinding
import com.example.androidcourses2022.model.PlayerRepository
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter
import jp.wasabeef.recyclerview.adapters.SlideInBottomAnimationAdapter
import jp.wasabeef.recyclerview.adapters.SlideInRightAnimationAdapter

class ListFragment : Fragment(R.layout.fragment_list) {
    private var binding: FragmentListBinding? = null
    private var adapter: PlayerAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        binding?.run {
            val itemDecoration = SpaceItemDecorator(
                this@ListFragment,
                16.0f
            )
            adapter = PlayerAdapter(
                PlayerRepository.players,
                glide = Glide.with(this@ListFragment)
            ) {
                parentFragmentManager.beginTransaction()
                    .setCustomAnimations(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out,
                        android.R.anim.fade_in,
                        android.R.anim.fade_out,
                    )
                    .replace(R.id.container, ProfileFragment.newInstance(it.id))
                    .addToBackStack("list")
                    .commit()
            }
            rvPlayer.adapter = SlideInBottomAnimationAdapter(adapter!!)
            rvPlayer.addItemDecoration(itemDecoration)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}