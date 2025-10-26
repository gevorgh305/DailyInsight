package com.gevorg.dailyinsight.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gevorg.dailyinsight.data.model.NewsResponse
import com.gevorg.dailyinsight.data.repository.NewsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class NewsViewModel(
    private val repository: NewsRepository = NewsRepository()
) : ViewModel() {

    private val _newsState = MutableStateFlow<NewsResponse?>(null)
    val newsState: StateFlow<NewsResponse?> = _newsState

    fun loadTopHeadlines(country: String = "us") {
        viewModelScope.launch {
            try {
                val response = repository.getTopHeadlines(country)
                _newsState.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
