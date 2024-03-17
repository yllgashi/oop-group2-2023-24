package lecture3_classes;

class AlreadyUsedClasses {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setPassword("123456789");

        String password = p1.getPassword("Normal user");
        password = p1.getPassword("Administrator");

        System.out.println(password);
    }
}
