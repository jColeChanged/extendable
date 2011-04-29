# extendable

This is a small script which can be used to speed the creation of Q&A style games. I made it so that if I ever decide to make more Q&A games for my Camfrog bot I can do it quickly.

## Usage

After getting the library into your project get access to the game creation
function with:
    
    (ns your-namespace
      (:use [extendable.core :only [extendable-game]]))

This function accepts a dictionary with the following keys, ``:folder``, ``:comand``, ``:time``, ``:delay``, ``:sleep``, and ``:qanda``.

The folder is where the game files will be saved. The command will be what people use to play the game. For example, someone might write "<command> start" to start playing the game. Time is how long people have to answer questions, delay is how much time is put between asking each question, and sleep is how long the game should go with nobody answering before it shuts off. Each of these should be integers. The last key, ``qanda``, should be a list of questions and answers. It should have the form below:

    [[question1 answer1] [question2 answer2] ... [questionN answerN]]

## License

Copyright (C) 2010 Joshua Cole

Distributed under the Eclipse Public License, the same as Clojure.
