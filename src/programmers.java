import java.util.*;

public class programmers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 1;
        int n = 15;
        int idx = 1;
        
        /*
        int idx = 1; ���� ����.
        ����Լ� �޾Ƽ�
        n������ ���� �ݺ�
        int sigmaidx = idx �����ϰ�
        ����Լ� �ȿ��� while�� �����鼭
        int nums ���ٰ� sigmaidx ������
        ������ sigmaidx++
        ���� n�� sigmaidx�� ������ result+1��Ű�� �ڱ��ڽ� ���
        ���� n�� sigmaidx���� ������ �ڱ��ڽ� ���
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
