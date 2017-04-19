public class Replace{

	public static<E> void remove(Queue<E> q, E oldValue, E newValue){
		Queue<Integer> temp = new ArrayQueue<Integer>(q.size());
		while (!q.empty()){
			if(q.front().equals(newValue))	{
				q.dequeue();
				temp.enqueue(newValue);
			}
			else temp.enqueue(q.dequeue());
		}
		q = temp;
	}
