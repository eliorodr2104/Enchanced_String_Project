# Enhanced String

**Introduction**
Enhanced String aims to enrich the functionality of the Kotlin `String` class by incorporating methods and features inspired by Python. This extension enhances the capabilities of the language and promotes code optimization.

## Added Methods

Enhanced String introduces the following methods to the `String` class:

- `center()`: Centers the text within a specified length by adding characters to the left and right.
- `count()`: Counts occurrences of a substring within the string, allowing customization of starting point and indices for the search.
- `endsWith()`: Checks if the substring is at the end of the main string, with optional adjustment of search boundaries.
- `expandTabs()`: Replaces '\t' characters with spaces, allowing customization of the number of spaces per tab.
- `formatMap()`: Joins an array of strings into a single string.
- `strip()`: Removes leading and trailing whitespace.
- `isAlphaNum()`: Checks if the string is alphanumeric.
- `isAlpha()`: Checks if the string is alphabetic.
- `isAscii()`: Checks if the string contains only ASCII characters.
- `isDecimal()`: Checks if the string is a decimal.
- `isDigit()`: Checks if the string contains only digits.
- `isIdentifier()`: Checks if the string is a valid identifier.
- `isLower()`: Checks if the string is lowercase.
- `isNumeric()`: Checks if the string is numeric.
- `isPrintable()`: Checks if the string is printable.
- `isSpace()`: Checks if the string contains only whitespace.
- `isTitle()`: Checks if the string is titlecased.
- `isUpper()`: Checks if the string is uppercase.
- `join()`: Joins the elements of an iterable with the string as a separator.
- `lJust()`: Left-justifies the string in a field of a given width.
- `lStrip()`: Left-strips leading whitespace.
- `partition()`: Splits the string into three parts using a separator.
- `rJust()`: Right-justifies the string in a field of a given width.
- `rStrip()`: Right-strips trailing whitespace.
- `splitLines()`: Splits the string at line breaks.
- `startWith()`: Checks if the string starts with a given prefix.
- `sStrip()`: Strips leading and trailing whitespace.
- `swapCase()`: Swaps case of alphabetic characters.
- `capitalize()`: Capitalizes the first character of the string.
- `zFill()`: Pads a numeric string with zeros.

## Improved Methods

Enhanced String optimizes the following method:

- `capitalize()`: Enhanced version with improved execution time compared to the native Kotlin method.

## Installation

To integrate Enhanced String into your project, add the following dependency to your `build.gradle` file:

```gradle
dependencies {
    implementation 'com.github.eliorodr2104:Enhanced_string_project:1.0.0'
}
```

## Usage

To use the added or improved methods of Enhanced String, import the package and utilize the methods as demonstrated below:

```kotlin
val string = "hello world!"

val newString = string.capitalize()

println(newString) // Hello world!
```

## Contributions

Enhanced String is an open-source project, and contributions are encouraged. To contribute, fork the GitHub repository and submit a pull request.

## Notes

- Enhanced String is under active development and may contain bugs.
- Enhanced String is compatible with Kotlin 1.6.0 or later versions.

## License
This project is licensed under the [MIT License](LICENSE).
