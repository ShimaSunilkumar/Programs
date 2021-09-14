import  java.util.Scanner;
public class stringoperations {
    public static void main(String[] args) {
        String str1, str2,str3,str4;
        int ch,i,len,f=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("\nSTRING OPERATIONS\n1.Length\n2.Concat\n3.Compare\n4.Copy\nEnter your choice: ");
        ch=reader.nextInt();
        switch (ch){
            case 1:System.out.print("Enter first string: ");
                str1 = reader.next();
                len=str1.length();
                System.out.print("String length is: "+len);
                break;
            case 2:System.out.print("Enter first string: ");
                str1 = reader.next();
                System.out.print("Enter second string: ");
                str2 = reader.next();
                str4=str1.concat(str2);
                str3=str1+str2;
                System.out.print("Concatenated String: "+str3);
                System.out.print("\nConcatination using library function: "+str4);
                break;
            case 3:System.out.print("Enter first string: ");
                str1 = reader.next();
                System.out.print("Enter second string: ");
                str2 = reader.next();
                   /*if(s1==s2)
                       f=1;
                   if(f==1)
                      System.out.print("\nStrings are not equal");
                   else {System.out.print("\nStrings are  equal");
                   }*/
                System.out.print("\nCompare using library function: "+str1.equals(str2));
                break;
            case 4:System.out.print("Enter first string: ");
                str1 = reader.next();
                System.out.print("Enter second string: ");
                str2 = reader.next();
                str2=str1;
                System.out.print("The copied string is : "+str2);
                break;
            default:System.out.print("Invalid choice");
                break;
        }

    }

}