# Sel_WDMar_2026

## Overview
This repository contains Java learning materials for the Selenium WebDriver March 2026 batch, focusing on fundamental Java concepts including data types, control statements, and operators.

## Course Structure

### Week 1 - Java Fundamentals

#### Day 2: Core Concepts

This day covers essential Java programming concepts:

1. **Primitive Data Types**
2. **Control Statements** (if-else, switch)
3. **Increment and Decrement Operators**

---

## Files in Week1/day2

### 1. LearnPrimitiveDatatype.java
**Topics Covered:**
- Variable declaration and initialization
- Primitive data types:
  - `byte` - Small integer values (e.g., employee age)
  - `short` - Medium integer values (e.g., employee ID)
  - `int` - Standard integer values (e.g., employee salary)
  - `long` - Large integer values (e.g., phone numbers)
  - `float` - Decimal values (e.g., interest rate)
  - `boolean` - True/false values (e.g., insurance status)
  - `char` - Single character (e.g., initials)
  - `String` - Text/sequences (e.g., names)
- Memory efficiency with primitives
- String concatenation operator (+)
- Output formatting with `System.out.println()`

**Key Concepts:**
- Variables store memory/values for business logic processing
- Each primitive type has a specific size and use case
- Proper suffixes for literals (L for long, F for float)

---

### 2. LearnControlStatements.java
**Topics Covered:**

#### A) Conditional Statements
- **Basic Operators:** + - * / %
- **Relationship Operators:** > < >= <= == !=
- **Logical Operators:** && (AND), || (OR), ! (NOT)

#### If-ElseIf-Else
```java
if (condition) {
    // Execute if true
} else if (another condition) {
    // Execute if first condition is false and this is true
} else {
    // Execute if all above conditions are false
}
```

**Real-world Example:** Amazon Prime membership check
- If user is prime member → Play movie
- Else → Redirect to subscription window

#### B) Switch-Case
```java
switch (variable) {
    case value1:
        // Execute if variable matches value1
        break;
    case value2:
        // Execute if variable matches value2
        break;
    default:
        // Execute if no cases match
}
```

**Real-world Example:** Browser selection
- Pass browser name (chrome, firefox, etc.)
- Launch corresponding browser

#### Loops
- **For Loop:** Used for printing sequences (e.g., first 10 whole numbers)
- Initialization, condition, and increment/decrement

---

### 3. LearnIncrementalAndDecrementalOperators.java
**Topics Covered:**

#### Increment Operators (++)
- **Pre-Increment (++i):** Increment first, then use the value
  ```java
  int i = 5;
  System.out.println(++i); // Output: 6
  ```

- **Post-Increment (i++):** Use the value first, then increment
  ```java
  int j = 15;
  System.out.println(j++); // Output: 15
  System.out.println(j);   // Output: 16
  ```

#### Decrement Operators (--)
- **Pre-Decrement (--x):** Decrement first, then use the value
  ```java
  int x = 10;
  System.out.println(--x); // Output: 9
  ```

- **Post-Decrement (y--):** Use the value first, then decrement
  ```java
  int y = 20;
  System.out.println(y--); // Output: 20
  System.out.println(y);   // Output: 19
  ```

#### Other Operators
- **Modulus (%):** Returns remainder
  ```java
  int c = 8 % 4; // Output: 0
  ```

- **Comparison Operators:** Returns boolean value
  ```java
  boolean d = 8 > 4; // Output: true
  ```

---

## How to Use These Files

### Prerequisites
- Java Development Kit (JDK) installed
- Java IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Running the Files

1. **Compile the Java files:**
   ```bash
   javac LearnPrimitiveDatatype.java
   javac LearnControlStatements.java
   javac LearnIncrementalAndDecrementalOperators.java
   ```

2. **Run the compiled classes:**
   ```bash
   java week1.day2.LearnPrimitiveDatatype
   java week1.day2.LearnControlStatements
   java week1.day2.LearnIncrementalAndDecrementalOperators
   ```

---

## Learning Objectives

By the end of Day 2, students should understand:
- ✅ How to declare and initialize primitive data types
- ✅ When to use each primitive type based on requirements
- ✅ How to structure conditional logic using if-else and switch statements
- ✅ Difference between pre and post increment/decrement operators
- ✅ How to write loops for repetitive operations
- ✅ Real-world applications of these concepts

---

## Key Takeaways

| Concept | Use Case |
|---------|----------|
| byte | Small values (0-127) |
| short | Medium integers |
| int | Standard integers |
| long | Large numbers (requires 'L' suffix) |
| float | Decimals (requires 'F' suffix) |
| double | Precise decimals |
| boolean | True/false conditions |
| String | Text and sequences |
| if-else | Multiple conditions |
| switch-case | Discrete value matching |
| ++/-- | Increment/decrement values |

---

## Notes
- Memory efficiency is important when choosing appropriate data types
- Always remember to break in switch cases to avoid fall-through
- Pre and post operators have different behaviors in assignments and print statements
- Logical operators (&&, ||, !) allow complex condition checking

---

## Author
**TestLeaf Trainings**

**Batch:** Selenium WebDriver - March 2026

**Created:** 2026-03-05

---

## License
This educational material is for learning purposes within the TestLeaf training program.