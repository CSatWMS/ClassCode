public class Sorting{
   public static void main(String[] args){
      int size = 10;
      int[] arr = new int[size];
      for (int i = 0; i<size; i++){
         arr[i] = (int) (Math.random() * 20) - 10;
      }
      printArray(arr);
      //BubbleSort(arr);
      //SelectionSort(arr);
      InsertionSort(arr);
      //int[] test = {4, 3, 2, 1};
      //System.out.println(sum(test, 0));
      //QuickSort(arr, 0, arr.length-1);
      //printArray(arr);
   }

     public static void swap(int[] arr, int i1, int i2){
      if (isValid(arr, i1) && isValid(arr, i2)){
         int temp = arr[i1];
         arr[i1] = arr[i2];
         arr[i2] = temp;
      }
   }

      public static void BubbleSort(int[] arr){
      int swapCount = 1;
      for (int i = 0; i<arr.length; i++){
         if (swapCount == 0) break;
         else {
            swapCount = 0;
            for (int j = 0; j <arr.length - i - 1; j++){
               if (arr[j+1] < arr[j]){
                  swapCount++;
                  swap(arr, j+1, j);
               }
            }
         }
         printArray(arr);
      }
   }

      public static void SelectionSort(int[] arr){
      for (int i = 0; i<arr.length; i++){
         int pivot = arr[i];
         int currMinIndex = i;
         for (int j = i; j<arr.length; j++){
            if (arr[j] < pivot){
               pivot = arr[j];
               currMinIndex = j;
            }   
         }
         swap(arr, i, currMinIndex);
         printArray(arr);
      }
   }


   //precondition: there is room in arr to shift things down
   public static void insert(int[] arr, int index, int thing){
      if (isValid(arr, index)){
         for (int i = arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
         }
         arr[index] = thing;
      }
   }

      public static void InsertionSort(int[] arr){
      int[] sorted = new int[arr.length];
      for (int i = 0; i < arr.length; i++){
         int thingToInsert = arr[i];
         int indexToInsert = 0;
         for (int j = 0; j<i; j++){
            if (sorted[j] <= thingToInsert){
               indexToInsert++;
            }
         }
         insert(sorted, indexToInsert, thingToInsert);
         printArray(sorted);
         
      }
      
      copy(sorted, arr);
   }
   
   
   
   public static int sum(int[] arr, int startingPoint){
      if (startingPoint == arr.length){
         return 0;
      }
      else {
         return arr[startingPoint] + sum(arr, startingPoint + 1);
      }
   }

   
   
   public static void QuickSort(int[] arr, int fakeStart, int fakeEnd){
      int i = fakeStart;
      int j = fakeEnd;
      int pivotIndex =  (i+j)/2;
      int pivot = arr[pivotIndex];
      while (i <= j){
         //swaps so that left side to be less than pivot and right is greater than pivot
         while (arr[j] > pivot){
            j--;
         }   
         while (arr[i] < pivot){
            i++;
         }
         if (i <= j){
            swap(arr, i, j);
            i++;
            j--;
         }
      }
      if (j > fakeStart)
      QuickSort(arr, fakeStart, j);
      if (i < fakeEnd)
      QuickSort(arr, i, fakeEnd);
   }

   public static int[] merge(int[] a, int[] b){
      int[] toReturn = new int[a.length + b.length];
      int i = 0; //index of A
      int j = 0; //index of B
      int k = 0; //index for toReturn
      while (i < a.length && j < b.length){
         if (a[i] < b[j]){
            toReturn[k] = a[i];
            i++;
         }else {
            toReturn[k] = b[j];
            j++;
         }
         k++;
      }
      if (i < a.length){
         for (; i < a.length; i++){
            toReturn[k] = a[i];
            k++;
            i++;
         }
      } else if (j < b.length){
         for (; j < b.length; j++){
            toReturn[k] = b[j];
            k++;
            j++;
         }
      }

      return toReturn;
   }
   
   
   public static boolean isValid(int[] arr, int i){
      return i>=0 && i<arr.length;
   }   
   
   public static void printArray(int[] arr){
      for (int i : arr)
         System.out.print(i + ", ");
      System.out.println();   
   }
   
      public static void copy(int[] oldData, int[] newArray){
      for (int i = 0; i<oldData.length; i++){
         newArray[i] = oldData[i];
      }   
   }
   
   
   
   /* Data HAS TO be sorted */
   public static boolean binarySearch(int[] arr, int targetNumber, int fakeStart, int fakeEnd){
      int middle = (fakeStart + fakeEnd) / 2;
      if (arr[middle] == targetNumber){
         return true;
      }  else if (fakeStart >= fakeEnd){
          return false;
      } else {
         if (targetNumber < arr[middle]){
            return binarySearch(arr, targetNumber, fakeStart, middle);
         }  else {
            return binarySearch(arr, targetNumber, middle, fakeEnd);
         }
      }
   }
   
   public static boolean seqSearch(int[] arr, int targetNumber){
      for (int x : arr){
         if (x == targetNumber){
            return true;
         }
      }
      return false;
   }
}