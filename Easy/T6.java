package Easy;

public class T6 {
    public int[] mergeSortedArray(int[] A, int[] B) {
        int idxA = 0;
        int idxB = 0;
        int idxRes = 0;
        int[] res = new int[A.length + B.length];
        while(idxA < A.length && idxB < B.length){
            if(A[idxA] < B[idxB]){
                res[idxRes] = A[idxA];
                idxA += 1;
            }else{
                res[idxRes] = B[idxB];
                idxB += 1;
            }
            idxRes += 1;
        }
        while(idxA < A.length){
            res[idxRes] = A[idxA];
            idxA += 1;
        }
        while(idxB < B.length){
            res[idxRes] = B[idxB];
            idxB += 1;
        }

        return res;
    }
}
