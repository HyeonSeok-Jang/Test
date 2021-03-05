import java.util.*;

public class programmers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 1;
        int n = 15;
        int idx = 1;
        
        /*
        int idx = 1; 부터 시작.
        재귀함수 받아서
        n이하일 동안 반복
        int sigmaidx = idx 선언하고
        재귀함수 안에서 while문 돌리면서
        int nums 에다가 sigmaidx 더해줌
        끝에는 sigmaidx++
        만약 n이 sigmaidx와 같으면 result+1시키고 자기자신 재귀
        만약 n이 sigmaidx보다 작으면 자기자신 재귀
        */
        
        System.out.println(jaegui(idx,answer,n));
	}
	public static int jaegui(int idx,int answer, int n){
        int sigmaidx = idx;
        int nums=0;
        while(n>nums&&n>idx){
            nums+=sigmaidx;
            if(n==nums){
                answer++;
                return jaegui(idx+1,answer,n);
            }else if(n<nums){
                return jaegui(idx+1,answer,n);
            }
            sigmaidx++;
        }
        return answer;
    }
}
