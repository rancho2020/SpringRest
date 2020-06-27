package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.domain.Billionaires;
import com.rest.repository.BillionairesRepository;

@Service
public class BillionairesServiceImpl implements BillionairesService{
	

	
	@Autowired(required=true)
	private BillionairesRepository billionairesRepository;
	
	public void setBillionairesRepository(BillionairesRepository billionairesRepository) {
		this.billionairesRepository = billionairesRepository;
	}

	public BillionairesRepository getBillionairesRepository() {
		return billionairesRepository;
	}

	public void save(Billionaires billionaires) {
		billionairesRepository.save(billionaires);
    }
     
    public List<Billionaires> listAll() {
        return (List<Billionaires>) billionairesRepository.findAll();
    }
     
    public Billionaires get(Long id) {
        return billionairesRepository.findById(id).get();
    }
     
    public void delete(Long id) {
    	billionairesRepository.deleteById(id);
    }



}
