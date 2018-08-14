package decimalToBinary;

public class Conversion {

    private int remainder;
    private int count;
    private int val;

    public Conversion() {
        remainder = 0;
        count = 0;
    }

    public void decimalToBinary(int num) throws Exception {
        stackArray sa = new stackArray(8);
        while (num > 0) {
            remainder = num % 2;
            sa.push(remainder);
            num = num / 2;
            count++;
        }
        System.out.print("Binary Number : ");
        for (int x = 1; x <= count; x++) {
            val = sa.pop();
            System.out.print(val);
        }
        System.out.println();
    }
}
