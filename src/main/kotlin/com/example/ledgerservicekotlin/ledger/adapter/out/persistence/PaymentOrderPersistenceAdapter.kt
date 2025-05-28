package com.example.ledgerservicekotlin.ledger.adapter.out.persistence

import com.example.ledgerservicekotlin.common.PersistenceAdapter
import com.example.ledgerservicekotlin.ledger.adapter.out.persistence.repository.PaymentOrderRepository
import com.example.ledgerservicekotlin.ledger.application.port.out.LoadPaymentOrderPort
import com.example.ledgerservicekotlin.ledger.domain.PaymentOrder

@PersistenceAdapter
class PaymentOrderPersistenceAdapter (
  private val paymentOrderRepository: PaymentOrderRepository
) : LoadPaymentOrderPort {

  override fun getPaymentOrders(orderId: String): List<PaymentOrder> {
    return paymentOrderRepository.getPaymentOrders(orderId)
  }
}