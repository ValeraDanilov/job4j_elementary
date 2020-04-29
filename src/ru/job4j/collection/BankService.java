package ru.job4j.collection;

import java.util.*;

public class BankService {
    private Map<User, List<AccountBank>> users = new HashMap<>();

    public void addUser(User user) {
       if (!users.containsKey(user)) {
           users.put(user, new ArrayList<AccountBank>());
       }
    }
    public void addAccount(String passport, AccountBank account) {
        User user = findByPassport(passport);
        List<AccountBank> list = users.get(user);
        list.add(account);
        users.putIfAbsent(user, list);
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key: users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
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
             account = list.get(index);
        }
        return account;
    }
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        AccountBank account = findByRequisite(srcPassport, srcRequisite);
        AccountBank secondAccount = findByRequisite(destPassport, dеstRequisite);
        if (account != null && destPassport != null && account.getBalance() >= amount ) {
            account.setBalance(account.getBalance() - amount);
            secondAccount.setBalance(secondAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
