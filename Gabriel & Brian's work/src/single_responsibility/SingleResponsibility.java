package single_responsibility;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class UserRepository {
    public void saveUser(User user) {
        System.out.println("User saved: " + user.getName());
    }
}

class EmailService {
    public void sendWelcomeEmail(User user) {
        // Simulate sending an email
        System.out.println("Welcome email sent to: " + user.getEmail());
    }
}

public class SingleResponsibility {
    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        UserRepository repo = new UserRepository();
        EmailService emailService = new EmailService();

        repo.saveUser(user);
        emailService.sendWelcomeEmail(user);
    }
}
