package week1.day2;

public class ChangeOddIntexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] ch=test.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(ch[i]);
			
			}
			else
			{
				String s=Character.toString(ch[i]);
				System.out.println(s.toUpperCase());
			}
		
		
		}
		
		

	}

}
