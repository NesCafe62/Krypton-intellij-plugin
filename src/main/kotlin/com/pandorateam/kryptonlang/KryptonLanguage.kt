package com.pandorateam.kryptonlang

import com.intellij.lang.Language

object KryptonLanguage : Language("krypton") {
    private fun readResolve(): Any = KryptonLanguage
    override fun getDisplayName(): String = "Krypton"
}