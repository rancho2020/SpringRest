package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.BillionairesDaoImpl;
import com.rest.domain.Billionaires;

@Service
public class BillionairesServiceImpl implements BillionairesService{
	
	@Autowired
	private BillionairesDaoImpl billionairesDaoImpl;

    public List<Billionaires> listAll() {
       System.out.println("SEERVVICE listAll---");
    	return (List<Billionaires>) billionairesDaoImpl.getBillionaires();
    	//return list;
    }
     
	 
	@Override
	public int deleteBillionaire(Long bilionaireiD) {
		System.out.println("SEERVVICE delete---");
		  return billionairesDaoImpl.deleteBillionaire(bilionaireiD); 
	}

	@Override
	public int createBillionaires(Billionaires billionaires) {
		System.out.println("SEERVVICE SAVE---");
		return billionairesDaoImpl.createBillionaires(billionaires);
	}

	@Override
	public boolean updateBillionaire(Billionaires billionaires) {
		System.out.println("SEERVVICE update---");
		return billionairesDaoImpl.updateBillionaire(billionaires);
	}
	 



}
