// anagram pgm by amit



class StringAnagram 
{
	public static void main(String...ar)
	{
		String s1="amit";
		String s2="mait";
		String t="";
		if(s1.length()==s2.length()){
		
		for(int i=0;i<s1.length();i++){
		for(int j=0;j<s2.length();j++){
		if(s1.charAt(i)==(s2.charAt(j))){
		
		t=t+s2.charAt(j);
		
		}
		}
		
		}
		}else{
		System.out.println("not Anagram");
		}
		
			if(t.equals(s1)){
				
				System.out.println(" Anagram");
			}else System.out.println("not Anagram");
		
	}
}