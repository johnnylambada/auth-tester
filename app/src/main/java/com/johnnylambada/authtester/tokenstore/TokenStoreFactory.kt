package com.johnnylambada.authtester.tokenstore

import android.content.Context

object TokenStoreFactory {
    fun build(context: Context): TokenStore {
        return SharedPreferenceTokenStore(context)
    }
}
