package quinto.esempio;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Triangolo t1=(Triangolo) context.getBean("triangolo2");
		   
		   t1.stampaVertici();
		   
//		   t1.getPuntoA().setX(50);
//		   t1.getPuntoA().setY(50);
		   
//		   
//		   Triangolo t2=(Triangolo) context.getBean("triangolo");
//		    
//		   t2.stampaVertici();
		   
	}

}
