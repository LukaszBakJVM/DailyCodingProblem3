import java.util.List;

public class Main {
    private static List<Integer> integers = List.of(34, -50, 42, 14, -5, 86);
    //-5, -1, -8, -9   the maximum sum would be 0
    //34, -50, 42, 14, -5, 86 the maximum sum would be 137
    public static void main(String[] args) {
        int i = sumContiguous(integers);
        System.out.println(i);


    }

    private static int sumContiguous(List<Integer> integers) {
        int sum = 0;
        int contiguous = 0;
        for (int i = 0; i < integers.size(); i++) {
            for (int j = i; j < integers.size(); j++) {

                contiguous += integers.get(j);

            }



            if (contiguous > sum)
                sum = contiguous;

            contiguous = 0;

        }



        return sum;
    }
}