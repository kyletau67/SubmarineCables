/*
Jude Grodesky, Jerry Ye
APCS2 pd02
HW46 -- Arrr, There Be Priorities Here Matey
2018-05-10r
*/

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{ 

  ArrayList<String> _data;
  public ArrayPriorityQueue(){
    _data = new ArrayList<String>(); 
  }
  public boolean isEmpty(){
    return _data.size() == 0;
  }
  public void add(String x){
    _data.add(x);
  }
  public String peekMin(){
      if(isEmpty()){return null;}
    String min = _data.get(0);
    for (String a: _data){
      if (a.compareTo(min) < 1){
        min = a;
      }
    }
    return min;
  }
  public String removeMin(){
      if(isEmpty()){return null;}      
    String min = _data.get(0);
    int minIndex = 0;
    for (int i = 1; i < _data.size(); i++){
      String a = _data.get(i);
      if (a.compareTo(min)< 1){
        min = a;
        minIndex = i;
      }
    }
    _data.remove(minIndex);
    return min;
  }
  public static void main(String[] args){
    ArrayPriorityQueue apq = new ArrayPriorityQueue();

    apq.add("a");
    apq.add("b");
    apq.add("c");

    System.out.println(apq.peekMin()); //a

    System.out.println(apq.removeMin()); //a
    System.out.println(apq.removeMin()); //b
    System.out.println(apq.removeMin()); //c
  }
}
