class Example
{
	public void reverseWordInMyString(String str){
		String[] words = str.split(" ");
		String reverseString="";
		for(int i=0;i<words.length;i++){
			String word = words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--){
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord+" ";
		}
		System.out.println(str);
		System.out.println(reverseString);
	}
	public static void main(String[] args){
		Example obj = new Example();
		obj.reverseWordInMyString("Welcome to Begineers Book");
		obj.reverseWordInMyString("This is an easy Java Program");
	}
}