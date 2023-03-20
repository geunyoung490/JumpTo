package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
/*@Setter*/
@Getter
public class HelloLombok {
    private final String hello;
    private final int lombok;
    /* (hello,lombok)final 적용 + (롬복)@RequiredArgsConstructor 적용
     -> 해당 속성을 필요로하는 생성자가 롬복에 의해 자동적으로 생성
     -> final 없는 속성은 생성자에 포함되지 않는다
     */
    /*
    public HelloLombok(String hello, int lombok){
        this.hello = hello;
        this.lombok = lombok;
    }
     */
    public static void main(String[] args){
        HelloLombok helloLombok = new HelloLombok("헬로",5);
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
