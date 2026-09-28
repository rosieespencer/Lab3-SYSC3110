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
}
