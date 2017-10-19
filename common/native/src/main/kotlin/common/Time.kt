package common

import kotlinx.cinterop.*
import sdl.*


actual class Time {
    actual fun currentTime(): Long = clock().also {
        println(it)
    }
}