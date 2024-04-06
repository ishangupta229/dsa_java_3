import java.util.*;
public class heapSort {

    public static void Heapify(int[] num,int  i,int size) {
            int left = (2*i)+1;
            int right = (2*i)+2;

            int max=i;

            if (left<size && num[max]<num[left]) {
                max=left;
            }
            if (right<size && num[max]<num[right]) {
                max=right;
            }
            if (max!=i) {
                int temp = num[max];
                num[max] = num[i];
                num[i]=temp;

                Heapify(num,i+1,size);
                
            }
        }

        public static void Sort(int[] num) {
            int i = num.length;
            for (int j = i/2 ; j>=0; j--) {
                Heapify(num,j,i);
            }

            for(int j=i-1;j>=0;j--){
                int temp = num[0];
                num[0]=num[j];
                num[j]=temp;
                Heapify(num,0,j);
            }
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j] + " ");
            }
        }


    public static void main(String[] args) {
        int arr [] = {1,6,3,7,9,8,4,2,5};
        Sort(arr);
    }
    
}