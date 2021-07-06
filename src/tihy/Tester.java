package tihy;

import java.util.Random;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        System.out.println("\t");


        System.out.println("Random Phone Number Generator - BiH ( +387 )");


        System.out.println("\t");


        System.out.println("-   -   -   -   -   -   -   -   -   -   -  -   ");


        System.out.println("1. Randomly generate a phone number");
        System.out.println(" ");
        System.out.println("2. Choose the specific first three numbers");

        Scanner s = new Scanner(System.in);

        System.out.println(" ");

        System.out.print("Enter: ");
            int pick = s.nextInt();

            if(pick==1){

                Random rand = new Random();

                int[] firstNums = {60,61,62,63,64};

                int phoneNumber = 0;

                System.out.print("+387 ");

                System.out.print(firstNums[new Random().nextInt(firstNums.length)]);

                System.out.print(" ");

                for(int counter = 1; counter <= 3 ; counter++){

                    phoneNumber = rand.nextInt(9);

                    System.out.print(phoneNumber);

                }

                System.out.print(" - ");

                for(int counter = 1; counter <= 3 ; counter++){

                    phoneNumber = rand.nextInt(9);

                    System.out.print(phoneNumber);

                }




                System.out.println('\t');

                System.out.println("-tihy");







            } else if(pick==2){

                System.out.println('\t');

                System.out.println("1. ( +387 ) --> 60");

                        System.out.println(" ");

                System.out.println("2. ( +387 ) --> 61");

                        System.out.println(" ");

                System.out.println("3. ( +387 ) --> 62");

                        System.out.println(" ");

                System.out.println("4. ( +387 ) --> 63");

                        System.out.println(" ");

                System.out.println("5. ( +387 ) --> 64");




                Scanner scanner = new Scanner(System.in);

                int pickNums = scanner.nextInt();

                    if(pickNums==1){

                        Random rand = new Random();

                        int phoneNumber = 0;

                        System.out.print("+387 ");

                        System.out.print("60 ");

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                    }else if(pickNums==2){


                        Random rand = new Random();

                        int phoneNumber = 0;

                        System.out.print("+387 ");

                        System.out.print("61 ");

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                    }else if(pickNums==3){


                        Random rand = new Random();

                        int phoneNumber = 0;

                        System.out.print("+387 ");

                        System.out.print("62 ");

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                    }else if(pickNums==4){


                        Random rand = new Random();

                        int phoneNumber = 0;

                        System.out.print("+387 ");

                        System.out.print("63 ");

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                    }else if(pickNums==5){


                        Random rand = new Random();

                        int phoneNumber = 0;

                        System.out.print("+387 ");

                        System.out.print("64 ");

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                        System.out.print(" ");

                        for(int counter = 1; counter <= 3 ; counter++){

                            phoneNumber = rand.nextInt(9);

                            System.out.print(phoneNumber);

                        }

                    }

            }


    }
}
