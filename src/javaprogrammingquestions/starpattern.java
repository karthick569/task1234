package javaprogrammingquestions;

import java.util.Scanner;
public class starpattern {

	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n / 2 + 1; i++)
              {
                  for (int j = 0; j < i; j++)
                    {
                       System.out.print(" ");
                    }
            if (i == n / 2) 
               {
                System.out.println("*");
               }
            else
               {
                System.out.println("* " + (i == 0 ? "" : "*"));
               }
        } 
        for (int i = n / 2 - 1; i >= 0; i--) 
            {
            for (int j = 0; j < i; j++) 
              {
                System.out.print(" ");
              }
            System.out.println("* " + (i == 0 ? "" : "*"));
        }
        
        scanner.close();  
    }
}

	}

}
