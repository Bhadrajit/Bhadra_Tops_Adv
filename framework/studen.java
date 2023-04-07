package com.Framweork;
  
import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationCotenxt;
public class studen 
{
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationCotenxt("config.xml");
	        Studen student= (Studen)context.getBean("studen");
	        System.out.println(studen);
	}

}
