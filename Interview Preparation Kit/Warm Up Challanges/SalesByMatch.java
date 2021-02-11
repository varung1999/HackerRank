public static int sockMerchant(int n, int[] ar) {
        int replace = Integer.MIN_VALUE;

        int count = 0;
        Arrays.sort(ar);
        for(int i = 0;i<ar.length-1;i++)
        {
            for(int j = i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    count++;
                    ar[i]=replace;
                    ar[j]=replace;
                    
                }
                
            }
        }
        return count;
    }
