package ottavo.esempio;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Figura f=(Figura) context.getBean("triangolo");
		   
		   f.stampa();
		   
	}

}
