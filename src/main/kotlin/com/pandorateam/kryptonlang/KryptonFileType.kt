package com.pandorateam.kryptonlang

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object KryptonFileType : LanguageFileType(KryptonLanguage) {
    override fun getName(): String = "KryptonFileType"
    override fun getDescription(): String = "Krypton file"
    override fun getDefaultExtension(): String = "kr"
    override fun getIcon(): Icon? = KryptonIcons.KRYPTON_FILE
}