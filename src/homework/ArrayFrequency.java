package homework;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {-28,-5,20,-5,20,-5,18};
        int[] control = new int[array.length];
        boolean[] isCounted = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (isCounted[i]) {
                continue;
            }
            int frekans = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    frekans++;
                    isCounted[j] = true;
                }
            }
            control[i] = frekans;
            System.out.println(array[i] + " sayısı " + control[i] + " kere tekrar edildi.");
        }
    }
}

