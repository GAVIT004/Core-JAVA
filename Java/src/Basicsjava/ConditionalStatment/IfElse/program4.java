package Basicsjava.ConditionalStatment.IfElse;

class UppercaseOrLowercase{
	public static void main(String[]args){
		char ch='a';
		if(ch>='a' && ch<='z'){
			System.out.println(ch +"is Lowwercase");
		}else if(ch>='A' && ch<='Z'){
			System.out.println(ch +"is Uppercase");
		}else{
			System.out.println("Ivalid Input");
		}
	}
}
