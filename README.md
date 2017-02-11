# CSA Tetris - Stage 2

In this stage, you will be creating two new object types: `Hopper` and `BlockStore`.
`Hopper` will store and keep track of the shapes that are in the queue to fall next.
`Hopper` serves as an abstraction for determining what shape should come next.
`BlockStore` will keep track off all the blocks that have fallen from previous shapes.
`BlockStore` serves as an abstraction for determining whether a shape will collide with fallen blocks;
it will also clear rows as they fill up horizontally.

### Introducing JUnit

JUnit is a Java library that helps you test your code against your expectations.
Every test case is added as a separate method within the test class.
Make sure that your test case methods are small and only test *ONE THING AT A TIME*.
Add javadoc comments above all of your test case methods.

### Compiling and Testing Stage 2 Code

To compile and run the JUnit tests:

- For `Hopper`: `./run_hopper_tests.sh`
- For `BlockStore`: `./run_block_store_tests.sh`
