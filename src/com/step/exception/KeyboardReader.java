package com.step.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardReader {
    //1.Introducerea unui numar pana cand nu introduce un numar corect
    Scanner scanner = new Scanner(System.in);

//    metoda exceptiei verificate o sa arate like this
    public void enterNumberUntilValid(){
        boolean isValid = false;
        do {
            try {
                int x = enterNumber();
                isValid = true;
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again");
            }

        }while (!isValid);
        System.out.println("Bye");
    }

//    public int enterNumber()throws Exception{
//        System.out.println("Please enter a number");
//        int val;
//        try {
//             val = scanner.nextInt();
//             return val;
//        }catch(InputMismatchException ex){
////            Scaner nextline se pune din cauza ca sa evitam bugurile cu scanerul, atunci cand dupa
////            apasarea la enter ramane in bufferul scannerului niste gunoi
//            scanner.nextLine();
//            System.out.println("Datele introduse nu reprezinta un numar");
////            crearea exceptiei noastre proprii print classa Exception
//            throw new Exception("Exceptie: datele introduse de la tastatura nu sunt un numar");
//        }
//    }
    public int enterNumber()throws NumberNotValidException{
        System.out.println("Please enter a number");
        int val;
        try {
        val = scanner.nextInt();
        return val;
        }catch(InputMismatchException ex){
        //Scaner nextline se pune din cauza ca sa evitam bugurile cu scanerul, atunci cand dupa
        //apasarea la enter ramane in bufferul scannerului niste gunoi
        scanner.nextLine();
        System.out.println("Datele introduse nu reprezinta un numar");
        //crearea exceptiei noastre proprii print classa Exception
        throw new NumberNotValidException();
    }



}

}
