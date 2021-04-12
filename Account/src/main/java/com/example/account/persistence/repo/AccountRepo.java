package com.example.account.persistence.repo;


import com.example.account.persistence.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long> {
}

