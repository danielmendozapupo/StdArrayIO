public class StdArrayIO{

    //Read an array of doubles

    public static double[] readDouble1D(){

        int n = StdIn.readInt();
        double[] a = new double[n];

        for(int i = 0; i < n; i++)
            a[i] = StdIn.readDouble();
        return a;
    }

    public static void print(double[] a){
        int n = a.length;
        for(int i = 0; i < n; i++) {
            StdOut.printf("%9.5f", a[i]);
            StdOut.println();
        }

    }

    //Read a two dimension array of doubles
    public static double[][] readDouble2D(){
        int m = StdIn.readInt();
        int n = StdIn.readInt();

        double[][] a = new double[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = StdIn.readDouble();
        return a;
    }


    public static void print(double[][] a){
        int m = a.length;
        int n = a[0].length;
        System.out.println(m +" " +n );
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                StdOut.printf("%9.5f", a[i][j]);
                StdOut.println();
            }
        }
        StdOut.println();
    }

    //read an array of integer
    public static int[] readInteger1D(){
        int n = StdIn.readInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = StdIn.readInt();
        }
        return a;
    }

    public static void print(int[] a){
        int n = a.length;
        for(int i = 0; i < n; i++) {
            StdOut.printf("%9.5d", a[i]);
            StdOut.println();
        }

    }

    //read a two dimension array of ints
    public static int[][] readInteger2D(){
        int m = StdIn.readInt();
        int n = StdIn.readInt();

        int[][] a = new int[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = StdIn.readInt();
        return a;
    }


    public static void print(int[][] a){
        int m = a.length;
        int n = a[0].length;
        System.out.println(m +" " +n );
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                StdOut.printf("%9.5d", a[i][j]);
                StdOut.println();
            }
        }
        StdOut.println();
    }



    //read an array of booleans
    public static boolean[] readBoolean1D(){

        int n = StdIn.readInt();
        boolean[] a = new boolean[n];

        for(int i = 0; i < n; i++)
            a[i] = StdIn.readBoolean();
        return a;
    }

    public static void print(boolean[] a){
        int n = a.length;
        for(int i = 0; i < n; i++) {
            StdOut.printf("%9.5b", a[i]);
            StdOut.println();
        }

    }

    //read a two dimension array of Booleans

    public static boolean[][] readBoolean2D(){
        int m = StdIn.readInt();
        int n = StdIn.readInt();

        boolean[][] a = new boolean[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = StdIn.readBoolean();
        return a;
    }


    public static void print(boolean[][] a){
        int m = a.length;
        int n = a[0].length;
        System.out.println(m +" " +n );
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                StdOut.printf("%9.5b", a[i][j]);
                StdOut.println();
            }
        }
        StdOut.println();
    }



    public static void main(String[] args){
        print(readDouble2D());
        print(readDouble1D());

        print(readInteger2D());
        print(readInteger1D());

        print(readBoolean2D());
        print(readBoolean1D());
    }
}