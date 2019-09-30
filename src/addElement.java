import java.util.Scanner;

public class addElement {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       int size;
       do{
           System.out.print("Enter a size: ");
           size=scanner.nextInt();
           if(size>10){
               System.out.println("size should be bigger than 10");
           }
       }while(size>10);
       int[] array=new int[size];
       for(int i=0;i<array.length;i++){
           System.out.print("enter element "+(i+1)+":");
           array[i]=scanner.nextInt();
       }
        System.out.print("Array: ");
       for(int j=0;j<array.length;j++){
           System.out.print(array[j]+"\t");
       }
        System.out.print("\n which number do you want to insert? ");
       int number= scanner.nextInt();
        System.out.println("\n which index do you want to insert? ");
        int index=scanner.nextInt();
        int[] newArr= insertElement(number,index,array);
        System.out.println("new array: ");
        for (int j=0;j<newArr.length;j++){
            System.out.print(newArr[j]+"\t");
        }
    }

    public static int[] insertElement(int number, int index, int[] array) {
        int[] newArr = new int[array.length + 1];
        if(index<0|| index>array.length-1){
            System.out.println("cannot insert number into position: "+index);
            System.exit(0);
        }
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = array[i];
            } else if (index == i) {
                newArr[index] = number;
            } else {
                newArr[i] = array[i - 1];
            }

        }
        return newArr;
    }
}
