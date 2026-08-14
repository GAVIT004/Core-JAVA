package Basicsjava.ConditionalStatment.IfElse;

class VowelOrConsonant{
	public static void main(String[]args){
		char ch='A';
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println(ch +"is Vowel");
		}else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println(ch +"is Consonant");
		}else{
			System.out.println("Invalid Input Or Is Not Alphabate");
		}
	}
}
