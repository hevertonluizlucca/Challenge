package br.com.hevertonluizlucca.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.hevertonluizlucca.challenge.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChallengeApplicationTests {
	
	@Autowired
	private UserService service;

	@Test
	public void contextLoads() {
		
	}

	 @Test
	  public void testReturnFilterOneResult() throws Exception {
	    int count =  this.service.getUsersByFilter("heverton").size();
	    assertEquals(1, count);
	  }
	 
	 @Test
	  public void testReturnFilterNoResult() throws Exception {
	    int count =  this.service.getUsersByFilter("blablabla").size();
	    assertEquals(0, count);
	  }
	 
	 @Test
	  public void testReturnFilterAnyResult() throws Exception {
	    int count =  this.service.getUsersByFilter("usuario").size();
	    assertEquals(20, count);
	  }
	
}
