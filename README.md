# CSA Tetris - Stage 2

In this stage, you will be creating two new objects: `Hopper` and `BlockStore`.
`Hopper` will store and keep track of the shapes that are in the queue to fall next.
`Hopper` serves as an abstraction for determining what shape should come next.
`BlockStore` will keep track off all the blocks that have fallen from previous shapes.
`BlockStore` serves as an abstraction for determining whether a shape will collide with fallen blocks;
it will also clear rows as they fill up horizontally.

### Introducing JUnit

JUnit is a Java library that helps you test your code against your expectations.

Every method with the `@Test` annotation is called a test case.
Every test case is added as a separate method within the test class.
Make sure that your test case methods are small and only test *ONE THING AT A TIME*.
Add javadoc comments above all of your test case methods.

Go to `JUnitIntro.java` to see examples of JUnit tests.
To run the tests, type `./run_junit_intro_tests.sh` into your terminal.


### Compiling and Testing Stage 2 Code

To compile and run the JUnit tests:

- For `Hopper`: `./run_hopper_tests.sh`
- For `BlockStore`: `./run_block_store_tests.sh`


### Tasks for this Assignment

 - [] Fix JUnitIntroTest.java (get the single test to pass)
 - [] Fix Hopper.java (there are two issues). 
 - [] Write at least 2 more test cases in HopperTest.java
 - [] Fix BlockStore.java 
 - [] Write at least 1 test case for ever method in BlockStore.java

### Turn In

Use your GitHub repository to turn in your assignment. Complete each task one at
a time. Once you've completed the task and it work as you'd like, commit and push it.

Check the status of your repository. Notice that the files you've modified are listed:

`git status`

Add the files you want to commit to the staging area (do multiple times for multiple files):

`git add <your_file>.java`

Commit the staged files (include the task description from the assignment): 

`git commit -m "Task: TASK DESCRIPTION"`


Push your commits back to GitHub:

`git push`
