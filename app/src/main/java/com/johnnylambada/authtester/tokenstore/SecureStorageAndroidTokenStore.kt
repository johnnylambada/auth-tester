package com.johnnylambada.authtester.tokenstore

import android.content.Context
import de.adorsys.android.securestoragelibrary.SecurePreferences

class SecureStorageAndroidTokenStore(context: Context) : TokenStore {

    private val KEY = "Token"

    override fun storeToken(token: String) {
        SecurePreferences.setValue(KEY,token)
    }

    override fun retrieveToken(): String {
        return SecurePreferences.getStringValue(KEY,"")!!
    }

    override fun clear() {
        SecurePreferences.clearAllValues()
    }
}
