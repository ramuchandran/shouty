A simple BDD- Cuccumber project

Tips and Tricks :
----------------------------------------------------------------------------------------------------
Skeleton project is available in GitHub , Search for "Cucumber Java Skeleton"




Interview Questions on Cucumber
----------------------------------------------------------------------------------------------------

-What is BDD ?

BDD is an approach that collaboratively specifies the system's desired behaviour. Each time a piece of behaviour is agreed, we use that specification to "drive" the development of the code that will implement that behaviour.

-What are the three practices of BDD, and in what order do you apply them to a story?

Discovery - Formulation - Automation
We start by collaboratively discovering the scope of the behaviour required by the story. Once we have agreed on that behaviour, we formulate the specification in business-readable language. Finally, we automate the formulated specification to verify that the system actually behaves as expected.

-How are Cucumber and BDD related?

BDD is a collaborative way of working for teams that can include using Cucumber
Cucumber is a tool that understands your documentation and turns it into automated tests.
BDD is a collaborative approach, made up of three practices. BDD practitioners may use Cucumber to automate their documentation

-What do we mean by “living documentation”

Documentation that can be automatically verified against the application
Documentation that tells you when it's out of date
"Living documentation" automatically tells us when the system and the documentation are out of sync. This may be for one of several reasons:

the behaviour specified has not yet been implemented
the implementation contains a defect
the documentation is out of date

-BDD practitioners prefer comprehensive documentation over collaboration - False

BDD is a collaborative activity. Living documentation is a secondary, valuable, output of applying BDD practices.


-What’s the relationship between BDD and agile?

BDD is a collection of practices that build upon agile ways of working, helping teams succeed. For these practices to deliver value, you'll need to be working in an agile way.

-What is it about User Stories that helps a team to do BDD?

User stories were created to be "placeholders for a conversation." They allow us to defer detailed analysis until we're confident that the behaviour they describe actually needs to be developed.

-Why do we call it “Three Amigos”?

The goal of a three amigos meeting is to ensure that the team fully understand the scope of the story being discussed. For this to be effective, we need to have at least three different perspectives represented at the meeting.

More than three people might attend a three amigos meeting, because:
some stories are broad enough to require the input of more than three perspectives
more than one representative of each perspective may attend


-Who are the three amigos?

The essential three perspectives required are:
customer / business perspective - usually provided by the Product Owner
development perspective - usually provided by a Developer
test perspective - usually provided by a Tester


-The group discovered a new business rule during the meeting. Why?

The whole purpose of the three amigos meeting is to discover things about the story that weren't previously obvious. We should expect to learn new things during a three amigos meeting.


-Why are questions a valuable output from a discovery session?

We want to discover our areas of ignorance before we start developing the next piece of functionality. If we still have unanswered questions about a piece of functionality, it's unlikely that we're in a position to start working on it.

Before the discovery workshop, the question hadn't been asked. That means it was an unknown unknown - it was something that we were completely unaware of. Now that we have asked the question, it is a known unknown - we are aware that it is an area that we need to learn more about.

Having discovered the question, the team now has a concrete area to investigate, learning more about the problem they're being asked to solve.

-Why are testing skills valuable during discovery?

The test perspective is essential during the discovery process. It allows us to ask difficult "what if " style questions that ensure that we have thought about the story in detail. The team use concrete examples to test their understanding of what they're being asked to deliver, while also testing the product owner's understanding of the functionality they're asking for.


-What is Gherkin?

Gherkin is a simple syntax that allows teams to write business readable, executable specifications. 
Some of the Gherkin keywords are Given, When, and Then, but not all text that uses these words is Gherkin.
Gherkin is understood by a large number of tools, notably Cucumber and Specflow, that effectively turn the specification into automated tests.

-What’s the relationship between a scenario and an example?

During three amigos the team uses concrete examples to ensure that they have a shared understanding of the functionality they're about to develop. Those concrete examples are formulated into Gherkin scenarios.

So, each scenario is an example.
Scenario and Example are both keywords in Gherkin.

-What’s an advantage of using Gherkin to express our examples in BDD?

Gherkin is just one way of expressing examples of how you want your system to behave. The advantage of using this particular format is that you can use Cucumber to test them for you, making them into Living Documentation.

