package com.company.Lesson10;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by Toll on 13.07.2017.
 */

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
NullPointerException
IndexOutOfBoundsException
NumberFormatException
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Task09 {
    public static void main(String[] args) {
        processExceptions();
    }
    private static void processExceptions(){
        try{
            nullPointer();
            indexOut();
            numberFormat();
        } catch (NullPointerException e1){
            e1.printStackTrace();
        }
        catch (IndexOutOfBoundsException e2){
            e2.printStackTrace();
        }
        catch (NumberFormatException e3){
            e3.printStackTrace();
        }

    }

    private static void nullPointer() throws NullPointerException {
        throw new NullPointerException();
    }
    private static void indexOut() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException();
    }
    private static void numberFormat() throws NumberFormatException {
        throw new NumberFormatException();
    }


}
