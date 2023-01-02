package com.example.cqrseventsourcing.commands.services;

import com.example.cqrseventsourcing.commands.dto.CreateAccountRequestDTO;
import com.example.cqrseventsourcing.commands.dto.CreditAccountRequestDTO;
import com.example.cqrseventsourcing.commands.dto.DebitAccountRequestDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);
    CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);
    CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}
