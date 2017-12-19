package com.pansy;

public class TransferServiceImpl extends TransferService {
    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
