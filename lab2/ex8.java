package lab2;

// Post class representing a social media post
class Post {
    String name, content;
    int likes;

    // Constructor to initialize Post objects
    public Post(String name, String content) {
        this.name = name;
        this.content = content;
        this.likes = 0; // Likes start at 0 when a post is created
    }

    // Method to increment likes for the post
    public void likePost() {
        this.likes++;
    }
}

// SocialMediaPlatform class representing the social media platform
class SocialMediaPlatform {
    static Post[] posts = new Post[100]; // Array to store posts (initially supports up to 100 posts)
    static int postCount = 0; // Counter to keep track of the number of posts

    // Method to create a new post and add it to the array
    public static void createPost(Post post) {
        if (postCount < posts.length) {
            posts[postCount] = post;
            postCount++;
        } else {
            System.out.println("Cannot add more posts, storage is full.");
        }
    }

    // Method to like a post given its index
    public static void likePost(int index) {
        if (index >= 0 && index < postCount) {
            posts[index].likePost();
        } else {
            System.out.println("Post not found.");
        }
    }

    // Method to search for posts by a specific user
    public static void searchPostsByUser(String userName) {
        System.out.println("Posts by " + userName + ":");
        for (int i = 0; i < postCount; i++) {
            if (posts[i].name.equals(userName)) {
                System.out.println("Content: " + posts[i].content + ", Likes: " + posts[i].likes);
            }
        }
    }

    // Method to display the post with the highest number of likes
    public static void displayMostLikedPost() {
        if (postCount == 0) {
            System.out.println("No posts available.");
            return;
        }

        Post mostLikedPost = posts[0];
        for (int i = 1; i < postCount; i++) {
            if (posts[i].likes > mostLikedPost.likes) {
                mostLikedPost = posts[i];
            }
        }

        System.out.println("Most liked post:");
        System.out.println("Author: " + mostLikedPost.name);
        System.out.println("Content: " + mostLikedPost.content);
        System.out.println("Likes: " + mostLikedPost.likes);
    }
}

// Main class to test the functionality
public class ex8 {
    public static void main(String[] args) {
        // Create some posts
        Post p1 = new Post("rauf", "my pic");
        Post p2 = new Post("ali", "beautiful sunset");
        Post p3 = new Post("rauf", "my new car");

        // Add posts to the social media platform
        SocialMediaPlatform.createPost(p1);
        SocialMediaPlatform.createPost(p2);
        SocialMediaPlatform.createPost(p3);

        // Like some posts
        SocialMediaPlatform.likePost(0); // Liking post at index 0 (p1)
        SocialMediaPlatform.likePost(2); // Liking post at index 2 (p3)
        SocialMediaPlatform.likePost(2); // Liking post at index 2 again (p3)

        // Search for posts by a specific user
        SocialMediaPlatform.searchPostsByUser("rauf");

        // Display the post with the highest number of likes
        SocialMediaPlatform.displayMostLikedPost();
    }
}