-Which of these are Gherkin keywords? (Scenario,Given,When,Then)

We've introduced four Gherkin keywords so far: 

Scenario tells Cucumber we’re about to describe an example that it can execute.
Given, When and Then identify the steps of the scenario.
There are a few other keywords which will be introduced later in the course.

-The Gherkin keywords Given, When and Then, allow us to express three different components of a scenario.

Which of these statements correctly describes how each of these keywords should be used?

Given is the context for the scenario. We’re putting the system into a specific state, ready for the scenario to unfold.

When is an action. Something that happens to the system that will cause something else to happen: an outcome.

Then is the outcome. It’s the behaviour we expect from the system when this action happens in this context.

-Why did our scenario not mention anything about Lucy walking into Sean’s store and making a purchase?

Behaviour-Driven Development practitioners definitely do care about business goals, but when we're writing the Scenario part of our Gherkin, we need to focus on the observable, testable behaviour of the system we're building.


-What does it mean when Cucumber says a step is Undefined?

Each line in a Scenario that begins with one of the Given / When / Then keywords is called a step.

When Cucumber tells us that a step is undefined, that means it doesn't know what we want it to do in order to automate that step. We have to tell Cucumber what to do by providing step definitions.

-What do step definitions do?

Step definitions are Java methods that actually do what's described in each step of a Gherkin scenario.

When it tries to run each step of a scenario, Cucumber will search for a step definition that matches. If there's a matching step definition, it will call the method to run it.

-What does it mean when Cucumber says a step is Pending

Cucumber tells us that a step (and by inference the Scenario that contains it) is Pending when the automation code throws a PendingException.

The PendingException is a special type of exception provided by Cucumber to allow the development team to signal that automation for a step is a work in progress. This makes it possible to tell the difference between steps that aren't finished yet and steps that are failing due to a defect in the system.

For example, when we run our tests in a Continuous Integration (CI) environment, we can choose to ignore pending scenarios.

-Which of the following might you want to consider when using a snippet generated by Cucumber?

When Cucumber generates a snippet, it has no idea of the business context of the undefined step. The implementation that Cucumber generates will definitely not automate what's been written in your Gherkin - that's up to you! 

Also, the name of the method and the parameters are just placeholders. It's the job of the person writing the code to rename the method and parameters to reflect the business domain.

-What’s the next step in BDD after we’ve pasted in the step definition snippet and seen it fail with a pending status?

If you read the comment in the generated snippet, Cucumber is telling you to "write the code you wish you had".

You need your step definition to call your application and do whatever the Gherkin step describes. In the case of our first step here, we want to tell the system that there are two people in certain locations.

We can use the act of fleshing out the body of our step definition as an opportunity to do some software design. We can think about what we want the interface to our system to look like, from the point of view of someone who needs to interact with it. Should we interact with it through the User Interface, or make a call to the programmer API directly? How would we like that interface to work?

We can do all of this without writing any implementation yet.

This is known as "outside-in" development. It helps us to ensure that when we do come to implementing our solution, we're implementing it based on real needs.


-How can you express in a Cucumber Expression that matching some text is optional?

Any text in a Cucumber Expression that is surrounded by parentheses `()` is considered optional.

-What does a slash `/` separating words mean in a Cucumber Expression?
Words in a Cucumber Expression that are separated by a slash `/` are considered alternates. There must be no whitespace between the word and the slash.

-Which of the following Cucumber Expressions would match both "Given it weighed 3 grammes" and "Given it weighed 1 gramme"?

Any text surrounded by parentheses `()` is considered optional.
Any words separated by a slash `/` are considered to be alternates. 
You can find full documentation about Cucumber Expressions at https://cucumber.io/docs/cucumber/cucumber-expressions

-What role do Regular Expressions play in Cucumber Expressions?

We use a Regular Expression to specify the text that should be matched when a custom Parameter Type is used in a Cucumber Expression.

-How would you use the custom Parameter Type defined by the following code?


@ParameterType("activated")
public Status state(String activationState) {
    return new Status(activationState);
}

The name of a custom Parameter Type is defined by the name of the method that is decorated with the `@ParameterType` annotation.


