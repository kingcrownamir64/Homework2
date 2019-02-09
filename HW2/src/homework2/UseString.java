package homework2;

public class UseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Sample = " I love Java. ";
		String Sample2 = "I love Selenium.";
		String Sample3 = "";
		String[] array;
	
		
		System.out.println(Sample.toUpperCase());
		System.out.println(Sample.toLowerCase());
		System.out.println(Sample.charAt(3));
		System.out.println(Sample.hashCode());
		System.out.println(Sample.compareTo(Sample2));
		System.out.println(Sample.startsWith("a"));
		System.out.println(Sample.replace("a","b"));
		System.out.println(Sample.length());
		System.out.println(Sample.trim());
		System.out.println(Sample.getBytes());
		System.out.println(Sample.equals(Sample2));
		System.out.println(Sample.indexOf("a"));
		System.out.println(Sample.intern());
		System.out.println(Sample.lastIndexOf("a"));
		System.out.println(Sample.endsWith("v"));
		System.out.println(Sample3.isEmpty());
		System.out.println(Sample.split("a"));
		System.out.println(Sample.subSequence(3,7));
		System.out.println(Sample.toString());
		System.out.println(Sample.equalsIgnoreCase(Sample2));
		System.out.println(Sample + Sample2);
		System.out.println(Sample.substring(4,8));
		System.out.println(Sample2.valueOf(8));
		System.out.println(Sample2 + Sample);
		System.out.println(Sample.replaceFirst("a", "h"));
		System.out.println(Sample.replaceAll("J", "h"));
		System.out.println(Sample.concat(" " +Sample));
		System.out.println(Sample2.startsWith("y"));
		System.out.println(Sample2.getBytes());
		System.out.println(Sample2.charAt(6));
	}

}
