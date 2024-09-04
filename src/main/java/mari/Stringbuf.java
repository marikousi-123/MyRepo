package mari;

public class Stringbuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuffer sb=new StringBuffer("Hello");
//		sb.append(" World");
//		System.out.println(sb);
		
		StringBuffer ss=new StringBuffer("Hello ");
		ss.insert(4, "Java");
		System.out.println(ss);
		
		
		StringBuffer st=new StringBuffer("Hello");
		st.replace(0, 2, "Java");
		System.out.println(st);
		
		StringBuffer sa=new StringBuffer("Hello");
		sa.delete(1, 3);
		System.out.println(sa);
		
		StringBuffer sl=new StringBuffer("Hello");
		sl.reverse();
        System.out.println(sl);
	}

}
