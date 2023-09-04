package lesson22;

public class Main1 {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.user();
    }


    public  void user() {
        User user = new  User("Fozilbek",22,"fozilbek@gmail.com");
        System.out.println(user);
    }


    private  class  User{
    private String UserName;
    private int age;
    private  String email;

        public User(String userName, int age, String email) {
            UserName = userName;
            this.age = age;
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{" +
                    "UserName='" + UserName + '\'' +
                    ", age=" + age +
                    ", email='" + email + '\'' +
                    '}';
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }


}
