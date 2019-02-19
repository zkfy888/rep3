package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountSevice {

    /**
     * 查询所有的账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     */
    public void saveAccount(Account account);
}
