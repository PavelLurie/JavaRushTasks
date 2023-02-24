package com.javarush.games.game2048;


import com.javarush.engine.cell.*;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;

    private int score;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();

    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();

    }

    private void drawScene() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private void createNewNumber() {
        if (getMaxTileValue() == 2048){
            win();
        }
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);

        if (gameField[y][x] == 0) {
            gameField[y][x] = getRandomNumber(10) < 9 ? 2 : 4;
        } else {
            createNewNumber();
        }
    }

    private Color getColorByValue(int value) {

        if (value == 0) return Color.WHITE;
        if (value == 2) return Color.PLUM;
        if (value == 4) return Color.SLATEBLUE;
        if (value == 8) return Color.DODGERBLUE;
        if (value == 16) return Color.DARKTURQUOISE;
        if (value == 32) return Color.MEDIUMSEAGREEN;
        if (value == 64) return Color.LIMEGREEN;
        if (value == 128) return Color.DARKORANGE;
        if (value == 256) return Color.SALMON;
        if (value == 512) return Color.ORANGERED;
        if (value == 1024) return Color.DEEPPINK;
        if (value == 2048) return Color.MEDIUMVIOLETRED;
        else return Color.NONE;
    }

    private void setCellColoredNumber(int x, int y, int value) {
        if (value == 0) {
            setCellValueEx(x, y, getColorByValue(value), "");
        } else {
            setCellValueEx(x, y, getColorByValue(value), Integer.toString(value));
        }
    }

    private boolean compressRow(int[] row) {
        int[] rowCopy = Arrays.copyOf(row, row.length);
        int temp = 0;
        for (int i : row) {
            if (i != 0) row[temp++] = i;
        }
        for (int i = temp; i < row.length; i++) {
            row[i] = 0;

        }
        if (Arrays.equals(row, rowCopy)) {
            return false;
        }
        return true;
    }

    private boolean mergeRow(int[] row) {
        int[] rowCopy = Arrays.copyOf(row, row.length);
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] == row[i + 1]) {
                row[i] += row[i + 1];
                score += row[i];
                setScore(score);
                row[i + 1] = 0;
            }
        }

        if (Arrays.equals(row, rowCopy)) {
            return false;
        }
        return true;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped){
            if (key == Key.SPACE) {
                isGameStopped = false;
                score = 0;
                createGame();
                drawScene();
                setScore(score);
            } else {
                return;
            }
        }
            if (canUserMove()) {
                if (key == Key.LEFT) {
                    moveLeft();
                    drawScene();
                } else if (key == Key.RIGHT) {
                    moveRight();
                    drawScene();
                } else if (key == Key.UP) {
                    moveUp();
                    drawScene();
                } else if (key == Key.DOWN) {
                    moveDown();
                    drawScene();
                }
            } else {
                gameOver();
            }

    }

    private void moveLeft() {
        boolean isNewNumberNeeded = false;
        for (int[] row : gameField) {
            boolean wasCompressed = compressRow(row);
            boolean wasMerged = mergeRow(row);
            if (wasMerged) {
                compressRow(row);
            }
            if (wasCompressed || wasMerged) {
                isNewNumberNeeded = true;
            }
        }
        if (isNewNumberNeeded) {
            createNewNumber();
        }
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {

        int [][] temp = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                temp[j][SIDE - 1 - i] = gameField[i][j];
            }
        }gameField = temp;
    }

    private int getMaxTileValue(){
        int maxValue = 0;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j] > maxValue){
                    maxValue = gameField[i][j];
                }
            }
        }
        return maxValue;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "You Win!", Color.BLACK, 50);
    }

    private boolean canUserMove() {
        if (method1()) {
            return true;
        }else if (method2()){
            return true;
        } else return false;
    }

    private boolean method1(){

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j] == 0) return true;
            }
        }
        return false;
    }

    private boolean method2(){
        int w = 0;
        int s = 0;
        int g = 0;
        int k = 0;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                while (j < gameField.length - 1){
                    w = gameField[i][j];
                    s = gameField[i][j + 1];
                    break;
                }if (w != s) {
                    while (i < gameField.length - 1){
                        g = gameField[i][j];
                        k = gameField[i + 1][j];
                        break;
                    }if (g == k)return true;
                }else return true;
            }
        }return false;
    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.RED, "You lose. You score: " + score, Color.BLACK, 40);

    }
}
