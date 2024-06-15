package lecture58_interfaces_4;



//class Z implements X, Y {
class Z implements Y {

    @Override
    public void a() {
        System.out.println("Method from interface X");
    }

    @Override
    public void b() {
        System.out.println("Method from interface Y");
    }
}
