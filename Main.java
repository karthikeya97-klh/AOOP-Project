package profile;

import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        // User profile creation and interactions
        User user1 = new User("john_doe", "john@example.com");
        Profile profile1 = new Profile(user1);

        User user2 = new User("jane_doe", "jane@example.com");
        profile1.addFriend(user2);
        profile1.addPost("Hello world!");

        System.out.println("Profile for " + user1.getUsername() + ":");
        System.out.println("Friends: " + profile1.getFriends().stream().map(User::getUsername).collect(Collectors.joining(", ")));
        System.out.println("Posts: " + profile1.getPosts());

        // Using the adapter
        LegacyPrinter oldPrinter = new OldPrinter();
        Document modernDoc = new PrinterAdapter(oldPrinter);

        modernDoc.render("This is a test document.");
    }
}
