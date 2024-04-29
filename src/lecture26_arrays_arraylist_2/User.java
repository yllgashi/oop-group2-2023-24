package lecture26_arrays_arraylist_2;

class User {
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String profilePic;

    public User(int id, String username, String password, String firstName, String lastName, String profilePic) {
        this.setId(id);
        this.setUsername(username);
        this.setPassword(password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setProfilePic(profilePic);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public void showMyInformation() {
        System.out.println("==================");
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }
}
