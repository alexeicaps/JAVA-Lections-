/**
 * program
 */
public class program {
    public static void main(String[] args) {
        // String s;
        // s = "best world";
        // String g = null;
        // System.out.println(g);

        // short age = 10;
        // int salary = 123456;
        // System.out.println(age);
        // System.out.println(salary);

        // float e = 1.2f;
        // double pi = 3.1415;
        // System.out.println(e);
        // System.out.println(pi);

        // char ch = 123;
        // System.out.println(ch);

        // int a = 12;
        // double d = a;
        // System.out.println(d);

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1);

        // boolean f = true ^ false;
        // System.out.println(f);

        // var i = 3 + " {} " + 2;
        // System.out.println(i);

        // int i = 123;
        // System.out.println(Integer.MAX_VALUE);

        // int i = 123_25_6556 + 00_44;
        // System.out.println(i);

        // String s = "makeba";
        // s.length();
        // System.out.println();

        // int a = 123;
        // // a = a-- - --a;
        // // a = --a - --a;
        // a = --a - a--;
        // System.out.println(a);

        // boolean f = 123 <= 215;
        // System.out.println(f);

        // int f = 123;
        // System.out.println(f);

        // System.out.printf("6 %4d" + "%10d \n", 6, 6);
        // System.out.printf("6 %3d" + "%10d" + "%2d \n", 6, 6, 6);
        // System.out.printf("6 %2d" + "%10d" + "%4d \n",6, 6, 6);
        // System.out.printf("6 %1d" + "%10d" + " 6 6 " + "%1d \n", 6, 6, 6);
        // System.out.printf("6 %2d" + "%8d" + "%8d \n", 6, 6, 6);
        // System.out.printf("6 %3d" + "%6d" + "%10d \n", 6, 6, 6);
        // System.out.printf("6 %4d" + "%4d" + "%12d \n",6, 6, 6);

        // System.out.printf("String %.2f", 10.230215);

         String numbers = "0123456789";

         StringBuffer sb = new StringBuffer(numbers);

         System.out.println(sb.substring(3)); // 3456789
         System.out.println(sb.substring(4, 8)); // 4567
         System.out.println(sb.replace(3, 5, "ABCDEjkghvhkjgtb")); // 012ABCDE56789

         sb = new StringBuffer(numbers);
         System.out.println(sb.reverse()); // 9876543210
         sb.reverse(); // Вернем изначальный порядок

         sb = new StringBuffer(numbers);
         System.out.println(sb.delete(5, 9)); // 012349
         System.out.println(sb.deleteCharAt(1)); // 02349
         System.out.println(sb.insert(1, "One")); // 0One2349
         System.out.println("java");

    }

}