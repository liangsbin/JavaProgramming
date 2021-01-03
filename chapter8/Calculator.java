public class Calculator {
    double x,y;
    public Calculator(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void getResult(SumInterface sumInterface){
        System.out.println("Add:" + sumInterface.add(x,y));
        System.out.println("Sub:" + sumInterface.sub(x,y));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(123.03,454.99);
       // Calc calc = new Calc();
        c.getResult(new SumInterface() {
            @Override
            public double add(double x, double y) {
                return x+y;
            }

            @Override
            public double sub(double x, double y) {
                return x-y;
            }
        });
    }
}
/*
class Calc implements SumInterface{
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }
}

 */