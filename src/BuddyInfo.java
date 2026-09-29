public class BuddyInfo {
    private String name;
    private String address;
    private String phone;
    private int age;

    public BuddyInfo(String name, String address, String phone, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
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
        BuddyInfo myBuddy = new BuddyInfo("Peters", "10 Bank Street", "1234567890", 20);
        System.out.print("Hello " + myBuddy.getName());
    }
}
