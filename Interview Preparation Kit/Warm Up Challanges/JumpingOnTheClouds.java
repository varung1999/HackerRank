 public static int jumpingOnClouds(int[] c) {
       
        int j = 0;
    for(int i = 0; i < c.length - 1; i++){
        j++;
        if( i  + 2 < c.length && c[i + 2] == 0){
            i++;
        }
    }
    return j;

    }
