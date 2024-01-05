package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import java.util.Objects;
import java.util.Random;

public class PlayScreen extends AppCompatActivity {
    private final Random random = new Random();
    private final String[][] board = new String[3][3];
    String currentPlayer = "O"; // default "O"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        initBoard();
        setBoardBtnListeners();

        Button play_again_btn = findViewById(R.id.play_again_btn);
        Button exit_btn = findViewById(R.id.exit_btn);

        play_again_btn.setOnClickListener(view -> {
            Toast.makeText(PlayScreen.this, "Game Reset", Toast.LENGTH_SHORT).show();
            resetGame();
        });

        exit_btn.setOnClickListener(view -> {
            Toast.makeText(PlayScreen.this, "See ya again champ", Toast.LENGTH_SHORT).show();
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        });
    }

    private void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    private void onCellClick(int r, int c) {
        Log.d("TicTacToe", "Clicked on the cell: " + r + ", " + c);
        if (Objects.equals(board[r][c], " ")) {
            @SuppressLint("DiscouragedApi") int btnID = getResources().getIdentifier("box_" + r + "_" + c, "id", getPackageName());
            Button btn = findViewById(btnID);
            btn.setText(String.valueOf(currentPlayer));
            board[r][c] = currentPlayer;

            if (checkForWinner()) {
                Intent intent = new Intent(this, ResultScreen.class);
                startActivity(intent);
            }
            else if (isBoardFull()) {
                showResult("It's a draw");
            }
            else {
                currentPlayer = (Objects.equals(currentPlayer, "X")) ? "O" : "X";

                if (currentPlayer.equals("X")) {
                    computerMove();
                }
            }
        }
    }

    private void computerMove() {
        int r, c;
        do {
            r = random.nextInt(3);
            c = random.nextInt(3);
        } while (!Objects.equals(board[r][c], " "));

        @SuppressLint("DiscouragedApi") int btnID = getResources().getIdentifier("box_" + r + "_" + c, "id", getPackageName());
        Button btn = findViewById(btnID);
        btn.setText("X");
        board[r][c] = "X";

        if (checkForWinner()) {
            showResult("Lmao. You Lose");
        } else if (isBoardFull()) {
            Toast.makeText(this, "It's a draw", Toast.LENGTH_SHORT).show();
        } else {
            currentPlayer = "O";
        }
    }

    private boolean checkForWinner() {
        // row
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(board[i][0], currentPlayer) && Objects.equals(board[i][1], currentPlayer) && Objects.equals(board[i][2], currentPlayer)) {
                return true;
            }
        }

        // column
        for (int j = 0; j < 3; j++) {
            if (Objects.equals(board[0][j], currentPlayer) && Objects.equals(board[1][j], currentPlayer) && Objects.equals(board[2][j], currentPlayer)) {
                return true;
            }
        }

        // top left to bottom right diagonal
        if (Objects.equals(board[0][0], currentPlayer) && Objects.equals(board[1][1], currentPlayer) && Objects.equals(board[2][2], currentPlayer)) {
            return true;
        }

        // top right to bottom left diagonal
        return Objects.equals(board[0][2], currentPlayer) && Objects.equals(board[1][1], currentPlayer) && Objects.equals(board[2][0], currentPlayer);
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Objects.equals(board[i][j], " ")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void showResult(String message) {
//        Log.d("TicTacToe", "Game result: " + message);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        resetGame();
    }


    private void resetGame() {
        initBoard();
        setBoardBtnListeners();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                @SuppressLint("DiscouragedApi") int btnID = getResources().getIdentifier("box_" + i + "_" + j, "id", getPackageName());
                Button btn = findViewById(btnID);
                btn.setText("");
            }
        }

        Log.d("ResetGame", "Board buttons listeners set up.");

        if (currentPlayer.equals("X")) {
            computerMove();
        }
    }

    private void setBoardBtnListeners() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                @SuppressLint("DiscouragedApi") int btnID = getResources().getIdentifier("box_" + i + "_" + j, "id", getPackageName());
                Button btn = findViewById(btnID);
                final int finalI = i;
                final int finalJ = j;

                btn.setOnClickListener(view -> {
                    onCellClick(finalI, finalJ);
                });
            }
        }
    }
}
