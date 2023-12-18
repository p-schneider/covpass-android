package de.rki.covpass.commonapp.utils

public object PrivacyMode {
    public var enabled: Boolean = true
    public fun toggle(): Boolean {
        enabled = !enabled
        return enabled
    }
}
