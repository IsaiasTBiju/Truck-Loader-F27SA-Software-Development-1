# Truck Loader (F27SA: Software Development 1)
This CW assessed Weeks 1–5: GitLab pull/push; creating, storing and accessing variables; types; expressions using operators, variables and values; conditional decision-making; creating, storing, accessing and iterating through arrays; loops for repetitive behaviour; and nesting conditionals within loops or vice versa.

## Programme Behaviour

The **Truck Loader** program is a simple database-style Java application for recording and retrieving information about boxes being loaded onto a truck.

When the program starts, the user is asked to enter the maximum number of boxes that can fit inside the truck. This value determines how many box records the program will accept. The program then goes through each box one at a time and asks the user to provide three pieces of information:

* The **customer name** associated with the box.
* The **weight of the box in kilograms**.
* Whether the box contains **dangerous goods**.

The information for the boxes is stored using three separate arrays. One array stores customer names, another stores box weights, and a boolean array stores whether each box contains dangerous goods. The same array index represents the same box across all three arrays. For example, index `0` in each array contains the customer name, weight, and dangerous-goods status of the first box.

Dangerous-goods information is stored as a boolean rather than as text. A value of `true` represents a box containing dangerous goods, while `false` represents non-dangerous goods.

### Menu and Searching

Once information for all boxes has been entered, the program displays a menu that allows the user to work with the stored records. The user can choose to:

* **List all boxes** – displays the customer name, weight, and dangerous-goods status for every box currently stored.
* **Search by customer name** – asks for a customer name and displays all boxes belonging to that customer.
* **Search by dangerous-goods status** – allows the user to display either boxes containing dangerous goods or boxes containing non-dangerous goods.
* **Quit** – ends the program and displays a farewell message.

The menu is placed inside a loop, meaning that completing a search or displaying the records does not immediately end the program. Instead, the menu is shown again so that the user can perform another operation. This continues until the user explicitly chooses the quit option.

### Overall Flow

The program therefore follows four main stages:

1. Read the maximum number of boxes from the user.
2. Collect and store the details of each box in the appropriate arrays.
3. Allow the user to view or search the stored box records through the menu.
4. Continue displaying the menu until the user chooses to quit.

The implementation makes use of core Java concepts including variables, data types, arrays, loops, conditional statements, user input with `Scanner`, and nested control structures.
