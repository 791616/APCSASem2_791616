
/**
 * Write a description of class selection here.
 *
 * @author Tristan Schnur
 * @version (a version number or a date)
 */
 public class selection{ 
    public static void main(String[] args){
       // selection Sort
       int arr
       
       for (int i = 0; i < arr.length-1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            intsmallerNumber = arr[index];
            arr[index] =arr[i];
            arr[i] = smallerNumber;
        }
    }
}

