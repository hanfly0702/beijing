package hyf;

public class OverflowExample {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE - 10;
        int b = 20;

        // 使用条件运算符判断
        if ((a > 0 && b > 0 && a > Integer.MAX_VALUE - b) || (a < 0 && b < 0 && a < Integer.MIN_VALUE - b)) {
            System.out.println("溢出了");
        } else {
            System.out.println("结果：" + (a + b));

        }
    }
}