package javaExerсise.loop;

public class Task107 {
    public static void loop(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 999) {
                break;
            }
            System.out.println(num);
            count++;
        }
        System.out.println("Значений: " + count);
    }
}