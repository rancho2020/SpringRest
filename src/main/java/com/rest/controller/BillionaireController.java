package com.rest.controller;

import com.rest.domain.Billionaires;
import com.rest.service.BillionairesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BillionaireController {


    private BillionairesService billionairesService;

    @Autowired
    public BillionaireController(BillionairesService billionairesService) {
        this.billionairesService = billionairesService;
    }

    @GetMapping(path = "/billionaires", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Billionaires> findAll() {
        return billionairesService.listAll();
    }

    @DeleteMapping(path = "/billionaire/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> delete(@PathVariable Long id) {
        billionairesService.deleteBillionaire(id);
        return ResponseEntity.ok().body("User deleted successfully");
    }

    @PostMapping(path = "/billionaire", produces = MediaType.APPLICATION_JSON_VALUE)
    public String save(@RequestBody Billionaires billionaires) {
        billionairesService.createBillionaires(billionaires);
        return "User deleted successfully";
    }

    @PutMapping(path = "/billionaire/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@RequestBody Billionaires billionaires) {
        billionairesService.updateBillionaire(billionaires);
        return "User deleted successfully";
    }

}
