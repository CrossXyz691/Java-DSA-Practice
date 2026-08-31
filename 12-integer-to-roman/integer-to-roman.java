class Solution {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(num);

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '1' + 1;
            int place = s.length() - i;
            sb.append(roman(n, place));
        }

        return sb.toString();
    }

    static String roman(int n, int place){
        StringBuilder sb = new StringBuilder();
        if(n == 4 && place == 1) return "IV";
        else if(n == 9 && place == 1) return "IX";
        else if(n == 4 && place == 2) return "XL";
        else if(n == 9 && place == 2) return "XC";
        else if(n == 4 && place == 3) return "CD";
        else if(n == 9 && place == 3) return "CM";
        else if(n != 4 && n < 5 && place == 1) sb.append("I".repeat(Math.max(0, n)));
        else if(n != 9 && n >= 5 && n < 10 && place == 1){
            sb.append("V");
            sb.append("I".repeat((n - 5)));
        }
        else if (n < 5 && place == 2) sb.append("X".repeat(Math.max(0, n)));
        else if (n != 9 && n >= 5 && n < 10 && place == 2) {
            sb.append("L");
            sb.append("X".repeat((n - 5)));
        }
        else if (n < 5 && place == 3) sb.append("C".repeat(Math.max(0, n)));
        else if (n != 9 && n >= 5 && n < 10 && place == 3) {
            sb.append("D");
            sb.append("C".repeat((n - 5)));
        }
        else if (n < 5 && place == 4) sb.append("M".repeat(Math.max(0, n)));

        return sb.toString();
    }
}