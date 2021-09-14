import java.util.Scanner;
class Posneg {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=reader.nextInt();
        String res=(num>0) ? "Positive":"Negative";
         System.out.println("The number "+num+" is a "+res+" number");  
    }
}