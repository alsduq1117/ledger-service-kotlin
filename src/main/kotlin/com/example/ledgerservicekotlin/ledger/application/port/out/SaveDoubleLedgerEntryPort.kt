package com.example.ledgerservicekotlin.ledger.application.port.out

import com.example.ledgerservicekotlin.ledger.domain.DoubleLedgerEntry

interface SaveDoubleLedgerEntryPort {

  fun save(doubleLedgerEntries: List<DoubleLedgerEntry>)
}