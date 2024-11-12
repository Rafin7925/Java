 class Contact{
private String personName;
private String personId;
private int age;
private String mobileNumber;
private char gender;
Contact(){}
Contact(String personName,String personId,int age,String mobileNumber,char gender){
this.personName=personName;
this.personId=personId;
this.age=age;
this.mobileNumber=mobileNumber;
this.gender=gender;
}
void showPersonInfo(){
System.out.println("<<<<<<<<<<INFO>>>>>>>>>>");
System.out.println("Name: "+personName);
System.out.println("ID: "+personId);
System.out.println("Age: "+age);
System.out.println("Mobile Number: "+mobileNumber);
System.out.println("Gender: "+gender);
detectMobileOperator();
}

void detectMobileOperator() {
    char thirdDigit = mobileNumber.charAt(2);
    if (thirdDigit == '8') {
        System.out.println("Operator: Robi");
    } else if (thirdDigit == '7') {
        System.out.println("Operator: GrameenPhone");
    } else if (thirdDigit == '6') {
        System.out.println("Operator: Airtel");
    } else if (thirdDigit == '9') {
        System.out.println("Operator: Banglalink");
    } else if (thirdDigit == '5') {
        System.out.println("Operator: Teletalk");
    }
}
}


