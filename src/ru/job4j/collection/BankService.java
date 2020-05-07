package ru.job4j.collection;

import java.util.*;

public class BankService {
    private Map<User, List<AccountBank>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<AccountBank>());
    }
    public void addAccount(String passport, AccountBank account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<AccountBank> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key: users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }
    public AccountBank findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        AccountBank account = null;
        if (user != null) {
            List<AccountBank> list = users.get(user);
            int index = list.indexOf(new AccountBank(requisite, -1));
            if (index != -1) {
                account = list.get(index);
            }
        }
        return account;
    }
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        AccountBank accountTransferring = findByRequisite(srcPassport, srcRequisite);
        AccountBank receivingAccount = findByRequisite(destPassport, dеstRequisite);
        if (accountTransferring != null && destPassport != null && accountTransferring.getBalance() >= amount ) {
            accountTransferring.setBalance(accountTransferring.getBalance() - amount);
            receivingAccount.setBalance(receivingAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
