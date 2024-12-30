package se.fatemeh.projectarbet;


import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("vad du vill göra nu?");

           String input = scanner.nextLine();
            switch (input){

                case "1": livingrum();
                break;
                case "2": kitchen();
                break;
                case "3": hall();
                break;
                case "4": badroom();
                break;
                case "5": offic();
                break;

            }

        }







    }

    public static void livingrum (){

        System.out.println("Du är i vardagsrum");
    }

    public static void kitchen(){
        System.out.println("DU är i köket");



    }
    public static void hall(){
        System.out.println("Du är i hall");
    }


     public static void badroom(){
         System.out.println("Du är i WC");

    }

    public static void offic(){
        System.out.println("Du är i kontoret");
    }




}
