public class StringMethods {
    public static void main(String args[]) {

		// length()
		String str = "Welcome";
		System.out.println(str.length());

		// concat()
		String s = "Hello";
		s.concat(" World");
		System.out.println(s);
		// s is still "Hello"
		// String objects are immutable which means they cannot be changed
		// Here, when we concat the two strings a new string object gets created

		String s1 = s.concat("World");
		System.out.println(s1);

		// + operator can also be used for string concatenation
		String fname = "Jack";
		String lname = "Black";
		System.out.println(fname + " " + lname);

		// equals()
		System.out.println(s.equals("Hello"));

		// equals compares only the values of the strings
		String s2 = new String("Hello");
		System.out.println(s.equals(s2));

		// == compares the object reference and will return false in the below
		// case
		System.out.println(s == s2);

		// equalsIgnoreCase()
		System.out.println(s.equalsIgnoreCase("hello"));

		// toLowerCase() and toUpperCase()
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		// substring()
		String subs = "Learning is fun";
		System.out.println(subs.substring(4, 8));
		System.out.println(subs.substring(4));

		// charAt()
		System.out.println(subs.charAt(10));

		// contains()
		System.out.println(subs.contains("is"));

		// replace()
		System.out.println(subs.replace('i', 'k'));
	}
}
