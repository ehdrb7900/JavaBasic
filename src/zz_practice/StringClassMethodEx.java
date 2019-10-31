package zz_practice;

public class StringClassMethodEx {
	
		
	public static void main(String[] args) {
		// String(String s)
		String s1 = new String("Hello");
		System.out.println("s1 = " + s1);
		System.out.println();
		
		// String(char[] value)
		char[] c1 = {'H','e','l','l','o'};
		String s2 = new String(c1);
		System.out.println("s2 = " + s2);
		System.out.println();
		
		// String(StringBuffer buf)
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.println("s3 = " + s3);
		System.out.println();
		
		// char charAt(int index)
		String s4 = "Hello";
		String n = "0123456";
		char c2 = s4.charAt(1); 
		char c3 = n.charAt(1); 
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println();
		
		// int compareTo(String str)
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println("i = " + i);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println();
		
		// String concat(String str)
		String s5 = "Hello";
		String s6 = s5.concat(" World");
		System.out.println("s6 = " + s6);
		System.out.println();
		
		// boolean contains(CharSequence s)
		String s7 = "abcdefg";
		boolean b = s7.contains("bc");
		System.out.println("b = " + b);
		System.out.println();
		
		// boolean endsWith (String suffix)
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");
		System.out.println("b2 = " + b2);
		System.out.println();
		
		// boolean equals(Object obj)
		String s8 = "Hello";
		boolean b3 = s8.equals("Hello");
		boolean b4 = s8.equals("hello");
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		System.out.println();
		
		// boolean equalsIgnoreCase(String str)
		String s9 = "Hello";
		boolean b5 = s9.equalsIgnoreCase("HELLO");
		boolean b6 = s9.equalsIgnoreCase("heLLo");
		System.out.println("b5 = " + b5);
		System.out.println("b6 = " + b6);
		System.out.println();
		
		// int indexOf(int ch)
		String s10 = "Hello";
		int idx1 = s10.indexOf('o');
		int idx2 = s10.indexOf('k');
		System.out.println("idx1 = " + idx1);
		System.out.println("idx2 = " + idx2);
		System.out.println();
		
		// int indexOf(int ch, int pos)
		String s11 = "Hello";
		int idx3 = s11.indexOf('e', 0);
		int idx4 = s11.indexOf('e', 2);
		System.out.println("idx3 = " + idx3);
		System.out.println("idx4 = " + idx4);
		System.out.println();
		
		// int indexOf(String str)
		String s12 = "ABCDEFG";
		int idx5 = s12.indexOf("CD");
		System.out.println("idx5 = " + idx5);
		System.out.println();
		
		// String intern()
		String s13 = new String("abc");
		String s14 = new String("abc");
		boolean b7 = (s13==s14);
		boolean b8 = s13.equals(s14);
		boolean b9 = (s13.intern()==s14.intern());
		System.out.println("b7 = " + b7);
		System.out.println("b8 = " + b8);
		System.out.println("b9 = " + b9);
		System.out.println();
		
		// int lastIndexOf(int ch)
		String s15 = "java.lang.Object";
		int idx6 = s15.lastIndexOf('.');
		int idx7 = s15.indexOf('.');
		System.out.println("idx6 = " + idx6);
		System.out.println("idx7 = " + idx7);
		System.out.println();
		
		// int lastIndexOf(String str)
		String s16 = "java.lang.java";
		int idx8 = s16.lastIndexOf("java");
		int idx9 = s16.indexOf("java");
		System.out.println("idx8 = " + idx8);
		System.out.println("idx9 = " + idx9);
		System.out.println();
		
		// int length()
		String s17 = "Hello";
		int length = s17.length();
		System.out.println("length = " + length);
		System.out.println();
		
		// String replace(char old, char nw) 
		String s18 = "Hello";
		String s19 = s18.replace('H','C');
		System.out.println("s19 = " + s19);
		System.out.println();
		
		// String replace(CharSequence old, CharSequence nw)
		String s20 = "Hellollo";
		String s21 = s20.replace("ll","LL");
		System.out.println("s21 = " + s21);
		System.out.println();
		
		// String replaceAll(String regex, String replacement)
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");
		System.out.println("r = " + r);
		System.out.println();
		
		// String replaceFirst(String regex, String replacement)
		String ab2 = "AABBAABB";
		String r2 = ab.replaceFirst("BB", "bb");
		System.out.println("r2 = " + r2);
		System.out.println();
		
		// String[] split(String regex)
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println();
		
		// String[] split(String regex, int limit)
		String animals2 = "dog,cat,bear";
		String[] arr2 = animals2.split(",",2);
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]);
		System.out.println();
		
		// boolean startsWith(String prefix)
		String s22 = "java.lang.Object";
		boolean b10 = s22.startsWith("java");
		boolean b11 = s22.startsWith("lang");
		System.out.println("b10 = " + b10);
		System.out.println("b11 = " + b11);
		System.out.println();
		
		// String substring(int begin) 
		// String substring(int begin, int end)
		String s23 = "java.lang.Object";
		String c = s23.substring(10);
		String p = s23.substring(5,9);
		System.out.println("c = " + c);
		System.out.println("p = " + p);
		System.out.println();
		
		// String toLowerCase()
		String s24 = "Hello";
		String s25 = s24.toLowerCase();
		System.out.println("s25 = " + s25);
		System.out.println();
		
		// String toString()
		String s26 = "Hello";
		String s27 = s26.toString();
		System.out.println("s27 = " + s27);
		System.out.println();
		
		// String toUpperCase()
		String s28 = "Hello";
		String s29 = s28.toUpperCase();
		System.out.println("s29 = " + s29);
		System.out.println();
		
		// String trim()
		String s30 = "   Hello World   ";
		String s31 = s30.trim();
		System.out.println("s31 = " + s31);
		System.out.println();
		
		// static String valueOf(boolean b)
		// static String valueOf(char c)
		// static String valueOf(int i)
		// static String valueOf(long l)
		// static String valueOf(float f)
		// static String valueOf(double d)
		// static String valueOf(Object o)
		String b12 = String.valueOf(true);
		String c4 = String.valueOf('a');
		String i4 = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		
		System.out.println("b12 = " + b12);
		System.out.println("c4 = " + c4);
		System.out.println("i4 = " + i4);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("date = " + date);
	}

}
