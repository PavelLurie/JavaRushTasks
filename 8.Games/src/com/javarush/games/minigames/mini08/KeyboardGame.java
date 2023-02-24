package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Работа с клавиатурой
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (key == Key.LEFT && i == 0){
                    setCellColor(i,j, Color.GREEN);
                } else if (key == Key.RIGHT && i == 2) {
                    setCellColor(i, j, Color.GREEN);
                }else if (key == Key.UP && j == 0) {
                    setCellColor(i, j, Color.GREEN);
                } else if (key == Key.DOWN && j == 2) {
                    setCellColor(i, j, Color.GREEN);
                }
            }

        }
    }

    @Override
    public void onKeyReleased(Key key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (key == Key.LEFT && i == 0){
                    setCellColor(i,j, Color.WHITE);
                } else if (key == Key.RIGHT && i == 2) {
                    setCellColor(i, j, Color.WHITE);
                }else if (key == Key.UP && j == 0) {
                    setCellColor(i, j, Color.WHITE);
                } else if (key == Key.DOWN && j == 2) {
                    setCellColor(i, j, Color.WHITE);
                }
            }

        }
    }
}
