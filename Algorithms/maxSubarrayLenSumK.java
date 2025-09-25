public class maxSubarrayLenSumK{
    public void algorithm(){
        /*
            maxSubarrayLenSumK(A, K):
                prefixSum = 0
                maxLen = 0
                map = new HashMap()   // prefixSum -> first index
                map[0] = -1           // important: handles subarrays starting at index 0

                for i = 0 to n-1:
                    prefixSum += A[i]

                    if (prefixSum - K) in map:
                        len = i - map[prefixSum - K]
                        maxLen = max(maxLen, len)

                    if prefixSum not in map:   // store only first occurrence
                        map[prefixSum] = i

                    return maxLen
        */
    }
}