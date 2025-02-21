public class HeartShape {
  public static void main(String[] args) {
      int n = 6; // The size of the heart
      
      // Upper part of the heart
      for (int i = n / 2; i <= n; i += 2) {
          // Print leading spaces
          for (int j = 1; j < n - i; j += 2) {
              System.out.print(" ");
          }

          // Print left upper part
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }

          // Print gap between the two parts
          for (int j = 1; j <= n - i; j++) {
              System.out.print(" ");
          }

          // Print right upper part
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }

          System.out.println();
      }

      // Lower part of the heart
      for (int i = n; i >= 1; i--) {
          // Print leading spaces
          for (int j = i; j < n; j++) {
              System.out.print(" ");
          }

          // Print lower part
          for (int j = 1; j <= (i * 2) - 1; j++) {
              System.out.print("*");
          }

          System.out.println();
      }
  }
}
