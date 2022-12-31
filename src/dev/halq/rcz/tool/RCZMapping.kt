package dev.halq.rcz.tool

import dev.halq.rcz.ui.RCZPanel
import dev.halq.rcz.ui.RCZUi
import kotlin.random.Random

/**
 * @author Halq
 * @since 10/10/22
 * @apiNote this is rewrite for rczEncrypt - java version
 */

object RCZMapping {

    val byteMapping: HashMap<String, String> = HashMap<String, String>()

    val japaneseList: ArrayList<String> = ArrayList<String>()

    fun res() {
        byteMapping["A"] = RCZPanel.ACONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["B"] = RCZPanel.BCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["C"] = RCZPanel.CCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["D"] = RCZPanel.DCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["E"] = RCZPanel.ECONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["F"] = RCZPanel.FCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["G"] = RCZPanel.GCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["H"] = RCZPanel.HCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["I"] = RCZPanel.ICONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["J"] = RCZPanel.JCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["K"] = RCZPanel.KCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["L"] = RCZPanel.LCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["M"] = RCZPanel.MCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["N"] = RCZPanel.NCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["O"] = RCZPanel.OCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["P"] = RCZPanel.PCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["Q"] = RCZPanel.QCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["R"] = RCZPanel.RCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["S"] = RCZPanel.SCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["T"] = RCZPanel.TCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["V"] = RCZPanel.VCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["U"] = RCZPanel.UCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["Y"] =  RCZPanel.YCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["W"] = RCZPanel.WCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["X"] = RCZPanel.XCONVERTED.getText().toByteArray().contentToString().lowercase()
        byteMapping["Z"] = RCZPanel.ZCONVERTED.getText().toByteArray().contentToString().lowercase()

        byteMapping["a"] = RCZPanel.ACONVERTED.getText().toByteArray().contentToString()
        byteMapping["b"] = RCZPanel.BCONVERTED.getText().toByteArray().contentToString()
        byteMapping["c"] = RCZPanel.CCONVERTED.getText().toByteArray().contentToString()
        byteMapping["d"] = RCZPanel.DCONVERTED.getText().toByteArray().contentToString()
        byteMapping["e"] = RCZPanel.ECONVERTED.getText().toByteArray().contentToString()
        byteMapping["f"] = RCZPanel.FCONVERTED.getText().toByteArray().contentToString()
        byteMapping["g"] = RCZPanel.GCONVERTED.getText().toByteArray().contentToString()
        byteMapping["h"] = RCZPanel.HCONVERTED.getText().toByteArray().contentToString()
        byteMapping["i"] = RCZPanel.ICONVERTED.getText().toByteArray().contentToString()
        byteMapping["j"] = RCZPanel.JCONVERTED.getText().toByteArray().contentToString()
        byteMapping["k"] = RCZPanel.KCONVERTED.getText().toByteArray().contentToString()
        byteMapping["l"] = RCZPanel.LCONVERTED.getText().toByteArray().contentToString()
        byteMapping["m"] = RCZPanel.MCONVERTED.getText().toByteArray().contentToString()
        byteMapping["n"] = RCZPanel.NCONVERTED.getText().toByteArray().contentToString()
        byteMapping["o"] = RCZPanel.OCONVERTED.getText().toByteArray().contentToString()
        byteMapping["p"] = RCZPanel.PCONVERTED.getText().toByteArray().contentToString()
        byteMapping["q"] = RCZPanel.QCONVERTED.getText().toByteArray().contentToString()
        byteMapping["r"] = RCZPanel.RCONVERTED.getText().toByteArray().contentToString()
        byteMapping["s"] = RCZPanel.SCONVERTED.getText().toByteArray().contentToString()
        byteMapping["t"] = RCZPanel.TCONVERTED.getText().toByteArray().contentToString()
        byteMapping["u"] = RCZPanel.UCONVERTED.getText().toByteArray().contentToString()
        byteMapping["v"] = RCZPanel.VCONVERTED.getText().toByteArray().contentToString()
        byteMapping["w"] = RCZPanel.WCONVERTED.getText().toByteArray().contentToString()
        byteMapping["x"] = RCZPanel.XCONVERTED.getText().toByteArray().contentToString()
        byteMapping["y"] = RCZPanel.YCONVERTED.getText().toByteArray().contentToString()
        byteMapping["z"] = RCZPanel.ZCONVERTED.getText().toByteArray().contentToString()
    }

    fun japaneseChars(): List<String> {
        japaneseList.add("前今&前u@")
        japaneseList.add("円後語前7*")
        japaneseList.add("時前)J)C$$#")
        japaneseList.add("間午)J@Zr前{}")
        japaneseList.add("前今前+)(前u@")
        japaneseList.add("円後)前J#@&前7*")
        japaneseList.add("時前@@S*&~C$$#")
        japaneseList.add("間午)¨&%$#¨前{}")
        japaneseList.add("前今Zr&前u@")
        japaneseList.add("円後前*_7*")
        japaneseList.add("時前)J@前語($#")
        japaneseList.add("間午)J@語N#前{}")
        japaneseList.add("前今校**語(前u@")
        japaneseList.add("円後)前@&前7*")
        japaneseList.add("時前@@)S$$#")
        japaneseList.add("間午)¨J2Zr前{}")
        japaneseList.add("前今前+&前Ç@")
        japaneseList.add("円後語*&7*")
        japaneseList.add("時語()))(*$$#")
        japaneseList.add("間午語Zr前{}")
        japaneseList.add("校**語(前@@")
        japaneseList.add("円後%@$$#@&前7*")
        japaneseList.add("時前@前)8*&~C$$#")
        japaneseList.add("間午¨語$@*(前{}")
        japaneseList.add("+)語&%&前u@")
        japaneseList.add("@前N*")
        japaneseList.add("前語()))#$$#")
        japaneseList.add("間N#語語Zr前{}")
        japaneseList.add("前*語(前u@")
        japaneseList.add("円7*")
        japaneseList.add("時前@&~C$$#")
        japaneseList.add("間午)%#&%前{}")

        return japaneseList
    }

    fun randomJapanese(): String {
        val characters = 1
        var name: String = ""
        for (i in 0 until characters) {
            val random = Random
            val ch = japaneseChars().get(random.nextInt(japaneseChars().size))
            name += ch
        }
        return name
    }

}