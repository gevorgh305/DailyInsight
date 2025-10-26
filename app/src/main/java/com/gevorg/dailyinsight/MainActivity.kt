package com.gevorg.dailyinsight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gevorg.dailyinsight.viewmodel.NewsViewModel

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    private val viewModel: NewsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.loadTopHeadlines()

        setContent {
            MaterialTheme {
                val newsState by viewModel.newsState.collectAsState()

                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = { Text("Daily Insight") }
                        )
                    }
                ) { paddingValues ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValues)
                            .padding(16.dp)
                    ) {
                        if (newsState == null) {
                            Text("Loading...", style = MaterialTheme.typography.bodyLarge)
                        } else {
                            LazyColumn(
                                verticalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                items(newsState?.articles ?: emptyList()) { article ->
                                    Card(
                                        modifier = Modifier.fillMaxWidth(),
                                        elevation = CardDefaults.cardElevation(4.dp)
                                    ) {
                                        Column(modifier = Modifier.padding(16.dp)) {
                                            Text(
                                                text = article.title ?: "No title",
                                                style = MaterialTheme.typography.titleMedium
                                            )
                                            Spacer(Modifier.height(8.dp))
                                            Text(
                                                text = article.description ?: "",
                                                style = MaterialTheme.typography.bodyMedium
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
