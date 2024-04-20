class JoinExample extends Thread  
{    
    @Override
    public void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try 
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
     
    
}
class JoinExample_ extends Thread  
{    
    @Override
    public void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try 
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
     
    
}

public class JoinExample1{
    public static void main(String args[])  
    {   
        JoinExample thread1 = new JoinExample();    
            
         thread1.start();
         
         JoinExample_ thread2 = new JoinExample_();    
         
         thread2.start();
         
         
       try 
        {    
        thread1.join();  
        thread2.join();
         
        }catch(Exception e){System.out.println(e);}    
        //thread2.start();   
        //thread3.start();   

       /* try{
            thread2.join();
        }catch(Exception e){
            System.out.println(e);
        }
*/
    }   
}