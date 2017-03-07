package mergesort;

public class Mergesort {
      
	  private int[] data;
      private int[] aux;
	  private int n;

public void sortarray(int[] mydata) {
    this.data = mydata;
    n = mydata.length;
				
    this.aux = new int[n];
    
	mergesort(0, n - 1);
    }

private void mergesort(int left , int right) {
 // check if the array is already sorted
int middle;
if (left < right) {
    middle = left + (right - left) / 2; 
    mergesort(left, middle); // divide and sort the first part of the array
    mergesort(middle + 1, right); //divide and sort the rest of the array
    merge(left, middle, right);
            }
        }
// here we combine and glue different sorted parts of array 
private void merge(int left, int middle, int right) {
    for (int i = left; i <= right; i++) { // copy halves of the array into an empty auxiliary array
        aux[i] = data[i];
        }
// fill the original array by minimums of smallest values from different (already sorted) halves
int i = left;
int j = left;
int k = middle + 1;
while (i <= middle && k <= right) {
    if (aux[i] <= aux[k]) {
        data[j] = aux[i];
        i++;
        } 
	else {
        data[j] = aux[k];
        k++;
        }
            
	    j++;
    }
			
    while (i <= middle) {
        data[j] = aux[i];
        i++;
        j++;
        }

    }
}