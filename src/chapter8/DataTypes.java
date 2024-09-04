package chapter8;

public class DataTypes {

    public static void main(String[] args){
        convertDecimalToInt();
    }

    public static void convertDecimalToInt(){
        double[] numbers = {1.5, 3.99, 45.5, 222.6};

        for(Double number : numbers){
            System.out.println(number.intValue());
        }
    }
};
