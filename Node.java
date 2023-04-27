//************************************************************
// Node.java
// A general node for a singly linked list of objects.
//************************************************************
public class Node<E>
{
	public Node<E> next;
	public E element;

	//------------------------------------------------------
	// Creates an empty node
	//------------------------------------------------------
	public Node()
	{
		next = null;
		element = null;
	}

	//------------------------------------------------------
	// Creates a node storing a specified element
	//------------------------------------------------------
	public Node(E element)
	{
		next = null;
		this.element = element;
	}

	//------------------------------------------------------
	// Returns the node that follows this one
	//------------------------------------------------------
	public Node<E> getNext()
	{
		return next;
	}

	//------------------------------------------------------
	// Sets the node that follows this one
	//------------------------------------------------------
	public void setNext(Node<E> node)
	{
		next = node;
	}

	//------------------------------------------------------
	// Returns the element stored in this node
	//------------------------------------------------------
	public E getElement()
	{
		return element;
	}

	//------------------------------------------------------
	// Sets the element stored in this node
	//------------------------------------------------------
	public void setElement(E element)
	{
		this.element = element;
	}
}