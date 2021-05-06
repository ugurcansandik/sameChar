public class Main
{
	public static void main(String[] args)
	{
		char[] vowels1 = new char[4];
		char[] vowels2 = new char[4];
		randomVowels(vowels1);
		randomVowels(vowels2);
		System.out.print("Vowels 1 = { ");
		printVowels(vowels1);
		System.out.print("}\nVowels 2 = { ");
		printVowels(vowels2);
		System.out.print("}\nSame Vowels = ");
		compare(vowels1, vowels2);
	}
	
	public static void randomVowels(char[] vowels)
	{
	    char[] vowelsRandom = new char[5];
	    int randomNumber;
	    vowelsRandom[0] = 'a';
	    vowelsRandom[1] = 'e';
	    vowelsRandom[2] = 'i';
	    vowelsRandom[3] = 'o';
	    vowelsRandom[4] = 'u';
	    for (int i = 0 ; i < 4 ; i++ )
	    {
	        randomNumber = (int)(Math.random() * 5);
	        vowels[i] = vowelsRandom[randomNumber];
	    }
	}
	
	public static void printVowels(char[] vowels)
	{
	    for (int i = 0 ; i < 4 ; i++ )
	    {
	        System.out.print(vowels[i] + " ");
	    }
	}
	
	public static void compare(char[] vowels1, char[] vowels2)
	{
	    String temp = "";
	    char sameChar;
	    int control = 1;
	    for (int i = 0 ; i < 4 ; i++ )
	    {
	        for (int j = 0 ; i < 4 ; i++ )
	        {
	            if (vowels1[i] == vowels2[j])
	            {
	                sameChar = vowels2[j];
	                for (int k = 0 ; k < temp.length() ; k++ )
	                {
	                    if (sameChar == temp.charAt(k))
	                    {
	                        control = 0;
	                    }
	                }
	                if (control == 1)
	                    {
	                        temp += sameChar;
	                    }
                    control = 1;
	            }
	        }
	    }
	    System.out.print(temp);
	}
}
