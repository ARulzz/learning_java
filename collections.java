import java.io.*;
import java.util.*;

class Solution {

	static HashSet<Integer> hs = new HashSet<Integer>();
	static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

	public static void main(String args[])throws IOException {
        
        // ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(6000);                   // [6000]
        al.add(1234);                   // [6000, 1234]
        al.add(0);                      // [6000, 1234, 0]
        al.remove(0);                   // [1234, 0]
        al.remove(new Integer(0));      // [1234]
        System.out.println(al);
        for(int i : al) System.out.print(i + " ");
        System.out.println();

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(3000);
        hs.add(2000);
        hs.add(1);
        System.out.println(hs);
        hs.remove(1);
        System.out.println(hs.contains(1));
        for(int i : hs) System.out.print(i + " ");
        System.out.println();

        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(3000);
        ts.add(2000);
        ts.add(1);
        System.out.println(ts);
        ts.remove(1);
        System.out.println(ts.contains(1));
        for(int i : ts) System.out.print(i + " ");
        System.out.println();

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(7, "Hi");
        hm.put(5, "Hello");
        hm.put(9, "Hey");
        System.out.println(hm);
        System.out.println(hm.keySet());
        hm.remove(9);
        System.out.println(hm.containsKey(9));
        for(int i : hm.keySet()) System.out.println(i + " " + hm.get(i));
        System.out.println();

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(7, "Hi");
        tm.put(5, "Hello");
        tm.put(9, "Hey");
        System.out.println(tm);
        System.out.println(tm.keySet());
        tm.remove(9);
        System.out.println(tm.containsKey(9));
        for(int i : tm.keySet()) System.out.println(i + " " + tm.get(i));
        System.out.println();

        Stack<Integer> s = new Stack<Integer>();
        System.out.println(s);
        s.push(1);
        System.out.println(s);
        s.push(2);
        System.out.println(s);
        s.push(3);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.size());

        Queue<Integer> q = new LinkedList<Integer>();
        System.out.println(q);
        q.add(1);
        System.out.println(q);
        q.add(2);
        System.out.println(q);
        q.add(3);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.size());

	}
}
