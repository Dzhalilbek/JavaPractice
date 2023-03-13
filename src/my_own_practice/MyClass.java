package my_own_practice;

import java.util.Scanner;

public class MyClass {	
	
	private static final String Yesterday  = null;

	public static void main(String[] args) {
		
/*int n = 10;
        for (int i = 1; i < n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
 */
		
		
//      12    16    32    99    99
//      25    75    18    35    6
//      16    67    28    58    68
//      70    92    62    40    80
//      14    37    36    24    83
//      25    58    12    66    4
//      56    80    25    54    80
//      66    61    73    19    15
//      33    48    86    64    30
//      8    87    22    84    7
		/*
		int[][] num = new int [10][5];
		num [0][0] = 12;
		num [0][1] = 16;
		num [0][2] = 32;
		num [0][3] = 99;
		num [0][4] = 99;
		
		num [1][0] = 25;
		num [1][1] = 75;
		num [1][2] = 18;
		num [1][3] = 35;
		num [1][4] = 6;
		
		num[2][0] = 16;
	    num[2][1] = 67;
	    num[2][2] = 28;
	    num[2][3] = 58;
	    num[2][4] = 68;

	    num[3][0] = 70; 
	    num[3][1] = 92;
	    num[3][2] = 62;
	    num[3][3] = 40;
	    num[3][4] = 80;
       
	    num[4][0] = 14; 
	    num[4][1] = 37;
	    num[4][2] = 36;
	    num[4][3] = 24;
	    num[4][4] = 83;
	   
	    num[5][0] = 25; 
	    num[5][1] = 58;
	    num[5][2] = 12;
	    num[5][3] = 66;
	    num[5][4] = 4;
       
	    num[6][0] = 56; 
	    num[6][1] = 80;
	    num[6][2] = 25;
	    num[6][3] = 54;
	    num[6][4] = 80;
       
	    num[7][0] = 66; 
	    num[7][1] = 61;
	    num[7][2] = 73;
	    num[7][3] = 19;
	    num[7][4] = 15;
       
	    num[8][0] = 33; 
	    num[8][1] = 48;
	    num[8][2] = 86;
	    num[8][3] = 64;
	    num[8][4] = 30;
       
	    num[9][0] = 8; 
	    num[9][1] = 87;
	    num[9][2] = 22;
	    num[9][3] = 84;
	    num[9][4] = 7;
       
	    
	    for(int row = 0; row < num.length; row++) {
		for (int col = 0; col < num[row].length; col++) {
	    	System.out.print(num[row][col] + "\t");
	    }System.out.println();
	    }*/
	    
	    
	    
	        /*System.out.println("\n--------------------------");
	        // outer loop is going through all of the rows
	        for (int row = 0; row < num.length; row++) {
	            // inner loop is going through all of the columns of that row
	            for (int col = 0; col < num[row].length; col++) {
	                
	                System.out.print(num[row][col] + "\t");
	            } // end of each row
	            
	            System.out.println(); // << this ln will take us to the next line after each row is processed
	        }

	        System.out.println("\n--------------------------");
*/
       
        
       

		   // Q1
     // *
     // * *
     // * * *
     // * * * *
		
	for(int i = 0; i < 10; i++) {
		for(int j = 0; j < i; j++) {
			System.out.print(" * ");
		} 
		System.out.println();
	}
		System.out.println("-----------------------------------------------");
		// Q2
        // * * * *
        // * * *
        // * *
        // *
		
		for(int i = 1; i < 10; i++ ) {
			for(int j = 10; j > i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
		 // Q3
        //       * 
        //     * * 
        //   * * *
        // * * * *
		
	int n = 10;
	for (int i = 1; i < n; i++) {
		for (int j = n; j >= i; j--) {
			System.out.print("  ");
		
		
		}for(int j = 0; j < i; j++) {
			System.out.print(" *");
		}System.out.println();
	}
	
	System.out.println("---------------------------------------------------------");
		

    // Q4
    // * * * *
    //   * * *
    //     * *
    //       *
	int x = 11;
	for(int i = 2; i < 11; i++) {
		for(int j = 0; j < i; j++) {
			System.out.print("  ");
		}
		for(int j = x; j > i; j--) {
			System.out.print(" *");
			
		}System.out.println();
		}
		System.out.println("-------------------------------------------");
	

        // Q5
        //       *
        //     * * *
        //   * * * * *
        // * * * * * * *
        //   * * * * *
        //     * * *
        //       *
		
		for(int i = 1; i < 10; i++) {
			for(int j = 10; j > i; j--) {
				System.out.print("  ");
			} 
			for(int j = 0; j < i; j++) {
				System.out.print(" *  ");
			}
			System.out.println();
		}
		for(int i = 2; i < 10; i++) {
			for(int j = 0; j < i; j++ ) {
				System.out.print("  ");
			}
			for(int j = 10; j > i; j--) {
				System.out.print(" *  ");
			}System.out.println();
		}
		
		System.out.println("--------    ADITIONAL MY WORK   -----------");
		
		// **********
		// **********
		// **********
		// **********
		
		int a = 4;
		int b = 10;
		for(int i = 0; i < a; i++) {			
		 for(int j = b; j > 0; j--) {			 
		 System.out.print(" *");
		 }System.out.println();
		 
		 }
		System.out.println("-------------------------------------------------");
		
		
		//*
		//**
		//***
		//****
		//*****
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}System.out.println();
		}
		System.out.println("--------------------------------------------------");
		
		//    *
	    //   **
	    //  ***
	    // ****
	    //*****
		
		for(int i = 1; i < 6; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print("  ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------");
		
		//   *
	    //  ***
	    // *****
	    //*******
	   //*********
		
		for (int i = 1; i <= 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				if(j == 0) {
				System.out.print("*");
				}else if(j < i && j > 0) {
					System.out.print(" * *");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------");
		  // 1
	     // 222
	    // 33333
	   // 4444444
	  // 555555555
		
		for (int i = 1; i <= 5; i++) {
			for(int j = 10; i > 5; j--) {
				System.out.print("  ");
			}
			for(int j = i; j == i; j++ ) {
				
				}
			}System.out.println();
			
		
				
				
				
				
				int[] l = {1,2,5,6,8,9,10,45,99,55,62,48,25,};
					int largest = l[0];
					int min = l[0];
				for(int i = 0; i < l.length; i ++) {
									
						if( l[i]> largest) { 
							largest = l[i];
					}
					}System.out.println("largerst number is " + largest);
						
					for(int i = 0; i < l.length; i++) {
						
						if(l[i]< min) {
							min = l[i];
						}
					}System.out.println("Smallest number is: " + min);
					
				
					
			}
	
		
		 }
		
	 
		
	

	
				
				
				
	
			

