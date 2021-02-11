public static int equalizeArray(int[] arr) {
        Arrays.sort(arr);
        int ans =arr[0];
        int count1 = 1;
        int count2 = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count1++;
            }else{
                if(count1>count2){
                    count2 = count1;
                    //System.out.println(count2);
                    ans = arr[i-1];
                }
                count1 =1;
            }
        }
        if(count1>count2){
            ans = arr[arr.length-1];
        }
       
        
        int del = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]!=ans)
            {
                del++;
            }
        }
        return del;
    }
