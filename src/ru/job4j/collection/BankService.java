package ru.job4j.collection;

import java.util.*;
import java.util.stream.Collectors;

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
        List<User> list = users.keySet().stream().filter(x -> x.getPassport().equals(passport)).collect(Collectors.toList());
        return list.size() == 0 ? null: list.get(0);
    }

    public AccountBank findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<AccountBank> list = users.get(user).stream().filter(accountBank -> accountBank.getRequisite().equals(requisite)).collect(Collectors.toList());
            return list.size() == 0? null: list.get(0);
        }
        return null;
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
