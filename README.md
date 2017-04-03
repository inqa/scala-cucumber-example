# Example Cucumber Scala project

About writing Cucumber tests
-------------------------
First and foremost, go away and learn about how to write scenarios and feature files using Cucumber, and make some decisions on the style of writing tests

My general approach is to use a declarative style for .feature files, such that they contain no direct reference to the UI/application or how to do the action. In this case, the .feature files should consider WHAT the user wants to achieve.

And what follows is the step definitions indicate HOW to perform the actions to do what the user wants to achieve.

A really good way to think about this is to imagine that your application under test is going to be completely re-written in the future, but conceptually the user will want to do the same things, but will have to do them in a different way. This should mean that your .feature files are still valid with a new application and you have your tests already in place. And then your step definitions (the HOW) would need to be re-written.

About the project
--------------
1. Get started with your .feature files and writing them.
    Add more into src/main/resources/features
2. Implement your step definitions
    Assuming you're using Intellij, you can install the Cucumber plugin, and this can help you create step definition methods automatically (well, you do still have to write the content of the methods).
3. Create a Test Runner class to run your tests
    See "InQATestRunner.scala" for the correct syntax with Scala/Cucumber. If you're renaming classes/moving things around then it should be evident in here what you need to update


Running Cucumber Tests using Maven
-----------------------------
mvn clean scala:testCompile test


Running Cucumber Tests using the TestRunner classes
--------------------------------------------
Assuming you're using Intellij, you can simply right click on your test runner class and press Run.
In this example project, this is the "InQATestRunner" class. I'd imagine you'd want to rename this or have multiple test runner classes with some variations on tags to use.


Rather an important note
---------------------
This project requires Scala SDK 2.11.x (or potentially below - I haven't checked).

At the moment 2.12.x doesn't work - it produces the issue raised at: https://github.com/cucumber/cucumber-jvm/issues/1087


Suggested Reading:
-------------
* The Cucumber for Java Book: Behaviour-Driven Development for Testers and Developers: see https://www.amazon.com/Cucumber-Java-Book-Behaviour-Driven-Development-ebook/dp/B00V20IEXM/ref=sr_1_1?ie=UTF8&qid=1491248538&sr=8-1&keywords=cucumber+jvm
While the title indicates this is just about Cucumber and Java, this book is a great introduction to BDD concepts and how to implement it for your project. It covers subjects like how to write your scenarios.

