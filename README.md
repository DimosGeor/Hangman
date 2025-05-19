# Hangman Word Game – Java Project

## Overview
This is a simple Hangman word guessing game implemented in Java.  
The program randomly selects a word from a predefined dictionary, and the player tries to guess it letter by letter with a limited number of attempts.

## Features

- Random word selection from a fixed dictionary of 52 words.
- Letter-by-letter guessing with input validation.
- Tracks and displays the progress of the guessed word.
- Limited number of tries (8 guesses per game).
- Displays statistics including number of games played, wins, and losses.
- Simple text-based menu for starting new games, viewing statistics, or exiting.

## Classes Description

- **Dictionary**:  
  Contains the list of words and returns a random word for the game.

- **Game**:  
  Contains the core game logic including guessing letters, tracking progress, checking win/loss conditions, and managing tries.

- **Menu**:  
  Displays the main menu, handles user input for starting new games, showing statistics, or exiting the application.

- **Main**:  
  Contains the main method that runs the program and interacts with the menu.

## How to Run

### Prerequisites
- Java JDK installed (version 8 or later)

### Compile
```bash
javac *.java


## Gameplay Instructions

- When the program starts, a menu appears with these options:  
  - Start a new Game (N)  
  - Statistics (S)  
  - Exit (E)

- Choose **N** to start a new game.

- The word to guess is shown as a series of dashes (`-`), each dash representing a letter.

- You have **8 guesses** to figure out the word by guessing one letter at a time.

- Enter a letter (case-insensitive).  
  - If you enter a non-letter character, you will be prompted to enter a valid letter.

- After each guess:  
  - If the letter is in the word, the program reveals all occurrences of that letter.  
  - If the letter is not in the word, you lose one guess.

- The current progress of the word is displayed after every guess.

- If you guess all the letters before using up all tries, you win.

- If you use all 8 tries without guessing the word, you lose.

- After each game ends, you return to the main menu, where you can start a new game, view statistics, or exit.


Example Words
The dictionary includes words like:
UNIVERSITY, COMPUTER, LAPTOP, HEADPHONES, FUZZY, DOG, KEYHOLE, TELEPHONE, PRINTER, BUILDING, COLLEGE, CALCULATOR, PROFESSOR, PRESIDENT, STUDENT, CAT, ARTICULATE, AMIABLE, INTELLIGENT, STRENGTH, SUBJECTIVE, OBJECT, FAIR, FARSIGHTED, ENGINEER, STATISTICS, PHYSICS, MATHEMATICS, SCIENCE, TRIP, TRACK, INDOLENT, JUVIOUS, NOTORIOUS, STATUE, LIBERTY, FIERY, TOLERANT, EXUBERANT, SKILL, ATTRIBUTE, TRAIT, PERSPECTIVE, GLOOMY, GLUTTONOUS, MATERIALISTIC, BENEVOLENT, GENEROUS, CONTROVERSIAL, FRANK, MODEST, MEDIOCRE.
