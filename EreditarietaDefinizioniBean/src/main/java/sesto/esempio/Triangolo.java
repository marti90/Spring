package sesto.esempio;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangolo implements ApplicationContextAware,BeanNameAware{
	
	  private Punto puntoA;
	  private Punto puntoB;
	  private Punto puntoC;
	
	  public Triangolo() {
			
		}
	  
	

	public void stampaVertici(){
		System.out.println("coordinato dell A:"+ puntoA.getX()+"-"+puntoA.getY());
 		System.out.println("coordinato dell B:"+ puntoB.getX()+"-"+puntoB.getY());
		System.out.println("coordinato dell C:"+ puntoC.getX()+"-"+puntoC.getY());
	
	}



	public Punto getPuntoA() {
		return puntoA;
	}



	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}



	public Punto getPuntoB() {
		return puntoB;
	}



	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}



	public Punto getPuntoC() {
		return puntoC;
	}



	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}

 ApplicationContext context;

	
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
		System.out.println("chiamato");
		
	}




	public void setBeanName(String bean) {
		
		System.out.println(bean);
		
	}

 
	

}
