package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class Exercicio {

    public static void main(String[] args){

        LocalDateTime dataX = LocalDateTime.of(2010, 5, 15,
                10, 0, 0, 0);
        System.out.println(dataX);

        LocalDateTime dataXAlterada = dataX.plusYears(5).minusMonths(6).plusHours(13);
        System.out.println(dataXAlterada);
    }
}
