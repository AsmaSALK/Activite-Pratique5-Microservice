package com.example.cqrseventsourcing.queries.repository;


import com.example.cqrseventsourcing.queries.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<BankAccount,String> {
}
