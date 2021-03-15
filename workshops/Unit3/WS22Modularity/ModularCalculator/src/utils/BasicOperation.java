package utils;

/**
 *
 * @author Kyara Lizeth
 */
public class BasicOperation {
    
    // addition, subtraction, division, multiplication
    
    public static float addTwoNumbers(float addend1, float addend2){
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }
    public static float subtractTwoNumbers(float minuend, float subtrahend){
        float subtraction = 0;
        subtraction = minuend - subtrahend;
        return subtraction;
    }
    public static float multiplyTwoNumbers(float multiplicand, float multiplier){
        float product = 0;
        product = multiplicand * multiplier;
        return product;
    }
    public static float divideTwoNumbers(float dividend, float divider){
        float quotient = 0;
        quotient = dividend / divider;
        return quotient;
    }
}


