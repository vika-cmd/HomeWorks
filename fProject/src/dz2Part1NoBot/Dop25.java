package dz2Part1NoBot;

/**
 * (3 балла) Решить задачу 7 основного дз за линейное время. Про понятие
 * линейного времени можно почитать здесь:
 *  * 6
 *  * -10 -5 1 3 3 8
 *  * Пример выходных данных
 *  * 1 9 9 25 64 100
 */
public class Dop25 {
    public static void main(String[] args) {
//        int n;
//        Scanner scanner=new Scanner(System.in);
//        n=scanner.nextInt();
//        int[] ai=new int[n];
//        int[] ai = {-20, -10, -5, 1, 3, 3, 8};//
        int[] ai = {-10, -5, 1, 3, 3, 8,10,20};//
//        int[] ai = {0,1, 2, 4, 5, 7, 8};//0 1 4 16 25 49 64
//        int[] ai={-8,-7,-5,-4,-2,-1};////0 1 4 16 25 49 64
        int n = ai.length;
        int[] arr = new int[n];//7

        int nl = findIndN(ai);//3
//        System.out.println(nl);
        if (nl == 0) {
            arr = fPos(ai);//0 1 4 16 25 49 64
        } else if (nl == -1) {//1 4 16 25 49 64
            arr = fNeg(ai);
        } else {
            for(int i=0,ip=nl,in=nl-1;i<n-1;i++){
                if(ai[in]*(-1)<ai[ip]){
                    arr[i]=ai[in]*ai[in];
                    if(in>0){
                        in--;
                    }
                    else{
                        while (ip<n){
                            i++;
                            arr[i]=ai[ip]*ai[ip];
                            ip++;
                        }
                    }
                }
                else {
                    arr[i]=ai[ip]*ai[ip];
                    if(ip<n-1){
                        ip++;
                    }
                    else{
                        while (in>=0){
                            i++;
                            arr[i]=ai[in]*ai[in];
                            in--;
                        }
                    }
                }
            }
        }

//        int in=nl-1;
//        int ip=nl;
//        System.out.println(fmin(ai[in],ai[ip])[1]);

        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static int findIndN(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= 0) {
                return i;
            }
        }
        return -1;
    }

    static int[] fNeg(int[] arr) {
        int[] resArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; ++i, j--) {
            resArr[i] = arr[j] * arr[j];
        }
        return resArr;
    }

    static int[] fPos(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

}


//    static int[] fmin(int n,int p){
//        int[] arr=new int[2];
//        if(n*(-1)<p){
//            arr[0]=0;
//            arr[1]=n*n;
//        }
//        else{
//            arr[0]=1;
//            arr[1]=p*p;
//        }
//        return arr;
//
//    }



//    static int[] findMin(int n,int p){
//        int[] arr=new int[2];
//        if(n*(-1)<p){
//            return arr= new int[]{-1, 2};
//        }
//        else {
//            return p*p;
//        }

//        int in=0, ip=0, bf;
//        for(int i=0,ind=0;i<n;) {
//            if(ai[i]<0){
//                i++;
//            }
//            ip=i;//2
//            in=i-1;
//            if(ai[ip]<ai[in]*(-1)){
//                arr[ind]=ai[ip];
//            }
//            else {
//                arr[ind]=ai[in];
//            }
//            ind++;
//            ip++;
//            in--;
//        }
