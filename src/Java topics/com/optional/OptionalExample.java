package com.optional;

import java.util.Optional;

class UsingOptional{
    public  static void checkLength(String str){
        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
//        System.out.println(optional.get());

        // if the value is present then print that value
        System.out.println(optional.orElse("no value are present"));
        System.out.println(optional.orElseThrow(()->new NumberFormatException("value no found")));

    }
}

class WithoutOptional{
    public  static void checkLength(String str){
        if(str == null){
            System.out.println("str is null");
        }else{
            System.out.println("str length is " + str.length());
        }
    }
}

public class OptionalExample {
    public static void main(String[] args) {
//        WithoutOptional.checkLength("abc");
//        WithoutOptional.checkLength(null);
        UsingOptional.checkLength("abc");
//        UsingOptional.checkLength(null);
    }
}
//if (byUsername == null) {
//        throw new UsernameNotFoundException("User not found with username: " + username);
//		}
//                return new User(username, byUsername.getPassword(),
//				Collections.singleton(new SimpleGrantedAuthority(byUsername.getROLE())));

