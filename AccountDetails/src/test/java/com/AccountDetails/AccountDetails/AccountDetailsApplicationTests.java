package com.AccountDetails.AccountDetails;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.AccountDetails.AccountDetails.AccountDetailsController;;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountDetailsApplicationTests {

	@Test
	public void connection(){
		String  msisdn = "966561732435";
		AccountDetailsController test= new AccountDetailsController();
		test.checkInfo(msisdn);

	}

}
