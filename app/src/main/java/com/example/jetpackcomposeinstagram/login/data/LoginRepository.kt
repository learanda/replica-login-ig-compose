package com.example.jetpackcomposeinstagram.login.data

import com.example.jetpackcomposeinstagram.login.data.network.LoginService
import javax.inject.Inject

class LoginRepository @Inject constructor(private val api: LoginService) {

    suspend fun doLogin(user: String, password: String): Boolean {
        // acá podríamos tener una lógica de si por ejemplo la api no tiene la info necesaria, acceder a la base de datos
        return api.doLogin(user, password)
    }
}