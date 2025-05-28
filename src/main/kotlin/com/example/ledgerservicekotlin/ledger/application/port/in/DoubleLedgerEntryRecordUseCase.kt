package com.example.ledgerservicekotlin.ledger.application.port.`in`

import com.example.ledgerservicekotlin.ledger.domain.LedgerEventMessage
import com.example.ledgerservicekotlin.ledger.domain.PaymentEventMessage

interface DoubleLedgerEntryRecordUseCase {

  fun recordDoubleLedgerEntry(message: PaymentEventMessage): LedgerEventMessage
}