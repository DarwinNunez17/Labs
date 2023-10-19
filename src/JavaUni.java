public class JavaUni {
    public static int[] filterNichtAusreichendeNoten(int[] noten) {
        int[] nichtAusreichendeNoten = new int[noten.length];
        int count = 0;

        for (int note : noten) {
            if (note < 40) {
                nichtAusreichendeNoten[count++] = note;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = nichtAusreichendeNoten[i];
        }
        return result;
    }

    public static double durchschnittlicheNote(int[] noten) {
        if (noten.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int note : noten) {
            sum += note;
        }
        return (double) sum / noten.length;
    }

    private static int round(int grade) {
        if (grade < 38 || grade % 5 < 3) {
            return grade;
        } else {
            return grade + (5 - (grade % 5));
        }
    }
    public static int[] abgerundeteNoten(int[] noten) {
        int[] abgerundete = new int[noten.length]; // Create an array to store the rounded values
        for (int i = 0; i < noten.length; i++) {
            abgerundete[i] = round(noten[i]);
        }
        return abgerundete;
    }

    public static int maxAbgerundeteNote(int[] noten) {
        int max = -1;
        for (int note : noten) {
            int abgerundeteNote = round(note);
            if (abgerundeteNote > max) {
                max = abgerundeteNote;
            }
        }
        return max;
    }
}
