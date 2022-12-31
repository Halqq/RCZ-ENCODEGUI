package dev.halq.rcz.tool

/**
 * @author Halq
 * @since 10/10/22
 * @apiNote this is rewrite for rczEncrypt - java version
 */

object RCZTransformer {

    val prefix = "RCZ-,"
    val random = RCZMapping.randomJapanese()
    val getRandom = random

    fun encodeBytes(input: String): String {
        RCZMapping.res()
        val output = StringBuilder()
        for (i in input.indices) {
            val vq = input[i] + ""

            if (RCZMapping.byteMapping.containsKey(vq)) {
                output.append(RCZMapping.byteMapping.get(vq))
                output.toString().replace("[", "")
            } else {
                output.append(vq)
            }
        }
        return prefix + output.toString().replace("[", "").replace("]", "前今")
    }
}