package com.arturwfb.chronicle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform