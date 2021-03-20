
package samgy;
import java.util.Scanner;

class reserve{
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your age: ");
        String age=sc.nextLine();
        System.out.println("Enter your contact number: ");
        String number=sc.nextLine();
        System.out.println("Set date for your reservation: ");
        String date=sc.nextLine();
        System.out.println("Press 1 to select BEEF samgy(additional P100 per person)\nPress 2 to select PORK samgy");
        int pb=sc.nextInt();
        System.out.println("Press 1 to add JUICE(additional P50 per person)\nPress 2 to select WATER only");
        int jw=sc.nextInt();
        System.out.println("how many of you will dine? ");
        int cos=sc.nextInt();
        
        System.out.println("--------------------------------------------");
        String cosNo="";
        if(cos<6){
            cosNo="You have 1 table (5 seaters)";
        }
        else{
            cosNo="You have 2 table (5 seaters)";
        }
        System.out.println(cosNo);
              
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Number: "+number);
        System.out.println("Costumer: "+cos);
        System.out.println("Reservation Date: "+date);
        
        if(pb==1){
            
            System.out.println("BEEF samgy");
            if(jw==1){
                System.out.println("With juice");
                int head=350*cos;
                if(cos==10){
                System.out.println("Your total payment is: "+(head-300)+" (discounted 1 person)");
                }else{
                System.out.println("Your total payment is: "+head);
                }
            }
            else{
                System.out.println("Water only");
                int head=300*cos;
                if(cos==10){
                System.out.println("Your total payment is: "+(head-300)+" (discounted 1 person)");
                }else{
                System.out.println("Your total payment is: "+head);
                }
            }
            
        }
        else{
            
            System.out.println("PORK samgy");
            if(jw==1){
                int headp=250*cos;
                System.out.println("With juice");
                if(cos==10){
                System.out.println("Your total payment is: "+(headp-200)+" (discounted 1 person)");
                }else{
                System.out.println("Your total payment is: "+headp);
                }
            }
            else{
                System.out.println("Water only");
                int headp=200*cos;
                if(cos==10){
                System.out.println("Your total payment is: "+(headp-200)+" (discounted 1 person)");
                }else{
                System.out.println("Your total payment is: "+headp);
                }
            }
        }             
    }
}
