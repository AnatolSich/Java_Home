package com.company.Lesson10;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by Toll on 13.07.2017.
 */

/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
IOException
RemoteException
NoSuchFieldException
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
*/
//Отловлены все исключения, но код, выдающий исключения после метода io(), не будет выполнен из-за ислючения IOException.
public class Task08 {
    public static void main(String[] args) {

    }
    private static void processExceptions(){
        try {
            io();
            remote();
            noSuchField();
        } catch (NoSuchFieldException e1){
            System.out.println(e1);
        }
        catch (RemoteException e2){
            System.out.println(e2);
        }
        catch (IOException e3){
            System.out.println(e3);
        }

    }
   private static void io() throws IOException {
        throw new IOException();
   }
    private static void remote() throws RemoteException {
        throw new RemoteException();
   }
    private static void noSuchField() throws NoSuchFieldException {
        throw new NoSuchFieldException();
   }

}


