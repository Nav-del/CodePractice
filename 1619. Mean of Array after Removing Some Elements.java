class Solution {
    public double trimMean(int[] arr) {
        int l=arr.length;
        Arrays.sort(arr);
        double lim = 0.05*l;
        int start = (int)lim;
        int end = l - (int)lim;
        double sum=0;
        double nl=0;

        for(int i=start;i<end;i++){
            sum+=arr[i];
            nl++;
        }
        double avg = sum / nl;
        return avg;
    }
}
