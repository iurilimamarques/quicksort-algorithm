# quicksort-algorithm
## Introduction

A quicksort algorithm consists of a code in which receives an unsorted list and performs in its worst case scenario O(n²), in an average case O(log n) and best case O(log n). 

## Under the hood

The algorithm itself consists of picking one number from the unsorted list as the pivot, the pivot is gonna be compared to every number left in the array after picking the pivot and every number that is less than or equal to the pivot is gonna be placed to its left and every number greater than the pivot is gonna be placed to its right, the responsible for keeping getting the pivot is the recursive function that works until it has got an array of size 1.

## Worst case

The worst case is when you always pick in each call of the recursive function either the greatest or the lowest number of the array which causes the algorithm to perform with a time complexity of O(n²).
