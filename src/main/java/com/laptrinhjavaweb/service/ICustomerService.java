package com.laptrinhjavaweb.service;

import java.util.List;


import com.laptrinhjavaweb.DTO.CustomerDTO;

public interface ICustomerService {
	List<CustomerDTO> findAll();
	void insert(CustomerDTO newCustomerDTO);
	CustomerDTO update(CustomerDTO updateCustomer, Long id);
	void delete(Long id);
	void findID(Long id);
}
