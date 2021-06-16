# CS 445 Recitation 5: Recursion and Divide & Conquer

## Introduction

In this lab, you will design, implement, and test several recursive algorithms.
The primary goal is to practice devising a recursive solution, with and without
divide & conquer, to a problem, and then implementing that solution in code.
Recall the general steps to devising a recursive solution:

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
link that you might consider taking some time to review:

[Recursion with Gayle Laakmann McDowell](https://www.youtube.com/watch?v=KEEKn7Me-ms)

The video was made by Gayle Laakmann McDowell, a big name in the programming
world. She wrote *Cracking the Coding Interview*, which has helped many people
succeed in tough interview questions in the biggest companies in the world. It
is a useful resource to prepare for your career moving forward.

## Gradle Testing on GitHub

As with other recent exercises, we have provided several example tests for this
exercise. In addition to using `./gradlew run` (or `gradlew.bat run` on DOS-like
terminals) to run a sample client program, you can also use `./gradlew test` (or
`gradlew.bat test` on DOS-like terminals) to execute JUnit-based tests. Check
both to make sure your solutions work as expected.

Recall that your programming assignments come with unit tests that run each time
you push to your submission repository. These are automatically enabled. If you
fork this recitation repository and want the included tests to run in your fork,
you'll need to navigate to the "Actions" tab on GitHub and enable them.

## Exercise

1. Download the provided code by forking and cloning this [Recitation 5
repository](https://github.com/2217-cs445/cs445-rec5). The starting code for
this exercise, as usual, is found in subdirectory `app/src/main/java/`. Navigate
to this subdirectory, then into the `cs445/rec5/` package folder within it. Note
the following provided Java files:

   - `Recursion.java` contains method stubs for today's exercises (non-D&C
     versions), as well as a few helper methods.
   - `DivideAndConquer.java` contains method stubs for today's exercises (D&C
     versions), as well as a few helper methods.
   - `Testers.java` contains a few tests for today's exercises inside of a
     `main` method. It is run when you execute `./gradlew run` (or `gradlew.bat
     run` on DOS-like terminals).

2. Implement the following methods in `Recursion.java` using recursion. First tackle them using "standard" recursion (i.e., without divide & conquer).

       /**
        * Reverses the order of the objects in an array
        */
       static <T> void reverse(T[] a)

       /**
        * Determines the minimum and maximum element of an array of ints
        */
       static MinMax findMinMax(int[] nums)

3. Test that your methods pass the provided tests.

4. Implement the above methods again in `DivideAndConquer.java`, this time using
divide & conquer recursion.

5. Test that your methods pass the provided tests.

## Conclusion

In this exercise, you practiced using recursion in order to reverse the contents
of an array and find the min and max of an array by breaking the problems down
into similar subproblems. In addition to simple recursion, you also utilized
divide & conquer techniques to solve the same problems by breaking the problems
into *fractional* subproblems. While the asymptotic runtimes of both approaches
were the same in these exercises, we will study problems later in the course
where divide & conquer approaches have a lower asymptotic runtime.

