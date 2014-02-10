package com.sanjay;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
 
public class JAXBExample {
	public static void main(String[] args) {
 
	  Customer customer = new Customer();
	  customer.setId(100);
	  customer.setName("SBOM");
	  customer.setAge(29);
	  
 
	  try {
 
		File file = new File("C:\\Sanjay\\Project\\Jaxb\\test_jaxb.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		
		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		jaxbMarshaller.marshal(customer, file);
		jaxbMarshaller.marshal(customer, System.out);
 
	      } catch (JAXBException e) {
		e.printStackTrace();
	      }
 
	}
}