package com.example.account.service;


import com.example.account.persistence.domain.Account;
import com.example.account.persistence.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AccountService {
    private AccountRepo repo;
    private RestTemplate rest;
//    private NumGenService numGen;
//    private PrizeGenService prizeGen;

    @Autowired
    public AccountService(AccountRepo repo){
        super();
        this.repo = repo;

    }

    public Account create(Account account, String accNum, double prizeNum) {
//        int num = numGen.generateNumber();
//        int prize = prizeGen.getPrize(num);
        account.setAccNum(accNum);
        account.setPrize(prizeNum);



        Account returnAccount = this.repo.save(account);
        return returnAccount;
    }

    public Account readById(Long id) {
        Account account = this.repo.findById(id).orElseThrow(() -> new NullPointerException());
        return account;
    }

    public List<Account> readAll() {
        List<Account> account = this.repo.findAll();

        return account;
    }

    public Account updateById(Long id, Account newAccount) {
        Account oldAccount = this.repo.findById(id).orElseThrow(() -> new NullPointerException());

        oldAccount.setFirstName(newAccount.getFirstName());
        oldAccount.setLastName(newAccount.getLastName());

        return this.repo.save(oldAccount);
    }

    public boolean deleteById(Long id) {
        this.repo.findById(id);
        this.repo.deleteById(id);

        return !this.repo.existsById(id);
    }
    }

