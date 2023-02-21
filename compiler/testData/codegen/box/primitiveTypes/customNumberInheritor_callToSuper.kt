// DONT_TARGET_EXACT_BACKEND: JVM
// DONT_TARGET_EXACT_BACKEND: JS
// IGNORE_BACKEND: JS_IR
// KT-46465
// WITH_STDLIB

class MyNumber(val b: Boolean) : Number() {
    override fun toByte(): Byte {
        return toInt().toByte()
    }

    override fun toDouble(): Double {
        return toInt().toDouble()
    }

    override fun toFloat(): Float {
        return toInt().toFloat()
    }

    override fun toChar(): Char {
        return super.toChar()
    }

    override fun toInt(): Int {
        return if (b) { 'O'.code } else { 'K'.code }
    }

    override fun toLong(): Long {
        return toInt().toLong()
    }

    override fun toShort(): Short {
        return toInt().toShort()
    }
}

@Suppress("DEPRECATION")
fun box(): String {
    val o = MyNumber(true)
    val k = MyNumber(false)
    return "${o.toChar()}${k.toChar()}"
}
