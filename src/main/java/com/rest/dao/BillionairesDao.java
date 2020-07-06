package com.rest.dao;

import java.util.List;

import com.rest.domain.Billionaires;

public interface BillionairesDao {
	public List<Billionaires> getBillionaires();

	public Billionaires getBillionaire(Long bilionaireiD);

	public int deleteBillionaire(Billionaires billionaire);

	public Billionaires updateBillionaire(Billionaires billionaires);

	public int createBillionaires(Billionaires billionaires);
}