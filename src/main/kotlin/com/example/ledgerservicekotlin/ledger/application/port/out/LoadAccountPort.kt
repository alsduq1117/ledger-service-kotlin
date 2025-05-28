package com.example.ledgerservicekotlin.ledger.application.port.out

import com.example.ledgerservicekotlin.ledger.domain.DoubleAccountsForLedger
import com.example.ledgerservicekotlin.ledger.domain.FinanceType

interface LoadAccountPort {

  fun getDoubleAccountsForLedger(financeType: FinanceType): DoubleAccountsForLedger
}