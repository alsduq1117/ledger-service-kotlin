package com.example.ledgerservicekotlin.ledger.adapter.out.persistence.repository

import com.example.ledgerservicekotlin.ledger.domain.DoubleAccountsForLedger
import com.example.ledgerservicekotlin.ledger.domain.FinanceType

interface AccountRepository {

  fun getDoubleAccountsForLedger(financeType: FinanceType): DoubleAccountsForLedger
}