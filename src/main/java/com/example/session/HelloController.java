package com.example.session;


import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



import java.util.*;


public class HelloController {



    @FXML
    TextField dmg;

    List<String> win_lose = new ArrayList<>();
    List<String> average_dmg = new ArrayList<>();
    int w = 0;
    float persent = 0;
    int dmg_sum = 0;





    @FXML
    private Label score_win;

    @FXML
    private Label score;

    @FXML
    private Label score_dmg;

    @FXML
    ImageView smile;


    Image zero = new Image("0.png");
    Image bad = new Image("1-39.png");
    Image normal = new Image("40-50.png");
    Image good = new Image("51-60.png");
    Image great = new Image("61-67.png");
    Image wow = new Image("68-74.png");
    Image amazing = new Image("75-89.png");
    Image demon = new Image("90-100.png");




    @FXML
    public void clear() {
        score.setText("0");
        score_dmg.setText("-");
        score_win.setText("-");
        win_lose.clear();
        average_dmg.clear();
        smile.setImage(zero);
        w = 0;
        dmg_sum = 0;
        dmg.clear();
    }

    @FXML
    public void win() {
            score.setText(String.valueOf(Integer.parseInt(score.getText().substring(score.getText().indexOf(" ") + 1)) + 1));
            win_lose.add("win");
            w = 0;
            for (String a : win_lose) {

                if (a.equals("win")) {
                    w++;
                }
            }
            persent = w / Float.parseFloat(score.getText()) * 100;
            score_win.setText((String.format("%.1f", w / Float.parseFloat(score.getText()) * 100).replace(',', '.') + "%"));
            if (1 <= persent && persent <= 39) {
                smile.setImage(bad);
            }
            if (40 <= persent && persent <= 50) {
                smile.setImage(normal);
            }
            if (51 <= persent && persent <= 60) {
                smile.setImage(good);
            }
            if (61 <= persent && persent <= 67) {
                smile.setImage(great);
            }
            if (68 <= persent && persent <= 74) {
                smile.setImage(wow);
            }
            if (75 <= persent && persent <= 89) {
                smile.setImage(amazing);
            }
            if (persent >= 90) {
                smile.setImage(demon);
            }
            average_dmg.add(dmg.getText());
            dmg_sum = 0;
        for (String s : average_dmg) {

            dmg_sum += Integer.parseInt(s);
        }

        score_dmg.setText(String.valueOf(dmg_sum / average_dmg.size()));
        dmg.clear();

    }


    @FXML
    public void lose() {
        score.setText(String.valueOf(Integer.parseInt(score.getText().substring(score.getText().indexOf(" ") + 1)) + 1));
        win_lose.add("lose");
        w = 0;

        for (String a : win_lose) {
            if (a.equals("win")) {
                w++;
            }
        }

        persent = w / Float.parseFloat(score.getText()) * 100;
        score_win.setText((String.format("%.1f" , w / Float.parseFloat(score.getText()) * 100 ).replace(',', '.') + "%"));

        if( 1 <= persent  && persent <= 39 ){
            smile.setImage(bad);
        }
        if(40 <= persent  && persent <= 50){
            smile.setImage(normal);
        }
        if(51 <= persent  && persent <= 60){
            smile.setImage(good);
        }
        if(61 <= persent  && persent <= 67){
            smile.setImage(great);
        }
        if(68 <= persent  && persent <= 74){
            smile.setImage(wow);
        }
        if(75 <= persent  && persent <= 89){
            smile.setImage(amazing);
        }
        if( persent >= 90 ){
            smile.setImage(demon);
        }
        average_dmg.add(dmg.getText());
        dmg_sum = 0;
        for (String s : average_dmg) {

            dmg_sum += Integer.parseInt(s);
        }

        score_dmg.setText(String.valueOf(dmg_sum / average_dmg.size()));
        dmg.clear();

    }

    }
