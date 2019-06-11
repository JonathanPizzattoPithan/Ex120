package Maven.ProjetoMaves_Ex120;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println(TesteA(null));
        
    }
    
    public static String TesteA(String B) {
    	
    	String H = new String("Hello, World");
    	B = H;
    	return B;
    	
    }
}
