# coding-problems
These are Hackerranke and Leetcode problems I've worked on so far.

## Tests
I didn't want to manage testing frameworks (Mockito, JUnit) or set up external dependencies (Maven or Gradle) so testing here is very BARE BONES. There were options when making this decision. I could have:
1. set up a complicated file system and include Maven or Gradle - pom.xml plus any dependencies plus goals or build.gradle plus all that as well.
2. set up a complicated file system and do *not* include Maven or Gradle build tools - then you're running tests from a completely separate directory which adds an unecessary level of complexity for these simple coding problem solutions.
3. do *not* set up a complicated file system - instead leave the test cases in their own class file but in the same directory as the coding solution class. Then the tests can be run separately from the solution class.
4. do *not* set up a complicated file system and add the test cases into the same file as the solution class - then the tests can be run at exactly the same time as the solution. Now we're talking - simple *and* easy!

Can you guess which I chose?

These require a flag: -ea which stands for -enableassertions because the keyword "assert" was not always a keyword, it was (in the distant past) not a reserved word. So today you can use the keyword
https://www.baeldung.com/java-assert

2025-06-13 13:21:51 - Some issues with running these small programs from the debugger (using launch.json).
1. Problem: The machine couldn't find main class because these files are no longer in a root directory - Solution: Have to hard-code the absolute file path to the solution file, example: "C:\Users\foski\Documents\coding-problems\leetcode\LC_11" because I don't have a single main function and I'm not building these with classpath.
2. Problem: Even with "-ea" flag and adding some System.out.println, the output was not changing - not showing even close to what I was expecting. Solution: Open the command pallete (F1 on Windows) and select "Clean the java language server workspace". It seems like a "clear the cache and cookies" oeparation that forced the machine to "rebuild" and reload the project.

