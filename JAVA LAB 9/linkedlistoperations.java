import java.util.*;
public class linkedlistoperations
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> lst = new LinkedList<Integer>();
        LinkedList<Integer> lst1 = new LinkedList<Integer>();
        do
        {
            System.out.println("Enter the operation you want to perform");
            System.out.println("\n1.Add\n2.Copy elements to another list\n3.Remove using index\n4.Change element\n5.Retrieve first item\n6.Retrieve last item\n7.Add element at first\n8.Add element at last\n9.Remove first element\n10.Remove last element\n11.Display List\n12.Clear List\n13.Exit\n ");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to add");
                    int n1=sc.nextInt();
                    lst.add(n1);
                    break;

                case 2:

                    lst1.addAll(lst);
                    System.out.println("New list is "+lst1);

                    break;

                case 3:
                    System.out.println("Enter index of the element to be removed ");
                    int n3=sc.nextInt();
                    lst.remove(n3);
                    break;

                case 4:
                    System.out.println("Enter the index to be changed ");
                    int n41=sc.nextInt();
                    System.out.println("Enter new element ");
                    int n42=sc.nextInt();
                    lst.set(n41,n42);
                    break;

                case 5:
                    System.out.println("First item of the list is "+lst.getFirst());
                    break;

                case 6:
                    System.out.println("Last item of the list is "+lst.getLast());
                    break;

                case 7:
                    System.out.println("Enter element to be added at First ");
                    int n7=sc.nextInt();
                    lst.addFirst(n7);
                    break;

                case 8:
                    System.out.println("Enter element to be added at Last ");
                    int n8=sc.nextInt();
                    lst.addLast(n8);
                    break;

                case 9:
                    System.out.println("List after removing first item is:");
                    lst.removeFirst();
                    System.out.println(lst);
                    break;

                case 10:
                    System.out.println("List after removing last item is:");
                    lst.removeLast();
                    System.out.println(lst);
                    break;

                case 11:
                    System.out.println(lst);
                    break;

                case 12:
                    lst.clear();
                    System.out.println(lst);
                    break;

                case 13:
                    System.out.println("Exit point!");
                    break;

                default:
                    System.out.println("Enter a valid choice!");
                    break;








            }
        }while(choice!=12);

    }
}