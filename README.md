# Count-Subarrays-With-Given-XOR
You are given an array of integers nums and an integer target. Your task is to count the number of subarrays whose bitwise XOR is equal to target.
 How it Works:
xor keeps track of the prefix XOR up to the current index.

We use a HashMap to store the frequency of each prefix XOR.

If prefix XOR ^ target exists in the map, it means a subarray ending at current index has XOR = target...

