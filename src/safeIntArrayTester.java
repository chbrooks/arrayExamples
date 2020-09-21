public class safeIntArrayTester {

    public static void main(String[] args) {

        safeIntArray sa = new safeIntArray(10);

        for (int i = 0; i < 5; i++) {
            sa.add(i);
        }
        System.out.println(sa);

        /* test the resizing */
        for (int i = 6; i < 15; i++) {
            sa.add(i);
        }
        System.out.println(sa);

        /* test the remove */
        sa.remove(7);

        System.out.println(sa);

        /* test set */
        sa.set(4, 20);
        System.out.println(sa);
        /* should generate an error */
        sa.set(25, 25);

        /* test contains */
        System.out.println(sa.contains(3));
        System.out.println(sa.contains(30));

        /* test indexOf */
        System.out.println(sa.indexOf(3));
        System.out.println(sa.contains(30));



    }

}
