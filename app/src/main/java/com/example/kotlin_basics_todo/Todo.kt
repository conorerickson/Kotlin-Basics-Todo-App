package com.example.kotlin_basics_todo

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)