package lecture3_classes;

class Person {
    int age;
    private String password;

    public void setPassword(String passwordFromUser) {
        if (passwordFromUser.length() > 8) {
            this.password = passwordFromUser;
        }
    }

    public String getPassword(String userRole) {
        if (userRole.equals("Administrator")) {
            return this.password;
        }
        return "Nuk lejohet";
    }
}
