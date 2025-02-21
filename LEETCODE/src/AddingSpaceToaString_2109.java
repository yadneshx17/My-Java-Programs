public class AddingSpaceToaString_2109 {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int []spaces = {8,13,15};

        String s2 = "icodeinpython";
        int[] spaces2 = {1, 5, 7, 9};
//        System.out.println(addSpaces(s, spaces));
        System.out.println(addSpaces(s2, spaces2));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
//        sb.append(sb.substring(0, spaces[0]));
        sb.append(s, 0, spaces[0]);
        int i = 1;
        for(; i<spaces.length; i++) {
            sb.append(" ");
            sb.append(s, spaces[i-1], spaces[i]);
        }
        sb.append(" ");
        sb.append(s.substring(spaces[i-1]));
        return sb.toString();
    }
}