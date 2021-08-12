package aulas.trabalhandoComDatas.javaCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExercicioFinal {

    public static void main(String[] args) throws ParseException {

        //Calendar agora = Calendar.getInstance();
            //System.out.println( "A data de hoje é: "+ new SimpleDateFormat("dd/MM/yyyy").format(agora.getTime()));

        Calendar dataVencimento = Calendar.getInstance();

        dataVencimento.set(Calendar.DATE, 6);
        dataVencimento.set(Calendar.MONTH, 10-1);
        dataVencimento.set(Calendar.YEAR, 2021);
        dataVencimento.add(Calendar.DATE, +10);
        System.out.print( "A data de vencimento é: "+ new SimpleDateFormat("dd/MM/yyyy").format(dataVencimento.getTime()));
        System.out.printf(" que será n(a/o) %tA.",dataVencimento);

        if (dataVencimento.get(Calendar.DAY_OF_WEEK) == 1){
            dataVencimento.add(Calendar.DATE, +1);
        }else if(dataVencimento.get(Calendar.DAY_OF_WEEK) == 7) {
            dataVencimento.add(Calendar.DATE, +2);
        }

        System.out.print( "\nA data do pagamento deverá ser até: "+ new SimpleDateFormat("dd/MM/yyyy").format(dataVencimento.getTime()));
        System.out.printf(" que será n(a/o) %tA.",dataVencimento);


       // System.out.println("Dia da Semana de hoje: " + agora.get(Calendar.DAY_OF_WEEK));
        //System.out.println("Dia da Semana do vencimento: " + dataVencimento.get(Calendar.DAY_OF_WEEK));
        //System.out.println("DAY_OF_MONTH: "+ agora.get(Calendar.DAY_OF_MONTH));
        //System.out.println("DAY_OF_WEEK_IN_MONTH: " + agora.get(Calendar.DAY_OF_WEEK_IN_MONTH));



    }
}
