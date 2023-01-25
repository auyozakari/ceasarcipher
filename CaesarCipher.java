import java.util.*;

public class CaesarCipher {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
	Caesar cc = new Caesar();
	
		int i=0,myKey;String myMsg;
		
		
		while (i != 3){
			System.out.println(
					"Enter the your Nummber you wish to do?\n"+
					"1.Encrypt Message\n2.Decrypt Message\n3.Exit"
					);
			i=input.nextInt();
			if (i == 1){
				//Encrypt code goes here
				System.out.println("Enter a message: ");
				myMsg=input.next();
				System.out.println("Enter a key: ");
					myKey=input.nextInt();
					cc.setMsg(myMsg);
				cc.setKey(myKey);
				cc.cipher(myMsg,myKey);
				
			}else if (i == 2){
				//Decrypt code goes here
				System.out.println("Enter a message: ");
				myMsg=input.next();
				System.out.println("Enter a key: ");
					myKey=input.nextInt();
				cc.setMsg(myMsg);
				cc.setKey(-myKey);
				cc.cipher(myMsg,myKey);
			}else if (i > 3 || i==0){
				System.out.println("Wrong Number Try again !!!");
			}else{
				System.out.println("");
			}
		}		
		
		System.out.println ("Thank you, Good Bye!");
	}

}
