package profile;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class UserProfileTest {

    private User user1;
    private User user2;
    private Profile profile1;

    @BeforeEach
    public void setUp() {
        user1 = new User("john_doe", "john@example.com");
        user2 = new User("jane_doe", "jane@example.com");
        profile1 = new Profile(user1);
    }

    @Test
    public void testAddFriend() {
        profile1.addFriend(user2);
        assertTrue(profile1.getFriends().contains(user2));
    }

    @Test
    public void testAddFriendTwice() {
        profile1.addFriend(user2);
        profile1.addFriend(user2);  // Adding the same friend again
        assertEquals(1, profile1.getFriends().size());
    }

    @Test
    public void testRemoveFriend() {
        profile1.addFriend(user2);
        profile1.removeFriend(user2);
        assertFalse(profile1.getFriends().contains(user2));
    }

    @Test
    public void testAddPost() {
        String post = "Hello world!";
        profile1.addPost(post);
        assertTrue(profile1.getPosts().contains(post));
    }

    @Test
    public void testAddMultiplePosts() {
        profile1.addPost("First post");
        profile1.addPost("Second post");
        assertEquals(2, profile1.getPosts().size());
    }
}

