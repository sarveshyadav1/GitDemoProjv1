package com.example.demo.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {
	
	private List<String> listMassage=new ArrayList<String>();
	
	
  public void addMessage(String msg) {
	  
	  listMassage.add(msg);
	  
  }
  
  public String getAllMessage() {
	return listMassage.toString();
	  
  }
}
