public class CalcArea {
    static double area= 2.5;
    public static void main(String[] args) {
        solve(2.0,2.3);

    }
    public static void solve(double a,double b){
        System.out.println(area);
        System.out.println("Area " + (a*b));
        area = 2.59;
        System.out.println(area);
    }
    
}
