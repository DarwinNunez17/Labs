public class ElektronikShop {
    public static int cheapestKeyboard(int[] keyboards) {
        int min = Integer.MAX_VALUE;
        for (int price : keyboards) {
            if (price < min) {
                min = price;
            }
        }
        return min;
    }

    public static int mostExpensiveItem(int[] keyboards, int[] usbDrives) {
        int max = -1;
        for (int price : keyboards) {
            if (price > max) {
                max = price;
            }
        }
        for (int price : usbDrives) {
            if (price > max) {
                max= price;
            }
        }
        return max;
    }

    public static int mostExpensiveUSBDrive(int[] usbDrives, int budget) {
        int max = -1;
        for (int price : usbDrives) {
            if (price <= budget && price > max) {
                max = price;
            }
        }
        return max;
    }

    public static int findTotalAmount(int budget, int[] keyboards, int[] usbDrives) {
        int cheapestKeyboard = cheapestKeyboard(keyboards);
        int mostExpensiveUSBDrive = mostExpensiveUSBDrive(usbDrives, budget);
        if (cheapestKeyboard == Integer.MAX_VALUE || mostExpensiveUSBDrive == -1) {
            return -1;
        }
        return cheapestKeyboard + mostExpensiveUSBDrive;
    }
}
