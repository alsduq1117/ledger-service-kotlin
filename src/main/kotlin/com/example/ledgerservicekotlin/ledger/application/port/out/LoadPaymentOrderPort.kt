package com.example.ledgerservicekotlin.ledger.application.port.out

import com.example.ledgerservicekotlin.ledger.domain.PaymentOrder

interface LoadPaymentOrderPort {

  fun getPaymentOrders(orderId: String): List<PaymentOrder>
}