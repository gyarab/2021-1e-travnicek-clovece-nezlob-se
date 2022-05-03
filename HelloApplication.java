package com.example.tip2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private final Circle c11 = new Circle(20, Color.GREEN);//zeleny domov
    private final Circle c12 = new Circle(20, Color.GREEN);//zeleny domov
    private final Circle c13 = new Circle(20, Color.WHITE);
    private final Circle c14 = new Circle(20, Color.WHITE);
    private final Circle c15 = new Circle(20, Color.WHITE);
    private final Circle c16 = new Circle(20, Color.WHITE);
    private final Circle c17 = new Circle(20, Color.WHITE);
    private final Circle c18 = new Circle(20, Color.WHITE);
    private final Circle c19 = new Circle(20, Color.WHITE);
    private final Circle c110 = new Circle(20, Color.WHITE);
    private final Circle c111 = new Circle(20, Color.WHITE);
    private final Circle c112 = new Circle(20, Color.WHITE);
    private final Circle c113 = new Circle(20, Color.BLUE);//modry domov
    private final Circle c114 = new Circle(20, Color.BLUE);//modry domov
    private final Circle c21 = new Circle(20, Color.GREEN);//zeleny domov
    private final Circle c22 = new Circle(20, Color.GREEN);//zeleny domov
    private final Button b23 = new Button();
    //private final Circle c23 = new Circle(20, Color.WHITE);
    private final Circle c24 = new Circle(20, Color.WHITE);
    private final Circle c25 = new Circle(20, Color.WHITE);
    private final Circle c26 = new Circle(20, Color.WHITE);
    private final Circle c27 = new Circle(20, Color.WHITE);
    private final Circle c28 = new Circle(20, Color.WHITE);
    private final Circle c29 = new Circle(20, Color.WHITE);
    private final Circle c210 = new Circle(20, Color.WHITE);
    private final Circle c211 = new Circle(20, Color.WHITE);
    private final Button b212 = new Button();
    //private final Circle c212 = new Circle(20, Color.WHITE);
    private final Circle c213 = new Circle(20, Color.BLUE);//modry domov
    private final Circle c214 = new Circle(20, Color.BLUE);//modry domov
    private final Circle c31 = new Circle(20, Color.WHITE);
    private final Circle c32 = new Circle(20, Color.WHITE);
    private final Circle c33 = new Circle(20, Color.GREEN);//zeleny start
    private final Circle c34 = new Circle(20, Color.GRAY);
    private final Circle c35 = new Circle(20, Color.GRAY);
    private final Circle c36 = new Circle(20, Color.GRAY);
    private final Circle c37 = new Circle(20, Color.GRAY);
    private final Circle c38 = new Circle(20, Color.GRAY);
    private final Circle c39 = new Circle(20, Color.GRAY);
    private final Circle c310 = new Circle(20, Color.GRAY);
    private final Circle c311 = new Circle(20, Color.GRAY);
    private final Circle c312 = new Circle(20, Color.BLUE);//modry start
    private final Circle c313 = new Circle(20, Color.WHITE);
    private final Circle c314 = new Circle(20, Color.WHITE);
    private final Circle c41 = new Circle(20, Color.WHITE);
    private final Circle c42 = new Circle(20, Color.WHITE);
    private final Circle c43 = new Circle(20, Color.GRAY);
    private final Circle c44 = new Circle(20, Color.WHITE);
    private final Circle c45 = new Circle(20, Color.WHITE);
    private final Circle c46 = new Circle(20, Color.WHITE);
    private final Circle c47 = new Circle(20, Color.WHITE);
    private final Circle c48 = new Circle(20, Color.WHITE);
    private final Circle c49 = new Circle(20, Color.WHITE);
    private final Circle c410 = new Circle(20, Color.WHITE);
    private final Circle c411 = new Circle(20, Color.WHITE);
    private final Circle c412 = new Circle(20, Color.GRAY);
    private final Circle c413 = new Circle(20, Color.WHITE);
    private final Circle c414 = new Circle(20, Color.WHITE);
    private final Circle c51 = new Circle(20, Color.WHITE);
    private final Circle c52 = new Circle(20, Color.WHITE);
    private final Circle c53 = new Circle(20, Color.GRAY);
    private final Circle c54 = new Circle(20, Color.WHITE);
    private final Circle c55 = new Circle(20, Color.WHITE);
    private final Circle c56 = new Circle(20, Color.WHITE);
    private final Circle c57 = new Circle(20, Color.WHITE);
    private final Circle c58 = new Circle(20, Color.WHITE);
    private final Circle c59 = new Circle(20, Color.WHITE);
    private final Circle c510 = new Circle(20, Color.WHITE);
    private final Circle c511 = new Circle(20, Color.WHITE);
    private final Circle c512 = new Circle(20, Color.GRAY);
    private final Circle c513 = new Circle(20, Color.WHITE);
    private final Circle c514 = new Circle(20, Color.WHITE);
    private final Circle c61 = new Circle(20, Color.WHITE);
    private final Circle c62 = new Circle(20, Color.WHITE);
    private final Circle c63 = new Circle(20, Color.GRAY);
    private final Circle c64 = new Circle(20, Color.WHITE);
    private final Circle c65 = new Circle(20, Color.WHITE);
    private final Circle c66 = new Circle(20, Color.WHITE);
    private final Circle c67 = new Circle(20, Color.WHITE);
    private final Circle c68 = new Circle(20, Color.WHITE);
    private final Circle c69 = new Circle(20, Color.WHITE);
    private final Circle c610 = new Circle(20, Color.WHITE);
    private final Circle c611 = new Circle(20, Color.WHITE);
    private final Circle c612 = new Circle(20, Color.GRAY);
    private final Circle c613 = new Circle(20, Color.WHITE);
    private final Circle c614 = new Circle(20, Color.WHITE);
    private final Circle c71 = new Circle(20, Color.WHITE);
    private final Circle c72 = new Circle(20, Color.WHITE);
    private final Circle c73 = new Circle(20, Color.GRAY);
    private final Circle c74 = new Circle(20, Color.WHITE);
    private final Circle c75 = new Circle(20, Color.WHITE);
    private final Circle c76 = new Circle(20, Color.WHITE);
    private final Circle c77 = new Circle(20, Color.WHITE);
    private final Circle c78 = new Circle(20, Color.WHITE);
    private final Circle c79 = new Circle(20, Color.WHITE);
    private final Circle c710 = new Circle(20, Color.WHITE);
    private final Circle c711 = new Circle(20, Color.WHITE);
    private final Circle c712 = new Circle(20, Color.GRAY);
    private final Circle c713 = new Circle(20, Color.WHITE);
    private final Circle c714 = new Circle(20, Color.WHITE);
    private final Circle c81 = new Circle(20, Color.WHITE);
    private final Circle c82 = new Circle(20, Color.WHITE);
    private final Circle c83 = new Circle(20, Color.GRAY);
    private final Circle c84 = new Circle(20, Color.WHITE);
    private final Circle c85 = new Circle(20, Color.WHITE);
    private final Circle c86 = new Circle(20, Color.WHITE);
    private final Circle c87 = new Circle(20, Color.WHITE);
    private final Circle c88 = new Circle(20, Color.WHITE);
    private final Circle c89 = new Circle(20, Color.WHITE);
    private final Circle c810 = new Circle(20, Color.WHITE);
    private final Circle c811 = new Circle(20, Color.WHITE);
    private final Circle c812 = new Circle(20, Color.GRAY);
    private final Circle c813 = new Circle(20, Color.WHITE);
    private final Circle c814 = new Circle(20, Color.WHITE);
    private final Circle c91 = new Circle(20, Color.WHITE);
    private final Circle c92 = new Circle(20, Color.WHITE);
    private final Circle c93 = new Circle(20, Color.GRAY);
    private final Circle c94 = new Circle(20, Color.WHITE);
    private final Circle c95 = new Circle(20, Color.WHITE);
    private final Circle c96 = new Circle(20, Color.WHITE);
    private final Circle c97 = new Circle(20, Color.WHITE);
    private final Circle c98 = new Circle(20, Color.WHITE);
    private final Circle c99 = new Circle(20, Color.WHITE);
    private final Circle c910 = new Circle(20, Color.WHITE);
    private final Circle c911 = new Circle(20, Color.WHITE);
    private final Circle c912 = new Circle(20, Color.GRAY);
    private final Circle c913 = new Circle(20, Color.WHITE);
    private final Circle c914 = new Circle(20, Color.WHITE);
    private final Circle c101 = new Circle(20, Color.WHITE);
    private final Circle c102 = new Circle(20, Color.WHITE);
    private final Circle c103 = new Circle(20, Color.GRAY);
    private final Circle c104 = new Circle(20, Color.WHITE);
    private final Circle c105 = new Circle(20, Color.WHITE);
    private final Circle c106 = new Circle(20, Color.WHITE);
    private final Circle c107 = new Circle(20, Color.WHITE);
    private final Circle c108 = new Circle(20, Color.WHITE);
    private final Circle c109 = new Circle(20, Color.WHITE);
    private final Circle c1010 = new Circle(20, Color.WHITE);
    private final Circle c1011 = new Circle(20, Color.WHITE);
    private final Circle c1012 = new Circle(20, Color.GRAY);
    private final Circle c1013 = new Circle(20, Color.WHITE);
    private final Circle c1014 = new Circle(20, Color.WHITE);
    private final Circle c11s1 = new Circle(20, Color.WHITE);
    private final Circle c11s2 = new Circle(20, Color.WHITE);
    private final Circle c11s3 = new Circle(20, Color.GRAY);
    private final Circle c11s4 = new Circle(20, Color.WHITE);
    private final Circle c115 = new Circle(20, Color.WHITE);
    private final Circle c116 = new Circle(20, Color.WHITE);
    private final Circle c117 = new Circle(20, Color.WHITE);
    private final Circle c118 = new Circle(20, Color.WHITE);
    private final Circle c119 = new Circle(20, Color.WHITE);
    private final Circle c1110 = new Circle(20, Color.WHITE);
    private final Circle c1111 = new Circle(20, Color.WHITE);
    private final Circle c1112 = new Circle(20, Color.GRAY);
    private final Circle c1113 = new Circle(20, Color.WHITE);
    private final Circle c1114 = new Circle(20, Color.WHITE);
    private final Circle c121 = new Circle(20, Color.WHITE);
    private final Circle c122 = new Circle(20, Color.WHITE);
    private final Circle c123 = new Circle(20, Color.YELLOW);//zluty start
    private final Circle c124 = new Circle(20, Color.GRAY);
    private final Circle c125 = new Circle(20, Color.GRAY);
    private final Circle c126 = new Circle(20, Color.GRAY);
    private final Circle c127 = new Circle(20, Color.GRAY);
    private final Circle c128 = new Circle(20, Color.GRAY);
    private final Circle c129 = new Circle(20, Color.GRAY);
    private final Circle c1210 = new Circle(20, Color.GRAY);
    private final Circle c1211 = new Circle(20, Color.GRAY);
    private final Circle c1212 = new Circle(20, Color.RED);//cerveny start
    private final Circle c1213 = new Circle(20, Color.WHITE);
    private final Circle c1214 = new Circle(20, Color.WHITE);
    private final Circle c131 = new Circle(20, Color.YELLOW);//zluty domov
    private final Circle c132 = new Circle(20, Color.YELLOW);//zluty domov
    private final Button b133 = new Button();
    //private final Circle c133 = new Circle(20, Color.WHITE);
    private final Circle c134 = new Circle(20, Color.WHITE);
    private final Circle c135 = new Circle(20, Color.WHITE);
    private final Circle c136 = new Circle(20, Color.WHITE);
    private final Circle c137 = new Circle(20, Color.WHITE);
    private final Circle c138 = new Circle(20, Color.WHITE);
    private final Circle c139 = new Circle(20, Color.WHITE);
    private final Circle c1310 = new Circle(20, Color.WHITE);
    private final Circle c1311 = new Circle(20, Color.WHITE);
    private final Button b1312 = new Button();
    //private final Circle c1312 = new Circle(20, Color.WHITE);
    private final Circle c1313 = new Circle(20, Color.RED);//cerveny domov
    private final Circle c1314 = new Circle(20, Color.RED);//cerveny domov
    private final Circle c141 = new Circle(20, Color.YELLOW);//zluty domov
    private final Circle c142 = new Circle(20, Color.YELLOW);//zluty domov
    private final Circle c143 = new Circle(20, Color.WHITE);
    private final Circle c144 = new Circle(20, Color.WHITE);
    private final Circle c145 = new Circle(20, Color.WHITE);
    private final Circle c146 = new Circle(20, Color.WHITE);
    private final Circle c147 = new Circle(20, Color.WHITE);
    private final Circle c148 = new Circle(20, Color.WHITE);
    private final Circle c149 = new Circle(20, Color.WHITE);
    private final Circle c1410 = new Circle(20, Color.WHITE);
    private final Circle c1411 = new Circle(20, Color.WHITE);
    private final Circle c1412 = new Circle(20, Color.WHITE);
    private final Circle c1413 = new Circle(20, Color.RED);//cerveny domov
    private final Circle c1414 = new Circle(20, Color.RED);//cerveny domov

    private Circle[] playground = new Circle[36];

    private final Button b57 = new Button();
    private final Dice dice = new Dice();

    private House redHouse = new House(c1313, c1314, c1413, c1414, Color.RED);
    private House yellowHouse = new House(c131, c132, c141, c142, Color.YELLOW);
    private House greenHouse = new House(c11, c12, c21, c22, Color.GREEN);
    private House blueHouse = new House(c113, c114, c213, c214, Color.BLUE);


    private int redPlayer = 0;
    private int yellowPlayer = 9;
    private int greenPlayer = 18;
    private int bluePlayer = 27;

    private int redPlayerDistance = 0;
    private int yellowPlayerDistance = 0;
    private int greenPlayerDistance = 0;
    private int bluePlayerDistance = 0;


    /*private int yellowPlayerScore = 0;
    private int redPlayerScore = 0;
    private int greenPlayerScore = 0;
    private int bluePlayerScore = 0;*/

    private Color lastColor = Color.BLUE;

    public HelloApplication() {
    }

    private Parent createContent() {
        TilePane tilePane = new TilePane();
        tilePane.setPrefColumns(14);
        tilePane.setPrefRows(14);
        //tilePane.setTileAlignment( Pos.CENTER );

        playground[0] = c1212;
        playground[1] = c1211;
        playground[2] = c1210;
        playground[3] = c129;
        playground[4] = c128;
        playground[5] = c127;
        playground[6] = c126;
        playground[7] = c125;
        playground[8] = c124;
        playground[9] = c123;
        playground[10] = c11s3;
        playground[11] = c103;
        playground[12] = c93;
        playground[13] = c83;
        playground[14] = c73;
        playground[15] = c63;
        playground[16] = c53;
        playground[17] = c43;
        playground[18] = c33;
        playground[19] = c34;
        playground[20] = c35;
        playground[21] = c36;
        playground[22] = c37;
        playground[23] = c38;
        playground[24] = c39;
        playground[25] = c310;
        playground[26] = c311;
        playground[27] = c312;
        playground[28] = c412;
        playground[29] = c512;
        playground[30] = c612;
        playground[31] = c712;
        playground[32] = c812;
        playground[33] = c912;
        playground[34] = c1012;
        playground[35] = c1112;
        //....

        tilePane.getChildren().addAll(c11,
                c12,
                c13,
                c14,
                c15,
                c16,
                c17,
                c18,
                c19,
                c110,
                c111,
                c112,
                c113,
                c114,
                c21,
                c22,
                b23,
                c24,
                c25,
                c26,
                c27,
                c28,
                c29,
                c210,
                c211,
                b212,
                c213,
                c214,
                c31,
                c32,
                c33,
                c34,
                c35,
                c36,
                c37,
                c38,
                c39,
                c310,
                c311,
                c312,
                c313,
                c314,
                c41,
                c42,
                c43,
                c44,
                c45,
                c46,
                c47,
                c48,
                c49,
                c410,
                c411,
                c412,
                c413,
                c414,
                c51,
                c52,
                c53,
                c54,
                c55,
                c56,
                b57,
                c58,
                c59,
                c510,
                c511,
                c512,
                c513,
                c514,
                c61,
                c62,
                c63,
                c64,
                c65,
                c66,
                c67,
                c68,
                c69,
                c610,
                c611,
                c612,
                c613,
                c614,
                c71,
                c72,
                c73,
                c74,
                c75,
                c76,
                c77,
                c78,
                c79,
                c710,
                c711,
                c712,
                c713,
                c714,
                c81,
                c82,
                c83,
                c84,
                c85,
                c86,
                c87,
                c88,
                c89,
                c810,
                c811,
                c812,
                c813,
                c814,
                c91,
                c92,
                c93,
                c94,
                c95,
                c96,
                c97,
                c98,
                c99,
                c910,
                c911,
                c912,
                c913,
                c914,
                c101,
                c102,
                c103,
                c104,
                c105,
                c106,
                c107,
                c108,
                c109,
                c1010,
                c1011,
                c1012,
                c1013,
                c1014,
                c11s1,
                c11s2,
                c11s3,
                c11s4,
                c115,
                c116,
                c117,
                c118,
                c119,
                c1110,
                c1111,
                c1112,
                c1113,
                c1114,
                c121,
                c122,
                c123,
                c124,
                c125,
                c126,
                c127,
                c128,
                c129,
                c1210,
                c1211,
                c1212,
                c1213,
                c1214,
                c131,
                c132,
                b133,
                c134,
                c135,
                c136,
                c137,
                c138,
                c139,
                c1310,
                c1311,
                b1312,
                c1313,
                c1314,
                c141,
                c142,
                c143,
                c144,
                c145,
                c146,
                c147,
                c148,
                c149,
                c1410,
                c1411,
                c1412,
                c1413,
                c1414

                //new Circle(0, Color.GRAY)
        );

        return tilePane;
    }

    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(createContent()));
        b57.setOnMouseClicked(this::rollTheDice);
        redHouse.getOneToken();
        blueHouse.getOneToken();
        yellowHouse.getOneToken();
        greenHouse.getOneToken();

        stage.show();
    }

    private void rollTheDice(MouseEvent e) {

        int vysledneCislo = dice.roll();
        Button diceButton = (Button) e.getSource();
        diceButton.setText(String.valueOf(vysledneCislo));



        if (lastColor == (Color.RED)) {
            //System.out.println("RED player move about " + vysledneCislo);
            int newIndex = move(yellowPlayer, vysledneCislo, Color.YELLOW, yellowPlayerDistance);
            if (yellowPlayer != newIndex) {
                yellowPlayer = newIndex;
                yellowPlayerDistance += vysledneCislo;
            }
            if (yellowPlayerDistance == 36) {
                yellowHouse.getOneToken();
                yellowPlayerDistance = 0;

            }
            if(yellowPlayerDistance == redPlayerDistance +9 || yellowPlayerDistance == greenPlayerDistance - 9 || yellowPlayerDistance == bluePlayerDistance - 18){
                yellowPlayerDistance = 0;



            }/*
            for (int x = 0; x == 1; x++) {
                if (vysledneCislo == 6) {
                    yellowHouse.getOneToken();
                }
            }*/
            lastColor = Color.YELLOW;
        } else if (lastColor == (Color.YELLOW)) {
            int newIndex = move(greenPlayer, vysledneCislo, Color.GREEN, greenPlayerDistance);
            if (greenPlayer != newIndex) {
                greenPlayer = newIndex;
                greenPlayerDistance += vysledneCislo;
            }
            lastColor = Color.GREEN;
            if (greenPlayerDistance == 36) {
                greenHouse.getOneToken();
                greenPlayerDistance = 0;
                //setGreenScore = setGreenScore + 1;
            }
            if(greenPlayerDistance == redPlayerDistance+18||greenPlayerDistance==yellowPlayerDistance+9||greenPlayerDistance==bluePlayerDistance-9 ){
                playground[greenPlayer].setFill(Color.GRAY);
                greenPlayerDistance = 0;
                playground[greenPlayer].setFill(Color.GREEN);

            }/*
            for (int x = 0; x ==1; x++) {
                if (vysledneCislo < 6) {
                    greenPlayer = 0;
                }
            }*/
        } else if (lastColor == (Color.GREEN)) {
            int newIndex = move(bluePlayer, vysledneCislo, Color.BLUE, bluePlayerDistance);
            if (bluePlayer != newIndex) {
                bluePlayer = newIndex;
                bluePlayerDistance += vysledneCislo;
            }
            lastColor = Color.BLUE;
            if (bluePlayerDistance == 36) {
                blueHouse.getOneToken();
                bluePlayerDistance = 0;
                //setBlueScore = setBlueScore + 1;

            }
            if(bluePlayerDistance == redPlayerDistance+27 || bluePlayerDistance==yellowPlayerDistance+18 || bluePlayerDistance==greenPlayerDistance+9 ){
                playground[bluePlayer].setFill(Color.GRAY);
                bluePlayer = 0;
                playground[bluePlayer].setFill(Color.BLUE);
            }/*
            for (int x = 0; x == 3; x++) {
                if (vysledneCislo < 6) {
                    bluePlayer = 0;
                }
            }*/
        } else if (lastColor == (Color.BLUE)) {
            int newIndex = move(redPlayer, vysledneCislo, Color.RED, redPlayerDistance);
            if (redPlayer != newIndex) {
                redPlayer = newIndex;
                redPlayerDistance += vysledneCislo;
            }
            lastColor = Color.RED;
            if (redPlayerDistance == 36) {
                redHouse.getOneToken();
                redPlayerDistance = 0;
                //setRedScore = setRedScore + 1;
            }
            if(redPlayerDistance == yellowPlayerDistance-9||redPlayerDistance ==greenPlayerDistance-18||redPlayerDistance==bluePlayerDistance-27 ){
                playground[redPlayer].setFill(Color.GRAY);
                redPlayer = 0;
                playground[redPlayer].setFill(Color.RED);

            }/*
            for (int x = 0; x == 3; x++) {
                if (vysledneCislo == 6) {
                    redHouse.getOneToken();
                }
            }*/
        }
    }


    private int move( int player, int dice, Color playerColor,int playerDistance){
        if (dice + playerDistance <= 36) {
            playerDistance += dice;
        } else {
            return player;
        }
        playground[player].setFill(Color.GREY);
        player = player + dice;
        if (player > 35) {
            player = player - 36;
        }
        playground[player].setFill(playerColor);
        return player;

    }
}