package Calculator;

public class Calculator {
    private IOperator _operator;
    public Calculator(IOperator ioperator)
    {
        _operator = ioperator;
    }
    public void Calculate(int a, int b)
    {
        _operator.executeOperation(a , b);
    }
}
