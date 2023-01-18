package ch05_package_inheritance;

public class Book {
    private String name ;
    private int price ;
    private String education ;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public String toString() {
        String imsi = "\n" ;
        imsi += "책이름 : " + this.name ;
        imsi += ", 단가 : " + this.price ;
        imsi += ", 교육 기관 : " + this.education ;
        return super.toString() + "\n" + imsi ;
    }

    public Book(String name, int price, String education) {
        this.name = name;
        this.price = price;
        this.education = education;
    }
}
