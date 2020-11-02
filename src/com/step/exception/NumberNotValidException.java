package com.step.exception;

public class NumberNotValidException extends Exception {
    //"Exceptie: datele introduse de la tastatura nu sunt un numar"
    public NumberNotValidException(){
        super("Exceptie: datele introduse de la tastatura nu sunt un numar");
    }
}
