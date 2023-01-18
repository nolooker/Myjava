package ch04_class;

public class AccountMain03 {
    public static void main(String[] args) {


        Account03 kim = new Account03();


        kim.setBank("국민은행");
        kim.setName("김철수");
        kim.setNo(1234);



        System.out.println();
        System.out.println("이름 : " + kim.getName());


    }
}
