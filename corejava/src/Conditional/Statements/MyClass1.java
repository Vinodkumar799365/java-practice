package Conditional.Statements;


class MyClass1 {

    public String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {

        MyClass1 obj = new MyClass1();

        System.out.println("Check -5: " + obj.checkNumber(-5));
        System.out.println("Check 10: " + obj.checkNumber(10));
        System.out.println("Check 0: " + obj.checkNumber(0));
    }
}


