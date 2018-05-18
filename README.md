# SubmarineCables (Jude Grodesky, Isaac Jon, Kyle Tau)

## Heap Todo
~~0. Constructor~~
~~1. isEmpty()~~
~~2. add()~~
~~3. minChildPos()~~
~~4. peekMin() and removeMin()~~
~~5. toString()~~

## Our PriorityQueue
We decided to follow the API guidelines and their descriptions of the runtimes of the methods in PriorityQueue. 

### add()
This method appends the new value to the end, running with a runtime of O(1).
### isEmpty()
This method returns if the size of the ArrayList is equal to 0, running with a runtime of O(1).
### peekMin()
This method iterates through the ArrayList and returns the least value, running with a runtime of O(n).
### removeMin()
This method finds the mimimum value, stores its index, removes the value, then returns the value, running with a runtime of O(n).
