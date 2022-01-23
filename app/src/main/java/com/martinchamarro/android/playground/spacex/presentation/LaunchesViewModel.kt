package com.martinchamarro.android.playground.spacex.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.martinchamarro.android.playground.spacex.domain.model.Launch
import com.martinchamarro.android.playground.spacex.domain.usecase.GetLaunches
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class LaunchesViewModel @Inject constructor(
    private val getLaunches: GetLaunches
) : ViewModel() {

    private val mutableLaunches = MutableLiveData<List<Launch>>()
    val launches: LiveData<List<Launch>> = mutableLaunches

    fun initialize() {
        viewModelScope.launch(Dispatchers.Main) {
            try {
                val launches = withContext(Dispatchers.IO) {
                    getLaunches.execute()
                }
                mutableLaunches.value = launches
            } catch (exception: Exception) {
                exception.printStackTrace()
            }
        }
    }

}
