/*
 * CSBA HACKATHON: Group ETFS
 * SO we tried our best at making a lost and found program. 
 * We made a fixed array, and the user could add things to it or look at the whole thing
 * There is a lot more we could do with this code, we just started learning arrays and we tried making a flexible array. 
 * We made a mock website as well that is attahced to git, it just shows how the web app could look
 *
 * p.s. happy birthday Alibek!
 */

import java.util.Scanner;
public class lost {
   public static void main(String [] args) {
       Scanner scan = new Scanner(System.in);
       boolean lost = false;
       boolean cont = false;
       int arraySize = 10;
       int index = 0;
       int[] list = new int[arraySize];
       String[] itemName = new String[arraySize ];
       String[] itemDes = new String[arraySize];
       String[] itemLocation = new String[arraySize];
       String[] itemPhone = new String[arraySize];
     
       do{
       System.out.println("Enter L to find lost item");
       System.out.println("Enter F to submit found item");
       System.out.println("Enter X if you are done");
       char respone = scan.nextLine().charAt(0);
       if (respone == 'L'){
           System.out.println("Here is a list of items that have been found");
               for (int i = 0; i < itemLocation.length; ++i){
                   System.out.println("Item: " + i + "; Item: " + itemName[i] + "; Description: " + itemDes[i] + "; Found Location: " + itemLocation[i] + "; Call: " + itemPhone[i]);
               }
           }
        else if (respone == 'F'){
            for (int i = index; i < index + 1; i++) {
                System.out.println("What did you find?");
                itemName[i] = scan.nextLine();
                System.out.println("Write a quick description");
                itemDes[i] = scan.nextLine();
                System.out.println("Where'd you find it?");
                itemLocation[i] = scan.nextLine();
                System.out.println("Lastly, what's your phone number");
                itemPhone[i] = scan.nextLine();
                arraySize++;
            }
            index++;
        }                  
       else if (respone =='X'){
           break;
       }
       else {
           System.out.println("Please enter only L or F");
           respone = scan.nextLine().charAt(0);
       }
       } while(cont == false);
       System.out.println("Goodbye");
   }
}