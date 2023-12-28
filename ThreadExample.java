//Printing Alphabet A to Z and integers simultaneously using thread concept

class AlphabetThread implements Runnable //Implementing Runnable Interface ||we can also achieve Thread by extending the Thread class
{
	public void run(){ //implementation of run method
		for(char ch='A';ch<='Z';ch++)
		{
		  System.out.print(" "+ch);
		}
		}
	
}
class NumberThread implements Runnable
{
	public void run(){
		for(int i=0;i<=26;i++)
		{
		  System.out.print(" "+i);
		}

		}
	
}
public class ThreadExample{
	public static void main(String args[]) {
		AlphabetThread a1=new AlphabetThread();
		NumberThread n1=new NumberThread();
		
		Thread t1=new Thread(a1);
		Thread t2=new Thread(n1);
		
		t1.start();
		t2.start();
		try{
	            t1.join(); //throws exception so kept in try block
                    t2.join();//join method used so that  the main thread executes later
		   }catch(Exception e){
			  throw new RuntimeException(e);
	              }
   }
}