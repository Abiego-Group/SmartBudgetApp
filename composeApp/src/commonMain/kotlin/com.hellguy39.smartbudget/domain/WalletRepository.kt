package com.hellguy39.smartbudget.domain

import com.hellguy39.smartbudget.model.Wallet

interface WalletRepository {

    fun getWallets() : List<Wallet>

}