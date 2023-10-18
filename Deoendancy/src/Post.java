public class Post{
    public String title;
    public String message;

    public User user;
    public Post(User user){
        //new User is wrong
        this.user=user;
        System.out.println("hello post title");
        System.out.println("hello post message");
        System.out.println(this.user.name);
        System.out.println(this.user.age);
    }

    public void setUser(User user) {
        this.user = user;
    }
}