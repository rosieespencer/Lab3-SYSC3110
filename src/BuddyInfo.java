public class BuddyInfo {
    private String name;
    private String address;
    private String phone;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BuddyInfo myBuddy = new BuddyInfo("Peter", "10 Bank Street", "1234567890");
        System.out.print("Hello " + myBuddy.getName());
    }
}
