public class MoveVowelsLeft {
    static void main(String[] args) {

        String str = "My Name is Harshal Salunke";
        String vovel = "";
        String constants = "";

        for (char c : str.toCharArray()) {

            if ("AEIOUaeiou".indexOf(c) != -1) {
                vovel += c;
            } else if (Character.isLetter(c)) {

                constants += c;
            } else if (" ".indexOf(c) != -1) {
                System.out.println(vovel + constants);
                vovel = "";
                constants = "";

            }

        }
        System.out.println(vovel + constants);


    }

}
