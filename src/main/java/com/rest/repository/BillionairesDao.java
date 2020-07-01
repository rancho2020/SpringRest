package com.rest.repository;

import java.util.List;

import com.rest.domain.Billionaires;

public interface BillionairesDao {
	public List<Billionaires> getBillionaires();

	public Billionaires getBillionaire(Long billionaireiD);

	public int deleteBillionaire(Long bilionaireiD);

	public int updateBillionaire(Billionaires billionaires);

	public int createBillionaires(Billionaires billionaires);
}