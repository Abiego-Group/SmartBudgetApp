package com.hellguy39.smartbudget.data

import com.hellguy39.smartbudget.domain.WalletRepository
import com.hellguy39.smartbudget.model.Wallet

class WalletRepositoryImpl : WalletRepository {

    override fun getWallets(): List<Wallet> {
        return testWallets
    }

    private val testWallets = listOf(
        Wallet(
            name = "Счёт 1",
            balance = "59.000 Р.",
            number = "**** 1234"
        ),
        Wallet(
            name = "Счёт 2",
            balance = "15.670 Р.",
            number = "**** 4321"
        )
    )
}
