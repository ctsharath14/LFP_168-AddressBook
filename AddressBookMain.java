import java.util.*;

public class AddressBookMain {


    static HashMap<String, AddressBook> addressBookMap = new HashMap<>();
    public static void addNewAddressBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the address book name");
        String addressBookName = scanner.nextLine();
        if(addressBookMap.containsKey(addressBookName)){
            System.out.println("address book is already available");
        }
        else{
            AddressBook addressBook =new AddressBook();
            addressBookMap.put(addressBookName,addressBook);
        }

    }
    public static  void main(String[] args){
        System.out.println("Welcome to a address book program");
        AddressBook addressBook = new AddressBook();

        int choice;
        do{
            addNewAddressBook();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kindly enter the choice");
            System.out.println("1 - Add contact");
            System.out.println("2 - Edit contact");
            System.out.println("3 - Delete contact");
            System.out.println("4 - Display contact");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();;
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContact();
                    System.exit(3);
                    break;
                default:
                    System.out.println("Please enter the correct choice");

            }
        }while (true);
    }
}