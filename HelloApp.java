public class Hello {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";
            for (int i = 0; i < args.length; i++) {
                if (i == 0) {
                    result = args[i];
                } else {
                    result = result + ", " + args[i];
                }
            }
            System.out.println("Hello, " + result + "!");
        }
    }
}
