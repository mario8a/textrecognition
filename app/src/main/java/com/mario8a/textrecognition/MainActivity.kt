package com.mario8a.textrecognition

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mario8a.textrecognition.ui.theme.TextrecognitionTheme
import com.mario8a.textrecognition.viewModel.ScannerViewModel
import com.mario8a.textrecognition.views.TabsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val viewModel: ScannerViewModel by viewModels()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextrecognitionTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 32.dp)) { innerPadding ->
                    TabsView(viewModel)
                }
            }
        }
    }
}
