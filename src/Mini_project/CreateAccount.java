package Mini_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CreateAccount {
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashMap<String, String> account = new HashMap<>(); //hashmap 키값은 학번 date는 ArrayList 값
    	boolean sw = false;
    	do {
    		System.out.println("1.입력 2. 확인 3. 종료");
    		String choice = br.readLine();
    		if(choice.equals("1")) {
    			System.out.println("학생의 수는?");
    			int student = Integer.parseInt(br.readLine());
    			
    			for(int i=0; i<student;i++) {
    				System.out.println("학번");
    				String accountNum = br.readLine();
    				System.out.println("이름");
    				String name = br.readLine();
    				account.put(accountNum, name);      
    			}sw=true;
    		}else if(choice.equals("2")) {
    			System.out.println("확인할 학번");
    			String check = br.readLine();
    			System.out.println(check+ ": " + account.get(check));
    			sw=true;
    		}else {
    			System.out.println("종료");
    			break;
    		}
    		
    	}while(sw == true);
    
    }

}
