package ch05_package_inheritance;

public class Health extends Human{
    double s_weight = 0.0 ; // 표준 체중
    double fatrate = 0.0 ; // 비만율
    String result = "" ; // 최종 결과

    public Health(String name, String gender, double height, double weight) {
        super(name, gender, height, weight);
        this.calculate();
        this.output2();
    }

    private void output2(){
        String message = "%s님은 비만율이 %.1f이고, 결과는 %s입니다." ;
        System.out.printf(message, super.getName(), this.fatrate, this.result);
    }

    private void calculate(){ // 비만율을 구하고, 해당 결과를 출력해 줍니다.
        if(super.getGender() == "M"){ // 성별에 따른 표준 체중 구하기
            this.s_weight = (super.getHeight() - 100.0) * 0.90 ;
        }else{
            this.s_weight = (super.getHeight() - 100.0) * 0.85 ;
        }

        this.fatrate = super.getWeight() / this.s_weight * 100.0 ; // 비만율

        if(this.fatrate >= 150.0) {
            this.result = "고도 비만" ;
        }else if(this.fatrate >= 131.0){
            this.result = "중도 비만" ;
        }else if(this.fatrate >= 121.0){
            this.result = "경도 비만" ;
        }else if(this.fatrate >= 111.0){
            this.result = "과체중" ;
        }else if(this.fatrate >= 91.0){
            this.result = "정상" ;
        }else{
            this.result = "저체중" ;
        }
    }
}
