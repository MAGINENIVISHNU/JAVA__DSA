package JAVA.DSA.Arrays;

class median_two_arr{
public static void main(String[] args) {

        int[] a = {1, 2};
        int[] b = {3, 4};

        int n = a.length;
        int m = b.length;
        int total = n + m;

        int i = 0, j = 0;
        int count = 0;

        int prev = 0, curr = 0;

        // merge until middle
        while (count <= total / 2) {
            prev = curr;

            if (i < n && (j >= m || a[i] <= b[j])) {
                curr = a[i];
                i++;
            } else {
                curr = b[j];
                j++;
            }
            count++;
        }

        double median;
        if (total % 2 == 0) {
            median = (prev + curr) / 2.0;
        } else {
            median = curr;
        }

        System.out.println("Median = " + median);
    }
}


//    public static void main(String args[]) {
//       int []a={1,2};
//       int []b={3,4};
//       int []c=new int[a.length+b.length];
//     //   System.arraycopy(a, 0, c,0, a.length);
//     //   System.arraycopy(b, 0, c,a.length,b.length);
//     for(int i=0;i<a.length;i++){
//         c[i]=a[i];
//     } 
    
//     for(int i=0;i<b.length;i++){
//         c[i+a.length]=b[i];
//     }
//       Arrays.sort(c);
      
//       double mean;
//       int n=c.length;
//       if(n%2!=0){
//         mean=c[n/2];
//       }
//       else{
//         mean =(c[(n/2)-1]+c[n/2])/2.0000;
//       }
//       System.out.println(mean);
//    }
// }

