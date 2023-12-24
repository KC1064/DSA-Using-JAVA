### Question 1: Find the Output

```java
public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }
    }
}

## Answer: Hello 2 times printed

### Question 2: Find the Error

```java

public class Solution {
    public static void main(String args[]) {
        for(int i = 0; i <= 5; i++ ) {
            System.out.println("i = " + i );
        }
    System.out.println("i after the loop = " + i );
    }
}

## Answer: Inside the loop i will increament till 5 then after loop it will print 6 only.