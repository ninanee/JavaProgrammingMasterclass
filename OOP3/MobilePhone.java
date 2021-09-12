import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContact;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already exists");
            return false;
        }
        this.myContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
        }
        this.myContact.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContact.remove(contact);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    public Contact queryContact(String name) {
        for(int i = 0; i < this.myContact.size(); i++){
            Contact contact = myContact.get(i);
            if(contact.getName().equals(name)){
                return contact;
            }
        }return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < this.myContact.size(); i++){
            Contact contact = myContact.get(i);
            System.out.println( i + 1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i = 0; i < this.myContact.size(); i++) {
            Contact contact = myContact.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
