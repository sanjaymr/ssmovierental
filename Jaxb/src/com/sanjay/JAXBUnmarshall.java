package com.sanjay;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
 

public class JAXBUnmarshall {
	public static void main(String[] args) {
		 
		 try {
	 
			File file = new File("C:\\Sanjay\\Project\\Jaxb\\test_jaxb.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
	 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer.name);
	 
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	 
		}
	}
