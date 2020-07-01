package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.domain.Billionaires;
import com.rest.repository.BillionairesDaoImpl;

@Service
public class BillionairesServiceImpl implements BillionairesService{
	

	
	
	@Autowired
	private BillionairesDaoImpl billionairesDaoImpl;

	/*
	 * public void setBillionairesRepository(BillionairesRepository
	 * billionairesRepository) { this.billionairesRepository =
	 * billionairesRepository; }
	 */

	/*
	 * public BillionairesRepository getBillionairesRepository() { return
	 * billionairesRepository; }
	 */

	/*
	 * public void save(Billionaires billionaires) {
	 * billionairesRepository.save(billionaires); }
	 */
     
    public List<Billionaires> listAll() {
       System.out.println("SEERVVICE listAll---");
    	return (List<Billionaires>) billionairesDaoImpl.getBillionaires();
    	//return list;
    }
     
	/*
	 * public Billionaires get(Long id) { return
	 * 
	 * billionairesRepository.findById(id).get(); }
	 */
	 
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
	 



}
