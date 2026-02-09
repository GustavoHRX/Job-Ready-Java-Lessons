package com.ghr.adderloopsgathetinput;
import java.util.Scanner;


public class AdderLoopsGathetInput {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); 
        /*
        while (true)
        {
            System.out.println("Enter some data: ");
            String input = myScanner.nextLine();
            
            if(input != null && !input.isEmpty()) //User hits enter without any data, it stops
            {
                System.out.println("You did not enter anything");
            } else
            {
                break;
            }
        
        }
        */
        
        /*
            //loop 2
            boolean isValid = false;
            
            do
            {
                System.out.println("Enter some data: ");
                String input = myScanner.nextLine();
                
                if(input == null || input.isEmpty())
                {
                    System.out.println("You did not enter anything!");
                } else
                    {
                        isValid = true;
                    }
                
                
            } while(!isValid);
            
        */
        
        //loop 3
        
        boolean isValid = false;
        do
        {
            try 
            {
                System.out.println("Enter a Whole number from 0 to 9: ");
                String input = myScanner.nextLine();
                int numero = Integer.parseInt(input);
                
                if(numero >= 0 && numero <= 9) //Se for inserido numero com menor valor não entra aqui
                {
                    isValid = true;
                    System.out.println("isValid agora eh true, numero inserido com sucesso!");
                } else
                {
                    System.out.println("Ainda dentro do looping");
                }
                
                
            }
            catch (NumberFormatException ex) //Funciona como um "else"
            {
                System.out.println("Enter a whole number!");
            }
        } while (!isValid);
        
        
    }
}
