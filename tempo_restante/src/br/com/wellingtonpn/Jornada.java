package br.com.wellingtonpn;
import org.joda.time.DateTime;
import org.joda.time.Duration;
public class Jornada {
  public static boolean life = true;
  public static boolean death = false;
  public static void main(String args[]) {
      DateTime dtToday = new DateTime();
      DateTime dtOther = new DateTime(DateTime.parse("2069-08-24T20:20:20Z"));
      Duration dur = new Duration(dtOther, dtToday);
      long dias = dur.getStandardDays();
      String days = String.valueOf(dias).replace("-", "");
      Integer vDias = Integer.valueOf(days);
      System.out.println("Dias :"+vDias);
      
      while(life) {
          Integer health = (int) Math.floor(Math.random() * (100000 - 0 + 1) + 0);
          if (health < 1 || vDias < 1) {
              life = false;
              death = true;
              System.out.println("****************************************************");
              System.out.println("---------------------------------------------");
              System.out.println();
              System.out.println("Você Está Morto!");
              System.out.println("Sua Jornada Acabou!");
              System.out.println();
              System.out.println("---------------------------------------------");
              System.out.println("****************************************************");
          } else {
        	  System.out.println("****************************************************");
        	  System.out.println("---------------------------------------------");
        	  System.out.println();
        	  System.out.println("Você Sobreviveu e Terá Mais Uma Chance Amanhã, Aproveite!");
        	  System.out.println();
        	  System.out.println("---------------------------------------------");
        	  System.out.println("****************************************************");
        	  System.out.println("********************************************************************************************************");
        	  
        	  String weeks = String.valueOf(vDias / 7).replace("-", "");
              String months = String.valueOf(vDias / 30).replace("-", "");
              String years = String.valueOf(vDias / 365).replace("-", "");
              
              Integer vSemanas = Integer.valueOf(weeks);
              Integer vMeses = Integer.valueOf(months);
              Integer vAnos = Integer.valueOf(years);
        	  System.out.println("Dias Restante Até completar 76 anos: " + String.valueOf(vDias).replace("-", ""));
              System.out.println("Semanas Restante Até completar 76 anos: " + vSemanas);
              System.out.println("Meses Restante Até completar 76 anos: " + vMeses);
              System.out.println("Anos Restante Até completar 76 anos: " + vAnos);
              System.out.println();
              System.out.println();
              vDias--;
          }
      }
  }
}
