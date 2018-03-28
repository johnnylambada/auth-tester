package com.johnnylambada.authtester.tokenstore

import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceTokenStore(context: Context) : TokenStore {

    private val STORE_NAME = "TokenStore"
    private val KEY = "Token"
    private val pref: SharedPreferences

    init {
        pref = context.getSharedPreferences(STORE_NAME, Context.MODE_PRIVATE)
    }

    override fun storeToken(token: String) {
        pref.edit().putString(KEY, token).apply()
    }

    override fun retrieveToken(): String {
        return pref.getString(KEY, "")
    }

    override fun clear() {
        pref.edit().clear().apply()
    }
}
