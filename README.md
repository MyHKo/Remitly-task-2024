# Remitly-task-2024

## Description

This folder contains a .jar file which is a presentation of work of the method
and another folder, where a source code can be found.

## Installation

To install the project you need to copy the repository using "git clone" command
and navigate to the project directory.

## Running the jar presentation

To run the jar file a JDK 22 is needed. It can be run by the following command
java -jar /path to the file Remitly-task-2024.jar/ /path to the .json file that is to be proccessed/
"true" will be written in the system console if the "Resource" field contains
exactly one asterisk. "false" in all other cases.

## The location of the source code

The source code can be found by the following path: ./Project/src/java/Main.java
There are two variations of the needed method. They are called "checkResources" One accepting name of the file as a String
and the other a variable of the "File" type. There are several custom exceptions thrown by the method.
For example, "The given file is empty" or "The Resource filed is missing".