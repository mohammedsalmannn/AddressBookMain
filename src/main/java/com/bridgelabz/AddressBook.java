package com.bridgelabz;

import com.bridgelabz.AddressService;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        int  input;
        int ans;
        AddressService object = new AddressService();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Add a contact");
            System.out.println("2.Edit a contact");
            System.out.println("3.Delete a contact");
            System.out.println("4.Search a contact");
            System.out.println("5.Display city");
            System.out.println("6.Display State");
            System.out.println("7.Sort by Name");
            input = scanner.nextInt();
            switch(input)
            {
                case 1:
                    object.add();
                    break;
                case 2:
                    object.edit();
                    break;
                case 3:
                    object.delete();
                    break;
                case 4:
                    object.Search();
                    break;
                case 5:
                    object.displayCity();
                    break;
                case 6:
                    object.displayState();
                    break;
                case 7:
                    object.sortName();
                    break;
                    case 8:
                      object.sortCity();
                        break;
                    case 9:
                        object.sortState();
                        break;
                    case 10:
                        object.sortZip();
                        break;
                default:System.out.println("Invalid option");
            }
            System.out.println("Do you want to continue?(0/1)");
            ans=scanner.nextInt();
        }while(ans==1);
    }

    }

