package com.gevorg.dailyinsight.data.network

import com.gevorg.dailyinsight.data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey: String = "c963766239d046c38f400c8319fa8465"
    ): NewsResponse
}
