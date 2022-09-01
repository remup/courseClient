package io.javabrains.springbootstarter.client;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.client.RestTemplate;

public class ClientServiceImpl {

	
	

public void getClientTopicById(String id,RestTemplate restTemplate,Logger log) {
	
	 
//	JavaMailSender mailSender;
//	SimpleMailMessage mail = new  SimpleMailMessage();
//	mail.setFrom("remya.pillai@citiustech.com");
//	mail.setTo("remya.pillai@citiustech.com");
//	mail.setSubject("test mail");
//	mail.setText("testing SprngBoot Mail");
	
	
	
	// TODO Auto-generated method stub
	System.out.println("=================Get  topic by ID Start=====================");
	log.debug("=================Get  topic by ID Start=====================");
	
	final String uri = "http://localhost:8080/getTopic/{id}";
     
    Map<String, String> params = new HashMap<String, String>();
    params.put("id", id);
     
    //the below method returns Object not JSON, we can use this to directly assign the returned object to the pojo class which is also correct.
    //ClientTopic clientTopic = restTemplate.getForObject(uri, ClientTopic.class, params);
    
    
    //the below method returns response entity with body(JSON object) along with status and headers ,we can fetch the requires parameters from the respnse entity ex we are fetching body below
    ResponseEntity<ClientTopic> clientTopicEntity=restTemplate.getForEntity(uri,  ClientTopic.class,params);
    ClientTopic clientTopic= clientTopicEntity.getBody();
     
    System.out.println(clientTopic);
	
	
    log.debug("The client output is"+"   "+clientTopic.getId()+"   "+clientTopic.getName()+"    "+clientTopic.getDescription());
	
	System.out.println(("The client output is"+"    "+clientTopic.getId()+"   "+clientTopic.getName()+"    "+clientTopic.getDescription()));
	
	
	//ClientTopic clientTopic= restTemplate.getForObject("http://localhost:8080/getTopic/"+id, ClientTopic.class);
	
	
	
	
	
	System.out.println("=================Get  topic by ID End=====================");
	log.debug("=================Get  topic by ID End=====================");
}
}
