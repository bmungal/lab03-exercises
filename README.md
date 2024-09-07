Lab03 9/5/24 collab with Jacob Forrest 
Find All Duplicates
Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.

Describe different approaches to figuring out all of the duplicate values of a list:

First solution: Nested Loop
for me, the nested loop is more intuitive. In my solution, I would iterate through the given list and set another index to look ahead at the list (the same list), then compare the elements. If the elements matched, it was stored in the list called duplicates and returned to main. Altough this is intuitive, this isn't the most efficient solution when compared to a hash map/ table because you're iterating through a list.

Second solution: map
With the hash set/ map, you don't have a nested for loop, so from an efficiency standpoint, the code is much faster than the nested loop. Depending on how you setup the hash set, you have functions for every opteration like add and contains. These operations are all constant time, so much more efficient than the nested loop. In a similar fashion, you iterate through the list and add duplicates (if any) to your hash map. Although this is extremely efficient, it's not as intuitive as the first solution. 