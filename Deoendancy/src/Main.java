public class Main {

    public static void main(String[] args) {

        Post post=new Post(new User("hussein",23));

        /**@PARAMS use that if you want to make instance sub post without make User Object
         * Post post1 = new Post();
         * post1.setUser(new User("hussein",23));
         **/
    }
}