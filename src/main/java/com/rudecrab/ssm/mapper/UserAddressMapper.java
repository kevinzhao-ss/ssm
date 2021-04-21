/*
 * @title com.rudecrab.ssm.entity.dao.UserAddressDAO.java
 * @Copy.Right (c)2015.好买气电子商务有限公司
 * @Department 技术开发部
 * @date 2021年04月21日 下午2:11:25
 * @author Enn.HowMuch.MybatisGenerator
 * @version V0.1.0
 *
 */
package com.rudecrab.ssm.mapper;


import com.rudecrab.ssm.entity.UserAddress;
import com.rudecrab.ssm.entity.vo.UserInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @InterfaceName org.mybatis.generator.api.dom.java.Interface
 * @TableName user_address
 * @Department user_address
 * @version V0.1.0
 * @Enn.Howmuch.MybatisGenerator
 */
public interface UserAddressMapper {
    /**
     * @MethodName deleteByPrimaryKey
     * @Description TODO
     * @param java.lang.Integer
     * @author Enn.HowMuch.MybatisGenerator
     * Method for user_address
     * @Enn.Howmuch.MybatisGenerator
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @MethodName insert
     * @Description TODO
     * @param com.rudecrab.ssm.entity.UserAddress
     * @author Enn.HowMuch.MybatisGenerator
     * Method for user_address
     * @Enn.Howmuch.MybatisGenerator
     */
    int insert(UserAddress record);

    /**
     * @MethodName insertSelective
     * @Description TODO
     * @param com.rudecrab.ssm.entity.UserAddress
     * @author Enn.HowMuch.MybatisGenerator
     * Method for user_address
     * @Enn.Howmuch.MybatisGenerator
     */
    int insertSelective(UserAddress record);

    /**
     * @MethodName selectByPrimaryKey
     * @Description TODO
     * @param java.lang.Integer
     * @author Enn.HowMuch.MybatisGenerator
     * Method for user_address
     * @Enn.Howmuch.MybatisGenerator
     */
    UserAddress selectByPrimaryKey(Integer id);

    /**
     * @MethodName updateByPrimaryKeySelective
     * @Description TODO
     * @param com.rudecrab.ssm.entity.UserAddress
     * @author Enn.HowMuch.MybatisGenerator
     * Method for user_address
     * @Enn.Howmuch.MybatisGenerator
     */
    int updateByPrimaryKeySelective(UserAddress record);

    /**
     * @MethodName updateByPrimaryKey
     * @Description TODO
     * @param com.rudecrab.ssm.entity.UserAddress
     * @author Enn.HowMuch.MybatisGenerator
     * Method for user_address
     * @Enn.Howmuch.MybatisGenerator
     */
    int updateByPrimaryKey(UserAddress record);

    /**
     * 根据用户id查询用户地址信息集合
     * @return
     */
    List<UserInfoVo> getUserAddressListByUserId(@Param("userId") int userId);

    UserAddress selectAddressId(@Param("userId") int userId);

}