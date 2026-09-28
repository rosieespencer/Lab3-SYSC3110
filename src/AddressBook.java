import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyContacts;

    AddressBook() {
        buddyContacts = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo b) {
        if (b != null) {
            buddyContacts.add(b);
        }
    }

    public BuddyInfo removeBuddy(int i) {
        if (i >= 0 && i < buddyContacts.size()) {
            return buddyContacts.remove(i);
        }
        return null;
    }

    public String toString() {
        if (buddyContacts.isEmpty()) {
            return "You have no contacts.";
        }

        String book = "Address Book\n";
        for (int i = 0; i <= buddyContacts.size() - 1; i++) {
            book += "Contact " + (i + 1) + "\nName: " + buddyContacts.get(i).getName() + "\nPhone: " + buddyContacts.get(i).getPhone() + "\nAddress: " + buddyContacts.get(i).getAddress() + "\n";
        }

        return book;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Peter", "123 Avenue", "123-456-7891", 20);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println(addressBook.toString());
        addressBook.removeBuddy(0);
        System.out.println(addressBook.toString());
    }
}
