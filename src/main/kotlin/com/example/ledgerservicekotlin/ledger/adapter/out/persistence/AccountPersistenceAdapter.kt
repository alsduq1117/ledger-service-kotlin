package com.example.ledgerservicekotlin.ledger.adapter.out.persistence

import com.example.ledgerservicekotlin.common.PersistenceAdapter
import com.example.ledgerservicekotlin.ledger.adapter.out.persistence.repository.AccountRepository
import com.example.ledgerservicekotlin.ledger.application.port.out.LoadAccountPort
import com.example.ledgerservicekotlin.ledger.domain.DoubleAccountsForLedger
import com.example.ledgerservicekotlin.ledger.domain.FinanceType

@PersistenceAdapter
class AccountPersistenceAdapter (
  private val accountRepository: AccountRepository
) : LoadAccountPort {

  override fun getDoubleAccountsForLedger(financeType: FinanceType): DoubleAccountsForLedger {
    return accountRepository.getDoubleAccountsForLedger(financeType)
  }
}