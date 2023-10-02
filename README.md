# Spaceship

Spaceship game

## How to run

### Command line

`mvn clean package`

### IntelliJ

Create a **Maven** configuration. In **Command Line**:

`clean package`

## Debugging

Create a **Maven** configuration in your IDE. In **Command Line**:

`clean javafx:run@debug`

Run the configuration. In the Terminal, look for an option to *Attach debugger*:

![screenshot of IntelliJ in which the Attach debugger option is visible](https://user-images.githubusercontent.com/42688474/272014381-f278d080-2c90-4cfa-9520-4b4e22dca16f.PNG)

The debugger should run on the running instance and pause at the first breakpoint that was set.
