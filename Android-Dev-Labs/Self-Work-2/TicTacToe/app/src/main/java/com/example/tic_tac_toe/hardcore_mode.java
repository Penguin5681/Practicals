package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import java.util.Objects;

public class hardcore_mode extends AppCompatActivity {

    private final String[][] board = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };

    private final Button[][] buttons = new Button[3][3];
    private boolean isPlayerTurn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardcore_mode);

        initButtons();
        Button exit_btn = findViewById(R.id.exit_btn);

        exit_btn.setOnClickListener(view -> {
            Toast.makeText(this, "See ya again champ", Toast.LENGTH_SHORT).show();
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        });

        Button main_menu = findViewById(R.id.home_btn);
        main_menu.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void initButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int btnId = getResources().getIdentifier("box_" + i + "_" + j, "id", getPackageName());
                buttons[i][j] = findViewById(btnId);
                int finalJ = j;
                int finalI = i;
                buttons[i][j].setOnClickListener(view -> onButtonClick(finalI, finalJ));
            }
        }
    }

    private void onButtonClick(int row, int col) {
        if (board[row][col].equals(" ") && isPlayerTurn) {
            makeMove(row, col, "X");
            checkGameStatus();
            makeComputerMove();
            checkGameStatus();
        }
    }

    private void makeMove(int row, int col, String player) {
        board[row][col] = player;
        buttons[row][col].setText(player);
        isPlayerTurn = !isPlayerTurn;
    }

    private void makeComputerMove() {
        int[] bestMove = findBestMove(board);
        makeMove(bestMove[0], bestMove[1], "O");
    }

    private void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "";
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }
        isPlayerTurn = true;
    }

    private void checkGameStatus() {
        if (checkWinner(board).equals("X")) {
            resetGame();
        }
        else if (checkWinner(board).equals("O")) {
            Toast.makeText(this, "You lost against 20 lines of code", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, AIWins.class);
            startActivity(intent);
        }
        else if (isBoardFull(board)) {
            Toast.makeText(this, "It's a draw", Toast.LENGTH_SHORT).show();
            resetGame();
        }
    }
    private int[] findBestMove(String[][] currentBoard) {
        int[] bestMove = new int[]{-1, -1};
        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (currentBoard[i][j].equals(" ")) {
                    currentBoard[i][j] = "O";
                    int score = minimax(currentBoard, 0, false);
                    currentBoard[i][j] = " ";   // Ctrl-Z

                    if (score > bestScore) {
                        bestScore = score;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }
        return bestMove;
    }

    private int minimax(String[][] currentBoard, int depth, boolean isMaximizing) {
        String winner = checkWinner(currentBoard);
        if (winner.equals("X"))
            return -1;
        else if (winner.equals("O"))
            return 1;
        else if (isBoardFull(currentBoard))
            return 0;

        int bestScore;
        if (isMaximizing) {
            bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (currentBoard[i][j].equals(" ")) {
                        currentBoard[i][j] = "O";
                        bestScore = Math.max(bestScore, minimax(currentBoard, depth + 1, false));
                        currentBoard[i][j] = " ";
                    }
                }
            }
        }
        else {
            bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (currentBoard[i][j].equals(" ")) {
                        currentBoard[i][j] = "X";
                        bestScore = Math.min(bestScore, minimax(currentBoard, depth + 1, true));
                        currentBoard[i][j] = " ";
                    }
                }
            }
        }
        return bestScore;
    }

    private String checkWinner(String[][] currentBoard) {
        for (int i = 0; i < 3; i++) {
            if (currentBoard[i][0].equals(currentBoard[i][1]) && currentBoard[i][1].equals(currentBoard[i][2]) && !currentBoard[i][0].equals(" ")) {
                return currentBoard[i][0];
            }
        }
        for (int j = 0; j < 3; j++) {
            if (currentBoard[0][j].equals(currentBoard[1][j]) && currentBoard[1][j].equals(currentBoard[2][j]) && !currentBoard[0][j].equals(" ")) {
                return currentBoard[0][j];
            }
        }

        // Check diagonals
        if (currentBoard[0][0].equals(currentBoard[1][1]) && currentBoard[1][1].equals(currentBoard[2][2]) && !currentBoard[0][0].equals(" ")) {
            return currentBoard[0][0];
        }

        if (currentBoard[0][2].equals(currentBoard[1][1]) && currentBoard[1][1].equals(currentBoard[2][0]) && !currentBoard[0][2].equals(" ")) {
            return currentBoard[0][2];
        }

        return " "; // No winner yet
    }

    private boolean isBoardFull(String[][] currentBoard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Objects.equals(currentBoard[i][j], " "))
                    return false;
            }
        }
        return true;
    }
}