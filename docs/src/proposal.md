# Proposal
### The FlexScript scripting language
<br/>
*ICOM/CIIC - Introduction to Programming Languages*
Authors: Angel Garcia, Ezequiel Rosario, Christopher Torres
Review Manager: Wilson Rivera
Status: Pending

September 9, 2021

### Introduction
This proposal introduces a better scripting language that focuses on scalability and readability. Although we have languages such as lua, python, bash, zsh and other scripting language, none was suited for large projects where dozens if not hundred of scripts would be executed where scalability and mantainance could not end into a nightmare of a task for developers. Here we propose the creation of a language named "FlexScript" that tackles these issues using Java as a layer, similar of how C was used to create Python.

### Motivation
Creating bash scripts whose syntax is somewhat loose, or creating scripts with many dependencies like the ones seen in many python scripts can become combersome for many developers. Therefore, a lightweight scripting language that posses an OOP paradigm and consistent yet flexible syntax is desired, especially, if such scripting is in constant expansion.

### Scope
-
-
-

### Language Features


### Example of a program in FS

```
-- Hello World

-- let this file be named "hello_world.fs"
-- Each file represents a class, much like in java, except that in FS its not necesary to specify such class

--*
This is a 
multiline comment
*--

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
        let arr <- array[:str:] = {"s", "r", "4"};
        let k <- i32;
        k = 0;
        k = k + 1;
        -- you cannot do k++ nor k+=1, get over it
    }

```

### Implementation requirements and tools

### Project Timeline

### Impacts/Backwards Compatibility Issues

### Reference

