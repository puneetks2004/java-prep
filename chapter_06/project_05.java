package chapter_06;

public class project_05 {
    public static void main(String[] args) {
        int i, j;
        int[][] flats = new int[2][3];
        flats[0][0] = 333;
        flats[0][1] = 34;
        flats[0][2] = 54;
        flats[1][0] = 99;
        flats[1][1] = 65;
        flats[1][2] = 88;

        for(i=0;i<flats.length;i++)
        {
            for(j=0;j<flats[1].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
}
