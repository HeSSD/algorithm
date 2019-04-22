
The following code is the core part of the insertion sort:
       
                   //pass in an arraya[0..n-1]
                   for(int m=1;m<b;m++){
                     int v=a[m];
                     int j=m-1;
                     while(j>=0 && a[j]>v){
                        a[j+1]=a[j];
                        j=j-1;
                     }
                     a[j+1]=v;
                   }
In the numbers before a[n], the positions of two numbers that are no smaller or no larger than a [n] are continuously searched, and then the positions are placed in the middle of the two numbers to complete an insertion, and the process is continuously repeated until all the numbers are arranged in sequence. Because every time we search from the previous number of a[n] until a[0], sometimes the more times we need to search in the future, the more times we need to search.
