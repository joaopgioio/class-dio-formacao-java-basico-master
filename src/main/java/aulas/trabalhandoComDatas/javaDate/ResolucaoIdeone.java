package aulas.trabalhandoComDatas.javaDate;


import java.text.SimpleDateFormat;
import java.util.Date;

class ResolucaoIdeone {
    public static void main (String[] args) throws java.lang.Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date dataNasc = sdf.parse("1985-10-14 17:39:50.000");
        System.out.println("Esse é o timemilis do dia do meu nascimento: "+dataNasc.getTime());
        //498170390000

        Date dataQuinzeMaio = sdf.parse("2010-05-15 17:39:50.000");
        System.out.println("Esse é o timemilis do dia quinze de maio de 2010: "+dataQuinzeMaio.getTime());
        //1273955990000

        Date dataQuinzeMaioObjetoDate = new Date(dataQuinzeMaio.getTime());
        System.out.println("Data quinze de maio em formato objeto date: "+dataQuinzeMaioObjetoDate);
        //Sat May 15 17:39:50 BRT 2010

        Date dataNascObjetoDate = new Date(dataNasc.getTime());
        System.out.println("Minha data de nascimento em formato objeto date: "+dataNascObjetoDate);
        //Mon Oct 14 17:39:50 BRT 1985


        /** Comparando se a dataQuinzeMaioObjetoDate é posterior a dataNascObjetoDate */
        boolean isAfter = dataQuinzeMaioObjetoDate.after(dataNascObjetoDate);

        System.out.println(isAfter);
        //true

        /** Comparando se a dataQuinzeMaioObjetoDate é anterior a dataNascObjetoDate */
        boolean isBefore = dataQuinzeMaioObjetoDate.before(dataNascObjetoDate);

        System.out.println(isBefore);
        //false
    }
}