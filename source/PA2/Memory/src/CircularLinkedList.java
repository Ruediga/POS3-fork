import java.util.Objects;

class CircularLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	public CircularLinkedList() {
		head = null;
		tail = null;
	}

	// Inserting a node at the end of the list
	public void append(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		tail.next = head;
	}

	// Inserting a node at the beginning of the list
	public void prepend(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = head;
		tail.next = newNode;
		head = newNode;
	}

	// Deleting a node with specific value
	public void delete(T data) {
		if (head == null) return;

		Node<T> current = head;
		Node<T> prev = null;

		// If head node itself holds the data to be deleted
		if (Objects.equals(head.data, data)) {
			head = head.next;
			tail.next = head;
			return;
		}

		// Searching for the data to be deleted
		while (!Objects.equals(current.data, data)) {
			if (current.next == head) return;
			prev = current;
			current = current.next;
		}

		if (prev != null) {
			prev.next = current.next;
		}
	}

	// Displaying the circular linked list
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node<T> temp = head;
		do {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		} while (temp != head);

		System.out.println("HEAD");
	}

	public static void main(String[] args) {
		CircularLinkedList<Integer> cll = new CircularLinkedList<>();

		cll.append(10);
		cll.append(20);
		cll.append(30);
		cll.prepend(5);

		cll.display();  // 5 -> 10 -> 20 -> 30 -> HEAD

		cll.delete(20);
		cll.display();  // 5 -> 10 -> 30 -> HEAD
	}
}