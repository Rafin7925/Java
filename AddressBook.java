public class AddressBook extends Contact{
private String ownerName;
private String info;
private Contact[] listOfContact;
private int totalContact;
AddressBook(){}
AddressBook(String ownerName,String info,int totalContact,Contact con){
this.ownerName=ownerName;
this.info=info;
this.totalContact=totalContact;
listOfContact=new Contact[totalContact];
for(int i=0;i<listOfContact.length;i++){
if(listOfContact[i]==null){
listOfContact[i]=con;
break;
}
}
}
void showAllContactInfo(){
for(int i=0;i<listOfContact.length;i++){
if(listOfContact[i]!=null){
listOfContact[i].showPersonInfo();
}
}
}
void addContact(Contact con){
for(int i=0;i<listOfContact.length;i++){
if(listOfContact[i]==null){
listOfContact[i]=con;
break;
}
}
}
}