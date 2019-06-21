package Mini_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CreateAccount {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("학생의 수는?");
        int student = Integer.parseInt(br.readLine());
        HashMap<String, String> account = new HashMap<>(); //hashmap의 value는 학생정보가 입력된 file or arraylist
        
        for(int i=0; i<student;i++) {
            System.out.println("학번");
            String accountNum = br.readLine();
            System.out.println("이름");
            String name = br.readLine();
            account.put(accountNum, name);                      
        }
        

        System.out.println("확인할 학번");
        String check = br.readLine();
        
        System.out.println(check+ ": " + account.get(check));
        
        
        
        
        
    }

}
