package Exceptions.exercicio_01.exeptions;

public class SaldoNegativoExceptions extends Exception {
    public String msg;

    public SaldoNegativoExceptions(String msg) {
        this.msg = msg;
    }

}
