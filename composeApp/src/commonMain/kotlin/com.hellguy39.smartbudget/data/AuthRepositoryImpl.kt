package com.hellguy39.smartbudget.data

import com.hellguy39.smartbudget.domain.AuthRepository
import com.hellguy39.smartbudget.model.LoginParams

class AuthRepositoryImpl : AuthRepository {

    override suspend fun login(loginParams: LoginParams): Boolean {
        return true
    }

    override suspend fun isAuthenticated(): Boolean {
        return false
    }

    override suspend fun logout() {
    }
}
