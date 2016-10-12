// Mohammed Raza

import java.util.*;

public class LinkedListDemo
{
	static Scanner keyboard = new Scanner(System.in);

	public static LinearLinkedList getList()
	{
		final String SENTINEL = "-999";

		LinearLinkedList list = new LinearLinkedList();

		System.out.println("enter list of words, terminate with " + SENTINEL);

		String word;
		word = keyboard.next();

		while(!(word.equals(SENTINEL)))
		{
			list.addLast(word);

			word = keyboard.next();
		}

		return list;
	}

	public static boolean search(LinearLinkedList list, Object key)
	{
		ListNode current = list.getFirstNode();

		while (current != null)
		{
			if (current.getValue().equals(key))
				return true;
			current = current.getNext();
		}
		return false;
	}

	public static void main(String[] args)
	{
		LinearLinkedList list = getList();

		System.out.print("list is: ");
		System.out.println(list);


		String first = (String) list.removeFirst();
		System.out.println("First element: " + first);

		String last = (String) list.removeLast();
		System.out.println("Last element: " + last);

		System.out.print("list is: ");
		System.out.println(list);

		System.out.print("enter key word for search: ");
		String key;
		key = keyboard.next();

		if(search(list, key))
			System.out.println(key + " is in the list");
		else
			System.out.println(key + " is not in the list");
		}

	}
