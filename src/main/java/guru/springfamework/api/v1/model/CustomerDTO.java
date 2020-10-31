/**
 * Alipay.com Inc.
 * Copyright (c) 2018‐2020 All Rights Reserved.
 */
package guru.springfamework.api.v1.model;

import lombok.Data;

/**
 * @author dhian.putra
 * @version $Id: CustomerDTO.java, v 0.1 2020‐10‐30 17.06 dhian.putra Exp $$ */
@Data
public class CustomerDTO {

    private Long   id;
    private String firstName;
    private String lastName;
    private String customerUrl;
}