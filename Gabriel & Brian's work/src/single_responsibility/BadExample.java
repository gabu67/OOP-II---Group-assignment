package single_responsibility;

class UserManager {
    private String name;
    private String email;

    public UserManager(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveUser() {
        System.out.println("User saved: " + name);
    }

    public void sendWelcomeEmail() {
        System.out.println("Welcome email sent to: " + email);
    }
}

public class BadExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager("Bob", "bob@example.com");
        userManager.saveUser();
        userManager.sendWelcomeEmail();
    }
}