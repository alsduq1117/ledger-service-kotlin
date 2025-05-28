package com.example.ledgerservicekotlin.ledger.application.port.out

import com.example.ledgerservicekotlin.ledger.domain.PaymentEventMessage

interface DuplicateMessageFilterPort {

  fun isAlreadyProcess(message: PaymentEventMessage): Boolean
}