package lecture5_class_properties;

public class Main {
    public static void main(String[] args) {
//        ex1
//        Account obj1 = new Account();
//        obj1.username = "123";
//        obj1.setUsername("123");

//        System.out.println(obj1.username);
//        System.out.println(obj1.getUsername());


//        ex2
//        lecture5_properties.House house1 = new lecture5_properties.House();
//        house1.setYearBuilt(1999);
//        System.out.println(house1.ageOfHouse());
//
//        lecture5_properties.House house2 = new lecture5_properties.House();
//        house2.setYearBuilt(2010);
//        System.out.println(house2.ageOfHouse());

        Phone phone1 = new Phone();
        phone1.setId(1);
        phone1.setType("Samsung");
        phone1.setModel("Galaxy S23");
        phone1.setOperatingSystem("Android");
        phone1.setImageUrl("https://fdn2.gsmarena.com/vv/bigpic/apple-iphone-15-pro.jpg");

        Phone phone2 = new Phone();
        phone2.setId(2);
        phone2.setType("Apple");
        phone2.setModel("13 pro");
        phone2.setOperatingSystem("iOS");
        phone1.setImageUrl("https://fdn2.gsmarena.com/vv/bigpic/samsung-galaxy-s24-ultra-5g-sm-s928-stylus.jpg");

        // result
        System.out.println(phone1.getId());
        System.out.println(phone1.getType());
        phone1.powerOn();

        System.out.println(phone2.getId());
        System.out.println(phone2.getType());
        phone2.powerOn();

    }
}
