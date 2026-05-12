package com.example.myfirstkmpapp

fun greet(name: String, nim: String): String {
    return "Halo, $name!\nNIM: $nim\nPlatform: ${getPlatformName()}"
}