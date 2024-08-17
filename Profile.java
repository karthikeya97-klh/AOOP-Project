package profile;
import java.util.*;

public class Profile {
    private User user;
    private List<User> friends;
    private List<String> posts;

    public Profile(User user) {
        this.user = user;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public void addFriend(User friend) {
        if (!friends.contains(friend) && !user.equals(friend)) {
            friends.add(friend);
        }
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }

    public void addPost(String post) {
        posts.add(post);
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<String> getPosts() {
        return posts;
    }
}
