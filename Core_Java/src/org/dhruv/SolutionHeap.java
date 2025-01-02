package org.dhruv;

import java.util.Scanner;

public class SolutionHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity = 100;

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];

		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();

		}
		in.close();
		printMedian(a);



		/*		MaxHeap m = new MaxHeap(10);
		m.insert(10);
		m.insert(37);

		m.insert(15);
		m.insert(5);

		m.insert(8);
		m.insert(43);

		//m.removeMax();
		m.print();

		m.insert(4);
		m.insert(96);

		m.insert(6);
		m.print();

		m.removeMax();
		m.print();
		System.out.println(m.getSize());*/
	}
	static MaxHeap left;
	static MinHeap right;
	static void printMedian(int[] array)
	{
		int len = array.length;
		left = new MaxHeap((len/2)+1);
		right = new MinHeap((len/2)+1);
		float median = 0;
		for(int i = 0; i < len;i++)
		{



			median = getMedian(array[i],median,left,right);
			System.out.println(median);
			/*System.out.print("MaxHeap : ");
			left.print();
			System.out.print("MinHeap : ");
			right.print();*/
		}
	}

	static float getMedian(int val,float median,MaxHeap left,MinHeap right)
	{
		if(left.getSize() == right.getSize())
		{
			if((float)val > median)
			{
				right.insert(val);
				median = (float)right.getMin();
			}
			else
			{
				left.insert(val);
				median = (float)left.getMax();
			}
		}
		else if(right.getSize() > left.getSize())
		{
			if((float)val > median)
			{
				left.insert(right.removeMin());
				right.insert(val);
			}
			else
			{
				left.insert(val);
			}
			median = (float)(left.getMax()+right.getMin())/2;
		}
		else if(left.getSize() > right.getSize())
		{
			if((float)val < median)
			{
				right.insert(left.removeMax());
				left.insert(val);
			}
			else
			{
				right.insert(val);
			}
			median = (float)(left.getMax()+right.getMin())/2;
		}
		return median;
	}

}


class MinHeap
{
	static int size;
	static int[] array;
	MinHeap(int capacity)
	{
		array = new int[capacity];
		size = 0;
	}

	static int getLeftChildIndex(int i)
	{
		return (i*2) + 1;
	}

	static int getRightChildIndex(int i)
	{
		return (i*2) + 2;
	}

	static int getParentIndex(int i)
	{
		return (i -1)/2;
	}

	static boolean hasLeftChild(int i)
	{
		return (((i*2)+1) < size);
	}

	static boolean hasRightChild(int i)
	{
		return (((i*2)+2) < size);
	}

	static boolean hasParent(int i)
	{
		return (((i-1)/2) >= 0);
	}

	static void heapifyUp()
	{
		int index = size;
		while(hasParent(index) && array[getParentIndex(index)] > array[index])
		{
			int temp = array[getParentIndex(index)];
			array[getParentIndex(index)] = array[index];
			array[index] = temp;
			index = getParentIndex(index);
		}
	}

	static void heapifyDown()
	{
		int index = 0;

		while(hasLeftChild(index))
		{


			int maxValueIndex = getLeftChildIndex(index);

			if(hasRightChild(index) && array[getRightChildIndex(index)] < array[maxValueIndex])
			{
				maxValueIndex = getRightChildIndex(index);
			}

			if(array[index] > array[maxValueIndex])
			{
				int temp = array[index];
				array[index] = array[maxValueIndex];
				array[maxValueIndex] = temp;
				index = maxValueIndex;
			}
			else
				break;

		}

	}

	void insert(int val)
	{
		array[size] = val;
		heapifyUp();
		size++;

	}

	int removeMin()
	{
		int min = getMin();
		size--;
		array[0] = array[size];
		array[size] = 0;
		heapifyDown();
		return min;
	}

	int getMin()
	{
		if(size > 0)
			return array[0];
		else
			return -1;
	}

	void print()
	{
		for(int  i : array)
			System.out.print(i+" ");
		System.out.println();
	}
	int getSize()
	{
		return size;
	}

}
class MaxHeap
{
	static int size;
	static int[] array;
	MaxHeap(int capacity)
	{
		array = new int[capacity];
		size = 0;
	}

	static int getLeftChildIndex(int i)
	{
		return (i*2) + 1;
	}

	static int getRightChildIndex(int i)
	{
		return (i*2) + 2;
	}

	static int getParentIndex(int i)
	{
		return (i -1)/2;
	}

	static boolean hasLeftChild(int i)
	{
		return (((i*2)+1) < size);
	}

	static boolean hasRightChild(int i)
	{
		return (((i*2)+2) < size);
	}

	static boolean hasParent(int i)
	{
		return (((i-1)/2) >= 0);
	}



	static void heapifyUp()
	{
		int index = size;
		while(hasParent(index) && array[getParentIndex(index)] < array[index])
		{
			int temp = array[getParentIndex(index)];
			array[getParentIndex(index)] = array[index];
			array[index] = temp;
			index = getParentIndex(index);
		}
	}

	static void heapifyDown()
	{
		int index = 0;

		while(hasLeftChild(index))
		{


			int maxValueIndex = getLeftChildIndex(index);

			if(hasRightChild(index) && array[getRightChildIndex(index)] > array[maxValueIndex])
			{
				maxValueIndex = getRightChildIndex(index);
			}
			if(array[index] < array[maxValueIndex])
			{
				int temp = array[index];
				array[index] = array[maxValueIndex];
				array[maxValueIndex] = temp;
				index = maxValueIndex;
			}
			else
				break;					
		}

	}

	void insert(int val)
	{
		array[size] = val;
		heapifyUp();
		size++;

	}

	int removeMax()
	{
		int max = getMax();
		size--;
		array[0] = array[size];
		array[size] = 0;
		heapifyDown();
		return max;
	}

	int getMax()
	{
		if(size > 0)
			return array[0];
		else
			return -1;
	}

	void print()
	{
		for(int  i : array)
			System.out.print(i+" ");
		System.out.println();
	}
	int getSize()
	{
		return size;
	}


}