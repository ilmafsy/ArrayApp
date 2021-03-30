
/**
 * Write a description of class arrayapp here.
 *
 * @Ilma Fahma Syadidah
 * @Ver 1.0 - 30 Maret 2021
 */
public class arrayapp
{
    public static void main(String[] args)
    {
        //ARRAY
        long[] arr;
        int nElems = 0;
        arr = new long[100];
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 0;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;
        
        int j;
        long searchKey;
        
        //Display Elements of Array
        for(j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
            System.out.println(" ");
        
        //Search Element
        searchKey = 66;  //Find item with key 66
        for(j = 0; j < nElems; j++)
            if(arr[j] == searchKey)
            break;
 
            if(j == nElems)
                System.out.println("Can't find "+ searchKey);
            else
                System.out.println("Found "+ searchKey);
 
        //Delete Element
        searchKey = 55;  //Delete item with 55
        for(j = 0; j < nElems; j++)
        if(arr[j] == searchKey)
            break;
 
        //deleting
        for(int k = j; k < nElems; k++)
            arr[k] = arr[k+1];
        nElems--;
 
        //Display Elements
        for(j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
            System.out.println(" ");}
    }