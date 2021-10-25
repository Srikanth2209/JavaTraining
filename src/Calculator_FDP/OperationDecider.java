package Calculator_FDP;

public class OperationDecider {
    public Operation getOperation(int choiceOfOperation){
        if(choiceOfOperation==1){
            return new Addition();
        }
        else if(choiceOfOperation==2){
            return new Subtraction();
        }
        else if(choiceOfOperation==3){
            return new Multiplication();
        }
        else if(choiceOfOperation==4){
            return new Division();
        }
        return null;
    }
}
