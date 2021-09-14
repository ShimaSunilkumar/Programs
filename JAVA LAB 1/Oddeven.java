import java.util.Scanner;
class Oddeven {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=reader.nextInt();
        if(num%2==0)
        System.out.print("It is a Even number");
        else
        System.out.print("It is a  Odd number");
    }
}