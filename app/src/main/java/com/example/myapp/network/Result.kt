package com.example.myapp.network

sealed class Result<out T> {
    data class Success<out T>(val value: T) : Result<T>()
    data class Error(val errorCode: Int) : Result<Nothing>()
}