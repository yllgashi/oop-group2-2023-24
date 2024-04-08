package lecture17_enums_2;

public class Main {


    public static void main(String[] args) {
        // without enums
        String answer = "BMW";
        final String BRAND_BMW = "BMW";
        final String BRAND_MERCEDES = "Mercedes";
        final String BRAND_VW = "VW";

        switch (answer) {
            case BRAND_BMW:
                System.out.println("You choosed BMW");
                break;
            case BRAND_MERCEDES:
                System.out.println("You choosed Mercedes");
                break;
            case BRAND_VW:
                System.out.println("You choosed VW");
                break;
            default:
                System.out.println("Not in stock");
                break;
        }


        // with enums
        Brand brand = Brand.BMW;

        switch (brand) {
            case BMW:
                System.out.println("You choosed BMW");
                break;
            case MERCEDES:
                System.out.println("You choosed Mercedes");
                break;
            case VW:
                System.out.println("You choosed VW");
                break;
            default:
                System.out.println("Not in stock");
                break;
        }
    }
}
