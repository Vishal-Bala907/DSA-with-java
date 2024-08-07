The Key Concepts: **Identity**, **Accumulator** and **Combiner**
Before we look deeper into using the Stream.reduce() operation, let’s break down 
the operation’s participant elements into separate blocks. 
That way, we’ll understand more easily the role that each one plays.

## Identity – 
    an element that is the initial value of the reduction operation and the default result if the stream is empty
## Accumulator – 
    a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
## Combiner – 
    a function used to combine the partial result of the reduction operation when the reduction is parallelized or when there’s a mismatch between the types of the accumulator arguments and the types of the accumulator implementation