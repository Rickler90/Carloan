/**
 * Write a description of class CarLoan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;


class main{
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        encap car = new encap();
        DecimalFormat num = new DecimalFormat("###,###.##");
        double mprice, rates, month, mrate, trate, tprice;
        String c1="", c2="";

            // Input
            System.out.println("\n*********************************************");
            System.out.println("\t\tCar Loan");
            System.out.println("*********************************************");

            while (true){
            System.out.println("\nChoose Vehicle Brand");
            System.out.println("Toyota\t\t[1]\nHonda\t\t[2]\nFord\t\t[3]\nNissan\t\t[4]\nKia\t\t[5]");
            System.out.print("Enter your choice: \t");
                c1 = input.nextLine();

                try {
                if (Integer.parseInt(c1 ) == 1){
                    car.setbrand("Toyota");
                    break;
                }
                else if (Integer.parseInt(c1) == 2){
                    car.setbrand("Honda");
                    break;
                }
                else if (Integer.parseInt(c1) == 3){
                    car.setbrand("Ford");
                    break;
                }
                else if (Integer.parseInt(c1) == 4){
                    car.setbrand("Nissan");
                    break;
                }
                else if (Integer.parseInt(c1) == 5){
                    car.setbrand("Kia");
                    break;
                } 
                else
                 System.out.println("**Unexpected Input**");
                }
                catch  (NumberFormatException nfe){
                    System.out.println("**Invalid Input**");
                } 
        }

        while (true){
            try{
            System.out.println("\n\nChoose Vehicle Type");
            System.out.println("Sedan\t\t[1]\nSUV\t\t[2]\nPick-U\t\t[3]\nHatchback\t[4]\nMiniVan\t\t[5]");
            System.out.print("Enter your choice: \t");
            c2 = input.nextLine();

            if (Integer.parseInt(c2) == 1){
                car.settype("Sedan");
                break;
            }
            else if (Integer.parseInt(c2) == 2){
                car.settype("SUV");
                break;
            }
            else if (Integer.parseInt(c2) == 3){
                car.settype("Pick-Up");
                break;
            }
            else if (Integer.parseInt(c2) == 4){
                car.settype("Hatchback");
                break;
            }
            else if (Integer.parseInt(c2) == 5){
                car.settype("MiniVan");
                break;
            }
            else 
                System.out.print("**Unexpected Input**");
            }
            catch  (NumberFormatException nfe){
                System.out.println("**Invalid Input**");
            } 
        }

        System.out.println("*********************************************");
        System.out.print("\nEnter total price of vehcle:\t");
        car.setprice(input.nextDouble());
        System.out.print("Enter monthly rate(%):\t\t");
        car.setrate(input.nextDouble());
        System.out.print("Enter loan duration in year: \t");
        car.setyear(input.nextDouble());



        // Processes
        rates = (car.getrate()/100);
        month = car.getyear()*12;
        mprice = car.getprice()/month;
        mrate = (mprice*rates)+ mprice;
        trate = (mprice*rates) * month;
        tprice = mrate * month;

        // Output
        
        System.out.println("\n*********************************************");
        System.out.println("Your loaned vehcle is "+car.getbrand()+ " its an "+car.gettype());
        System.out.println("*********************************************");

        System.out.println("Monlty rate :\t\t\t"+num.format(mrate));
        System.out.println("total interest rate :\t\t"+num.format(trate));
        System.out.println("total price without interest :\t"+num.format(car.getprice()));
        System.out.println("total price with interest :\t"+num.format(tprice));
        System.out.println("*********************************************\n");

    }
}


