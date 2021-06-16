# CS 445 Recitation 5: Recursion and Divide & Conquer

## Introduction

In this lab, you will design, implement, and test several recursive algorithms.
The primary goal is to practice devising a recursive solution, with and without divide & conquer, to a problem, and
then implementing that solution in code. Recall the general steps to devising a
recursive solution:

1. **Identify the subproblems:** What smaller (yet structurally identical)
subproblems will be used to solve the original problem? Note that in divide &
conquer, these must be *fractional* in size, relative to the original problem.

2. **Identify how answers are composed:** Once the solutions to the subproblems
are in hand, how can they be combined to get an answer to the original problem?

3. **Identify the base cases:** What are the small problems that can be solved
directly, without recursion?

4. **Verify termination:** Ensure your solution will not cause infinite
recursion.

Recursion can be confusing to comprehend at first, so we recommend (in addition
to class material) watching some visual explanations of the process. Here is a
link that will help you solve the first part of the lab and prepare you for the
latter parts:

[Recursion with Gayle Laakmann McDowell](https://www.youtube.com/watch?v=KEEKn7Me-ms)

The video was made by Gayle Laakmann McDowell, a big name in the programming
world. She wrote *Cracking the Coding Interview*, which has helped many people
succeed in tough interview questions in the biggest companies in the world. It
is a useful resource to prepare for your career moving forward.

## Gradle Testing on GitHub

In this exercise, in addition to using `./gradlew run` (or `gradlew.bat run` on DOS-like terminals) to run a sample client program, you can also use `./gradlew test` (or `gradlew.bat test` on DOS-like terminals) to execute pre-written unit tests. These tests use JUnit and attempt to reveal whether the assigned methods work as expected.

Recall your programming assignments will come with unit tests that will be run for you each time you push to your submission repository. These will automatically be enabled for your assignments. Don't forget that you'll need to navigate to the "Actions" tab on GitHub and enable these tests for this Recitation.

Also, you can check if these methods work as expected with class `Testers`! This class calls each of the below exercise methods on a few instances, but you should convince yourself that they work in *all* scenarios.

## Exercise

Write the following methods inside of class `Recursion` and class 'DivideAndConquer'

```
/**
 * Reverses the order of the objects in an array
 */
static <T> void reverse(T[] a)
```

```
/**
 * Determines the minimum and maximum element of an array of ints
 */
static MinMax findMinMax(int[] nums)
```

Be sure to test that your methods pass the provided JUnit tests by running `./gradlew test` (or `gradlew.bat test` on DOS-like terminals) and when pushing to the GitHub repository using the `git push` command.

## Conclusion

In this exercise, you practiced using Recursion in order to reverse the contents of an array and find the min and max of an array by breaking the problems down into similar subproblems. In addition to Tail Recursion, you utilized Divide and Conquer techniques to solve the same problems by breaking the problems into *fractional* subproblems. While the asymptotic runtimes of both approaches were the same in these exercises, we will study problems later in the course where Divide and Conquer approaches have a lower asymptotic runtime.