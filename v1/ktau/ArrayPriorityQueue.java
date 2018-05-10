/* Kyle Tau
APCS2 pd 2
HW46 -- Arrr, There Be Priorities Here Matey
2018-05-09 */

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
    ArrayList<String> q = new ArrayList<String>();
    public void add (String x) {
	q.add(x); 
    }
    public boolean isEmpty() {
	return q.size() == 0; 
    }
    public String peekMin() {
	String min = "Empty Queue";
	if (!q.isEmpty()) {
	    min = q.get(0);
	    for (int x = 1; x < q.size(); x++) {
		if (q.get(x).compareTo(min) != 0)
		    min = q.get(x); 
	    }}
	return min; 
    }
    public String removeMin() {
	String min = this.peekMin();
	String retStr = "";
	for (int x = 0; x < q.size(); x++) {
	    if (q.get(x).equals(min)) {
		retStr = min;
		q.remove(x);
	    }
	}
	return retStr;
    }
    public static void main(String[] args) {
    }
}
