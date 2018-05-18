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
    public void add(int addend) {

	//Compare the addend to the current median and place it into its repective heap:
	//lilVals for < , bigVals for >

	//Check if there will be a median
	if (lilVals.size() == 0 && bigVals.size() == 0) {
	    lilvals.add(addend);
	}
	else if (addend <= getMedian()){
	    lilVals.add(addend);
	}
	else if (addend > getMedian()){
	    bigVals.add(addend);
	}

	//If heaps are to far apart in size, redistribute to balance
	
	if (lilVals.size() - bigVals.size() > 1){
	    bigVals.add( lilVals.removeMax() );
	}
	else if (bigVals.size() - lilVals.size() > 1){
	    lilVals.add( bigVals.removeMin() );
	}
    }
}
