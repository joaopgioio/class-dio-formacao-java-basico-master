package aulas.trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio {

    public static void main(String[] args){

        Date atual = new Date();
        System.out.println(atual);

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss:mmm");
        System.out.println(dataFormatada.format(atual));

    }
}
