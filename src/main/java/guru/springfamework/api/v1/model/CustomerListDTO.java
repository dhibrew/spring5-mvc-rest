/**
 * Alipay.com Inc.
 * Copyright (c) 2018‐2020 All Rights Reserved.
 */
package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author dhian.putra
 * @version $Id: CustomerListDTO.java, v 0.1 2020‐10‐30 17.06 dhian.putra Exp $$ */
@Data
@AllArgsConstructor
public class CustomerListDTO {

    private List<CustomerDTO> customerDTOList;

}