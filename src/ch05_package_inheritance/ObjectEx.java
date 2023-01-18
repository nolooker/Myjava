package ch05_package_inheritance;

public class ObjectEx {
    public static void main(String[] args) {
        Sample obj1 = new Sample();
        int hashcode = obj1.hashCode() ;
        System.out.println("해시 코드 : " + hashcode);

        String hexa = Integer.toHexString(hashcode) ;
        System.out.println("해시 코드(16진수) : " + hexa);

        // class ch05_package_inheritance.Sample
        // obj1는 ch05_package_inheritance 패키지 내에 있는 Sample 클래스에 대한 객체입니다.
        System.out.println(obj1.getClass());

        System.out.println(obj1.toString());

        // 객체 출력시 암시적으로 toString() 메소드가 호출이 됩니다.
        System.out.println(obj1);

        Sample soo = new Sample("김철수", 20) ;
        System.out.println(soo);
    }
}






