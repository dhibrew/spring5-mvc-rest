/**
 * Alipay.com Inc.
 * Copyright (c) 2018‐2020 All Rights Reserved.
 */
package guru.springfamework.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author dhian.putra
 * @version $Id: Customer.java, v 0.1 2020‐10‐30 16.58 dhian.putra Exp $$ */
@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}