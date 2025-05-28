package com.example.ledgerservicekotlin.ledger.adapter.`in`.stream

import com.example.ledgerservicekotlin.common.StreamAdapter
import com.example.ledgerservicekotlin.ledger.application.port.`in`.DoubleLedgerEntryRecordUseCase
import com.example.ledgerservicekotlin.ledger.domain.PaymentEventMessage
import org.springframework.cloud.stream.function.StreamBridge
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.Message
import java.util.function.Consumer

@Configuration
@StreamAdapter
class PaymentEventMessageHandler (
    private val doubleLedgerEntryRecordUseCase: DoubleLedgerEntryRecordUseCase,
    private val streamBridge: StreamBridge
) {

  @Bean
  fun consume(): Consumer<Message<PaymentEventMessage>> {
    return Consumer { message ->
      val ledgerEventMessage = doubleLedgerEntryRecordUseCase.recordDoubleLedgerEntry(message.payload)
      streamBridge.send("ledger", ledgerEventMessage)
    }
  }
}