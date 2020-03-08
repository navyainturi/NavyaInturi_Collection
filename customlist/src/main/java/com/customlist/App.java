package com.customlist;


	public class App{
		public static void main(String[] args) 
	    {
	        Datalist<Integer> list = new Datalist<Integer>();
	 
	        //Add elements
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        System.out.println("The list elements are :");
	        System.out.println(list);
	         
	        //Remove elements from index
	        list.remove(2);
	        System.out.println("List after removing element at index 2 : ");
	        System.out.println(list);
	         
	        //Get element with index
	        System.out.println("Getting the elemtent from the list at index 0 : "+ list.get(0) );
	        System.out.println("Getting the elemtent from the list at index 1 : "+ list.get(1) );
	 
	        //List Size
	        System.out.println("Size of list is : "+list.size());
	    }
	}
