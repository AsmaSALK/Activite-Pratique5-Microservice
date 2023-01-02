package com.example.cqrseventsourcing.mappers;


import com.example.cqrseventsourcing.queries.dto.AccountOperationResponseDTO;
import com.example.cqrseventsourcing.queries.dto.BankAccountResponseDTO;
import com.example.cqrseventsourcing.queries.entities.AccountOperation;
import com.example.cqrseventsourcing.queries.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
