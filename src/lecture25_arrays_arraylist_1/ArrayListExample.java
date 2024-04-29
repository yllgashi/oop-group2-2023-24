package lecture25_arrays_arraylist_1;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();

        // add users into application
        users.add("filanfisteku");
        users.add("testimtesteri");

        // show users informations
        showAllUsers(users);

        // get user by username
        showUserByUsername(users, "filanfisteku");

        // update user by username
        updateUserByUsername(users, "filanfisteku", "testtest");

    }

    public static void showAllUsers(ArrayList<String> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("_________________________");
            System.out.println(users.get(i));
        }
    }

    public static void showUserByUsername(ArrayList<String> users, String username) {
        int indexOfElement = users.indexOf(username);
        if (indexOfElement != -1) {
            System.out.println(users.get(indexOfElement));
        } else {
            System.out.println("Element does not exists");
        }
    }

    public static void updateUserByUsername(ArrayList<String> users, String username, String newUsername) {
        int indexOfElement = users.indexOf(username);
        if (indexOfElement != -1) {
            users.set(indexOfElement, newUsername);
        } else {
            System.out.println("Element does not exists");
        }
    }
}
