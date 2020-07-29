import java.awt.*; 
import java.applet.*; 
  
 /*<applet code="ScrollingText" height="350" width="450">
 </applet> 
 */
  
 public class ScrollingText extends Applet implements Runnable 
 { 
      String text="Hello everyone.... "; 
     Thread t;
     int x = 500;

       
      public void start() 
      { 
           if (t == null)
           {
                t = new Thread(this);
                t.start();
           }
          
      } 
       
      public void run() 
      { 
           try 
           { 
                while(true) 
                { 
                     repaint(); 
                     Thread.sleep(15); 
                      
                } 
           } 
           catch (InterruptedException e) 
           { 
               System.out.println(e); 
           } 
      } 
       
      public void stop() 
      { 
           if(t != null)
             t=null; 
      } 
       
      public void paint(Graphics g) 
      { 
           Font a = new Font("Impact",Font.BOLD,45); 
           g.setFont(a); 
           g.drawString(text,x,150); 
           x--;
           if(x<-200){
                x = 500;
           }
      } 
       
 }  
