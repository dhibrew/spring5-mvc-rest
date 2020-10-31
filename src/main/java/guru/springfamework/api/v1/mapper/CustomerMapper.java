/**
 * Alipay.com Inc.
 * Copyright (c) 2018‐2020 All Rights Reserved.
 */
package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author dhian.putra
 * @version $Id: CustomerMapper.java, v 0.1 2020‐10‐30 17.10 dhian.putra Exp $$ */
@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

}