import java.util.Scanner;
class Main{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter your name : ");
String personName=sc.nextLine();
System.out.println("ID:");
String personId=sc.nextLine();
System.out.println("Age:");
int age=sc.nextInt();
System.out.println("MobileNumber:");
String mobileNumber=" ";
mobileNumber=sc.nextLine();
mobileNumber+=sc.nextLine();
System.out.println("Gender:");
char gender=sc.next().charAt(0);
System.out.println("ThankYou!");
Contact contact1=new Contact(personName,personId,age,mobileNumber,gender);

String ownerName=personName;
System.out.println("LocationInfo:");
String info=" ";
info=sc.nextLine();
info+=sc.nextLine();
System.out.println("TotalContact:");
int totalContact=sc.nextInt();
AddressBook address1=new AddressBook(ownerName,info,totalContact,contact1);

System.out.println("Enter your name:");
personName=" ";
personName=sc.nextLine();
personName+=sc.nextLine();
System.out.println("ID:");
personId=sc.nextLine();
System.out.println("Age:");
age=sc.nextInt();
System.out.println("MobileNumber:");
mobileNumber=" ";
mobileNumber=sc.nextLine();
mobileNumber+=sc.nextLine();
System.out.println("Gender:");
gender=sc.next().charAt(0);
System.out.println("ThanYou!");
Contact contact2 = new Contact(personName,personId,age,mobileNumber,gender);
address1.addContact(contact2);

System.out.println("Enter your name:");
personName=" ";
personName=sc.nextLine();
personName+=sc.nextLine();
System.out.println("ID:");
personId=sc.nextLine();
System.out.println("Age:");
age=sc.nextInt();
System.out.println("Mobile Number:");
mobileNumber=" ";
mobileNumber=sc.nextLine();
mobileNumber+=sc.nextLine();
System.out.println("Gender:");
gender=sc.next().charAt(0);
System.out.println("ThankYou!");
Contact contact3=new Contact(personName,personId,age,mobileNumber,gender);
address1.addContact(contact3);
System.out.println("Name:Gazi MD Rafayet Hossen,ID: 22-7846-2,Roll:11");
address1.showAllContactInfo();
}
}