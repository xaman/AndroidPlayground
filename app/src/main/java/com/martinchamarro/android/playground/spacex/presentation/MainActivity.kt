package com.martinchamarro.android.playground.spacex.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.martinchamarro.android.playground.R
import com.martinchamarro.android.playground.spacex.domain.model.Launch
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val launchesViewModel by viewModels<LaunchesViewModel>()
    private val recycler: RecyclerView by lazy { findViewById(R.id.launches_recycler) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        launchesViewModel.launches.observe(this, ::showLaunches)
        launchesViewModel.initialize()
    }

    private fun showLaunches(launches: List<Launch>) {
        val adapter = LaunchesAdapter()
        adapter.submitList(launches)
        recycler.adapter = adapter
    }

}
