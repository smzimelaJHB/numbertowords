<div id="top"></div>
<!--
***
-->

<!-- PROJECT SHIELDS -->
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li>
        <a href="#running">Running</a>
        <ul>
            <li><a href="#usage">Usage</a></li>
        </ul>
    </li>
    <li>
        <a href="#contact">Details</a>
        <ul>
            <li><a href="#contact">Contact</a></li>
        </ul>
    </li>

  </ol>
</details>



<!-- ABOUT THE PROJECT -->
# About The Project
Takes a numeral (just digits without separators (e.g. 19093 instead of 19,093) and returns the standard way of reading a number, complete with punctuation.

**Example**
- sayNumber(0) ➞ "Zero."
- sayNumber(11) ➞ "Eleven."
- sayNumber(1043283) ➞ "One million, forty three thousand, two hundred and eighty three."
- sayNumber(90376000010012) ➞ "Ninety trillion, three hundred and seventy six billion, ten thousand and twelve."

### worst-case space complexity is 0.5 micro seconds because of recursioin

<p align="right">(<a href="#top">back to top</a>)</p>


[![Product Name Screen Shot][product-screenshot1]]
[![Product Name Screen Shot][product-screenshot2]]

# Built With

* [Java 17 and Maven]

<!-- GETTING STARTED -->
# Getting Started

To get started you need to have Java 17, Apache Maven 3.8.6 and Make  on your machine.

# Prerequisites Links

on linux machine or mac you can install https://sdkman.io/ : then
* ```
  sdk install java
  sdk install maven
  sudo apt install make
  ```

# Installation


1. Clone the repo
   ```
   git clone https://github.com/smzimelaJHB/numbertowords
   ```

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
# Running
### Usage
    To freshly run all tests,build and package the code run 'make or make all' from the terminal
    ``- make ``
### Commands for command line

    make                                                          To compile,verify, package and run all tests
    mvn test / make test-everything                               To run all tests
    make verify/ mvn verify                                       To check all packages
    make package/ mvn package                                     To create the jar file make 

    java -jar output/numbertowords-release.jar @arg1              To run the jar file where @arg1 is the number you want to convert
    java -jar target/numbertowords-release.jar @arg1              Can also be ran from the target folder 
    java -jar output/numbertowords-release.jar @arg1 @arg2 @arg3  Multiple numbers can be also converted at once


<!-- CONTACT -->
# Contact

Project Link: [https://github.com/smzimelaJHB/numbertowords](https://github.com/smzimelaJHB/numbertowords)

<p align="right">(<a href="#top">back to top</a>)</p>

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555

[linkedin-url]: https://www.linkedin.com/in/siyabonga-mzimela-237507b6/

[product-screenshot1]: tests.png
[product-screenshot2]: results.png



