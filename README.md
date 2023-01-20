## _**The Pizza Restaurant Simulator**_

### Background Information

**Developers** - Manon Mampaey (mamp0002) and Shirel Snopik (snop0001) 

**Base code and lecturer** - Andries Nieuwenhuize

During our course of SDE year 2 of ICT in HZ We were taught about design patterns.   
**“Design patterns** are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code. ”(Refactoring Guru [https://refactoring.guru/design-patterns/what-is-pattern)](https://refactoring.guru/design-patterns/what-is-pattern)  
There are 3 types of design patterns:

1.  Creational Design Patterns - that provide mechanisms to increase flexibility and the option to reuse code.
2.  Structural Design Patterns - that configure large structures of objects and classes and ensure flexibility and efficiency in the code.
3.  Behavioral Design Patterns - Take care of assigning responsibilities between objects. 

As part of the course, we were given an assignment to implement a program that would use different design patterns and at least one of each kind.   
Together Manon and Shirel came up with the idea of a restaurant simulator.

### About the program

The program is a console-based app where an imaginary scenario is played where the user enters a pizza restaurant. Once entering, the host presents himself and will ask for the customer's preference of language and some basic details to make the program feel a bit more personal. After the initial dialog is complete, the host will show the user his table and from there on the waiter will take care of the user. During the interaction with the waiter, the user will be able to choose a type of pizza he would like to order and then the program will continue running, imitating the scenario of  ordering, receiving the food, giving review and lastly paying.   
In short, the patterns were included as follows:

#### Creational Patterns:

1.  Builder - This pattern was used to build the initial conversation between the user and the host.
2.  Factory method - This pattern was implemented together with the Builder to create the option of choosing between Dutch and the English languages.

#### Structural Patterns:

1.  Adapter - The adapter pattern was included to allow the program to understand different inputs from the user and make it more flexible.
2.  Facade -  To make the main class have just the responsibility of starting the program but not handle of the functionality of the restaurant, now the main class creates a facade instance and the facade will run all the different methods in the right order.

#### Behavioral Patterns:

1.  State - The state pattern was added for the smoothness of the program to be auto moving. Here, the state represents the waiter in the restaurant, which moves between actions of interacting with the user and with the kitchen.   
    States include - idle, taking order, has order, has food, taking review, has complaints, has payment and has no more pizzas.
2.  Template method - The template method was added to create a variety in the selection of pizzas offered and created in our simulation.  
    The options include - Vegan, Vegetarian, Classic and Whole Wheat.

### The process

Creating this program was a team effort between the two developers. From the brainstorming phase of coming up with the idea of the program and researching which design pattern we would like to use, in which manner everything was done together as a pair.   
For the programming and development of the app, we chose to work in the method of pair programming where each time we alternated between one being the driver and the other being the observer. We tried to do this when we completed the implementation of one design pattern and moved to the next.   
Because this is our first time building a program from scratch that combines different design patterns, we preferred working this way in order to be involved in each step and truly understand what is being done. It allowed us to think creatively, help to, learn from, and teach each other.   
It can also be seen from the git history, the use of two different languages and the size of the program, because we chose to implement two patterns for each kind instead of just one.  

---

## Creational Patterns

The [CKEditor 5 WYSIWYG](https://ckeditor.com/) editor lets you use this flexible yet simple markup language in the GitHub flavor. The editor-produced Markdown output supports the most important features, like [links](https://ckeditor.com/), **different** kinds of _emphasis_, `inline code formatting` or code blocks:

```css
p {
    text-align: center;
    color: red;
  }
```

## Formatting blocks with Markdown

Markdown can be used to create various block-level features, such as:

*   Block quotes
*   Headings
    1.  Heading 1
    2.  Heading 2
    3.  Heading 3
*   Lists, including nested ones
    *   Numbered lists
    *   Bulleted lists
    *   To-do lists

## Support for tables in Markdown

Bear in mind that Markdown has only very basic support for tables, so things like table styles or merged cells will not work.

|   | Income | Revenue |
| --- | --- | --- |
| Walker 3 | $104.000 | 15% |
| Stroller | $12.000 | 10% |
| Runner | $97.500 | 15% |