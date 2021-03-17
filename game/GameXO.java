package game;

import java.util.*;

public class GameXO {

    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> botPositions = new ArrayList<>();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);


        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9)");
            int playerPos = scan.nextInt();

            while (playerPositions.contains(playerPos) || botPositions.contains(playerPos)){
                System.out.println("Position token");
                playerPos = scan.nextInt();
            }

            placePiece(gameBoard, playerPos, "player");

            String result = checkWinner();
            if (result.length()>0) {
                System.out.println(result);
                break;
            }

            Random random = new Random();
            int botPos = random.nextInt(9) + 1;
            while (playerPositions.contains(botPos) || botPositions.contains(botPos)){
                botPos = random.nextInt(9) + 1;
            }

            placePiece(gameBoard, botPos, "bot");

            printGameBoard(gameBoard);


            result = checkWinner();
            if (result.length()>0) {
                System.out.println(result);
                break;
            }
        }

    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("bot")) {
            symbol = '0';
            botPositions.add(pos);
        }

        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List minRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1, 4, 7);
        List minCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(minRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(minCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (playerPositions.containsAll(l)) {
                return "Tabrik! bozira bridi qurutov ba nomtay ";
            } else if (botPositions.containsAll(l)) {
                return "zik nashav bou dodi izo dafai diga mebri  ";
            } else if (playerPositions.size() + botPositions.size() == 9) {
                return "CAT!";
            }
        }

        return "";
    }
}