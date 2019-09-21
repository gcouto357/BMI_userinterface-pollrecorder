

import java.util.Scanner;

public class couto_p3_poll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int [][] userRating = new int[5][10];
		int [][] recordRating = new int [5][10];
		int [] pointTotal = new int[5];
		int [] actpointTotal = new int[5];
		String[] userTopics = {"Destiny","Halo","Raft","Overwatch","Anthem"};
		int i,j,k,a,h,z,b,x,max,minPoint,maxPoint,min,response,numPeople;
		System.out.println("How many people are participating in the poll?");
		numPeople = scnr.nextInt();

		//recording user input
		for(i=0;i<numPeople;++i) {
			for(j=0;j<5;++j) {
				System.out.println("How would you rate " + userTopics[j] + " from 1 out of 10?");
				response = scnr.nextInt();
				recordRating[j][i] = response;
				userRating[j][response - 1]++;
			}
			System.out.println("Thank you for participating.The next person may continue the poll. ");

		}
		 
		//finding total and average
		for(z=0;z<5;++z) {
			for(x=0;x<10;++x){
                pointTotal[z] += recordRating[z][x];
                actpointTotal[z] = pointTotal[z]; 
			}
			pointTotal[z] /= numPeople;
		}
		
	
		//declaring min max
		min = pointTotal[0];
		max = pointTotal[0];
		maxPoint = 0;
		minPoint = 0;
		
		//finding max
		for(a=0;a<5;++a) { 
		      if(pointTotal[a] > max){ 
		         max = pointTotal[a]; 
		         maxPoint = a;
		      }
		}
		
		//finding min
		for(b=0;b<5;++b) { 
		      if(pointTotal[b] < min){ 
		         min = pointTotal[b]; 
		         minPoint = b;
		      }
		}

		//printing table top
		System.out.println("__________________________________________________________________________________");
        System.out.printf("%10s %3s %3s %3s %3s %3s %3s %3s %3s %3s %3s %8s", "Topics", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Average");
        System.out.println("");
        System.out.println("__________________________________________________________________________________");
		
        //printing the results
		for(k=0;k<5;++k) {
			System.out.printf("%10s",userTopics[k]);
				for(h=0;h<10;++h) {
					System.out.print(" ");
					System.out.printf("%3d",userRating[k][h]);
				}
			System.out.printf("%3d",pointTotal[k]);
			System.out.println("");
		}
		//printing min-max
		System.out.println("");
		System.out.println(userTopics[maxPoint] + " recieved the highest point total with " + actpointTotal[maxPoint] + " points.");
		System.out.println(userTopics[minPoint] + " recieved the lowest point total with " + actpointTotal[minPoint] + " points.");

	}

}
