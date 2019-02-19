package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountSevice accountSevice;

    /**
     * 查询所有
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层:查询所有账户...");
        List<Account> accounts = accountSevice.findAll();
        model.addAttribute("list",accounts);
        return "list";
    }

    @RequestMapping("/save")
    public void findAll(Account account, HttpServletResponse response, HttpServletRequest request) throws IOException {
        accountSevice.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
