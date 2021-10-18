package PracticTask;

public class MathMethods implements PracticTask.DateTime {
    private int a, b;
    private int result = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public MathMethods() {
    }

    public MathMethods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void doMathMethods(MathMethods mathMethods) {
    result =mathMethods.a + mathMethods.b;
        System.out.println("Summ a and b equals: " + result + "    Current time: " +  showTime());
        int resultDegree = (int) Math.pow(result,2);
        System.out.println(result + " in 2 degree equals: " + resultDegree + "    Current time: " +  showTime());
    }

    @Override
    public String toString() {
        return "Suum " + this.a + " and " + this.b + " equals: " + (this.a + this.b) +  "    Current time:" + showTime();
    }
}
