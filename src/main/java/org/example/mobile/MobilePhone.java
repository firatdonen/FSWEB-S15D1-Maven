package org.example.mobile;
import java.util.List;
import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;// 1. field
    private List<Contact>myContacts;// 2.field

    public MobilePhone(String myNumber, List<Contact> contacts){
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<>();
    }
    //Getter metodları
    public String getMyNumber(){
        return myNumber;
    }
    public List<Contact> getMyContacts(){
        return myContacts;
    }

    //addNewContact method
     public boolean addNewContact(Contact contact){
            if(findContact(contact.getName())>=0){
            return false;
         }myContacts.add(contact);
        return true;
     }
     //updateContact method
    public  boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {// yok ise false
            return false;
        }
        myContacts.set(foundPosition, newContact); //var ve update olur ise
        return true;
    }
     //removeContact method
        public boolean removeContact(Contact contact){
            int foundPosition = findContact(contact);
            if(foundPosition<0){
                return false;
            }
            myContacts.remove(contact);
            return true;

        }
        //findContact method (Contact    parametre ile)
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    //findContact method(String parameter ile
    public int findContact(String contactName){
        for(int i = 0; i<this.myContacts.size(); i++){
            Contact contact= this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;

    }
    public Contact queryContact(String name){
        int position= findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;

    }
    //printContact method
    public void printContact(){
        System.out.println("Contact List:");
        for(Contact contact: myContacts ){
            System.out.println(contact);
        }
    }



}






