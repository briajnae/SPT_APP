package com.parker.sptformapi;

import com.parker.sptformapi.dao.SPTRepository;
import com.parker.sptformapi.dto.SpecialPaymentTermForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class SptFormApiApplicationTests {

	@Autowired
	SPTRepository sptRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFormTest(){
		SpecialPaymentTermForm a = new SpecialPaymentTermForm();
		a.setFormId(1);
		a.setRequestorName("Mary Lamb");
		a.setLocation("32");
		a.setDepartment("43");
		a.setRequestDate(LocalDate.of(2021,06,21));
		a.setSupplierName("ABC Co.");
		a.setSupplierNumber("1234");
		a.setOccurrence("once");
		a.setCurrentPaymentTerms("current terms");
		a.setRequestedPaymentTerms("requested terms");
		a.setPaymentTermReason("reason");
		a.setApproved(false);
		a.setPaymentTermApprovalDate(LocalDate.of(2021,07,21));

	    sptRepo.save(a);
	}


}
