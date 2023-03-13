package my_own_practice;

public class Runner {

	public static void main(String[] args) {
		
		String [][] arr = {{"ID","Name","Action"}, 
				           {"11","test2","View/Edit"},
				           {"12","test3","View/Edit"},
				           {"13","test2","View/Edit"}};
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++) {
				if(arr[i][j].equals("13")) {
					System.out.println(arr[i][j]);
				}
			}			
		}System.out.println("---------------------------------------------------------------------------------------");
		
		
			
	 String str = "lolojon";
	 String rev = "";
	 for(int i = str.length()-1; i>=0; i--) {
		 rev += str.charAt(i);
	 }System.out.println(rev);
	 
	}

}
