
/**
 * Write a description of class bubble here.
 *
 * @author Tristan Schnur
 * @version (110)
 */
public class bubble{ 

    public static void main(String[] args) {
        //  bubble Sort
        int[] m = new int[200];
        loadArray(m); 
        int  numSwaps=0;
       
        for(int i= m.length-1;i > 0 ;i--) {
            for(int j=0;j < i-1; j++)
                if(m[j] > m[j+1]) {
                    swap(m, j, j+1);
                    numSwaps++;

                }
        }
        System.out.println("Number of Swaps =" + numSwaps);
        printArray(m);
    } 

    public static void loadArray(int[] m){
        for(int i=0;i< m.length; i++){
            m[i] = (int)(Math.random() * m.length);

        }
    }

    public static void printArray(int[] m) {

        for(int i=0;i< m.length; i++){

            System.out.print(m[i]+", ");
        }     
    }

    public static void swap(int[] arr,int a, int b){

        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]= temp;

    }
}
