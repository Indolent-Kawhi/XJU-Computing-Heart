public class RandomTest {
    public static void main(String[] args) {
        //创建随机数对象
        Random random = new Random();
        // 随机产生一个int类型取值范围内的数字
        int num1 = random.nextInt();
        System.out.println(num1);

        // 产生[0~100]之间的随机数。不能产生101。
        // nextInt翻译为：下一个int类型的数据是101，表示只能取到100.
        int num2 = random.nextInt(101);//不包括101
        System.out.println(num2);
    }
}

public class GuessNum {
    public static void main(String[] args) {
        Random random = new Random();

		Scanner sc = new Scanner(System.in);


        //nextInt可理解为：下一个int类型的数据是100，表示只能取到99
        //random.nextInt(100)表示产生[0,99]内的随机数
        int guessNum = random.nextInt(100) + 1;
        System.out.println("系统已经随机产生了一个1-100的整数：");

        int inputNum;
        do {
            System.out.print("请输入一个整数：");
            inputNum = sc.nextInt();
            if (inputNum < guessNum) {
                System.out.println("猜小了！");
            } else if (inputNum > guessNum) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜对了！");
            }
        } while (inputNum != guessNum);
    }
}