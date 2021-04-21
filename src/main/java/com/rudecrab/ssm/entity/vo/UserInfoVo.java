package com.rudecrab.ssm.entity.vo;

import com.rudecrab.ssm.entity.User;
import com.rudecrab.ssm.entity.UserAddress;

import java.util.List;

/**
 * 用户详情信息
 */
public class UserInfoVo extends User {

    /**
     * 所有用户地址信息
     */
    List<UserAddress> addressList;

    public List<UserAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<UserAddress> addressList) {
        this.addressList = addressList;
    }
}
