package Maven.ProjetoMaves_Ex120;



import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumerosAleatorios{

    public static void main(String[] args) {
        
    	int NumeroAleatorio;
    	int M1;
    	Random r = new Random();
    	M1 = r.nextInt(100);
    	if(M1 > 60) {
    		NumeroAleatorio = 60;
    	}else {
    		NumeroAleatorio = M1;
    	}
    	
    	System.out.println(NumeroAleatorio);
    	
    }
}