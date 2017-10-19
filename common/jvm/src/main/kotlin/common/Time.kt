package common


actual class Time {


    actual fun currentTime(): Long = System.currentTimeMillis().also { println(it) }
}