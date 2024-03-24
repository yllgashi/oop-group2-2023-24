package lecture4_classes;

class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(String userRole) {
        if (userRole.equals("Administrator")) {
            return password;
        } else {
            return "";
        }
    }

    public void setPassword(String password) {
        if (password.length() > 7) {
            this.password = password;
        }
    }
}
