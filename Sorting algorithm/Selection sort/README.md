
this is a selective sorting algorithm. For an unordered array containing N elements, the first number is used as the default minimum to  start sorting, and the remaining unsorted numbers are compared to find the subscript of the minimum value. Then the first number is exchanged with the found minimum number, and the above operations are repeated until the order is finally arranged.
for example, use this array to give an example: 33 22 65 38 67 53 82 12   (starts with-> and · marks the minimum number found each time)

                          ->33  22  65  38  67  53  82  ·12
                          12  ->·22  65  38  67  53  82  33
                          12  22  ->65  38  67  53  82  ·33
                          12  22  33  ->·38  67  53  82  65
                          12  22  33  38  ->67  ·53  82  65
                          12  22  33  38  53  ->67  82  ·65
                          12  22  33  38  53  65  ->82  ·67
                          12  22  33  38  53  65  67  ->·82    （Actually, it's over here）
