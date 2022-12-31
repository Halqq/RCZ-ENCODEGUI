package dev.halq.rcz.tool

import dev.halq.rcz.ui.RCZPanel
import java.io.File
import kotlin.Throws
import java.io.IOException
import java.lang.Exception
import java.io.FileWriter

/**
 * @author Halq
 * @since 31/12/2022 at 20:34
 */
object ConfigurationWriter {
    @JvmStatic
    @Throws(IOException::class)
    fun writeConverts() {
        val file = File("config.txt")
        if (!file.exists()) {
            try {
                file.createNewFile()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        val writer = FileWriter(file)
        writer.write(
            """
    A=${RCZPanel.ACONVERTED.text}
    B=${RCZPanel.BCONVERTED.text}
    C=${RCZPanel.CCONVERTED.text}
    D=${RCZPanel.DCONVERTED.text}
    E=${RCZPanel.ECONVERTED.text}
    F=${RCZPanel.FCONVERTED.text}
    G=${RCZPanel.GCONVERTED.text}
    H=${RCZPanel.HCONVERTED.text}
    I=${RCZPanel.ICONVERTED.text}
    J=${RCZPanel.JCONVERTED.text}
    K=${RCZPanel.KCONVERTED.text}
    L=${RCZPanel.LCONVERTED.text}
    M=${RCZPanel.MCONVERTED.text}
    N=${RCZPanel.NCONVERTED.text}
    O=${RCZPanel.OCONVERTED.text}
    P=${RCZPanel.PCONVERTED.text}
    Q=${RCZPanel.QCONVERTED.text}
    R=${RCZPanel.RCONVERTED.text}
    S=${RCZPanel.SCONVERTED.text}
    T=${RCZPanel.TCONVERTED.text}
    U=${RCZPanel.UCONVERTED.text}
    V=${RCZPanel.VCONVERTED.text}
    W=${RCZPanel.WCONVERTED.text}
    X=${RCZPanel.XCONVERTED.text}
    Y=${RCZPanel.YCONVERTED.text}
    Z=${RCZPanel.ZCONVERTED.text}
    
    """.trimIndent()
        )
        writer.close()
    }
}