package com.walletline

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform