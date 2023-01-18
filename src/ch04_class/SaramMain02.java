package ch04_class;

public class SaramMain02 {
    public static void main(String[] args) {
        System.out.println(Saram02.nationality);

        Saram02 yusin = new Saram02() ;
        yusin.nationality = "korea";

        Saram02 soon = new Saram02() ;
        System.out.println(soon.nationality);

        double a = 12.34;
        double b = 22.54;
        double result = yusin.avg(a, b) ;
        System.out.println(result); // 평균 : 17.44
    }
}
