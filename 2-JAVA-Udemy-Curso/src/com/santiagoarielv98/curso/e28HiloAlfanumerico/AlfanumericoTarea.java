package com.santiagoarielv98.curso.e28HiloAlfanumerico;

import java.util.concurrent.TimeUnit;

public class AlfanumericoTarea implements Runnable{
    private final Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        try {
            switch (tipo){
                case NUMERO -> {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
                case LETRA -> {
                    for (char c = 'A'; c < 'Z'; c++) {
                        System.out.println(c);
                        TimeUnit.MICROSECONDS.sleep(250);
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
