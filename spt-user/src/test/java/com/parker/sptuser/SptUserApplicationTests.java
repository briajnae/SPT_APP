package com.parker.sptuser;

import com.parker.sptuser.dao.UserRepository;
import com.parker.sptuser.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SptUserApplicationTests {

	@Autowired
	UserRepository userRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUpdateAndDeleteUserTest(){
		User me = new User();
		me.setUserId(1);
		me.setFirstName("Mary");
		me.setLastName("Lamb");
		me.setEmail("mlamb@yahoo.com");
		me.setDepartment("TFD");
		me.setLocation("31");

		userRepo.save(me);

	}

}
