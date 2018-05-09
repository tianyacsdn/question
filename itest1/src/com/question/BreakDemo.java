package com.question;

public class BreakDemo {

	public static void main(String[] args) {
		ok:
		    for(int i=0;i<10;i++)    {
		        for(int j=0;j<10;j++)  {
		            System.out.println("i=" + i + ",j=" + j);
		            if(j == 5) break ok;
		        }
		    } 
		for(int i=0;i<4;i++){
		                for(int j=0;j<5;j++){
		                    System.out.println("i="+i+"; j="+j);
		                    if(j==3){
		                        i=4;
		                        break;
		                    }
		                }
		            }
		System.out.println("-----------------");
		//方法二：
		int arr[][] = {{1,2,3},{4,5,6,7},{9}};
		boolean found = false;
		for(int i=0;i<arr.length && !found;i++)    {
		        for(int j=0;j<arr[i].length;j++){
		            System.out.println("i=" + i + ",j=" + j);
		            if(arr[i][j]  == 5) {
		                found = true;
		                break;
		            }
		        }
		    }
	}

}
