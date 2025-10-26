package com.gevorg.dailyinsight.data.repository

import com.gevorg.dailyinsight.data.network.RetrofitInstance

class NewsRepository {
    suspend fun getTopHeadlines(country: String) =
        RetrofitInstance.api.getTopHeadlines(country = country)
}
