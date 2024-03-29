// Pseudo Code for Recursive Approach
  func isPalindrome(start, end):
      while start <= end:
          if string_char[start] != string_char[end]:
              then return false;
          else:
              start += 1
              end -= 1
      return true;
    
  func min_partition(start, end):
      if start >= end or if isPalindrome(start, end):
          then return 0
      else:
          total_min_partition = Infinity // Total minimum partition needed for the string or substring from start to end
          
          for every partition from start to end: // Partitioning at some index between start to end
              left_partition_count = min_partition(start, partition)
              right_partition_count = min_partition(partition+1, right)
              partition_count = left_partition_count + right_partition_count + 1
              
              if partition_count < total_min_partition:
                  then total_min_partition = partition_count
          
          return total_min_partition