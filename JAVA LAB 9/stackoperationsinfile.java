import java.util.*;
public class stackoperationsinfile
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<Integer>();
        do
        {
            System.out.println("Enter the operation you want to perform");
            System.out.println("\n1.Push\n2.Peek\n3.Remove top element\n4.Search element\n5.To check Stack empty or not\n6.Print elements of the stack\n7.Remove using index\n8.To get Size of Stack\n9.Display Stack\n10.Exit\n ");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to add");
                    int n1=sc.nextInt();
                    s.push(n1);
                    break;

                case 2:
                    System.out.println("Top element is "+s.peek());
                    break;

                case 3:
                    s.pop();
                    System.out.println(s);
                    break;


                case 4:
                    System.out.println("Enter element to search ");
                    int n4=sc.nextInt();
                    System.out.println(s.search(n4));
                    break;

                case 5:
                    System.out.println("is stack empty?  "+s.empty());
                    break;

                case 6:
                    for(Integer i:s)
                        System.out.println(i+"   ");
                    break;

                case 7:
                    System.out.println("Enter index of the element to be removed ");
                    int n7=sc.nextInt();
                    s.remove(n7);
                    System.out.println(s);
                    break;

                case 8:
                    System.out.println("size of the stack is "+s.size());
                    break;

                case 9:
                    System.out.println(s);
                    break;

                case 10:
                    System.out.println("Exit point!");
                    break;

                default:
                    System.out.println("Enter a valid choice!");
                    break;


            }
        }while(choice!=10);

    }
}