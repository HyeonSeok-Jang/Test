import java.util.*;

public class test {
	public static void main(String[] args) {
		int n = 40;
		int i = 0;
	    int plus = 0;
	    String answer = "";
	    while(plus<n+1) {
	    	plus += jaegob(i);
	    	i++;
	    }
	    
	    plus = plus - jaegob(i-1);
	    System.out.println(plus);
	    int oTFour = n - plus;
	    int[] onetwofour = new int[i-1];
	    for(int j = 0;j<i-1;j++) {
	    	onetwofour[j]=oTFour%3;
	    	oTFour=oTFour/3;
	    }
	    for(int j = 0;j<onetwofour.length;j++) {
	    	switch (onetwofour[j]) {
	    	case 0:
	    		answer= 1+answer;
	    		break;
	    	case 1:
	    		answer= 2+answer;
	    		break;
	    	case 2:
	    		answer= 4+answer;
	    		break;
	    	}
	    	
	    }
	    
	    System.out.println(answer);
	}
	public static int jaegob(int i) {
	
		int gobsu = 1;
		for(int j=0;j<i;j++) {
			gobsu *=3;
		}
		return gobsu;
	}
}
