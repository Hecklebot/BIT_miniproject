package Mini_project;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {

    public static void main(String[] args) {
                Calendar stdTime = Calendar.getInstance();
                stdTime.set(Calendar.HOUR_OF_DAY, 9);
                stdTime.set(Calendar.MINUTE, 0);
                
                Calendar myTime = Calendar.getInstance();
                if(stdTime.before(myTime)) {
                    System.out.println("���ð� ����");
                }else {
                    System.out.println("����");
                }
                
                Calendar myWeek = Calendar.getInstance();
                myWeek.set(Calendar.DAY_OF_MONTH, 1);
                int count = 0;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                System.out.println(sdf.format(myWeek.getTime()));
                System.out.println(myWeek.get(Calendar.DAY_OF_WEEK));
                

    }

}
