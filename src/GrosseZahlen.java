public class GrosseZahlen {
    public static int[] Summe(int[] n1, int[] n2){
        int length = n1.length;
        int carry = 0;
        int[] sum = new int[length];

        for(int i = length - 1; i >= 0; i--){
            int cifSum = n1[i] + n2[i] + carry;
            sum[i] = cifSum % 10;
            carry = cifSum / 10;
        }

        if(carry > 0){
            int[] result = new int[length + 1];
            result[0] = carry;

            for (int i = 0; i < length; i++) {
                result[i + 1] = sum[i];
            }
            return result;
        }
        else{
            return sum;
        }
    }
    public static int[] Differenz(int[] n1, int[] n2) {
        int length = n1.length;
        int borrow = 0;
        int[] diff = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            int cifDiff = n1[i] - n2[i] - borrow;
            if (cifDiff < 0) {
                cifDiff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            diff[i] = cifDiff;
        }
        return diff;
    }

    public static int[] Multiplikation(int[] n, int cif) {
        int length = n.length;
        int carry = 0;
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            int product = n[i] * cif + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[length + 1];
            newResult[0] = carry;
            for (int i = 0; i < length; i++) {
                newResult[i + 1] = result[i];
            }
            return newResult;
        } else {
            return result;
        }
    }
    public static int[] Division(int[] n, int cif) {
        int length = n.length;
        int[] result = new int[length];
        int rest = 0;

        for (int i = 0; i < length; i++) {
            int deimpartit = rest * 10 + n[i];
            result[i] = deimpartit / cif;
            rest = deimpartit % cif;
        }
        return result;
    }
}
