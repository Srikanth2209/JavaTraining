package Calculator;

class SubtractOperator implements IOperator {
    @Override
    public void executeOperation(int a, int b) {
        System.out.println("SubtarctOperator result : " + (a - b));
    }
}
