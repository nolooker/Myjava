package ch11_lamdba_expression.lambdatest;

// 클래스 이름에 Impl이라는 단어가 붙여 있으면 인터페이스의 구현체(Implementation) 클래스로 보시면 됩니다.

public class NameConcatImpl implements NameConcat{
    @Override
    public void nameCombination(String husband, String wife) {
        System.out.println("남편 : " + husband + ", 아내 : " + wife);
    }
}
