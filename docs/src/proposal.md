# Proposal
### The FlexScript scripting language
<br/>
*ICOM/CIIC - Introduction to Programming Languages*
Authors: Angel Garcia, Ezequiel Rosario, Christopher Torres
Review Manager: Wilson Rivera
Status: Pending

September 9, 2021

### Introduction
This proposal introduces a better scripting language that focuses on scalability and readability. Although we have languages such as LUA, python, bash, zsh and other scripting language, none was suited for large projects where dozens if not hundreds of scripts would be executed where scalability and maintenance could not end into a nightmare of a task for developers. Here we propose the creation of a language named "FlexScript" that tackles these issues using Java as a layer, similar to how C was used to create Python. 

### Motivation
Creating bash scripts whose syntax is somewhat loose or creating scripts with many dependencies like the ones seen in many node.js project. One then may argue the use of Python for scripting. While Python is a well-made and a popular scripting language, it can be slow and variable types could become a nightmare to manage due to its duck-typing perk. Although it is true that one could switch for a language that is faster and more robust, such as Java, it is a very large language, which makes it harder to master properly. 

As such, the Flex Team aims to provide a faster and more flexible alternative to Python and similar scripting languages. We aim to make a scripting language with a hybrid of the Object-Oriented Paradigm and Functional Programming Paradigm, giving it the ease of use by keeping the language as small as possible (much like Lua), yet with flexibility and scalability. 

### Scope
-
-
-

### Language Features
Most scripting languages on the UNIX side focus on the functional programming paradigm and lack any possibility to greatly expand as a language being just managing a bunch of files or simple control-flow in small simple scripts. By adding OOP features, a scripting language could easily be utilized for large scalable projects. To put it simple, FlexScript is made so you can fix your problems then and there, having the best of functional programming languages like bash, while also bringing OOP elements like PowerShell does.

With the use of object-oriented programming (OOP), another feature that will greatly increase the ease of access for users is the creation of Drag and Drop (D&D) programming features. Implementing D&D features into FlexScript will allow both new and veteran programmers to create scripts, functions, sets, lists, and other coding elements in an easy and personalized fashion. 

### Example of a program in FS

```
-- Hello World

-- let this file be named "hello_world.fs"
-- Each file represents a class, much like in java, except that in FS its not necesary to specify such class

--[[
This is a 
multiline comment
]]--

source printf from std

function main() -> () {
        printf("Hello World"); 
    }

-- This is a simple class of type i32, aka, integer
class vehicle() <- i32:? {
    function self -> () {
        let price <- i32;
        -- Another way...
        let price_2 <- i32 = 2000;
        }
    
    function get_price() -> i32 {
        return self().price;
    }
    
    function set_price(new_price <- i32) -> () {
            self().price = new_price;
        }
}

-- In: FS, everything must be wrapped around a function or a class. 
global fun_var = function() -> () {
        printf("Yes, you can do this too");
    }

-- By default, all functions are public, so if you want privacy
-- Just say it
private function priv_fun() -> str {
        printf("Other files won't be able to use me");

        -- About loops
        -- This example shows a loop that goes from
        -- 1 to 10
        for i in 0..10 do {
                something;
            }
        
        -- Loops can algo go "wack"
        for (i, j, k) in three_d_arr do {
            something;
        }

        -- Arrays
        let arr <- array[@ <- str] = {"s", "r", "4"};
        let k <- i32;
        k = 0;
        k = k + 1;
        -- you cannot do k++ nor k+=1, get over it
    }
}
```

### Implementation requirements and tools

FlexScript will be based on the Java programming language, using JFlex as our lexical analyzer generator to identify and read certain characters and make functions to ease the coding process. For the user, the lexer can be utilized to define and read expressions, recovering from errors faster, which allows the program to continue despite them, whenever possible.  

The AWT and Swing libraries will also be crucial for the creation of a D&D environment. UI design and mouse interaction are necessary for a proper interactive space.  

Lastly, JavaParser will be used redundantly as a parser for our project. A parser will allow an Abstract Syntax Tree (AST) to interact with the code as objects, allowing us to obtain the OOP environment we envision. 

### Project Timeline

<p align="center">
    <a href="https://github.com/FrenzyExists" target="_blank">
        <img src="Timeline.png" alt="Timeline" width="1020"/>
    </a>
</p>

### Impacts/Backwards Compatibility Issues

### Reference

