import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        if (args.length > 2) {
            throw new Exception("ERROR: the number of command line arguments is too big. It has to be 1 or 2.");
        } else if (args.length == 0) {
            throw new Exception("ERROR: the number of command line arguments is too small. It has to be 1 or 2.");
        } else if (args.length == 2) {
            switch (args[1].toLowerCase(Locale.ROOT)) {
                case "hun":
                    sb.append("Szia, ");break;
                case "eng":
                    sb.append("Hello, ");break;
                case "ger":
                    sb.append("Willkommen, ");break;
                default:
                    throw new Exception("ERROR: not a correct language code is given. It should be hun, eng or ger.");
            }
        } else {
            sb.append("Szia, "); // the number of arguments here is exactly one. There is no language is given, the default is hungarian.
        }
        sb.append(args[0]);
        sb.append("!");
        System.out.println(sb);
    }
}
