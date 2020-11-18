public class Rectangle2D extends Shape2D {
    protected double height ;
    protected double weight ;

    public Rectangle2D(double height , double weight){
        this.height= height;
        this.weight= weight;
    }

     public double setArea(){
        return weight *= height;
     }

    @Override
    public double get2DArea() {
        return setArea();
    }
}
