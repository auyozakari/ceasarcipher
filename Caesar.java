import java.util.Scanner;
public class Caesar {
	
	
		Scanner input = new Scanner (System.in);
		
		private String msg;
		private int key;
		public void setMsg(String emsg){
			msg=emsg;
		}
		public String getMsg(){
			return msg;
		}
		
		public void setKey(int k){
			key=k;
		}
		public int getKey(){
			return key;
		}
		public void cipher(String m,int k){
		String s="";
		int len = getMsg().length();
		
		for(int i=0; i< len; i++){
			char c =(char)(getMsg().charAt(i)+getKey());
	     
			if (c > 'z'){
				s+=(char)(getMsg().charAt(i)-(26-getKey()));
				
			}else if(c < 'a' ) {
				s+=(char)(getMsg().charAt(i)+(26+getKey()));
			}
			
			else{
				s+=(char)(getMsg().charAt(i)+getKey());
			}
		}
		System.out.println(s);
		
		}
		


}
