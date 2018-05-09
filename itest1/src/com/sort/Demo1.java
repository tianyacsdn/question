package com.sort;

public class Demo1 {
	/**
	 * 冒泡排序
	 * 特点：效率低，实现简单
	 * 思想（从小到大排）：每一趟将待排序序列中最大元素移到最后，剩下的为新的待排序序列，重复上述步骤直到排完所有元素。这只是冒泡排序的一种，当然也可以从后往前排。
	 * @param array
	 */
	public static int[] bubbleSort(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
        return array;
    }
	/**
	 * 选择排序
	 * 特点：效率低，容易实现
	 * 思想：每一趟从待排序序列选择一个最小的元素放到已排好序序列的末尾，剩下的位待排序序列，重复上述步骤直到完成排序
	 * @param array
	 */
	public static int[] selectSort(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++){
            int index=i;
            for (int j = i + 1; j < array.length; j++)
                if (array[index] > array[j])
                    index=j;
            if(index!=i){ //找到了比array[i]小的则与array[i]交换位置
                t = array[i];
                array[i] = array[index];
                array[index] = t;
            }
        }
        return array;
    }
	
	/**
	 * 插入排序
	 * 特点：效率低，容易实现
	 * 思想：将数组分为两部分，将后部分元素逐一与前部分元素比较，如果当前元素array[i]小，就替换。找到合理位置插入array[i]
	 * @param array
	 */
	public static int[] insertionSort(int array[]) {
        int i, j, t = 0;
        for (i = 1; i < array.length; i++) {
            t = array[i];
            for (j = i - 1; j >= 0 && t < array[j]; j--)
                array[j + 1] = array[j];
            array[j + 1] = t;
        }
        return array;
    }
	
	/**
	 * 快速排序
	 * 特点：高效，时间复杂度为nlogn
	 * 采用分治法的思想：首先设置一个轴值pivot，然后以这个轴值为划分基准将待排序序列分成比pivot大和比pivot小的两部分，接下来对划分完的子序列进行快排直到子序列为一个元素为止
	 * @param array
	 * @param low
	 * @param high
	 */
	public static int[] quickSort(int array[], int low, int high) {// 传入low=0，high=array.length-1;
        int pivot, p_pos, i, t;// pivot->位索引;p_pos->轴值。
        if (low < high) {
            p_pos = low;
            pivot = array[p_pos];
            for (i = low + 1; i <= high; i++)
                if (array[i] > pivot) {
                    p_pos++;
                    t = array[p_pos];
                    array[p_pos] = array[i];
                    array[i] = t;
                }
            t = array[low];
            array[low] = array[p_pos];
            array[p_pos] = t;
            // 分而治之
            quickSort(array, low, p_pos - 1);// 排序左半部分
            quickSort(array, p_pos + 1, high);// 排序右半部分
        }
        return array;
	}
	
	public static void print(int[] array) {
		for (int item: array) {
			System.out.print(item + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] data = {8, 61, 16, 37, 50, 25, 81, 12, 52, 34};
		int[] bubbleData = bubbleSort(data);
		
		//冒泡排序
		System.out.println("冒泡排序:");
		print(bubbleData);
		
		//选择排序
		System.out.println("选择排序:");
		int[] selectData = selectSort(data);
		print(selectData);
		
		//插入排序
		System.out.println("插入排序");
		int[] insertData = insertionSort(data);
		print(insertData);
		
		//快速排序
		System.out.println("快速排序:");
		int[] quickData = quickSort(data, 0, data.length-1);
		print(quickData);
		
//		System.out.println();
//		for (int item : data) {
//			System.out.print(item + "\t");
//		}
	}

}
