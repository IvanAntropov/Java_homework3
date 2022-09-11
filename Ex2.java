//Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class Ex2 {

    static void HeapSort(int[] arr){
        PrintArray(arr);
        for(int i = arr.length/2 - 1; i >= 0; i--){
            MakeHeap(arr, i, arr.length);
        }
        for(int j = arr.length - 1; j >= 0; j--){
            Replace(arr,0,j);
            MakeHeap(arr,0, j);
        }
        System.out.println();
        PrintArray(arr);
    }

    static void MakeHeap(int[] arr, int index, int size){
        int left = index*2 + 1;
        int right = index*2 + 2;
        int largest = index;

        if(left < size && arr[left] > arr[largest]){
            largest = left;
        };
        if(right < size && arr[right] > arr[largest]){
            largest = right;
        };
        if(largest == index){
            return;
        };

        Replace(arr, largest, index);
        MakeHeap(arr, largest, size);
    }

    static void Replace(int[] arr, int i, int r){
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }

    static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2,5,3,-6,4,1,-7,8,3,9,1,0,3,-3,6,3,2,7,-5,1,0,6,-5,3,-8,6,2,8};
        HeapSort(arr);
    }
}
