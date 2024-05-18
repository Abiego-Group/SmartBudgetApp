package com.hellguy39.smartbudget.di

import com.hellguy39.smartbudget.data.AuthRepositoryImpl
import com.hellguy39.smartbudget.data.WalletRepositoryImpl

object AppContainer {

    val walletRepository by lazy { WalletRepositoryImpl() }

    val authRepository by lazy { AuthRepositoryImpl() }

}