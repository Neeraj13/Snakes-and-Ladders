package switchcase;
public class Switchcase
{
public static void main(String args[])
{
int choice;
System.out.println("pick one: 1.Red\t 2.Blue\t 3.Green\t 4.Orange\t");
Scanner s=new Scanner(System.in);
choice =s.nextInt();
switch(choice)
{
case 1:
System.out.println("You said  colour is Red");
break;
case 2:
System.out.println("You said colour is Blue");
break;
case 3:
System.out.println("You said colour is  Green");
break;
case 4:
System.out.println("You said colour is Orange");
break;
default:
 System.out.println("Invalid choice");
   }
  }
 }
