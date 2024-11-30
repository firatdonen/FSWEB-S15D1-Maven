package org.example.mobile;

public class Contact {
    private String name;
    private String phoneNumber;
    //Constructor
    public Contact(String name,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    //getter metotları
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    //Contact oluşturmak için static metot
    public static Contact createNewContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
    @Override
    public String toString(){
        return name+ " -> "+ phoneNumber;
    }

}
