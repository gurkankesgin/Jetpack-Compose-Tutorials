package com.smarttoolfactory.tutorial1_1basics.model

import androidx.compose.runtime.Composable

data class TutorialSectionModel(
    val title: String,
    val action: @Composable (() -> Unit)? = null,
    val description: String,
    val tags: List<String> = listOf()
)

