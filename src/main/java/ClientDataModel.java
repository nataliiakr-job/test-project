class Client {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phone;

    public Client(String name, int age, String gender, String email, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class ClientDataModel {
    public static void main(String[] args) {
        Client client1 = new Client("John Doe", 30, "Male", "john@example.com", "123-456-7890");
        System.out.println("Name: " + client1.getName());
        System.out.println("Age: " + client1.getAge());
        System.out.println("Gender: " + client1.getGender());
        System.out.println("Email: " + client1.getEmail());
        System.out.println("Phone: " + client1.getPhone());

        Client client2 = new Client("Jane Smith", 25, "Female", "jane@example.com", "987-654-3210");
        System.out.println("Name: " + client2.getName());
        System.out.println("Age: " + client2.getAge());
        System.out.println("Gender: " + client2.getGender());
        System.out.println("Email: " + client2.getEmail());
        System.out.println("Phone: " + client2.getPhone());

        client1.setName("John Smith");
        client1.setAge(35);
        client1.setEmail("johnsmith@example.com");
        client1.setPhone("555-1234");

        System.out.println("Updated Name: " + client1.getName());
        System.out.println("Updated Age: " + client1.getAge());
        System.out.println("Updated Gender: " + client1.getGender());
    }
}

