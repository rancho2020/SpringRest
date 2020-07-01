package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.domain.Billionaires;
import com.rest.service.BillionairesService;

@RestController
@RequestMapping("/rest")
public class MyRestController {

	@Autowired(required = true)
	private BillionairesService billionairesService;

	@GetMapping(path = "/get/allData", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Billionaires> getText() {
		return billionairesService.listAll();
	}

	@DeleteMapping(path = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> delete(@PathVariable Long id) {
		billionairesService.deleteBillionaire(id);
		return ResponseEntity.ok().body("User deleted successfully");
	}

	@PostMapping(path = "/save/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String save(@RequestBody Billionaires billionaires) {
		billionairesService.createBillionaires(billionaires);
		return "User deleted successfully";
	}

	@PostMapping(path = "/update/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String update(@RequestBody Billionaires billionaires) {
		billionairesService.updateBillionaire(billionaires);
		return "User deleted successfully";
	}

}
