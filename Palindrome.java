package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="madam";
char[] ch=s.toCharArray();
int lastIndex=ch.length-1;
for(int i=0;i< (ch.length/2);i++)
{
	if(ch[i]==ch[lastIndex])

	{
		System.out.println("The given word is Not palindrome");
		break;
	}
lastIndex=lastIndex-1;
}

	
	}

}
