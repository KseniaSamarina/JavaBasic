package JavaBasic;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 20);
        }
        int resultMax = array[0];
        for (int j : array) {
            if (j > resultMax)
                resultMax = j;
        }
        System.out.println("Max value: " + resultMax);
        int resultMin = array[0];
        for (int j : array) {
            if (j < resultMin)
                resultMin = j;
        }
        System.out.println("Min value: " + resultMin);
        int modul = Math.abs(resultMax);
        int modul2 = Math.abs(resultMin);
        if (modul > modul2) {
            System.out.println("Max modul: " + modul);
        }
        else if (modul2 > modul) {
            System.out.println("Max modul: " + modul2);
        }
        else {
            System.out.println("The numbers are equal: " + modul + " = " + modul2);
        }
    }
}
