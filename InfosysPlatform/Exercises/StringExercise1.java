class StringExercise1{
    public static String removeWhiteSpaces(String str){
        return str.replace(" ","");
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}