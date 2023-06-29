package github_projects.project13;

    public class DigitSeparation {

        public static void main(String[] args) {

            int x = 12345;

            int ones = x % 10; // 5

            int tens = (x / 10) % 10;  // 4

            int hundreds = (x / 100) % 10; // 3

            int thousands = (x / 1000) % 10; // 2

            int tenThousands = x / 10000; // 1

            System.out.println(ones + tens + hundreds + thousands + tenThousands);
        }
    }


