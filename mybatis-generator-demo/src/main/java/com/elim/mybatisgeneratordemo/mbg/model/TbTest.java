package com.elim.mybatisgeneratordemo.mbg.model;

import java.math.BigDecimal;
import java.util.Date;

public class TbTest {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_test.id
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_test.name
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_test.password
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_test.price
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_test.create_time
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_test.id
     *
     * @return the value of tb_test.id
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_test.id
     *
     * @param id the value for tb_test.id
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_test.name
     *
     * @return the value of tb_test.name
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_test.name
     *
     * @param name the value for tb_test.name
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_test.password
     *
     * @return the value of tb_test.password
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_test.password
     *
     * @param password the value for tb_test.password
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_test.price
     *
     * @return the value of tb_test.price
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_test.price
     *
     * @param price the value for tb_test.price
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_test.create_time
     *
     * @return the value of tb_test.create_time
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_test.create_time
     *
     * @param createTime the value for tb_test.create_time
     *
     * @mbggenerated Sun Nov 29 19:16:05 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}