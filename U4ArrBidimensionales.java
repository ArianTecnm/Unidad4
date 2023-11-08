
package u4arrbidimensionales;


public class U4ArrBidimensionales {

    public static void main(String[] args) {
 char[][] letters = new char[3][5];

  
        int index = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                letters[i][j] = (char) ('a' + index);
                index++;
            }
        }

    
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                System.out.print(letters[i][j] + " ");
            }
            System.out.println();
        }
    }
}