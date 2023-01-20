package ch11_lamdba_expression.lambdatest;

public class NameConcatImpl implements NameConcat {
    @Override
    public void nameCombination(String husbund, String wife) {
        System.out.println("남편 : " + husbund + "님, 아내 : " + wife + "님");
    }
}
