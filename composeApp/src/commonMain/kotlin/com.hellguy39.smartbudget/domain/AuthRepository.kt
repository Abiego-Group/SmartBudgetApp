package com.hellguy39.smartbudget.domain

import com.hellguy39.smartbudget.model.LoginParams

interface AuthRepository {

    suspend fun login(loginParams: LoginParams): Boolean

    suspend fun isAuthenticated(): Boolean

    suspend fun logout()

}
