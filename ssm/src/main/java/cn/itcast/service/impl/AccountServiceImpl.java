package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountSevice {

    @Autowired
    private AccountDao accountDao;
    /**
     * 查询所有的账户
     * @return
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有的账户...");
        return accountDao.findAll();
    }


    /**
     * 保存账户信息
     * @param account
     */
    @Transactional
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层:保存账户信息");
        accountDao.saveAccount(account);
    }
}
