package Mini_project;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class InTime_Check {

    public static void main(String[] args) {
        //1. 입실 체크해 출석 지각 결석 조회
        ArrayList<Integer> july = new ArrayList<Integer>(22);
        Calendar stdInTime = Calendar.getInstance();
        stdInTime.set(Calendar.HOUR_OF_DAY, 9);
        stdInTime.set(Calendar.MINUTE, 10);

        Calendar stdInTime2 = Calendar.getInstance();
        stdInTime2.set(Calendar.HOUR_OF_DAY, 9);
        stdInTime2.set(Calendar.MINUTE, 30);

        Calendar inTime = Calendar.getInstance();
        System.out.println(inTime.getTime());

        System.out.println(july.size());
        for (int i = 0; i < 22; i++) { //22에 계산된 월 별 출석일 변수값
            if (!stdInTime2.after(inTime)) {
                july.add(0); // 배열에서 0은 결석
            } else if (!stdInTime.after(inTime)) {
                july.add(2); // 배열에서 2는 지각, 조퇴, 외출
            } else {
                july.add(1); // 배열에서 1은 출석
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm"); 
        int outTime1 = Integer.parseInt(sdf.format(inTime.getTime())); 
        int outTime2 = Integer.parseInt(sdf.format(inTime.getTime())+500); 

        if(outTime2 - outTime1 < 400) { 
            System.out.println("결석");
        }else {
            System.out.println("외출");
            }
        
        int countAttend = 0, countAbcent = 0, countLate = 0;
        for (int i = 0; i < july.size(); i++) {
            if (july.get(i) == 0) {
                countAbcent++;
            } else if (july.get(i) == 1) {
                countAttend++;
            } else {
                countLate++;
            }
        }
        boolean inCourseCheck = true;
        
        if(countAbcent>=5) {
            System.out.println("중도탈락입니다.");
            inCourseCheck = false;
            }

        ArrayList<ArrayList<Integer>> test = new ArrayList<>();
        test.add(july);
        System.out.println(test.get(0).size()); //test arraylist의 0번 index는 july
        
        //중도탈락자는 hashmap에서 삭제, 별도처리
        //
        
    }

}
