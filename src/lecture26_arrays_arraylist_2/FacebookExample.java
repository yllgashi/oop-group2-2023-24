package lecture26_arrays_arraylist_2;

import java.util.ArrayList;
import java.util.Scanner;

class FacebookExample {
    public static void main(String[] args) {
        ArrayList<User> facebookUsers = new ArrayList<User>();

    }


    // register
    public static void addElement(ArrayList<User> facebookUsers) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int id = scanner.nextInt();

        User user = new User(id, username, password, firstName, lastName, "");

        facebookUsers.add(user);
    }


    // does user exists
    public static boolean doesUserExists(ArrayList<User> facebookUsers, String username) {
        for (int i = 0; i < facebookUsers.size(); i++) {
            if (facebookUsers.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }


    // login
    public static void getElement(ArrayList<User> facebookUsers, String username, String password) {
        for (int i = 0; i < facebookUsers.size(); i++) {
            if (facebookUsers.get(i).getUsername().equals(username) && facebookUsers.get(i).getPassword().equals(password)) {
                facebookUsers.get(i).showMyInformation();
            }
        }
        System.out.println("Not found!");
    }
}
