<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#SectionA">Section A: Code Review</a>
      <ul>
        <li><a href="#Option1">Option 1: Python Task</a></li>
      </ul>
    </li>
    <li>
      <a href="#SectionB">Section B: Projects</a>
      <ul>
        <li><a href="#project">Link to a project I am most proud of</a></li>
        <dd>https://github.com/smzimelaJHB/Hangman_Iteration3</dd>
      </ul>
    </li>
    <li>
      <a href="#SectionC">Section C: Code Challenge</a>
      <ul>
        <li><a href="#code_challenge">Link to a code challenge</a></li>
        <dd>https://github.com/smzimelaJHB/numbertowords</dd>
      </ul>
    </li>
    <li>
      <a href="#SectionD">Section D: Loom Video Submission</a>
      <ul>
        <li><a href="#video">Link loom video</a></li>
         <dd>https://www.loom.com/share/89e1e727b6324e2998855383d4c28084</dd>
      </ul>
    </li>
  </ol>
</details>

# Section A: Code Review

### Option 1: Python Task

The overall solution class looks good considering the naming of a class as it conforms to the Python naming convention of classes as indicated on documentation, the function however does not conform as the name should consist only of lower cases separated by an underscore, so in this case (group_anagrams). I do like the fact that the function name describes what the function does. Only one loop is used which makes the code easier to read.

While reading the code I noticed that there are no comments, which makes it a little bit difficult to read, I would do the commenting for this particular solution as follows, the numbers on the left indicate the lines of a code :

```
    * 3: initialize dictionary named result to store the output
    * 5: sort the letters in a given word alphabetically, e.g  "eat" will be ["a" , "e" ,"t"] then convert the sorted word back into string i.e  "aet" using "".join().
    * 7: if the sorted word matches the key inside result dictionary, add the selected word*(unsorted) at the end of the list.
    * 9: create a new key with it value inside a list.
    * 10: covert dictionary values to list 
    * 11: create an instance of Solution
```

Trying to run this solution will give errors, firstly because of the indentation of line 2 which needs to be shifted left by two spaces to match the code below, as a rule in python, the same number of spaces should be used throughout, by default four spaces are used in python. 

Line 5 will also produce an error since sorted() function expects an argument of iterable, which in this case will be 'i', a selected word in the list of strings(strs).

### Please see below code with fixed errors
```
class Solution:
    def group_anagrams(self, strs):
      result = {}
      for i in strs:
         x = "".join(sorted(i))
         if x in result:
            result[x].append(i)
         else:
            result[x] = [i]
      return list(result.values())
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
```

# Section B: Projects

### Project I am most proud of:

* https://github.com/smzimelaJHB/Hangman_Iteration3


# Section C: Code Challenge

### Option 1: Say the Number : 

* https://github.com/smzimelaJHB/numbertowords

# Section D: Loom Video Submission

### Link to the video:

* https://www.loom.com/share/89e1e727b6324e2998855383d4c28084
