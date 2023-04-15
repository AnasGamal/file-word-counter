# Word Counter

Word Counter is a simple Java application that reads a text file and counts the occurrences of each word and character in the file. It then produces a sorted output of the number of characters and words detected, as well as also a sorted list of the words and characters.

## Functionality

The application's primary functionality is to provide an easy-to-use tool for counting word and character occurrences in a text file. This functionality is useful for analyzing textual data, such as documents, articles, or web pages. The application produces a sorted output of the number of words, characters, as well as the top 10 words and characters that occur most frequently.

## Technologies and Libraries

The application was built using Java programming language and relies solely on the standard Java SE library.

## Installation

To install and use the application, simply download the project source code from this GitHub repository, compile the source code into an executable .jar file, and run the application from the command line using the appropriate command.

Here is an example installation script that assumes you have JDK installed:

```
git clone <repository_url>
cd WordCounter
javac Main.java
jar cfe WordCounter.jar Main *.class
java -jar WordCounter.jar <path_to_text_file>
```

## Developer Notes

The most challenging aspect of this project was designing the appropriate data structures and algorithms to efficiently and accurately count the occurrences of the words and characters. After doing some research and multiple iterations of implementations, the TreeMap was used to provide the necessary functionality in an efficient and effective manner.

Overall, this project allowed me to strengthen my foundational knowledge of Java, further develop my ability to parse text data into structured formats, and design efficient algorithms.
Attempting to fix JSON by finding outermost brackets
