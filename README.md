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
2.  Facade -  To make the main class have just the responsibility of starting the program but not the functionality of the restaurant, now the main class creates a facade instance and the facade will run all the different methods in the right order.

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

**ERD of all the program classes:**

**\*\*all images included here are also uploaded in our github files at** [https://github.com/snop0001/SDE-Restaurant-Program/tree/main/documentation**\*\***](https://github.com/snop0001/SDE-Restaurant-Program/tree/main/documentation**)

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/e7e0fa9287cadeb0eca37e53f44029d75d4807bf8279adda.png)

---

## Creational Patterns

### Builder + Factory

In our app, the creational patterns take care of the entire initial interaction between the user and the “host” of the restaurant.  

*   The interface of ConversationBuilder creates all the different methods that will be used to build a conversation.  
     (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/ConversationBuilder.java)
*   The Conversation Director manages the conversation creation in its entirety with the personalization of its settings, from language to name, and number of guests that arrive at the restaurant. (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/ConversationDirector.java)
*   Dutch and English ConversationBuilders, each one creates and implements all the different methods in the conversation builder according to the language chosen.  
     (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/DutchConversationBuilder.java   
     [https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/EnglishConversationBuilder.java](https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/EnglishConversationBuilder.java) )

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/0af1ed7eb614f0cee2df7619c1f8bed854d0715caa82b367.png)

---

## Structural Patterns

### Adapter

The adapter pattern was included in the program to allow the app to react to different inputs that will mean the same in a day to day conversation. This was meant to make the application more flexible and give a “natural” feeling to the interactions.

*   BooleanAdapter Interface, sets the method that needs to be implemented in each adapter (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/BooleanAdapter.java)
*   OrderBooleanAdapter, sets the acceptable answers that will return true and, if not false. This will be used when an answer is accepted to the question of “what would you like to order”. This adapter checks if the user has chosen a food item that exists in the restaurant or not. It allows for a variety of answers. For example, if a customer wants a vegetarian pizza, both “vegetarian” and “vegetarian pizza” will be accepted as valid.   
    (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/OrderBooleanAdapter.java)
*   NoComplaintsBooleanAdapter, sets the acceptable answers a user may give to the program if he has no complaints about the food or the restaurant. The adapter will return true if there are no complaints (the answer matches one of the set options) or false if there were complaints (the answer doesn't match the options set). (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/NoComplainsBooleanAdapter.java)

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/3fdf07fa0bad5f08c012b04851928697846b9568191d5ea6.png)

### Facade

(https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/RestaurantFacade.java)

The facade handles the management of the restaurant :

*   Configuring the restaurant according to the basic settings received from the user (as the player of the simulator, for example, language, starter amount of pizzas and so on).
*   Configuring and initializing the conversation with the host of the restaurant
*   Configuring the order and running the waiter states and interactions.

This allows for the main class to be in charge only of initializing the simulator and setting the starter settings such as language. From there on, the control goes to Facade, which will run the different aspects needed for the restaurant simulator to function properly.

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/bbcc4549c5ba35667de468c63c5b0e226b6fdc213f70b96a.png)

---

## Behavioral Patterns

### State

The state patterns allow the smooth transition between different stages of our simulator. In the program, the different states simulate the waiter of the restaurant, who at different steps of handling the customer will need to act differently. The stages change three different methods - interacting with the costumer, interacting with the kitchen staff and refilling the amount of pizzas.  Important to mention, the interaction language will also change according to the language chosen in the initialization of the simulator.

**Flow chart of how the different states relate to each other:** 

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/0cddc0615f9043ebb7369c88226ad4c11026fe329c684391.png)

  
**The different states are:**

