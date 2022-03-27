package com.CSC161J.ArrayAndLinkList;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import com.CSC161.ArrayAndLinkedList.MyLinkedList;


/**
 * @author downey
 *
 */
public class MyLinkedListTest extends MyArrayListTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		mylist = new MyLinkedList<Integer>();
		mylist.addAll(list);
	}
}