public class person1 
{
	public static void main(String[] args)
	{
		        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		        Person person1 = (Person) context.getBean("person1");
		        person.displayInfo();
	}
}

		       
		       
		    

