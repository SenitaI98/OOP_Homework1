package qamp;

public class Calculator {
    int numberA;
    int numberB;
    int[] myArray;

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    static double pi = 3.14;


    int sum() {
        return this.numberA + this.numberB;
    }

    int diff() {
        return this.numberA - numberB;
    }

    int product() {
        return this.numberA * this.numberB;
    }

    int quotient() {
        return this.numberA / this.numberB;
    }

    double areaWithRadiusNumberA() {
        return (this.numberA * this.numberA) * pi;

    }

    double areaWithRadiusNumberB() {
        return (this.numberB * this.numberB) * pi;

    }

    int sumElementInArray(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    int productElementInArray(int[] myArray) {
        int product = 1;
        for (int i = 0; i < myArray.length; i++) {
            product *= myArray[i];
        }
        return product;
    }
}
