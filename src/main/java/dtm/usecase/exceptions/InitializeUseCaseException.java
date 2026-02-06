package dtm.usecase.exceptions;

public class InitializeUseCaseException extends RuntimeException{

    public InitializeUseCaseException(String msg){
        super(msg);
    }

    public InitializeUseCaseException(String msg, Throwable th){
        super(msg, th);
    }


    public InitializeUseCaseException(Throwable th){
        super(th);
    }
}
