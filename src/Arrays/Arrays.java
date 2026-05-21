package Arrays;

public class Arrays {
    int[] arr;
    int count;

    public Arrays(int size){
        this.arr = new int[size];
    }

    public void printArray(){
//        for(int s: arr){
//            System.out.print(s+" ");
//        }
        for(int i=0; i<count;i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public void insert(int number){

        if(arr.length == count){
            int[] newArr = new int[count*2];

            for(int i=0; i<count ;i++){
                newArr[i] =arr[i];
            }
            arr = newArr;

        }

        arr[count++] = number;

    }

    public void removeAt(int index){
        if(index<0 || index>=count){return;}
        for(int i=index;i<count;i++){
            arr[i] = arr[i+1];
        }
        count--;
    }

    public int indexOf(int number){
      //  if(index<0 || index>=count){return;}
       for(int i=0;i<count;i++){
           if(number==arr[i]) {return i;}
       }

       return -1;
    }
}
