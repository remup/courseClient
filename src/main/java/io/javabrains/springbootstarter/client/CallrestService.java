package io.javabrains.springbootstarter.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CallrestService implements CommandLineRunner {

	



@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
	final Logger log=LoggerFactory.getLogger(CallrestService.class);
	
	//ClientServiceImpl n = new ClientServiceImpl();
	ClientServiceImpl n = superBean();
	 RestTemplate restTemplate =new RestTemplate();
	
	 
	String getTopicId="two";
	
	n.getClientTopicById(getTopicId,restTemplate,log);
	
	
	
	
	
}


private ClientServiceImpl superBean() {
	// TODO Auto-generated method stub
	return new ClientServiceImpl() ;
}}


