package com.example.ledgerservicekotlin.ledger.adapter.out.persistence.entity

import com.example.ledgerservicekotlin.ledger.domain.Account
import org.springframework.stereotype.Component

@Component
class JpaAccountMapper {

  fun mapToDomainEntity(jpaAccountEntity: JpaAccountEntity): Account {
    return Account(
      id = jpaAccountEntity.id!!,
      name = jpaAccountEntity.name
    )
  }
}