*   Idle - when there isn't an active customer interacting with the restaurant (at the beginning and end of the simulation). (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/IdleState.java)
*   Taking order (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/TakingOrderState.java) - when the waiter approaches the customer to get his order, the following state and answers vary:
    *    according to the amount of pizzas left - if there are none left, the waiter will mention that to the client and will go to the state of HasNoMorePizzas.
    *   If there are pizzas left, the waiter will take the order (using the OrderBooleanAdapter):
        *   If the answer received exists in the restaurant, the waiter will accept the order and move to HasOrder state
        *   If the answer received does not exist, the waiter will ask again for the order and specify that this item does not exist in the restaurant.
*   Has order (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/HasOrderState.java) - here the main interaction is with the kitchen. According to the answer received from the user, the correct pizza will be created (using the template method pattern explained below), when the food is ready it will be collected by the waiter to be served to the customer and the following state of HasFood will be called.
*   Has food (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/HasFoodState.java) - when the waiter collects the food from the kitchen, he will serve it to the customer. Then the state will move to TakingReviewState.
*   Taking review (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/TakingReviewState.java) - Here the waiter will ask the customer if they have any complaints, and by using the NoComplaintsBooleanAdapter, will take his next step:
    *   If the customer has complaints, the next state will be HasComplaints.
    *   If the customer is satisfied according to the adapter, the following state will be HasPayment.
*   Has complaints (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/HasComplainState.java) - The waiter in this state will apologize to the customer and will offer him to order again, now the state of the waiter will move back to TakingOrderState.
*   Has payment (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/HasPaymentState.java) - The waiter will thank the customer and offer them the bill for the meal, in this concluding the simulator and moving the waiter to the idle state.
*   Has no more pizzas (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/HasNoMorePizzasSate.java) - In case the restaurant is out of pizzas, the interaction will be with the refill method where the waiter will interact with the kitchen and update the amount of pizzas according to what was set previously by the user.

**Additional Files related to this pattern:**

*   Waiter class (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/Waiter.java) - will configure the waiter himself, all his methods, and extra properties needed to run the restaurant interaction:
    *   All the states and their methods will be initialized. These methods will be used in the states themselves to transition between one and the other.
    *   the amount of pizzas so the states will be able to track when there are no more left and update the count when the refill was triggered.
    *   The reader and writer, so the waiter will be interactive with the user.
    *   The adapters that are being used for the different answers the waiter accepts.
    *   The interactions themselves with the user or the kitchen and the refill of the pizzas (are configured in each state as well).
    *   Getters for the settings: language, count of pizzas, answers received
    *   Setter for the state of the waiter.
*   State interface (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/State.java) - sets the methods that will be implemented in each state - the interactions with the customer, kitchen and refill action.

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/9ae7e93012676c5054dbb696e41af5b30a9c9a79a420d7dc.png)

### Template Method

The template method was added to create a variety in the selection of pizzas offered and created in our simulation.  
The options include - Vegan, Vegetarian, Classic and Whole Wheat.

*   Pizzas abstract class (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/Pizzas.java) - will set the default methods that all types of pizzas will implement, the specific methods that will change between each type (toppings and cheese) and the general method that will implement all the different steps, no matter the type of pizza created.   
    This class will be extended by these classes (the different implementations and types of pizzas):
    *   Whole Wheat Pizza - will offer healthy options, including low fat cheese. (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/WholeWheatPizza.java)
    *   Classic pizza - will combine cheese with meat and vegetables. (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/RegularPizza.java)
    *   Vegan Pizza - will offer vegan cheese and toppings. (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/VeganPizza.java)
    *   Vegetarian Pizza - will include no meat in the toppings. (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/VegeterianPizza.java)

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/b7ce4ad76e33fdff74776482bd02c695fa7a8a64caf856ec.png)

---

### Additional Files used:

These files were not written by us and used from Andries\`s code used during lectures (as well some of the patterns used basic code from his lectures as well):

*   Console Reader (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/ConsoleReader.java) - to allow the program to read inputs made by the user
*   Console Writer (https://github.com/snop0001/SDE-Restaurant-Program/blob/main/src/com/hz/ConsoleWriter.java) - prints the lines to the console

## Hope you enjoyed our program!

Manon and Shirel :)