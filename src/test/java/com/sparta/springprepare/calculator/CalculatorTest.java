package com.sparta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("몫 나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result); // (예상하는 값, 확인하려는 값);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void test3(){
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "*", 2);
        System.out.println("result = " + result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void test4() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "-", 2);
        System.out.println("result = " + result);   // 잘못된 연산자 입니다.
    }
//    @Test
//    @DisplayName("나머지 나누기 테스트")
//    void test5() {
//        Calculator calculator = new Calculator();
//        Double result = calculator.operate(8, "%", 2);
//        System.out.println("result = " + result);
//        => 잘못된 연산자 입니다. 라고 뜬다
//    }

}