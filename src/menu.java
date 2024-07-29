public class menu {
  
    public void printing() {
        int i = 0;
        int a = 0;
        while (a < 16) {
            i = 0;
            while (i < 91) {
                i++;
                if (!(a < 7 && a > 4 && i > 30 && i < 70)) {
                    System.out.print("<3");
                }
            }
            System.out.print(" ");
            a++;
            }
        System.out.println();
    }
}
