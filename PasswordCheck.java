
import java.util.*;

public class PasswordCheck {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter The Password : ");
//		String pass = sc.nextLine();
		Password pass = new Password();
		char[] ch = {'k','S','r',' ','4','9','$'};
		int n = ch.length;
		int min = 5;
		System.out.println(pass.show(ch,n,min));
	}
}
class Password{
	public String show(char[] str,int n,int min){

		if(n < min){
			return "InValid";
		}
		if(str[0] >= 48 && str[0] <= 57){
			return "InValid";
		}
		int a = 0,cp = 0,num = 0;
		while(a < n){
			if(str[a] == ' ' || str[a] == '+'){
				return "InValid";
			}
			if(str[a] >= 'A' && str[a] <= 'Z'){
				cp++;
			}
			else if(str[a] >= 48 && str[a] <= 57){
				num++;
			}
			a++;
		}
		if(cp > 0 && num > 0){
			return "Valid";
		}
		else {
			return "InValid";
		}
	}
}
