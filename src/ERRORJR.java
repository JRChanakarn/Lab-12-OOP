import java.util.ArrayList;
import java.util.List;
import java.lang.LinkageError;
public class ERRORJR {
	
	

	static int i = 0;
	  
    // Method to print numbers
    public static int printNumber(int x)
    {
  
        i = i + 2;
        return i + printNumber(i + 2);
    }
  
    
    static {
    	try {
        System.loadLibrary("libfile");
    	} catch(LinkageError e ) {
    		System.out.println("---> : LinkageError");
    	}
    }
    native void cfun();
    


 
    

static List<String> list = new ArrayList<String>();
    
public static void main(String[] args) {
		

	 try
	  {
		 printNumber(i);

	  }
	  catch ( Error e )
	  {
		  System.out.println("---> : Error");
	  }//End Catch
		
	 
	 try
	  {
		 printNumber(i);

	  }
	  catch ( VirtualMachineError e )
	  {
		  System.out.println("---> : VirtualMachineError");
	  }//End Catch
	 
	 try
	  {
		 printNumber(i);

	  }
	  catch ( StackOverflowError e )
	  {
		  System.out.println("---> : StackOverflowError");
	  }//End Catch
	 
	 try
	  {
		 Integer[] array = new Integer[1000000000 * 100000000];

	  }
	  catch ( OutOfMemoryError e )
	  {
		  System.out.println("---> : OutOfMemoryError");
	  }//End Catch
	 
	 
	  //LinkageError
		 ERRORJR g = new ERRORJR();
	     g.cfun();
		 
	
	 

	 
	}//end main



	
}//endClass

