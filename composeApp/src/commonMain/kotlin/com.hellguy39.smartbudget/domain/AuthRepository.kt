package com.hellguy39.smartbudget.domain

import com.hellguy39.smartbudget.model.LoginParams
import com.hellguy39.smartbudget.model.RegisterParams

interface AuthRepository {

    suspend fun register(registerParams: RegisterParams): Boolean

    suspend fun login(loginParams: LoginParams): Boolean

    suspend fun isAuthenticated(): Boolean

    suspend fun logout()

}
