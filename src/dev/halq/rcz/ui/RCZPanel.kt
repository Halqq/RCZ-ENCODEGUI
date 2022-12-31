package dev.halq.rcz.ui

import dev.halq.rcz.tool.RCZTransformer.encodeBytes
import dev.halq.rcz.tool.ConfigurationWriter.writeConverts
import javax.swing.JPanel
import java.awt.Dimension
import javax.swing.JLabel
import javax.swing.JButton
import dev.halq.rcz.ui.RCZPanel
import java.awt.GridLayout
import javax.swing.BorderFactory
import javax.swing.JTextField
import java.awt.event.ActionListener
import dev.halq.rcz.tool.RCZTransformer
import dev.halq.rcz.tool.ConfigurationWriter
import javax.swing.JOptionPane
import java.io.IOException

/**
 * @author Halq
 * @since 31/12/2022 at 19:56
 */
class RCZPanel : JPanel() {
    init {
        preferredSize = Dimension(1000, 1080)
        drawPanel()
    }

    fun drawPanel() {
        val ACONVERT = JLabel("A  -> ")
        val BCONVERT = JLabel("B  -> ")
        val CCONVERT = JLabel("C  -> ")
        val DCONVERT = JLabel("D  -> ")
        val ECONVERT = JLabel("E  -> ")
        val FCONVERT = JLabel("F  -> ")
        val GCONVERT = JLabel("G  -> ")
        val HCONVERT = JLabel("H  -> ")
        val ICONVERT = JLabel("I  -> ")
        val JCONVERT = JLabel("J  -> ")
        val KCONVERT = JLabel("K  -> ")
        val LCONVERT = JLabel("L  -> ")
        val MCONVERT = JLabel("M  -> ")
        val NCONVERT = JLabel("N  -> ")
        val OCONVERT = JLabel("O  -> ")
        val PCONVERT = JLabel("P  -> ")
        val QCONVERT = JLabel("Q  -> ")
        val RCONVERT = JLabel("R  -> ")
        val SCONVERT = JLabel("S  -> ")
        val TCONVERT = JLabel("T  -> ")
        val UCONVERT = JLabel("U  -> ")
        val VCONVERT = JLabel("V  -> ")
        val WCONVERT = JLabel("W  -> ")
        val XCONVERT = JLabel("X  -> ")
        val YCONVERT = JLabel("Y  -> ")
        val ZCONVERT = JLabel("Z  -> ")
        val convert = JButton("ENCODE")
        val p3 = JPanel()
        p3.add(JLabel("RCZ ENCRYPT - USE CAPITAL LETTERS IN TEXT FIELDS"))
        p = JPanel()
        p!!.add(ACONVERT)
        p!!.add(ACONVERTED)
        p!!.add(BCONVERT)
        p!!.add(BCONVERTED)
        p!!.add(CCONVERT)
        p!!.add(CCONVERTED)
        p!!.add(DCONVERT)
        p!!.add(DCONVERTED)
        p!!.add(ECONVERT)
        p!!.add(ECONVERTED)
        p!!.add(FCONVERT)
        p!!.add(FCONVERTED)
        p!!.add(GCONVERT)
        p!!.add(GCONVERTED)
        p!!.add(HCONVERT)
        p!!.add(HCONVERTED)
        p!!.add(ICONVERT)
        p!!.add(ICONVERTED)
        p!!.add(JCONVERT)
        p!!.add(JCONVERTED)
        p!!.add(KCONVERT)
        p!!.add(KCONVERTED)
        p!!.add(LCONVERT)
        p!!.add(LCONVERTED)
        p!!.add(MCONVERT)
        p!!.add(MCONVERTED)
        p!!.add(NCONVERT)
        p!!.add(NCONVERTED)
        p!!.add(OCONVERT)
        p!!.add(OCONVERTED)
        p!!.add(PCONVERT)
        p!!.add(PCONVERTED)
        p!!.add(QCONVERT)
        p!!.add(QCONVERTED)
        p!!.add(RCONVERT)
        p!!.add(RCONVERTED)
        p!!.add(SCONVERT)
        p!!.add(SCONVERTED)
        p!!.add(TCONVERT)
        p!!.add(TCONVERTED)
        p!!.add(UCONVERT)
        p!!.add(UCONVERTED)
        p!!.add(VCONVERT)
        p!!.add(VCONVERTED)
        p!!.add(WCONVERT)
        p!!.add(WCONVERTED)
        p!!.add(XCONVERT)
        p!!.add(XCONVERTED)
        p!!.add(YCONVERT)
        p!!.add(YCONVERTED)
        p!!.add(ZCONVERT)
        p!!.add(ZCONVERTED)
        p!!.layout = GridLayout(27, 2)
        p!!.border = BorderFactory.createEmptyBorder(10, 10, 10, 10)
        val p2 = JPanel()
        val input = JTextField(20)
        val output = JTextField(20)
        val saveTemplate = JButton("SAVE TEMPLATE")
        p2.add(JLabel("TEXT TO ENCODE"))
        p2.add(input)
        p2.add(convert)
        p2.add(JLabel("ENCODED TEXT"))
        p2.add(output)
        p2.add(saveTemplate)
        output.isEditable = false
        convert.addActionListener {
            val out = encodeBytes(input.text)
            output.text = out
        }
        saveTemplate.addActionListener {
            try {
                writeConverts()
                JOptionPane.showMessageDialog(null, "Template saved in config.txt!")
            } catch (ex: IOException) {
                ex.printStackTrace()
            }
        }
        add(p3)
        add(p)
        add(p2)
    }

    companion object {
        var p: JPanel? = null
        var ACONVERTED = JTextField(6)
        var BCONVERTED = JTextField(6)
        var CCONVERTED = JTextField(6)
        var DCONVERTED = JTextField(6)
        var ECONVERTED = JTextField(6)
        var FCONVERTED = JTextField(6)
        var GCONVERTED = JTextField(6)
        var HCONVERTED = JTextField(6)
        var ICONVERTED = JTextField(6)
        var JCONVERTED = JTextField(6)
        var KCONVERTED = JTextField(6)
        var LCONVERTED = JTextField(6)
        var MCONVERTED = JTextField(6)
        var NCONVERTED = JTextField(6)
        var OCONVERTED = JTextField(6)
        var PCONVERTED = JTextField(6)
        var QCONVERTED = JTextField(6)
        var RCONVERTED = JTextField(6)
        var SCONVERTED = JTextField(6)
        var TCONVERTED = JTextField(6)
        var UCONVERTED = JTextField(6)
        var VCONVERTED = JTextField(6)
        var WCONVERTED = JTextField(6)
        var XCONVERTED = JTextField(6)
        var YCONVERTED = JTextField(6)
        var ZCONVERTED = JTextField(6)
    }
}