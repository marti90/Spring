package nono.esempio;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangolo implements InitializingBean,DisposableBean{
	
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

	public void afterPropertiesSet() throws Exception {
		
		
		System.out.println("inizializzato !!!!");
		
	}
	
	public void destroy() throws Exception {
		
		System.out.println("prima di distruggere !!!!");
		
	}

	public void aaaa(){
		System.out.println("methodo aaa di Tringolo");
	}
	
	
	public void bbbb(){
		System.out.println("methodo bbbb di Tringolo");
		
	}

}
