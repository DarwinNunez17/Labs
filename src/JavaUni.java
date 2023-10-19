public class JavaUni {
    public static int[] nichtAusreichendeNoten(int[] noten) {
        int[] nichtAusreichendeNoten = new int[noten.length];
        int count = 0;
        for(int note : noten){
            if(note < 40){
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
            return 0;
        }
        int sum = 0;
        for (int note : noten) {
            sum += note;
        }
        return (double) sum / noten.length;
    }
    private static int round(int note) {
        if (note < 38 || note % 5 < 3) {
            return note;
        } else {
            return note + (5 - (note % 5));
        }
    }
    public static int[] abgerundeteNoten(int[] noten) {
        int[] abgerundete = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            abgerundete[i] = round(noten[i]);
        }
        return abgerundete;
    }
    public static int maximaleAbgerundeteNote(int[] noten) {
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
