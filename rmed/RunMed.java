import java.util.NoSuchElementException;

public class RunMed {
    //inst vars
    ALHeapMax lilVals;
    ALHeapMin bigVals;

    //Constructor
    public RunMed() {
	lilVals = new ALHeapMax();
	bigVals = new ALHeapMin(); //min heap holds greater half
    }

    //getMedian
    public int getMedian() {
	if (lilVals.size() == 0 && bigVals.size() == 0) {
	    throw new NoSuchElementException(); } //no roots
	else if (lilVals.size() == bigVals.size()) {
	    return lilVals.peekMax() + bigVals.peekMin() / 2; } //avg of roots
	else { //return root of bigger heap
	    if (lilVals.size() > bigVals.size()) {
		return lilVals.peekMax(); } 
	    else {
		return bigVals.peekMin(); }
	}
    }
}
