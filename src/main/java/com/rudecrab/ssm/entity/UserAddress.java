/*
 * @title com.rudecrab.ssm.entity.bean.UserAddress.java
 * @Copy.Right (c)2015.好买气电子商务有限公司
 * @Department 技术开发部
 * @date 2021年04月21日 下午2:11:25
 * @author Enn.HowMuch.MybatisGenerator
 * @version V0.1.0
 *
 */
package com.rudecrab.ssm.entity;

import java.util.Date;

/**
 * @ClassName org.mybatis.generator.api.dom.java.TopLevelClass
 * @TableName user_address
 * @Department user_address
 * @version V0.1.0
 * @Enn.Howmuch.MybatisGenerator
 */
public class UserAddress {
    /**
     * @Department 主键
     * @DatabaseTable user_address
     * @DatabaseColumn id
     * @Enn.Howmuch.MybatisGenerator
     */
    private Integer id;

    /**
     * @Department 用户id
     * @DatabaseTable user_address
     * @DatabaseColumn user_id
     * @Enn.Howmuch.MybatisGenerator
     */
    private Integer userId;

    /**
     * @Department 国家
     * @DatabaseTable user_address
     * @DatabaseColumn addr_country
     * @Enn.Howmuch.MybatisGenerator
     */
    private String addrCountry;

    /**
     * @Department 省份
     * @DatabaseTable user_address
     * @DatabaseColumn addr_province
     * @Enn.Howmuch.MybatisGenerator
     */
    private String addrProvince;

    /**
     * @Department 城市
     * @DatabaseTable user_address
     * @DatabaseColumn addr_city
     * @Enn.Howmuch.MybatisGenerator
     */
    private String addrCity;

    /**
     * @Department 区
     * @DatabaseTable user_address
     * @DatabaseColumn addr_county
     * @Enn.Howmuch.MybatisGenerator
     */
    private String addrCounty;

    /**
     * @Department 详细地址
     * @DatabaseTable user_address
     * @DatabaseColumn addr_detail
     * @Enn.Howmuch.MybatisGenerator
     */
    private String addrDetail;

    /**
     * @Department 备注信息
     * @DatabaseTable user_address
     * @DatabaseColumn remark
     * @Enn.Howmuch.MybatisGenerator
     */
    private String remark;

    /**
     * @Department CURRENT_TIMESTAMP
     * @DatabaseTable user_address
     * @DatabaseColumn create_time
     * @Enn.Howmuch.MybatisGenerator
     */
    private Date createTime;

    /**
     * @Department CURRENT_TIMESTAMP
     * @DatabaseTable user_address
     * @DatabaseColumn update_time
     * @Enn.Howmuch.MybatisGenerator
     */
    private Date updateTime;

    /**
     * 获取user_address.id
     *
     * @return user_address.id
     * @Enn.Howmuch.MybatisGenerator
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置user_address.id
     *
     * @param setuser_address.id
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取user_address.user_id
     *
     * @return user_address.user_id
     * @Enn.Howmuch.MybatisGenerator
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置user_address.user_id
     *
     * @param setuser_address.user_id
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取user_address.addr_country
     *
     * @return user_address.addr_country
     * @Enn.Howmuch.MybatisGenerator
     */
    public String getAddrCountry() {
        return addrCountry;
    }

    /**
     * 设置user_address.addr_country
     *
     * @param setuser_address.addr_country
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setAddrCountry(String addrCountry) {
        this.addrCountry = addrCountry == null ? null : addrCountry.trim();
    }

    /**
     * 获取user_address.addr_province
     *
     * @return user_address.addr_province
     * @Enn.Howmuch.MybatisGenerator
     */
    public String getAddrProvince() {
        return addrProvince;
    }

    /**
     * 设置user_address.addr_province
     *
     * @param setuser_address.addr_province
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince == null ? null : addrProvince.trim();
    }

    /**
     * 获取user_address.addr_city
     *
     * @return user_address.addr_city
     * @Enn.Howmuch.MybatisGenerator
     */
    public String getAddrCity() {
        return addrCity;
    }

    /**
     * 设置user_address.addr_city
     *
     * @param setuser_address.addr_city
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity == null ? null : addrCity.trim();
    }

    /**
     * 获取user_address.addr_county
     *
     * @return user_address.addr_county
     * @Enn.Howmuch.MybatisGenerator
     */
    public String getAddrCounty() {
        return addrCounty;
    }

    /**
     * 设置user_address.addr_county
     *
     * @param setuser_address.addr_county
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setAddrCounty(String addrCounty) {
        this.addrCounty = addrCounty == null ? null : addrCounty.trim();
    }

    /**
     * 获取user_address.addr_detail
     *
     * @return user_address.addr_detail
     * @Enn.Howmuch.MybatisGenerator
     */
    public String getAddrDetail() {
        return addrDetail;
    }

    /**
     * 设置user_address.addr_detail
     *
     * @param setuser_address.addr_detail
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail == null ? null : addrDetail.trim();
    }

    /**
     * 获取user_address.remark
     *
     * @return user_address.remark
     * @Enn.Howmuch.MybatisGenerator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置user_address.remark
     *
     * @param setuser_address.remark
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取user_address.create_time
     *
     * @return user_address.create_time
     * @Enn.Howmuch.MybatisGenerator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置user_address.create_time
     *
     * @param setuser_address.create_time
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取user_address.update_time
     *
     * @return user_address.update_time
     * @Enn.Howmuch.MybatisGenerator
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置user_address.update_time
     *
     * @param setuser_address.update_time
     * @Enn.Howmuch.MybatisGenerator
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}