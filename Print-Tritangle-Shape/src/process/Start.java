package process;

import java.util.Scanner;

/**
 * 
 * @author vuongluis
 * @Analysis: 
 *  ***** => i
 *  Analasis: 
 *  	0 <=> n-1
 *  	1 <=> n-1-1 >> n-1+1
 *  	2 <=> n-1-2 >> n-1+2
 */
@SuppressWarnings("all")
public class Start {
	public static void getResultProcess(int n){
		int i = 0,j= 0;
		for(i = 0; i< n; i++){
			for(j = 0; j < 2*n-1; j++){
				if(i == n-1){
					System.out.print("*");
				}else
					if(j>= n-1-i && j <= n-1+i){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			System.out.println();
		}
	}
	public static void main(String[]args){
		System.out.print("Please enter your number: ");
		int n = Integer.parseInt(new Scanner(System.in).nextLine());
		getResultProcess(n);
	}
}
