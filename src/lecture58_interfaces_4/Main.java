package lecture58_interfaces_4;

class Main {
    public static void main(String[] args) {
        // has access to all methods
        Z z1 = new Z();
        z1.a();
        z1.b();

        // has access only in methods which are declared in X
        X z2 = new Z();
        z2.a();

        // has access only in methods which are declared in Y
        // and are extended from Z
        Y z3 = new Z();
        z3.a();
        z3.b();
    }
}
