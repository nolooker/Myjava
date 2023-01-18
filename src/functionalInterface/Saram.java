package functionalInterface;

public class Saram {
    private String id;
    private String name;
    private int kor;
    private int eng;

    public Saram(String id, String name, int kor, int eng){
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }
}

