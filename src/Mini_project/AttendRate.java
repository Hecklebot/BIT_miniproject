package Attend_Manager;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AttendRate {

	public static void main(String[] args) {

        Calendar june = Calendar.getInstance();
        
        int juneCount = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        System.out.println(sdf.format(june.getTime()));
        june.set(Calendar.DATE, 1);
        System.out.println(june.get(Calendar.DAY_OF_WEEK));

        for(int i=1; i<=june.getActualMaximum(june.DAY_OF_MONTH);i++) { //���� �� �� ���ϱ�
        	june.set(Calendar.DATE, i);
        	switch(june.get(Calendar.DAY_OF_WEEK)){
        	case 2: case 3: case 4: case 5: case 6:
        		juneCount++; break;
        	}
        }System.out.println("6월 출석일은 " + juneCount + "일");
        
        
        int julyCount=0;
        Calendar july = Calendar.getInstance();
        for(int i=1; i<=july.getActualMaximum(july.DAY_OF_MONTH);i++) {
        	july.set(Calendar.MONTH, Calendar.JULY);
        	july.set(Calendar.DATE, i);
        	switch(july.get(Calendar.DAY_OF_WEEK)) {
        	case 2: case 3: case 4: case 5: case 6:
        		julyCount++; break;
        	}
        }
        System.out.println("7월 출석일은 " + julyCount +"일");
        
        
        int augCount=0;
        Calendar august = Calendar.getInstance();
        for(int i=1; i<=august.getActualMaximum(august.DAY_OF_MONTH);i++) {
        	august.set(Calendar.MONTH, Calendar.AUGUST);
        	august.set(Calendar.DATE, i);
        	switch(august.get(Calendar.DAY_OF_WEEK)) {
        	case 2: case 3: case 4: case 5: case 6:
        		augCount++; break;
        	}
        }
        System.out.println("8월 출석일은  " + augCount +"일");
        
        
        int sepCount=0;
        Calendar september = Calendar.getInstance();
        for(int i=1; i<=september.getActualMaximum(september.DAY_OF_MONTH);i++) {
        	september.set(Calendar.MONTH, Calendar.SEPTEMBER);
        	september.set(Calendar.DATE, i);
        	switch(september.get(Calendar.DAY_OF_WEEK)) {
        	case 2: case 3: case 4: case 5: case 6:
        		sepCount++; break;
        	}
        }
        System.out.println("9월 출석일은 " + sepCount +"일");

        
        int octCount=0;
        Calendar october = Calendar.getInstance();
        for(int i=1; i<=october.getActualMaximum(october.DAY_OF_MONTH);i++) {
        	october.set(Calendar.MONTH, Calendar.OCTOBER);
        	october.set(Calendar.DATE, i);
        	switch(october.get(Calendar.DAY_OF_WEEK)) {
        	case 2: case 3: case 4: case 5: case 6:
        		octCount++; break;
        	}
        }
        System.out.println("10월 출석일은 " + octCount +"일");
        
        
        int novCount=0;
        Calendar november = Calendar.getInstance();
        for(int i=1; i<=november.getActualMaximum(november.DAY_OF_MONTH);i++) {
        	november.set(Calendar.MONTH, Calendar.NOVEMBER);
        	november.set(Calendar.DATE, i);
        	switch(november.get(Calendar.DAY_OF_WEEK)) {
        	case 2: case 3: case 4: case 5: case 6:
        		novCount++; break;
        		
        	}
        }
        System.out.println("11월 출석일은 " + novCount +"일");
        
        
        
	}

}
