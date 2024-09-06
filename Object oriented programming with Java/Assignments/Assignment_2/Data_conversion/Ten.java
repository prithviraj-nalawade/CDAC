public class Ten {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String opr = args[2];
        System.out.println(opr);
        switch (opr) {
            case "+": System.out.println("Addition  :   "+Integer.sum(num1, num2));
                      break;
            case "-": System.out.println("Substraction  :   "+(num1 -num2));
                      break;
            case "*": System.out.println("Multiplication  :   "+(num1 * num2));
                      break;
            case "/": System.out.println("Division  :   "+(num1 / num2));
                      break;
            default: System.out.println("Invalid operator..");
                break;
        }

    }
}
