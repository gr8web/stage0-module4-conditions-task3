package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 91 && character <= 96)
        || (character < 65 || character > 122)) {

            System.out.println("wrong alphabet!");
            return;
        }

        if (character == 'a'
            || character == 'e'
            || character == 'i'
            || character == 'o'
            || character == 'u') {

            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
