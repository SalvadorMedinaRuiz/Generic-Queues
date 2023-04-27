

//***********************************************************
// LinkedQueue.java
// A linked-list implementation of the classic FIFO queue interface.
//***********************************************************
public class LinkedQueue<E> implements QueueADT<E>
{
	private Node<E> front, back;
	private int numElements;

	//---------------------------------------------
	// Constructor; initializes the front and back pointers
	// and the number of elements.
	//---------------------------------------------
	public LinkedQueue()
	{
		front = null;
		back = null;
		numElements = 0;
	}

	//---------------------------------------------
	// Puts item on end of queue.
	//---------------------------------------------
	public void enqueue(E item)
	{
		Node<E> newNode = new Node<>(item); 

	    if (back == null) {
	      front = back = newNode; 
	    }
	    else {
	      back.next = newNode; 
	      back = newNode; 
	    }

	    numElements++; 
	}

	//---------------------------------------------
	// Removes and returns object from front of queue.
	//---------------------------------------------
	public E dequeue() {
		if (numElements == 0) {
			return null;
		} else {
			E temp = front.element;
			front = front.next;
			numElements--;
			if (front == null) {
				back = null;
			}
			return temp;
		}
	}

	//---------------------------------------------
	// Returns true if queue is empty.
	//---------------------------------------------
	public boolean isEmpty()
	{
		if(numElements==0) {
			return true;
		}
		else {
			return false;
		}
	}

	//---------------------------------------------
	// Returns true if queue is full, but it never is.
	//---------------------------------------------
	public boolean isFull()
	{
		return false;

	}

	//---------------------------------------------
	// Returns the number of elements in the queue.
	//---------------------------------------------
	public int size()
	{
		return numElements;

	}

	//---------------------------------------------
	// Returns a string containing the elements of the queue
	// from first to last
	//---------------------------------------------
	public String toString()
	{
		String result = "\n";
		Node<E> temp = front;
		while (temp != null)
		{
			result += temp.getElement() + "\n";
			temp = temp.getNext();
		}
		return result;
	}
}