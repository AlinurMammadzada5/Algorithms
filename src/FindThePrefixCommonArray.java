import java.util.HashSet;
import java.util.Set;

public class FindThePrefixCommonArray {
    public static int[] findThePrefixCommonArray1(int[] A, int[] B) {
        int[] finalArr = new int[A.length];
        Set<Integer> hashA = new HashSet<>();
        Set<Integer> hashB = new HashSet<>();
        int counter=0;
        for(int i =0; i<A.length; i++){


            hashA.add(A[i]);
            hashB.add(B[i]);

            if(hashA.contains(B[i])){
                counter++;
                hashA.remove(B[i]);
                hashB.remove(B[i]);
            }
            if(hashB.contains(A[i])){
                counter++;
                hashA.remove(A[i]);
                hashB.remove(A[i]);
            }

            finalArr[i] = counter;

        }
        return finalArr;
    }
}
