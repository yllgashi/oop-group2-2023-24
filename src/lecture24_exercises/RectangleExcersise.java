package lecture24_exercises;

public class RectangleExcersise {
    public static void main(String[] args) {
        Rectangle drejtkendeshi1 = new Rectangle(2, 6);
        int syprina = drejtkendeshi1.gjejSyprinen();
        int perimetri = drejtkendeshi1.gjejPerimetrin();
        System.out.println("Syprina e drejtkendeshit te dhene eshte: " + syprina);
        System.out.println("Perimetri i drejtkendeshit te dhene eshte: " + perimetri);
        drejtkendeshi1.printoDrejtkendeshin();


        Rectangle drejtkendeshi2 = new Rectangle();
        drejtkendeshi2.setAB(1, 2);


    }
}
