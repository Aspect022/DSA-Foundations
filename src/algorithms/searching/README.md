# 🔍 Searching Algorithms

This folder contains implementations of various searching algorithms in Java.

---

## 📋 Available Algorithms

### ✅ Implemented

#### 1. **Linear Search** (`LinearSearch.java`)
- **Description**: Sequential search through array elements one by one
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Best Case**: O(1) - element found at first position
- **Worst Case**: O(n) - element at last position or not found
- **Use Case**: Works on both sorted and unsorted arrays

#### 2. **Binary Search** (`BinarySearch.java`)
- **Description**: Efficient search on sorted arrays using divide and conquer
- **Time Complexity**: O(log n)
- **Space Complexity**: O(1)
- **Prerequisite**: Array must be sorted
- **Use Case**: Fast searching in large sorted datasets

---

## 🔄 Planned Implementations

- [ ] **Interpolation Search** - Better than binary search for uniformly distributed data
- [ ] **Exponential Search** - Useful for unbounded/infinite arrays
- [ ] **Jump Search** - Block-based search algorithm
- [ ] **Ternary Search** - Divide array into three parts
- [ ] **Fibonacci Search** - Uses Fibonacci numbers for searching

---

## 🚀 How to Run

1. **Compile**: 
   ```bash
   javac algorithms/searching/LinearSearch.java
   javac algorithms/searching/BinarySearch.java
   ```

2. **Execute**:
   ```bash
   java algorithms.searching.LinearSearch
   java algorithms.searching.BinarySearch
   ```

3. **Follow the prompts** to enter array size, elements, and search target

---

## 📊 Algorithm Comparison

| Algorithm | Time Complexity | Space Complexity | Sorted Array Required | Best For |
|-----------|----------------|------------------|---------------------|----------|
| Linear Search | O(n) | O(1) | No | Small arrays, unsorted data |
| Binary Search | O(log n) | O(1) | Yes | Large sorted arrays |

---

## 💡 Key Notes

- **Linear Search**: Works on any array but slower for large datasets
- **Binary Search**: Requires sorted array but much faster for large datasets
- **Edge Cases**: All implementations handle empty arrays and single elements
- **Input Validation**: Programs include basic error handling

---

## 🎯 Test Cases

### Linear Search Example:
```
Input: [5, 2, 8, 1, 9], Search: 8
Output: Element found at index 2

Input: [1, 3, 5, 7], Search: 4
Output: Invalid number
```

### Binary Search Example:
```
Input: [1, 3, 5, 7, 9, 11], Search: 7
Output: Element found at index 3

Input: [2, 4, 6, 8, 10], Search: 5
Output: Invalid number
```
