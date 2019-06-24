package Mini_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Random;

public class Attend_Manager_2 {

    public static void main(String[] args) throws Exception {
        Random rdm = new Random();
        System.out.println("1 �Խ� 2 ��� 3 ���� 4 ��ȸ 5 ����");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(br.readLine());
        Calendar workDay = Calendar.getInstance();
        LocalTime stdInTime = LocalTime.of(9, 0);
        LocalTime inTime = LocalTime.of(9, rdm.nextInt(30));
        LocalTime stdOutTime = LocalTime.of(17, 50);
        LocalTime outTime = LocalTime.of(17, rdm.nextInt(50));
        LocalTime outtingTime = LocalTime.of(rdm.nextInt(12)+1, rdm.nextInt(59));
        LocalTime comebackTime = LocalTime.of(16, 0);
        Calendar cal = Calendar.getInstance();
        
        int julyCount =0;

        for(int i=1;i<=workDay.getActualMaximum(workDay.DAY_OF_MONTH);i++) {
            workDay.set(Calendar.MONTH, Calendar.JUNE);
            workDay.set(Calendar.DATE, i);
            switch(workDay.get(Calendar.DAY_OF_WEEK)) {
            case 2: case 3: case 4: case 5: case 6:
                julyCount++; break;
            }
        }
        int inCheck = inTime.getMinute() - stdInTime.getMinute();
        int outCheck = stdOutTime.getMinute() - outTime.getMinute();
        int outtingCheck = comebackTime.getHour() - outtingTime.getHour();

        int[] juneInCheck = new int[5]; //20�� ����
        int[] juneOutCheck = new int[5];
        int juneAttend=0, juneLate=0, juneAbsent=0;
        
        while(true) {
            if(answer == 1) {
                
                for(int i=0;i<5;i++) {
                    if(inTime.getHour() <= stdInTime.getHour() && inCheck < 10) {
                        System.out.println("�Խ�");
                        juneInCheck[i]=1;
                    }else if(inTime.getHour() == stdInTime.getHour() && inCheck > 10) {
                        System.out.println("����");
                        juneInCheck[i]=2;
                    }else if(inTime.getHour() >= stdInTime.getHour() && inCheck > 30) {
                        System.out.println("�Ἦ");
                        juneInCheck[i]=0;
                    }
                }
                
            }else if(answer == 2) {
                for(int i=0;i<juneOutCheck.length;i++) {
                    if(outTime.getHour()>=stdOutTime.getHour() && outCheck< 10) {
                        System.out.println("���");
                        juneOutCheck[i]=1;
                    }else if(outTime.getHour() == stdOutTime.getHour() && outCheck > 10){
                        System.out.println("����");
                        juneOutCheck[i]=2;
                    }else if(outTime.getHour() <= stdOutTime.getHour() && outCheck > 30){
                        System.out.println("�Ἦ");
                        juneOutCheck[i]=0;
                    }
                }
            }else if(answer == 3) {
                for(int i=0;i<juneOutCheck.length;i++) {
                    if(outtingCheck> 4) {
                        System.out.println("�Ἦ");
                        juneOutCheck[i]=0;
                    }else if(outtingCheck <=4) {
                        System.out.println("����");
                        juneOutCheck[i]=2;
                    }
                }
            }
            
            for(int i=0; i<juneInCheck.length;i++) {
                if(juneInCheck[i] * juneOutCheck[i] ==0) {
                    juneAbsent++;
                }else if(juneInCheck[i] * juneOutCheck[i] == 1) {
                    juneAttend++;
                }else if(juneInCheck[i] * juneOutCheck[i] == 2 || juneInCheck[i] * juneOutCheck[i] == 4) {
                    juneLate++;
                }
            }
            
            
            
            
            
            
            
        }

    }

}
