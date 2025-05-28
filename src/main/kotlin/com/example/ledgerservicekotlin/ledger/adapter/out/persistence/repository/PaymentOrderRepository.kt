package com.example.ledgerservicekotlin.ledger.adapter.out.persistence.repository

import com.example.ledgerservicekotlin.ledger.domain.PaymentOrder

interface PaymentOrderRepository {

  fun getPaymentOrders(orderId: String): List<PaymentOrder>
}