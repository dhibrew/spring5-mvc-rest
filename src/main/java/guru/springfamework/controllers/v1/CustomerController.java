/**
 * Alipay.com Inc.
 * Copyright (c) 2018‐2020 All Rights Reserved.
 */
package guru.springfamework.controllers.v1;

import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.api.v1.model.CustomerListDTO;
import guru.springfamework.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dhian.putra
 * @version $Id: CustomerController.java, v 0.1 2020‐10‐31 10.11 dhian.putra Exp $$ */

@Controller
@RequestMapping("/api/v1/customers/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<CustomerListDTO> getAllCustomers(){

        return new ResponseEntity<CustomerListDTO>(new CustomerListDTO(customerService.getAllCustomers()) , HttpStatus.OK);
    }

    @GetMapping("{firstName}")
    public ResponseEntity<CustomerDTO> getCustomerByFName(@PathVariable String firstName){

        return new ResponseEntity<>(customerService.getCustomerByFirstName(firstName),
                HttpStatus.OK);
    }


}