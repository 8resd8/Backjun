package A알아두면좋을만한것들;

public class 진법변환 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int ten = 1000; ten < 10000; ten++) {
            String twelve = Integer.toString(ten, 12);
            String hex = Integer.toString(ten, 16);

            int changeTen = getSum(String.valueOf(ten));
            int changeTwelve = getSum(twelve);
            int changeHex = getSum(hex);



            if (changeTen == changeTwelve && changeTen == changeHex) {
                sb.append(ten).append("\n");
            }

        }
        System.out.println(sb);
    }

    private static int getSum(String ten) {
        int sum = 0;
        for (char c : ten.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
