public class Shape2DDriver {

    public static void main(String[] args) {
        

        Rectangle2D rec = new Rectangle2D(4,2);
        System.out.println(rec.get2DArea());
        Circle2D circle = new Circle2D(5);
        System.out.println(circle.get2DArea());

        int [] attendance = new int [31];
    for (int dayI = 0; dayI < attendance.length; ++dayI){
        System.out.println( dayI);
    }


        

    }
}
