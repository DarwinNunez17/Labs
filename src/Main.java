import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main{
        public static void main(String[]args){
            int[] workingNoten = {84, 29, 37, 62, 88};
            int[] nonWorkingNoten = {45, 50, 60, 75};

            // Test filterNichtAusreichendeNoten
            int[] filteredWorking = JavaUni.filterNichtAusreichendeNoten(workingNoten);

            assert Arrays.equals(filteredWorking, new int[]{29, 37});
            try {
                int[] filteredNonWorking = JavaUni.filterNichtAusreichendeNoten(nonWorkingNoten);
                assert Arrays.equals(filteredNonWorking, new int[]{});
            } catch (AssertionError e) {
                System.out.println("Test failed: " + e.getMessage());
            }

            // Test durchschnittlicheNote
            double averageWorking = JavaUni.durchschnittlicheNote(workingNoten);
            double averageNonWorking = JavaUni.durchschnittlicheNote(new int[0]);

            assert Double.compare(averageWorking, 60.0) == 0;
            assert Double.compare(averageNonWorking, 0.0) == 0;

            // Test abgerundeteNoten
            int[] roundedWorking = JavaUni.abgerundeteNoten(workingNoten);
            int[] roundedNonWorking = JavaUni.abgerundeteNoten(new int[0]);

            assert Arrays.equals(roundedWorking, new int[]{85, 29, 37, 62, 90});
            assert Arrays.equals(roundedNonWorking, new int[]{});

            // Test maxAbgerundeteNote
            int maxWorking = JavaUni.maxAbgerundeteNote(workingNoten);
            int maxNonWorking = JavaUni.maxAbgerundeteNote(new int[0]);

            assert maxWorking == 90;
            assert maxNonWorking == -1;


        ////2
            int[] positiveNumbers = {4, 8, 3, 10, 17};

            // Test findMaxZahl
            int maxPositive = ArrayPositiveZahlen.findMaxZahl(positiveNumbers);
            assert maxPositive == 17;


            // Test findMinZahl
            int minPositive = ArrayPositiveZahlen.findMinZahl(positiveNumbers);
            assert minPositive == 3;

            // Test findMaxSum
            int maxSumPositive = ArrayPositiveZahlen.findMaxSum(positiveNumbers);
            assert maxSumPositive == 39;

            // Test findMinSum
            int minSumPositive = ArrayPositiveZahlen.findMinSum(positiveNumbers);
            assert minSumPositive == 25;

        ////3
            // Test Summe
            int[] sum1 = GrosseZahlen.Summe(new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0}, new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0});
            assert Arrays.equals(sum1, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

            // Test Differenz
            int[] diff1 = GrosseZahlen.Differenz(new int[]{8, 3, 0, 0, 0, 0, 0, 0, 0}, new int[]{5, 4, 0, 0, 0, 0, 0, 0, 0});
            assert Arrays.equals(diff1, new int[]{2, 9, 0, 0, 0, 0, 0, 0, 0});

            // Test Multiplikation
            int[] mult1 = GrosseZahlen.Multiplikation(new int[]{2, 3, 6, 0, 0, 0, 0, 0, 0}, 2);
            assert Arrays.equals(mult1, new int[]{4, 7, 2, 0, 0, 0, 0, 0, 0});

            int[] mult2 = GrosseZahlen.Multiplikation(new int[]{3, 7, 2}, 5);
            assert Arrays.equals(mult2, new int[]{1, 8, 6, 0});

            // Test Division
            int[] div1 = GrosseZahlen.Division(new int[]{2, 3, 6, 0, 0, 0, 0, 0, 0}, 2);
            assert Arrays.equals(div1, new int[]{1, 1, 8, 0, 0, 0, 0, 0, 0});

            int[] div2 = GrosseZahlen.Division(new int[]{5, 0, 0, 0, 0}, 4);
            assert Arrays.equals(div2, new int[]{1, 2, 5, 0, 0});

        ///4
            // Test cheapestKeyboard
            int[] keyboards1 = {40, 35, 70, 15, 45};
            int cheapest1 = ElektronikShop.cheapestKeyboard(keyboards1);
            assert cheapest1 == 15;

            int[] keyboards2 = {25, 30, 40, 20};
            int cheapest2 = ElektronikShop.cheapestKeyboard(keyboards2);
            assert cheapest2 == 20;

            // Test mostExpensiveItem
            int[] keyboards3 = {15, 20, 10, 35};
            int[] usbDrives3 = {20, 15, 40, 15};
            int mostExpensive3 = ElektronikShop.mostExpensiveItem(keyboards3, usbDrives3);
            assert mostExpensive3 == 40;

            int[] keyboards4 = {30, 40, 25, 18};
            int[] usbDrives4 = {12, 30, 25};
            int mostExpensive4 = ElektronikShop.mostExpensiveItem(keyboards4, usbDrives4);
            assert mostExpensive4 == 40;

            // Test mostExpensiveUSBDrive
            int[] usbDrives5 = {15, 45, 20};
            int budget5 = 30;
            int mostExpensiveUSB5 = ElektronikShop.mostExpensiveUSBDrive(usbDrives5, budget5);
            assert mostExpensiveUSB5 == 20;

            int[] usbDrives6 = {12, 18, 25, 30};
            int budget6 = 15;
            int mostExpensiveUSB6 = ElektronikShop.mostExpensiveUSBDrive(usbDrives6, budget6);
            assert mostExpensiveUSB6 == 12;

            // Test findTotalAmount
            int budget7 = 60;
            int[] keyboards7 = {40, 50, 60};
            int[] usbDrives7 = {8, 12};
            int totalAmount7 = ElektronikShop.findTotalAmount(budget7, keyboards7, usbDrives7);
            assert totalAmount7 == 48;

            int budget8 = 30;
            int[] keyboards8 = {40, 50, 60};
            int[] usbDrives8 = {8, 12};
            int totalAmount8 = ElektronikShop.findTotalAmount(budget8, keyboards8, usbDrives8);
            assert totalAmount8 == -1;
        }
}