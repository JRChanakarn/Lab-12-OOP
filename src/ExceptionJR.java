import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ExceptionJR  {

	public int m;
	
	public static BigDecimal addOne(Object obj){
		BigDecimal a = (BigDecimal)obj;
		return a.add(BigDecimal.ONE);
	}

	 public void checkEOF()
	    {
	        File file = new File("einput.txt");
	        DataInputStream dataInputStream =  null;
	        try
	        {
	            dataInputStream = new DataInputStream(new FileInputStream(file));
	            while(true)
	            {
	                dataInputStream.readInt();  
	            }           
	        }
	        catch (EOFException eofException)
	        {           
	            System.out.println("---> : EOFException");
	        }
	        catch (IOException ioException)
	        {
	            
	        }

	    }
	 
	public static void main(String[] args) {
		
		int x = 1 ;
	
		///Exception//////////////////////////////
		try { 
			
			x = x/0;
			
		} catch (Exception e) { 
			
			System.out.println("---> : Exception");
			
		}//End Catch
		
		try { 
			
			x = x/0;
			
		} catch (RuntimeException e) { 
			
			System.out.println("---> : RuntimeException");
			
		}//End Catch
		
		try { 
			
			x = x/0;
			
		} catch (ArithmeticException e) { 
			
			System.out.println("---> : ArithmeticException");
			
		}//End Catch
		
		try { 
			
			String objStr = "123";
			BigDecimal result = addOne(objStr);
			System.out.println(result);
			
		} catch (ClassCastException e) { 
			
			System.out.println("---> : ClassCastException");
			
		}//End Catch
		

		Thread t1 = new Thread(new Runnable() {
	         public void run()
	            {
	            	
	            	
	            try {
	            	 Thread.sleep(-10);
	            }catch (IllegalArgumentException e) {
	            	System.out.println("---> : IllegalArgumentException");
	            } catch (InterruptedException e) {
	            	System.out.println("---> : InterruptedException");
					e.printStackTrace();
				}//End Catch

	           }
	            
	        });
		    t1.start();
	     
	        
		    try { 
				
		    	 String a = "1234 ";
				 Integer.parseInt(a);
			} catch (NumberFormatException e) { 
				
				System.out.println("---> : NumberFormatException");
				
			}//End Catch
		  
		    try { 
				
		        List<String> testList = new ArrayList<String>();
				testList.get(0);
		        
			} catch (IndexOutOfBoundsException e) { 
				
				System.out.println("---> : IndexOutOfBoundsException");
				
			}//End Catch
		    
		    try { 
				
		    	String[] testArry = new String[]{"a", "b", "c", "d", "e"};
				System.out.println(testArry[6]);
		        
			} catch (ArrayIndexOutOfBoundsException e) { 
				
				System.out.println("---> : ArrayIndexOutOfBoundsException");
				
			}//End Catch
		    
		    try { 
				
		    	String[] testArry = new String[]{"a", "b", "c", "d", "e"};
				System.out.println(testArry[6]);
		        
			} catch (ArrayIndexOutOfBoundsException e) { 
				
				System.out.println("---> : ArrayIndexOutOfBoundsException");
				
			}//End Catch
		    
		    try { 
				
		        String str = "JR Is the Best";
			    System.out.println(str.charAt(40));
		        
			} catch (StringIndexOutOfBoundsException e) { 
				
				System.out.println("---> : StringIndexOutOfBoundsException");
				
			}//End Catch
		    
		    String ptr = null;
		    
	        try
	        {
	        	
	            if (ptr.equals("gfg"))
	            	
	                System.out.print("Same");
	            else 
	                System.out.print("Not Same");
	        }
	        catch(NullPointerException e)
	        {
	            System.out.println("---> : NullPointerException");
	            
	        }//End Catch
		    

		    try { 
				
		        FileInputStream in = new FileInputStream("input.txt");
	           
			} catch (IOException e) { 
				
				System.out.println("---> : IOException");
				
			}//End Catch
		    
		    try
	        {
	            FileInputStream in = new FileInputStream("input.txt");
	            System.out.println("This is not printed");
	        } 
	        catch (FileNotFoundException fileNotFoundException)
	        {
	        	System.out.println("---> : fileNotFoundException");
	        }//End Catch
		    

	        //EOF
		    ExceptionJR  example = new ExceptionJR();
	        example.checkEOF();
	        
	        Thread t2 = new Thread(new Runnable() {
		     
		            	
		            	
		        	 public void run()
		 	        {
		 	 

		 	            Socket socket = null;
		 	 
		 	            try {
		 	 
		 	                socket = new Socket("localhost", 3333);
		 	 

		 	                PrintWriter outWriter = new PrintWriter(
		 	                    socket.getOutputStream(), true);
		 	 

		 	                System.out.println("Wait");
		 	 

		 	               
		 	 
		 	              
		 	                outWriter.println("Hello Mr. Server!");
		 	            }

		 	            catch (SocketException e) {
		 	 
		 	              
		 	            	System.out.println("---> : SocketException");
		 	            } catch (UnknownHostException e) {
		 					
		 					
		 				} catch (IOException e) {
		 					
		 					
		 				} //End Catch
		 				
		 	 
		 	         
		 	        }//End Catch

		           
		            
		        });
			    t2.start();

			   			    
			    
		}//End Main
		

}//End class




