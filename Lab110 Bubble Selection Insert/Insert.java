
/**
 * Write a description of class Insert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Insert {
    var temp;
    for(var  i = 1; i < arr.length; i++) {
        for(var  j = i ; j > 0 ; j--)
        {

            if(arr[j] < arr[j-1]){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }

        }
    }

