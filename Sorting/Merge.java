package Sorting;

public class Merge {
    static void mergeSort(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while (i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            mix[k]=arr[i];
            i++; k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++; k++;
        }

        for (int num=0; num<mix.length;num++){
            arr[s+num]=mix[num];
        }
    }
}
