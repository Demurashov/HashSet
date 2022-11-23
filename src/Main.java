public class Main {
   public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut" +
            "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
            "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu" +
            "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit" +
            "anim id est laborum.";
    public static String word="nulla"; //сюда вводить искомое слово

    public static void main(String[] args) {

        WordsChecker finder=new WordsChecker(text);
        if (finder.hasWord(word)){
            System.out.println("Слово "+word+" имеется в тексте");
        }else {
            System.out.println("Слова "+word+" в тексте нет");
        }
    }
}