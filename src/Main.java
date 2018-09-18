import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] a;
    int[] b;

    String aString = scanner.nextLine();
    a = getNumbers(aString);

    String bString = scanner.nextLine();
    b = getNumbers(bString);

    if (!isNumbersValid(a) || !isNumbersValid(b)) {
      return;
    }

    int[] totalScores = getTotalScore(a, b);
    System.out.println(totalScores[0] + " " + totalScores[1]);
  }

  private static int[] getNumbers(String numberString) {
    String[] numbersString = numberString.split(" ");
    int[] numbers = new int[3];

    for (int i = 0; i < 3; i++) {
      int number = Integer.parseInt(numbersString[i]);
      numbers[i] = number;
    }
    return numbers;
  }

  private static boolean isNumbersValid(int[] numbers) {
    for (int number : numbers) {
      return (number >= 1 && number <= 100);
    }
    return false;
  }

  private static int[] getTotalScore(int[] a, int[] b) {
    int[] totalScore = new int[2];

    for (int i = 0; i < a.length; i++) {
      if (a[i] > b[i]) {
        totalScore[0] += 1;
      } else if (a[i] < b[i]) {
        totalScore[1] += 1;
      }
    }
    return totalScore;
  }
}
