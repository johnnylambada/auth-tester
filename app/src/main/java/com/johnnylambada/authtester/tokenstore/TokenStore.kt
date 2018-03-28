package com.johnnylambada.authtester.tokenstore

interface TokenStore {
    fun storeToken(token: String)
    fun retrieveToken(): String
    fun clear()
}
