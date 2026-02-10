class Solution {
    public void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length && index < arr.length; i++) {
            if(arr[i] == 0){
                index+=2;
            } else {
                result[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<result.length; i++){
            arr[i] = result[i];
        }
    }
}