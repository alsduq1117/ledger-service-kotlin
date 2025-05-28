package com.example.ledgerservicekotlin.ledger.adapter.out.persistence.repository

import com.example.ledgerservicekotlin.ledger.domain.PaymentEventMessage

interface LedgerTransactionRepository {

  fun isExist(message: PaymentEventMessage): Boolean
}