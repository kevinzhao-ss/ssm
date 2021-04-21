package com.rudecrab.ssm.controller;

import com.rudecrab.ssm.entity.User;
import com.rudecrab.ssm.entity.vo.UserInfoVo;
import com.rudecrab.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getList")
    public String getList(Model model) {
        model.addAttribute("userList", userService.getAll());
        return "index";
    }

    @GetMapping("/getJson")
    @ResponseBody
    public List<User> getList() {
        return userService.getAll();
    }

    /**
     * wwx
     * @return
     */
    @GetMapping("/getUserJson")
    @ResponseBody
    public List<UserInfoVo> getUserList() {
        return userService.getUserAddressListByUserId(1);
    }
}
