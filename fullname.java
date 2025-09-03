import java.util.Scanner;

public class FullName
{
   public static void main(String[] args)
    {
         int i,j;
     
      Scanner S = new Scanner(System.in);
      System.out.print("enter rows:");
        int ro = S.nextInt();
        System.out.print("enter cols:");
            int cl = S.nextInt();
        
        for(i=1;i<=ro;i++)
	{
          for(j=1;j<=cl;j++)
           {
            if(i==1)
             for(j=1;j<=cl;j++)
             {
               if(j==5||j==7||j==8||j==9||j==10||j==11||j==13||j==18||j==23||j==29||j==31||j==32||j==33)
                {
              System.out.print("   ");
                 }
              else
               {
                  System.out.print(" * ");
              }
            }
         
            else if(i==2)
                 {
                   for(j=1;j<=cl;j++)
		    {
                     if(j==1||j==4||j==6||j==12||j==14||j==19||j==26||j==31||j==33)
                        {
                      System.out.print(" * ");
                         }
                      else
                         {
                          System.out.print("   ");
                         }
                    }
                 }
           else if(i==3)
                  {
                    for(j=1;j<=cl;j++)
                    {
                      if(j==1||j==4||j==6||j==12||j==14||j==19||j==26||j==32)
                        {
                      System.out.print(" * ");
                        }
                      else
                        {
                        System.out.print("   ");
                         }
                     }
                   }
                else if(i==4)
                      {
                        for(j=1;j<=cl;j++)
			{
                          if(j==2||j==15||j==16||j==6||j==12||j==14||j==17||j==19||j==20||j==21||j==22||j==26||j==32)
                              {
                              System.out.print(" * ");
			      }
                          else
			      {
                                System.out.print("   ");
                             } 
                        }
                      }
                 else if(i==5)
                      {
                        for(j=1;j<=cl;j++)
			{
                          if(j==3||j==9||j==16||j==6||j==12||j==14||j==17||j==19||j==20||j==21||j==22||j==26||j==32||j==15)
                              {
                              System.out.print(" * ");
			      }
                          else
			      {
                                System.out.print("   ");
                             } 
                        }
                      }
                   else if(i==6)
                      {
                        for(j=1;j<=cl;j++)
			{
                          if(j==1||j==4||j==6||j==8||j==12||j==10||j==14||j==19||j==26||j==32)
                              {
                              System.out.print(" * ");
			      }
                          else
			      {
                                System.out.print("   ");
                             } 
                        }
                      }
                 else if(i==7)
                      {
                        for(j=1;j<=cl;j++)
			{
                          if(j==1||j==4||j==6||j==7||j==12||j==11||j==14||j==19||j==26||j==32)
                              {
                              System.out.print(" * ");
			      }
                          else
			      {
                                System.out.print("   ");
                             } 
                        }
                      }
                 else if(i==8)
                      {
                        for(j=1;j<=cl;j++)
			{
                          if(j==1||j==2||j==3||j==4||j==6||j==12||j==14||j==15||j==16||j==17||j==19||j==20||j==21||j==22||j==26||j==32)
                              {
                              System.out.print(" * ");
			      }
                          else
			      {
                                System.out.print("   ");
                             } 
                        }
                      }
         
                    //System.out.println();
                   
                System.out.println();
            }
         }
        // System.out.println();
	// new line added2
     }  
}

