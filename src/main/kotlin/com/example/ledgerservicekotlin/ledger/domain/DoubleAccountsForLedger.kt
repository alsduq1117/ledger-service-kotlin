package com.example.ledgerservicekotlin.ledger.domain

data class DoubleAccountsForLedger (
  val to: Account,
  val from: Account
)