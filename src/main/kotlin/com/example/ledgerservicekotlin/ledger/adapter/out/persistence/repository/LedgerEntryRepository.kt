package com.example.ledgerservicekotlin.ledger.adapter.out.persistence.repository

import com.example.ledgerservicekotlin.ledger.domain.DoubleLedgerEntry

interface LedgerEntryRepository {

  fun save(doubleLedgerEntries: List<DoubleLedgerEntry>)
}