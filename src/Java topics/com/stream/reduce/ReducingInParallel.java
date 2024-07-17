//package com.stream.reduce;
//
//import org.openjdk.jmh.annotations.Benchmark;
//import org.openjdk.jmh.annotations.Scope;
//import org.openjdk.jmh.annotations.State;
///*
//* As we learned before, we can use reduce() on parallelized streams.
//
//* When we use parallelized streams, we should make sure that reduce() or any other aggregate
//* operations executed on the streams are:
//
//! associative:
//? the result is not affected by the order of the operands
//! non-interfering:
//? the operation doesn’t affect the data source
//! stateless and deterministic:
//? the operation doesn’t have state and produces the same output for a given input
//
//* We should fulfill all these conditions to prevent unpredictable results.
//
//* As expected, operations performed on parallelized streams, including reduce(), are executed in
//* parallel, hence taking advantage of multi-core hardware architectures.
//
//* For obvious reasons, parallelized streams are much more performant than the sequential counterparts.
//*  Even so, they can be overkill if the operations applied to the stream aren’t expensive,
//* or the number of elements in the stream is small.
//
//* Of course, parallelized streams are the right way to go when we need to work with large streams and
//* perform expensive aggregate operations.
//
//* Let’s create a simple JMH (the Java Microbenchmark Harness) benchmark test and compare the
//* respective execution times when using the reduce() operation on a sequential and a parallelized
//* stream:
//* */
//
//import java.util.List;
//
//@State(Scope.Thread)
//private final List<User> userList = createUsers();
//
//private List<User> createUsers() {
//
//}
//
//@Benchmark
//public Integer executeReduceOnParallelizedStream() {
//    return this.userList
//            .parallelStream()
//            .reduce(
//                    0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
//}
//
//@Benchmark
//public Integer executeReduceOnSequentialStream() {
//    return this.userList
//            .stream()
//            .reduce(
//                    0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
//}
//
//public class ReducingInParallel {
//    public static void main(String[] args) {
//        LOGGER
//
//    }
//}
//
//public void main() {
//
//}
