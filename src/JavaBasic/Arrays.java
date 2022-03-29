package JavaBasic;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[] {10, 24, 36, 41, 58}; //1. Задан массив с 5-ю элементами
        int num = myArray[0];
        myArray[0] = myArray[4];
        myArray[4] = num;
        System.out.println(myArray[0]); //2. Первое число поменяно на последнее
        System.out.println(myArray[4]); //2. Последнее число поменяно на первое
        System.out.println(myArray[myArray.length - 5] + myArray[myArray.length - 3]); //3. Сумма первого и среднего числа
    }
}