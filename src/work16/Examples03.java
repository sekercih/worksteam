package work16;

public class Examples03 {

	public static void main(String[] args) {
		// 
        //verilen stringi karakter dizisine donusturun hangi indexte hangi eleman var
        String str="Welcome to Java Programming";
        
        
       indexBulma(str);
	}  
	
	
        public static char[] indexBulma(String str) {
        	
        char arr[]=str.toCharArray();  ///w,e,l...
        
        for (int i = 0; i < arr.length; i++) {
			System.out.println("index  ["+i+"] = " + arr[i]);  
		}
        	
			return arr;
        }}