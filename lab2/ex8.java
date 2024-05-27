package lab2;


class Post {
    String name, content;
    int likes;
    public Post(String name, String content) {
        this.name = name;
        this.content = content;
        this.likes = 0; 
    }
    public void likePost() {
        this.likes++;
    }
}
class SocialMediaPlatform {
    static Post[] posts = new Post[100]; 
    static int postCount = 0; 
    public static void createPost(Post post) {
        if (postCount < posts.length) {
            posts[postCount] = post;
            postCount++;
        } else {
            System.out.println("Cannot add more posts, storage is full.");
        }
    }

   
    public static void likePost(int index) {
        if (index >= 0 && index < postCount) {
            posts[index].likePost();
        } else {
            System.out.println("Post not found.");
        }
    }
    public static void searchPostsByUser(String userName) {
        System.out.println("Posts by " + userName + ":");
        for (int i = 0; i < postCount; i++) {
            if (posts[i].name.equals(userName)) {
                System.out.println("Content: " + posts[i].content + ", Likes: " + posts[i].likes);
            }
        }
    }
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
public class ex8 {
    public static void main(String[] args) {
        Post p1 = new Post("rauf", "my pic");
        Post p2 = new Post("ali", "beautiful sunset");
        Post p3 = new Post("rauf", "my new car");

        SocialMediaPlatform.createPost(p1);
        SocialMediaPlatform.createPost(p2);
        SocialMediaPlatform.createPost(p3);

        SocialMediaPlatform.likePost(0); 
        SocialMediaPlatform.likePost(2); 
        SocialMediaPlatform.likePost(2); 
        SocialMediaPlatform.searchPostsByUser("rauf");
        SocialMediaPlatform.displayMostLikedPost();
    }
}
