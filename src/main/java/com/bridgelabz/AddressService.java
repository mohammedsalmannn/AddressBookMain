package com.bridgelabz;
import com.bridgelabz.Address;
import java.util.ArrayList;
import java.util.Scanner;



import java.util.ArrayList;
import java.util.Scanner;

public class AddressService implements IAddress {
    ArrayList<Address> book =new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void createAddressBook(){

    }

    @Override
    public void add() {

        Address addressService = new Address();
        System.out.println("Enter First name:");
        addressService.setFirstname(scanner.next());
        System.out.println("Enter last name:");
        addressService.setLastname(scanner.next());
        System.out.println("Enter your address:");
        addressService.setAddress(scanner.next());
        System.out.println("Enter your city:");
        addressService.setCity(scanner.next());
        System.out.println("Enter your state:");
        addressService.setState(scanner.next());
        System.out.println("Enter your ZIP code:");
        addressService.setZip(scanner.nextInt());
        System.out.println("Enter your phone number");
        addressService.setPhone(scanner.next());
        book.stream().forEach( n ->{
            if (n.getFirstname().equals(addressService.getFirstname())){
                System.out.println("Duplicate");
            }
            else {
                book.add(addressService);
            }
        });
        if(book.size()==0)
            book.add(addressService);
    }

    @Override
    public void edit() {

        String temp=null;
        System.out.println("Enter the 'First Name' of the record u want to Edit");
        temp=scanner.next();
        if(book.isEmpty())
        {
            System.out.println("No records to edit");
            return;
        }

        for(int i=0;i<book.size();i++)
        {
            if(book.get(i).getFirstname().equals(temp))
            {
                Address address=new Address();
                System.out.println(temp);
                System.out.println("Enter First name:");
                address.setFirstname(scanner.next());
                System.out.println("Enter last name:");
                address.setLastname(scanner.next());
                System.out.println("Enter your address:");
                address.setAddress(scanner.next());
                System.out.println("Enter your city:");
                address.setCity(scanner.next());
                System.out.println("Enter your state:");
                address.setState(scanner.next());
                System.out.println("Enter your ZIP code:");
                address.setZip(scanner.nextInt());
                System.out.println("Enter your phone number");
                address.setPhone(scanner.next());
                book.remove(i);
                book.set(i, address);
                break;
            }

        }
    }

    @Override
    public void delete() {

        String temp=null;
        System.out.println("Enter the First name of the record you want to delete");
        temp=scanner.next();
        if(book.isEmpty())
        {
            System.out.println("No records to delete");
            return;
        }
        for(int i=0;i<book.size();i++)
        {
            if(book.get(i).getFirstname().equals(temp))
            {
                book.remove(i);
                break;
            }
        }
    }
}