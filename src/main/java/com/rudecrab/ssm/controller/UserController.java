package com.rudecrab.ssm.controller;

import com.rudecrab.ssm.entity.User;
import com.rudecrab.ssm.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {

    private static final Log logger = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/getList")
    public String getList(Model model) {
        model.addAttribute("userList", userService.getAll());
        // 返回一个网页
        return "index";
    }

    @GetMapping("/getJson")
    @ResponseBody
    public List<User> getList() {
        return userService.getAll();
    }

    @GetMapping("/add")
    public int addOne(User user) {
        return userService.insert(user);
    }
}
