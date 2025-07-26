# 🔄 Sorting Algorithms

This folder contains implementations of various sorting algorithms in Java, ranging from simple O(n²) algorithms to advanced O(n log n) algorithms.

---

## 📋 Available Algorithms

### ✅ Implemented

#### 1. **Bubble Sort** (`BubbleSort.java`)
- **Description**: Repeatedly swaps adjacent elements if they're in wrong order
- **Time Complexity**: O(n²) average and worst case, O(n) best case
- **Space Complexity**: O(1)
- **Stability**: Stable (maintains relative order of equal elements)
- **Use Case**: Educational purposes, small datasets
- **Optimization**: Uses early termination when no swaps occur

---

## 🔄 Planned Implementations

### **Divide and Conquer Algorithms**
- [ ] **Merge Sort** - Stable O(n log n) sorting using divide and conquer
- [ ] **Quick Sort** - Average O(n log n), worst O(n²) with partitioning
- [ ] **Heap Sort** - O(n log n) using binary heap data structure

### **Simple Sorting Algorithms**
- [X] **Bubble Sort** - O(n²) by repeatedly swapping adjacent elements if they are in the wrong order
- [ ] **Selection Sort** - O(n²) by repeatedly finding minimum element
- [ ] **Insertion Sort** - O(n²) by building sorted array one element at a time
- [ ] **Shell Sort** - Improved insertion sort with gap sequences

### **Advanced Sorting Algorithms**
- [ ] **Radix Sort** - O(d×n) non-comparison sorting for integers
- [ ] **Counting Sort** - O(n+k) for integers in limited range
- [ ] **Bucket Sort** - O(n+k) average case for uniformly distributed data
- [ ] **Tim Sort** - Hybrid merge sort + insertion sort (used in Python/Java)

---

## 🚀 How to Run

1. **Compile**: 
   ```bash
   javac algorithms/sorting/BubbleSort.java
   ```

2. **Execute**:
   ```bash
   java algorithms.sorting.BubbleSort
   ```

3. **Follow the prompts** to enter array size and elements

---

## 📊 Algorithm Comparison Chart

| Algorithm | Time Complexity | Space Complexity | Stability | Best For |
|-----------|----------------|------------------|-----------|----------|
| **Bubble Sort** | O(n²) | O(1) | Stable | Learning, tiny arrays |
| **Merge Sort** *(planned)* | O(n log n) | O(n) | Stable | Large datasets, guaranteed performance |
| **Quick Sort** *(planned)* | O(n log n) avg | O(log n) | Unstable | General purpose, average case |
| **Selection Sort** *(planned)* | O(n²) | O(1) | Unstable | Memory-limited environments |
| **Insertion Sort** *(planned)* | O(n²) | O(1) | Stable | Small/nearly sorted arrays |
| **Heap Sort** *(planned)* | O(n log n) | O(1) | Unstable | When space is limited |
| **Radix Sort** *(planned)* | O(d×n) | O(n+k) | Stable | Integer sorting, fixed digits |

---

## 🎯 Algorithm Categories

### **Comparison-Based Sorts**
- Bubble, Selection, Insertion, Merge, Quick, Heap Sort
- **Lower bound**: O(n log n) for comparison-based sorting

### **Non-Comparison Sorts**  
- Counting, Radix, Bucket Sort
- **Can achieve**: O(n) time under specific conditions

### **Stable vs Unstable**
- **Stable**: Maintains relative order of equal elements (Bubble, Merge, Insertion)
- **Unstable**: May change relative order (Selection, Quick, Heap)

---

## 💡 Implementation Notes

### Current Features:
- **Interactive Input**: All algorithms accept user input for testing
- **Edge Case Handling**: Empty arrays and single elements
- **Optimization**: Bubble sort includes early termination
- **Clear Output**: Displays sorted array after completion

### Planned Features:
- **Recursive & Iterative versions** for applicable algorithms
- **Performance benchmarking** tools
- **Visualization helpers** for understanding algorithm steps
- **Generic implementations** for different data types

---

## 🎯 Test Cases & Examples

### Bubble Sort Example:
```
Input: Enter array size: 5
       Enter elements: 64 34 25 12 22
Output: Sorted array: 12 22 25 34 64

Input: Enter array size: 3  
       Enter elements: 1 2 3
Output: Sorted array: 1 2 3 (optimized - no swaps needed)
```

### Expected Merge Sort Example *(when implemented)*:
```
Input: [38, 27, 43, 3, 9, 82, 10]
Process: 
  - Divide: [38,27,43,3] | [9,82,10]
  - Conquer: [27,38] [3,43] | [9,82] [10]
  - Merge: [3,27,38,43] | [9,10,82]
Output: [3, 9, 10, 27, 38, 43, 82]
```

---

## 📚 Learning Path Recommendation

1. **Start with**: Bubble Sort (understand basic swapping)
2. **Move to**: Selection & Insertion Sort (understand building sorted portions)
3. **Learn**: Merge Sort (master divide and conquer)
4. **Practice**: Quick Sort (understand partitioning)
5. **Explore**: Heap Sort (combine with heap data structure)
6. **Advanced**: Radix/Counting Sort (non-comparison techniques)

---

## 🔗 Related Topics

- **Data Structures**: Arrays, Heaps (see `../../datastructures/`)
- **Algorithm Design**: Divide & Conquer, Greedy approaches
- **Complexity Analysis**: Big O notation, best/average/worst cases
- **Searching**: Binary search works best on sorted arrays
