class Solution {
    public boolean validUtf8(int[] data) {
        int mask1 = 1<<7 ;
        int mask2 = 1<<6 ;
        int bits = 0 ;
        for (int i = 0 ; i < data.length ; i++ ){
            if(bits == 0){
                int mask = 1<<7 ;
                while((mask & data[i]) !=0 ){
                    bits++ ;
                    mask>>=1 ;
                }
                if(bits == 0){
                    continue ;
                }
                if(bits > 4 || bits== 1){
                    return false ;
                }
            }
            else{
                if(!((data[i] & mask1) != 0) || !((data[i] & mask2) == 0)){
                    return false ;
                }
            }
            bits-- ;

        }
        return bits==0 ;
    }
}