import java.util.Random;
public class OddsArgs {
    public static void main(String[] args) {
        Random random = new Random(); // random seed
        int tall = random.nextInt(Integer.parseInt(args[0]));
        tall++;
        
        System.out.println(tall);
        for (int i = 0; i < 10; i++) {
            System.err.println("");
        }
        // HIT / MISS
        if (tall == Integer.parseInt(args[0])) {
            
            System.out.print("                              \r\n" + //
                                "                              \r\n" + //
                                "   .           .--.           \r\n" + //
                                " .'|           |__|           \r\n" + //
                                "<  |           .--.      .|   \r\n" + //
                                " | |           |  |    .' |_  \r\n" + //
                                " | | .'''-.    |  |  .'     | \r\n" + //
                                " | |/.'''. \\   |  | '--.  .-' \r\n" + //
                                " |  /    | |   |  |    |  |   \r\n" + //
                                " | |     | |   |__|    |  |   \r\n" + //
                                " | |     | |           |  '.' \r\n" + //
                                " | '.    | '.          |   /  \r\n" + //
                                " '---'   '---'         `'-'  ");
        }
        else {
            System.out.println("░▒▓██████████████▓▒░  ░▒▓█▓▒░  ░▒▓███████▓▒░  ░▒▓███████▓▒░ \r\n" + //
                                "░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░ ░▒▓█▓▒░        ░▒▓█▓▒░        \r\n" + //
                                "░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░ ░▒▓█▓▒░        ░▒▓█▓▒░        \r\n" + //
                                "░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░  ░▒▓██████▓▒░   ░▒▓██████▓▒░  \r\n" + //
                                "░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░        ░▒▓█▓▒░        ░▒▓█▓▒░ \r\n" + //
                                "░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░        ░▒▓█▓▒░        ░▒▓█▓▒░ \r\n" + //
                                "░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░ ░▒▓███████▓▒░  ░▒▓███████▓▒░  \r\n" + //
                                "                                                            ");
        }
        // Tømmer terminalen
        for (int i = 0; i < 10; i++) {
            System.out.println("");
    }
}
}