package org.example.models;
import java.util.*;


public class Grocery {
    public static List<String>groceryList= new ArrayList<>();

    public static void startGrocery(){
        Scanner scanner= new Scanner(System.in);//girdi al.
        Boolean running= true;
        while (running){
            System.out.println("0: uygulamayı durdur");
            System.out.println("1: ekleme işlemi");
            System.out.println("2: çıkarma işlemi");
            System.out.println("seçiniz: ");

            int choice =scanner.nextInt();
            scanner.nextLine();//nextLİne karakterini temizle

            switch (choice){
                case 0:
                    running= false;
                    break;

                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemToAdd= scanner.nextLine();
                    addItems(itemToAdd);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String  itemsToRemove=scanner.nextLine();
                    removeItems(itemsToRemove);
                    printSorted();
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }

        }
        scanner.close();



    }

    public static  void  addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (!checkItemIsInList(item)) groceryList.add(item);
        }
        sortList();

    }
public static void removeItems(String input){
    String []items=input.split(",");
    for(String item:items){
        item=item.trim();
        if (checkItemIsInList(item))
            groceryList.remove(item);

    }
    sortList();
        }
public static boolean checkItemIsInList(String product){
    return groceryList.contains(product);
        }

public static  void printSorted(){
    sortList();
            System.out.println("Sıralanmış liste"+groceryList);
        }
        private static void sortList(){
            Collections.sort(groceryList);
        }
        public static void main(String[] args){
    startGrocery();
        }

    }
