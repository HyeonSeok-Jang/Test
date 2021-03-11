package codding;

import java.util.*;

public class Noneblocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number = "1232123212321232123212321";
		int k = 10;
		String answer = "";
        int[] list = new int[number.length()];
        for(int i = 0;i<number.length();i++){
            list[i] =number.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(list));
        int n = 0;
        for(int i = 0;i<list.length&&k>0;i++){
        	if(i<0)
        		continue;
            if(list[i]==0){
                n = 0;
                continue;
            }
            if(list[i+n+1]==0){
                n++;
                i--;
                continue;
            }
            if(i == list.length-1){
                break;
            }
            
            if(list[i]<list[i+1+n]){
                list[i]=0;
                if(i!=0) {
                    i=0;
                    n=0;
                }
//                i--;
                k--;
            }
            
        }
        System.out.println(Arrays.toString(list));
        for(int i = 0;i<k;i++){
            if(list[i]!=0){
                list[list.length-1-i]=0;  
            }
        }
        
        for(int i = 0; i<list.length;i++){
            if(list[i]!=0)
                answer+=list[i];
        }
        System.out.println(answer);
	}

}
