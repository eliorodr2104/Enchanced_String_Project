# Enhanced String

## Introduction

Enhanced String is a project aimed at enhancing the Kotlin `String` class by integrating methods and functionalities inspired by the Python language. 
This expands the language capabilities and optimizes code.

## Added Methods

The `String` class has been enriched with the following methods:

- `center()`: the text will be centered by adding a specified number of characters to the left and right, based on the given length.
- `count()`: it counts the number of times the substring passed as a parameter appears within the main string, also allowing adjustment of the starting point and indices as parameters for the search.
- `endsWith()`: Checks if the substring is at the end of the main string; it can also be adjusted by passing the start and end indices for the search.
- `expandTabs()`: When it detects a '\t' in the string, it is replaced with spaces; the number of spaces will match the quantity provided as a parameter.
- `formatMap()`: joins an array of strings into a single string.
- `strip()`: 
- `isAlphaNum()`: 
- `isAlpha()`: 
- `isAscii()`: 
- `isDecimal()`: 
- `isDigit()`: 
- `isIdentifier()`: 
- `isLower()`: 
- `isNumeric()`: 
- `isPrintable()`:
- `isSpace()`:
- `isTitle()`:
- `isUpper()`:
- `join()`:
- `lJust()`:
- `lStrip()`:
- `partition()`:
- `rJust()`:
- `rStrip()`:
- `splitLines()`:
- `startWith()`:
- `sStrip()`:
- `swapCase()`:
- `capitalize()`:
- `zFill()`:

## Improved Methods

The following methods have been optimized for superior performance:

- `capitalize()`: with faster execution time compared to the native Kotlin method.

## Installation

To integrate Enhanced String, add the following dependency to your project's `build.gradle` file:

```gradle
dependencies {
    implementation 'com.github.eliorodr2104:Enhanced_string_project:1.0.0'
}
```

## Usage

To use the added or improved methods of Enhanced String, you need to import the package com.github.[username].enhancedstring.
For example, to use the replace() method, you'd write the following code:

```kotlin
import com.github.eliorodr2104.Enhanced_string_project.EnchancedStrings

val string = "hello world!"

val nuovaStringa = string.capitalize()

println(nuovaStringa) // Hello world!
```

## Contributions

Enhanced String is an open-source project, and contributions are welcome.
To contribute, you can fork the GitHub repository and submit a pull request.

## Notes

- Enhanced String is still in development and might contain bugs.
- Enhanced String is compatible with Kotlin 1.6.0 or later versions.

## Acknowledgments

Thanks to all the developers who have contributed to the project.
