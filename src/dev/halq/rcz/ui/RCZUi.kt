package dev.halq.rcz.ui

import javax.swing.JFrame
import dev.halq.rcz.ui.RCZPanel

/**
 * @author Halq
 * @since 31/12/2022 at 19:55
 */
class RCZUi : JFrame("RCZ - CONFIGURABLE ENCODE") {
    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(1000, 1080)
        add(RCZPanel())
        pack()
        isVisible = true
    }
}