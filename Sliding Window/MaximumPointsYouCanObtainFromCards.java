class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0;
        int leftSum = 0;
        int rightSum = 0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
            maxSum=leftSum;
        }
        int right = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum=leftSum-cardPoints[i];
            rightSum = rightSum+cardPoints[right];
            right--;
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}
