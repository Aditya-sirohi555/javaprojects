
import java.util.Scanner;

public class code3 {static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {        
        boolean isrunning=true;
        while(isrunning){
        String display="**showing contents**\n-->balance\n-->deposit\n-->withdrawal\n-->exit";
        System.out.println(display);

        System.out.println("press 1 to show balance, press 2 to deposit, press 3 to withdraw,press 4 to exit");
        System.out.print("press the number: ");
    int i= sc.nextInt();
        if(i>4){
            System.out.println("enter valid number");
        }
    switch(i){
                case 1->
                    System.out.println(balance());

        case 2 -> {
            System.out.print("enter the amount you want to deposit: ");

            System.out.print(" balance: "+remaining_amount());
        }

        case 3->
                    {
                        System.out.print("enter the amount you want to withdraw: ");

                System.out.print(" balance: "+remaining_amount2());
                    }

        case 4 -> {
            isrunning=false;
            System.out.println("exiting......");
        }}
    }
    }static int dep(){
        int d= sc.nextInt();
        if(d<0){
            System.out.println("cannot deposit");
        }return dep();

    }static int wedr(){
        int with= sc.nextInt();
      if(with<=0&&with>balance()) {
          System.out.println("cannot withdraw");}
      return wedr();
    }static int balance(){
        int balance=5000;
        return balance;
    }static double remaining_amount(){
        int x=dep()+balance();

        return x ;
    }static double remaining_amount2(){
        int z=balance()-wedr();
        return z;
    }
    }


