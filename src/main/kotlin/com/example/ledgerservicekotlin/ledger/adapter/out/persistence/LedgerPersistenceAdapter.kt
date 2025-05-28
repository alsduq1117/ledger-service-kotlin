package com.example.ledgerservicekotlin.ledger.adapter.out.persistence

import com.example.ledgerservicekotlin.common.PersistenceAdapter
import com.example.ledgerservicekotlin.ledger.adapter.out.persistence.repository.LedgerEntryRepository
import com.example.ledgerservicekotlin.ledger.adapter.out.persistence.repository.LedgerTransactionRepository
import com.example.ledgerservicekotlin.ledger.application.port.out.DuplicateMessageFilterPort
import com.example.ledgerservicekotlin.ledger.application.port.out.SaveDoubleLedgerEntryPort
import com.example.ledgerservicekotlin.ledger.domain.DoubleLedgerEntry
import com.example.ledgerservicekotlin.ledger.domain.PaymentEventMessage

@PersistenceAdapter
class LedgerPersistenceAdapter (
  private val ledgerTransactionRepository: LedgerTransactionRepository,
  private val ledgerEntryRepository: LedgerEntryRepository
) : DuplicateMessageFilterPort, SaveDoubleLedgerEntryPort {

  override fun isAlreadyProcess(message: PaymentEventMessage): Boolean {
    return ledgerTransactionRepository.isExist(message)
  }

  override fun save(doubleLedgerEntries: List<DoubleLedgerEntry>) {
    return ledgerEntryRepository.save(doubleLedgerEntries)
  }
}