/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author Dell
 */
//try
//{
//    button.setIcon(new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("image.png"))));
//}
//catch(IOException e)
//{
//    e.printStackTrace();
//}
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.*;

public class mine1 extends javax.swing.JFrame {

    /**
     * Creates new form mine1
     */
    //MouseListener mouseListen;
    boolean checkLoserWinner;
    int[][] bombsArray = new int[9][9];
    String userPlaying;
    boolean playStatus;
    String allMyBombs;
    dbConnectivity db;
    final int wid = 9, hei = 9;
    final int bombCount = 10;
    JToggleButton[][] button = new JToggleButton[9][9];
    boolean firstButtonClicked; 
    Timer timer;
    

    public mine1(String username) {
        this();
        allMyBombs = "10";
        db = new dbConnectivity();
        bombField.setText(allMyBombs);
        userPlaying = username;
        System.out.println("Wohoo! " + username + " is in the game!");
        usernamePlays.setText(username);

    }

    public mine1() {
        initComponents();
        
        setSize(647, 640);
                      
        playStatus = true;
        time.setText("0");
        firstButtonClicked = true;
        checkLoserWinner=true;
        
        button[0][0] = new JToggleButton();
        button[0][0] = jB1;
        button[0][0].addActionListener(listen);

        button[0][1] = new JToggleButton();
        button[0][1] = jB2;
        button[0][1].addActionListener(listen);

        button[0][2] = new JToggleButton();
        button[0][2] = jB3;
        button[0][2].addActionListener(listen);

        button[0][3] = new JToggleButton();
        button[0][3] = jB4;
        button[0][3].addActionListener(listen);

        button[0][4] = new JToggleButton();
        button[0][4] = jB5;
        button[0][4].addActionListener(listen);

        button[0][5] = new JToggleButton();
        button[0][5] = jB6;
        button[0][5].addActionListener(listen);

        button[0][6] = new JToggleButton();
        button[0][6] = jB7;
        button[0][6].addActionListener(listen);

        button[0][7] = new JToggleButton();
        button[0][7] = jB8;
        button[0][7].addActionListener(listen);

        button[0][8] = new JToggleButton();
        button[0][8] = jB9;
        button[0][8].addActionListener(listen);

        button[1][0] = new JToggleButton();
        button[1][0] = jB10;
        button[1][0].addActionListener(listen);

        button[1][1] = new JToggleButton();
        button[1][1] = jB11;
        button[1][1].addActionListener(listen);

        button[1][2] = new JToggleButton();
        button[1][2] = jB12;
        button[1][2].addActionListener(listen);

        button[1][3] = new JToggleButton();
        button[1][3] = jB13;
        button[1][3].addActionListener(listen);

        button[1][4] = new JToggleButton();
        button[1][4] = jB14;
        button[1][4].addActionListener(listen);

        button[1][5] = new JToggleButton();
        button[1][5] = jB15;
        button[1][5].addActionListener(listen);

        button[1][6] = new JToggleButton();
        button[1][6] = jB16;
        button[1][6].addActionListener(listen);

        button[1][7] = new JToggleButton();
        button[1][7] = jB17;
        button[1][7].addActionListener(listen);

        button[1][8] = new JToggleButton();
        button[1][8] = jB18;
        button[1][8].addActionListener(listen);

        button[2][0] = new JToggleButton();
        button[2][0] = jB19;
        button[2][0].addActionListener(listen);

        button[2][1] = new JToggleButton();
        button[2][1] = jB20;
        button[2][1].addActionListener(listen);

        button[2][2] = new JToggleButton();
        button[2][2] = jB21;
        button[2][2].addActionListener(listen);

        button[2][3] = new JToggleButton();
        button[2][3] = jB22;
        button[2][3].addActionListener(listen);

        button[2][4] = new JToggleButton();
        button[2][4] = jB23;
        button[2][4].addActionListener(listen);

        button[2][5] = new JToggleButton();
        button[2][5] = jB24;
        button[2][5].addActionListener(listen);

        button[2][6] = new JToggleButton();
        button[2][6] = jB25;
        button[2][6].addActionListener(listen);

        button[2][7] = new JToggleButton();
        button[2][7] = jB26;
        button[2][7].addActionListener(listen);

        button[2][8] = new JToggleButton();
        button[2][8] = jB27;
        button[2][8].addActionListener(listen);

        button[3][0] = new JToggleButton();
        button[3][0] = jB28;
        button[3][0].addActionListener(listen);

        button[3][1] = new JToggleButton();
        button[3][1] = jB29;
        button[3][1].addActionListener(listen);

        button[3][2] = new JToggleButton();
        button[3][2] = jB30;
        button[3][2].addActionListener(listen);

        button[3][3] = new JToggleButton();
        button[3][3] = jB31;
        button[3][3].addActionListener(listen);

        button[3][4] = new JToggleButton();
        button[3][4] = jB32;
        button[3][4].addActionListener(listen);

        button[3][5] = new JToggleButton();
        button[3][5] = jB33;
        button[3][5].addActionListener(listen);

        button[3][6] = new JToggleButton();
        button[3][6] = jB34;
        button[3][6].addActionListener(listen);

        button[3][7] = new JToggleButton();
        button[3][7] = jB35;
        button[3][7].addActionListener(listen);

        button[3][8] = new JToggleButton();
        button[3][8] = jB36;
        button[3][8].addActionListener(listen);

        button[4][0] = new JToggleButton();
        button[4][0] = jB37;
        button[4][0].addActionListener(listen);

        button[4][1] = new JToggleButton();
        button[4][1] = jB38;
        button[4][1].addActionListener(listen);

        button[4][2] = new JToggleButton();
        button[4][2] = jB39;
        button[4][2].addActionListener(listen);

        button[4][3] = new JToggleButton();
        button[4][3] = jB40;
        button[4][3].addActionListener(listen);

        button[4][4] = new JToggleButton();
        button[4][4] = jB41;
        button[4][4].addActionListener(listen);

        button[4][5] = new JToggleButton();
        button[4][5] = jB42;
        button[4][5].addActionListener(listen);

        button[4][6] = new JToggleButton();
        button[4][6] = jB43;
        button[4][6].addActionListener(listen);

        button[4][7] = new JToggleButton();
        button[4][7] = jB44;
        button[4][7].addActionListener(listen);

        button[4][8] = new JToggleButton();
        button[4][8] = jB45;
        button[4][8].addActionListener(listen);

        button[5][0] = new JToggleButton();
        button[5][0] = jB46;
        button[5][0].addActionListener(listen);

        button[5][1] = new JToggleButton();
        button[5][1] = jB47;
        button[5][1].addActionListener(listen);

        button[5][2] = new JToggleButton();
        button[5][2] = jB48;
        button[5][2].addActionListener(listen);

        button[5][3] = new JToggleButton();
        button[5][3] = jB49;
        button[5][3].addActionListener(listen);

        button[5][4] = new JToggleButton();
        button[5][4] = jB50;
        button[5][4].addActionListener(listen);

        button[5][5] = new JToggleButton();
        button[5][5] = jB51;
        button[5][5].addActionListener(listen);

        button[5][6] = new JToggleButton();
        button[5][6] = jB52;
        button[5][6].addActionListener(listen);

        button[5][7] = new JToggleButton();
        button[5][7] = jB53;
        button[5][7].addActionListener(listen);

        button[5][8] = new JToggleButton();
        button[5][8] = jB54;
        button[5][8].addActionListener(listen);

        button[6][0] = new JToggleButton();
        button[6][0] = jB55;
        button[6][0].addActionListener(listen);

        button[6][1] = new JToggleButton();
        button[6][1] = jB56;
        button[6][1].addActionListener(listen);

        button[6][2] = new JToggleButton();
        button[6][2] = jB57;
        button[6][2].addActionListener(listen);

        button[6][3] = new JToggleButton();
        button[6][3] = jB58;
        button[6][3].addActionListener(listen);

        button[6][4] = new JToggleButton();
        button[6][4] = jB59;
        button[6][4].addActionListener(listen);

        button[6][5] = new JToggleButton();
        button[6][5] = jB60;
        button[6][5].addActionListener(listen);

        button[6][6] = new JToggleButton();
        button[6][6] = jB61;
        button[6][6].addActionListener(listen);

        button[6][7] = new JToggleButton();
        button[6][7] = jB62;
        button[6][7].addActionListener(listen);

        button[6][8] = new JToggleButton();
        button[6][8] = jB63;
        button[6][8].addActionListener(listen);

        button[7][0] = new JToggleButton();
        button[7][0] = jB64;
        button[7][0].addActionListener(listen);

        button[7][1] = new JToggleButton();
        button[7][1] = jB65;
        button[7][1].addActionListener(listen);

        button[7][2] = new JToggleButton();
        button[7][2] = jB66;
        button[7][2].addActionListener(listen);

        button[7][3] = new JToggleButton();
        button[7][3] = jB67;
        button[7][3].addActionListener(listen);

        button[7][4] = new JToggleButton();
        button[7][4] = jB68;
        button[7][4].addActionListener(listen);

        button[7][5] = new JToggleButton();
        button[7][5] = jB69;
        button[7][5].addActionListener(listen);

        button[7][6] = new JToggleButton();
        button[7][6] = jB70;
        button[7][6].addActionListener(listen);

        button[7][7] = new JToggleButton();
        button[7][7] = jB71;
        button[7][7].addActionListener(listen);

        button[7][8] = new JToggleButton();
        button[7][8] = jB72;
        button[7][8].addActionListener(listen);

        button[8][0] = new JToggleButton();
        button[8][0] = jB73;
        button[8][0].addActionListener(listen);

        button[8][1] = new JToggleButton();
        button[8][1] = jB74;
        button[8][1].addActionListener(listen);

        button[8][2] = new JToggleButton();
        button[8][2] = jB75;
        button[8][2].addActionListener(listen);

        button[8][3] = new JToggleButton();
        button[8][3] = jB76;
        button[8][3].addActionListener(listen);

        button[8][4] = new JToggleButton();
        button[8][4] = jB77;
        button[8][4].addActionListener(listen);

        button[8][5] = new JToggleButton();
        button[8][5] = jB78;
        button[8][5].addActionListener(listen);

        button[8][6] = new JToggleButton();
        button[8][6] = jB79;
        button[8][6].addActionListener(listen);

        button[8][7] = new JToggleButton();
        button[8][7] = jB80;
        button[8][7].addActionListener(listen);

        button[8][8] = new JToggleButton();
        button[8][8] = jB81;
        button[8][8].addActionListener(listen);

        rightClickFlagEvents();

    }
    
    private void placeBombs(int row, int column) {
        for (int count = 1; count <= bombCount; count++) {
            int generateAtRow, generateAtColumn;
            do {
                generateAtRow = (int) (Math.random() * (8.99));
                generateAtColumn = (int) (Math.random() * (8.99));
            } while (bombsArray[generateAtRow][generateAtColumn] == -1 || (generateAtRow == row && generateAtColumn == column));
            bombsArray[generateAtRow][generateAtColumn] = -1;

        }
    }
    
    public void rightClickFlagEvents() {
        for (int flagRow = 0; flagRow < 9; flagRow++) {
            for (int flagColumn = 0; flagColumn < 9; flagColumn++) {
                final int finalCol = flagColumn;
                final int finalRow = flagRow;
                
                button[flagRow][flagColumn].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (SwingUtilities.isRightMouseButton(e)) {
                            flagForMine(true, finalRow, finalCol,checkLoserWinner);
                        }
                    }
                });
            }
        }
    }

    public void flagForMine(boolean mineFlag, int row, int column,boolean checkLoserWinner) {
        if (checkLoserWinner==true){
        if (button[row][column].getIcon() == null) {
            button[row][column].setIcon(new ImageIcon(this.getClass().getResource("flag.png")));
            String get = bombField.getText();
            int parseIt = Integer.parseInt(get);
            bombField.setText(String.valueOf(parseIt - 1));

        } else {
            button[row][column].setIcon(new ImageIcon(this.getClass().getResource("")));
            String get = bombField.getText();
            int parseIt = Integer.parseInt(get);
            bombField.setText(String.valueOf(parseIt + 1));
        }
        }
    }
    
    private void loserStatus() {
        playStatus = false;
        for (int rowCheck = 0; rowCheck < 9; rowCheck++) {
            for (int columnCheck = 0; columnCheck < 9; columnCheck++) {
                if (bombsArray[rowCheck][columnCheck] == -1) {
                    button[rowCheck][columnCheck].setIcon(new ImageIcon(this.getClass().getResource("bomb_king.gif")));
                    timer.stop();
                    checkLoserWinner=false;
//                    String prevScore = db.getScore(userPlaying);
//                    System.out.print("prev score" + prevScore);
//                    String getScore = time.getText();
//                    int comparison = getScore.compareTo(prevScore);
//                    if (comparison > 0) {
//                        db.setScore(userPlaying, getScore, prevScore);
//                    }
                    button[rowCheck][columnCheck].setSelected(true);
                }
            }
        }
        javax.swing.JOptionPane.showMessageDialog(null, "Loser!");
    }
    
    private void winnerStatus() {
        boolean win = true;
        for (int winRow = 0; winRow < 9; winRow++) {
            for (int winCol = 0; winCol < 9; winCol++) {
                if (bombsArray[winRow][winCol] == 0) {
                    win = false;
                    break;
                }
            }
            if (!win) {
                break;
            }
        }
        if (win) {
            
            javax.swing.JOptionPane.showMessageDialog(null, "Winner!");
            checkLoserWinner=false;
            timer.stop();
            String prevScore = db.getScore(userPlaying);
            System.out.print("Previous Score: " + prevScore);
            String getScore = time.getText();
            System.out.println("Current Score: " + getScore);
            int comparison = getScore.compareTo(prevScore);
            //if (comparison > 0) {
                db.setScore(userPlaying, getScore, prevScore);
            //}
            playStatus = false;
        }
    }
    
    ActionListener listen = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            System.out.println("BUTTON CLICKED!");
            boolean buttonClicked = true;
            int detectClickRow = 0;
            int detectClickColumn = 0;

            for (detectClickRow = 0; detectClickRow < 9; detectClickRow++) {
                for (detectClickColumn = 0; detectClickColumn < 9; detectClickColumn++) {
                    if (evt.getSource() == button[detectClickRow][detectClickColumn]) {
                        if (button[detectClickRow][detectClickColumn].getIcon() == null) {
                            buttonClicked = false;
                            break;
                        }
                    }
                }
                if (!buttonClicked) {
                    break;
                }
            }
            if (playStatus) {
                button[detectClickRow][detectClickColumn].setSelected(true);
                if (firstButtonClicked) {
                    placeBombs(detectClickRow, detectClickColumn);

                    timer = new Timer(1000, timeEvent -> {
                        String get = time.getText();
                        int i = Integer.parseInt(get);
                        time.setText(String.valueOf(i + 1));
                    });
                    timer.setRepeats(true);
                    timer.start();

                    
                    firstButtonClicked = false;
                }
                if (bombsArray[detectClickRow][detectClickColumn] != -1) {
                    openBoard(detectClickRow, detectClickColumn);
                    loadAgain();
                } else {
                    loserStatus();
                }
                winnerStatus();
            } else {
                loadAgain();
            }

        }
    };
    
    private void loadAgain() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (bombsArray[row][column] == 0) {
                    button[row][column].setText("");
                    button[row][column].setSelected(false);

                }
                if (bombsArray[row][column] == -2) {
                    button[row][column].setText("");
                    button[row][column].setSelected(true);
                }
                if (bombsArray[row][column] > 0) {
                    button[row][column].setText("" + bombsArray[row][column]);
                    button[row][column].setSelected(true);
                }
                if (!playStatus && bombsArray[row][column] == -1) {
                    button[row][column].setSelected(true);
                }
            }
        }
        jPanel1.repaint();
    }

    private void openBoard(int boardRow, int boardCol) {
        if (boardCol > 8 || boardRow > 8 ||boardRow < 0 || boardCol < 0 ||  bombsArray[boardRow][boardCol] != 0) {
            return;
        }
        int bombs = 0;
        for (int i = boardRow - 1; i <= boardRow + 1; i++) {
            for (int j = boardCol - 1; j <= boardCol + 1; j++) {
                if (!(j < 0 || i < 0 || j > wid - 1 || i > hei - 1) && bombsArray[i][j] == -1) {
                    bombs++;
                }
            }
        }
        if (bombs == 0) {
            bombsArray[boardRow][boardCol] = -2;
            for (int i = boardRow - 1; i <= boardRow + 1; i++) {
                for (int j = boardCol - 1; j <= boardCol+ 1; j++) {
                    if (!(j < 0  || i > 8 || i < 0 ||  j > 8)) {
                        if (i != boardRow || j != boardCol) {
                            openBoard(i, j);
                        }
                    }
                }
            }
        } else {
            bombsArray[boardRow][boardCol] = bombs;
        }
    }

        private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized
        
    }//GEN-LAST:event_jPanel1ComponentResized

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                ImageIcon im=new ImageIcon("Influenza.jpg");
                Image i=im.getImage();

                g.drawImage(i, 0, 0, this.getSize().width,this.getSize().height,this);

            }

        };
        jB2 = new javax.swing.JToggleButton();
        jB3 = new javax.swing.JToggleButton();
        jB4 = new javax.swing.JToggleButton();
        jB5 = new javax.swing.JToggleButton();
        jB1 = new javax.swing.JToggleButton();
        jB6 = new javax.swing.JToggleButton();
        jB7 = new javax.swing.JToggleButton();
        jB9 = new javax.swing.JToggleButton();
        jB8 = new javax.swing.JToggleButton();
        jB18 = new javax.swing.JToggleButton();
        jB27 = new javax.swing.JToggleButton();
        jB17 = new javax.swing.JToggleButton();
        jB16 = new javax.swing.JToggleButton();
        jB14 = new javax.swing.JToggleButton();
        jB13 = new javax.swing.JToggleButton();
        jB12 = new javax.swing.JToggleButton();
        jB11 = new javax.swing.JToggleButton();
        jB10 = new javax.swing.JToggleButton();
        jB21 = new javax.swing.JToggleButton();
        jB22 = new javax.swing.JToggleButton();
        jB26 = new javax.swing.JToggleButton();
        jB15 = new javax.swing.JToggleButton();
        jB24 = new javax.swing.JToggleButton();
        jB23 = new javax.swing.JToggleButton();
        jB25 = new javax.swing.JToggleButton();
        jB20 = new javax.swing.JToggleButton();
        jB19 = new javax.swing.JToggleButton();
        jB32 = new javax.swing.JToggleButton();
        jB33 = new javax.swing.JToggleButton();
        jB34 = new javax.swing.JToggleButton();
        jB35 = new javax.swing.JToggleButton();
        jB36 = new javax.swing.JToggleButton();
        jB31 = new javax.swing.JToggleButton();
        jB30 = new javax.swing.JToggleButton();
        jB29 = new javax.swing.JToggleButton();
        jB28 = new javax.swing.JToggleButton();
        jB45 = new javax.swing.JToggleButton();
        jB44 = new javax.swing.JToggleButton();
        jB43 = new javax.swing.JToggleButton();
        jB42 = new javax.swing.JToggleButton();
        jB62 = new javax.swing.JToggleButton();
        jB40 = new javax.swing.JToggleButton();
        jB39 = new javax.swing.JToggleButton();
        jB38 = new javax.swing.JToggleButton();
        jB37 = new javax.swing.JToggleButton();
        jB46 = new javax.swing.JToggleButton();
        jB47 = new javax.swing.JToggleButton();
        jB48 = new javax.swing.JToggleButton();
        jB49 = new javax.swing.JToggleButton();
        jB50 = new javax.swing.JToggleButton();
        jB51 = new javax.swing.JToggleButton();
        jB52 = new javax.swing.JToggleButton();
        jB53 = new javax.swing.JToggleButton();
        jB54 = new javax.swing.JToggleButton();
        jB63 = new javax.swing.JToggleButton();
        jB41 = new javax.swing.JToggleButton();
        jB61 = new javax.swing.JToggleButton();
        jB60 = new javax.swing.JToggleButton();
        jB59 = new javax.swing.JToggleButton();
        jB58 = new javax.swing.JToggleButton();
        jB57 = new javax.swing.JToggleButton();
        jB56 = new javax.swing.JToggleButton();
        jB55 = new javax.swing.JToggleButton();
        jB72 = new javax.swing.JToggleButton();
        jB71 = new javax.swing.JToggleButton();
        jB70 = new javax.swing.JToggleButton();
        jB69 = new javax.swing.JToggleButton();
        jB68 = new javax.swing.JToggleButton();
        jB67 = new javax.swing.JToggleButton();
        jB66 = new javax.swing.JToggleButton();
        jB65 = new javax.swing.JToggleButton();
        jB64 = new javax.swing.JToggleButton();
        jB74 = new javax.swing.JToggleButton();
        jB75 = new javax.swing.JToggleButton();
        jB76 = new javax.swing.JToggleButton();
        jB73 = new javax.swing.JToggleButton();
        jB78 = new javax.swing.JToggleButton();
        jB79 = new javax.swing.JToggleButton();
        jB80 = new javax.swing.JToggleButton();
        jB81 = new javax.swing.JToggleButton();
        jB77 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bombField = new javax.swing.JTextField();
        usernamePlays = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jB16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jB64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jB73, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jB65, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB67, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB68, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jB70, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB71, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jB74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB77, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB78, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB79, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB80, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(181, 181, 181))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jB55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB56, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB61, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jB37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jB46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB50, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB52, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jB28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jB26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jB27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jB35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jB36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(169, 169, 169)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB50, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB52, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB56, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB61, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB65, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB67, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB68, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB70, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB71, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB73, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB79, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB78, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB80, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB77, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 60, 470, 470);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\minesweeper\\src\\minesweeper\\bomb.gif")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 140, 70, 70);

        time.setEditable(false);
        time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeFocusLost(evt);
            }
        });
        getContentPane().add(time);
        time.setBounds(510, 390, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\minesweeper\\src\\minesweeper\\clock.gif")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 300, 70, 60);

        bombField.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        bombField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(bombField);
        bombField.setBounds(510, 230, 110, 40);

        usernamePlays.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        usernamePlays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usernamePlays);
        usernamePlays.setBounds(490, 80, 160, 50);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\minesweeper\\src\\minesweeper\\gameTitle.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 0, 360, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\minesweeper\\src\\minesweeper\\Blocks-1s-42px.gif")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 20, 50, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\minesweeper\\Poncho.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-36, -40, 800, 640);

        jMenu1.setText("Game");

        jMenuItem1.setText("New Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Score Table");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB1ActionPerformed

    private void timeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeFocusLost
        // TODO add your handling code here:

//        System.out.print("TIMER TICKING!");
//
//        timer = new Timer(1000, timeEvent -> {
//            int i = Integer.parseInt(time.getText());
//            String variable = String.valueOf(i + 1);
//            time.setText(variable);
//        });
//        timer.setRepeats(true);
//        timer.start();

    }//GEN-LAST:event_timeFocusLost

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Step1: The mouse is the only tool that you'll need to play Minesweeper. The left mouse button is used to click squares that don't contain mines, while the right mouse button is used to flag squares that contain mines.");
        JOptionPane.showMessageDialog(null, "Step 2: The first square that you click will never have a mine beneath it; clicking a square will clear off some of the board while numbering other squares.");
        JOptionPane.showMessageDialog(null, "Step 3: A number on a square refers to the number of mines that are currently touching that square.");
        JOptionPane.showMessageDialog(null, "You are ready to go! Good luck!");
    }//GEN-LAST:event_jMenu2MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
          this.dispose();
          new mine1(userPlaying).setVisible(true);
//        db.Invoke(userPlaying);
//        dispose();
       
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        scoreTable obj=new scoreTable();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mine1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mine1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mine1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mine1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mine1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bombField;
    private javax.swing.JToggleButton jB1;/*
    private javax.swing.JButton jB1;
    */
    private javax.swing.JToggleButton jB10;/*
    private javax.swing.JButton jB10;
    */
    private javax.swing.JToggleButton jB11;/*
    private javax.swing.JButton jB11;
    */
    private javax.swing.JToggleButton jB12;/*
    private javax.swing.JButton jB12;
    */
    private javax.swing.JToggleButton jB13;/*
    private javax.swing.JButton jB13;
    */
    private javax.swing.JToggleButton jB14;/*
    private javax.swing.JButton jB14;
    */
    private javax.swing.JToggleButton jB15;/*
    private javax.swing.JButton jB15;
    */
    private javax.swing.JToggleButton jB16;/*
    private javax.swing.JButton jB16;
    */
    private javax.swing.JToggleButton jB17;/*
    private javax.swing.JButton jB17;
    */
    private javax.swing.JToggleButton jB18;/*
    private javax.swing.JButton jB18;
    */
    private javax.swing.JToggleButton jB19;/*
    private javax.swing.JButton jB19;
    */
    private javax.swing.JToggleButton jB2;/*
    private javax.swing.JButton jB2;
    */
    private javax.swing.JToggleButton jB20;/*
    private javax.swing.JButton jB20;
    */
    private javax.swing.JToggleButton jB21;/*
    private javax.swing.JButton jB21;
    */
    private javax.swing.JToggleButton jB22;/*
    private javax.swing.JButton jB22;
    */
    private javax.swing.JToggleButton jB23;/*
    private javax.swing.JButton jB23;
    */
    private javax.swing.JToggleButton jB24;/*
    private javax.swing.JButton jB24;
    */
    private javax.swing.JToggleButton jB25;/*
    private javax.swing.JButton jB25;
    */
    private javax.swing.JToggleButton jB26;/*
    private javax.swing.JButton jB26;
    */
    private javax.swing.JToggleButton jB27;/*
    private javax.swing.JButton jB27;
    */
    private javax.swing.JToggleButton jB28;/*
    private javax.swing.JButton jB28;
    */
    private javax.swing.JToggleButton jB29;/*
    private javax.swing.JButton jB29;
    */
    private javax.swing.JToggleButton jB3;/*
    private javax.swing.JButton jB3;
    */
    private javax.swing.JToggleButton jB30;/*
    private javax.swing.JButton jB30;
    */
    private javax.swing.JToggleButton jB31;/*
    private javax.swing.JButton jB31;
    */
    private javax.swing.JToggleButton jB32;/*
    private javax.swing.JButton jB32;
    */
    private javax.swing.JToggleButton jB33;/*
    private javax.swing.JButton jB33;
    */
    private javax.swing.JToggleButton jB34;/*
    private javax.swing.JButton jB34;
    */
    private javax.swing.JToggleButton jB35;/*
    private javax.swing.JButton jB35;
    */
    private javax.swing.JToggleButton jB36;/*
    private javax.swing.JButton jB36;
    */
    private javax.swing.JToggleButton jB37;/*
    private javax.swing.JButton jB37;
    */
    private javax.swing.JToggleButton jB38;/*
    private javax.swing.JButton jB38;
    */
    private javax.swing.JToggleButton jB39;/*
    private javax.swing.JButton jB39;
    */
    private javax.swing.JToggleButton jB4;/*
    private javax.swing.JButton jB4;
    */
    private javax.swing.JToggleButton jB40;/*
    private javax.swing.JButton jB40;
    */
    private javax.swing.JToggleButton jB41;/*
    private javax.swing.JButton jB41;
    */
    private javax.swing.JToggleButton jB42;/*
    private javax.swing.JButton jB42;
    */
    private javax.swing.JToggleButton jB43;/*
    private javax.swing.JButton jB43;
    */
    private javax.swing.JToggleButton jB44;/*
    private javax.swing.JButton jB44;
    */
    private javax.swing.JToggleButton jB45;/*
    private javax.swing.JButton jB45;
    */
    private javax.swing.JToggleButton jB46;/*
    private javax.swing.JButton jB46;
    */
    private javax.swing.JToggleButton jB47;/*
    private javax.swing.JButton jB47;
    */
    private javax.swing.JToggleButton jB48;/*
    private javax.swing.JButton jB48;
    **/
    private javax.swing.JToggleButton jB49;/*
    private javax.swing.JButton jB49;
    */
    private javax.swing.JToggleButton jB5;/*
    private javax.swing.JButton jB5;
    */
    private javax.swing.JToggleButton jB50;/*
    private javax.swing.JButton jB50;
    */
    private javax.swing.JToggleButton jB51;/*
    private javax.swing.JButton jB51;
    */
    private javax.swing.JToggleButton jB52;/*
    private javax.swing.JButton jB52;
    */
    private javax.swing.JToggleButton jB53;/*
    private javax.swing.JButton jB53;
    */
    private javax.swing.JToggleButton jB54;/*
    private javax.swing.JButton jB54;
    */
    private javax.swing.JToggleButton jB55;/*
    private javax.swing.JButton jB55;
    */
    private javax.swing.JToggleButton jB56;/*
    private javax.swing.JButton jB56;
    */
    private javax.swing.JToggleButton jB57;/*
    private javax.swing.JButton jB57;
    */
    private javax.swing.JToggleButton jB58;/*
    private javax.swing.JButton jB58;
    */
    private javax.swing.JToggleButton jB59;/*
    private javax.swing.JButton jB59;
    */
    private javax.swing.JToggleButton jB6;/*
    private javax.swing.JButton jB6;
    */
    private javax.swing.JToggleButton jB60;/*
    private javax.swing.JButton jB60;
    */
    private javax.swing.JToggleButton jB61;/*
    private javax.swing.JButton jB61;
    */
    private javax.swing.JToggleButton jB62;/*
    private javax.swing.JButton jB62;
    */
    private javax.swing.JToggleButton jB63;/*
    private javax.swing.JButton jB63;
    */
    private javax.swing.JToggleButton jB64;/*
    private javax.swing.JButton jB64;
    */
    private javax.swing.JToggleButton jB65;/*
    private javax.swing.JButton jB65;
    */
    private javax.swing.JToggleButton jB66;/*
    private javax.swing.JButton jB66;
    */
    private javax.swing.JToggleButton jB67;/*
    private javax.swing.JButton jB67;
    */
    private javax.swing.JToggleButton jB68;/*
    private javax.swing.JButton jB68;
    */
    private javax.swing.JToggleButton jB69;/*
    private javax.swing.JButton jB69;
    */
    private javax.swing.JToggleButton jB7;/*
    private javax.swing.JButton jB7;
    */
    private javax.swing.JToggleButton jB70;/*
    private javax.swing.JButton jB70;
    */
    private javax.swing.JToggleButton jB71;/*
    private javax.swing.JButton jB71;
    */
    private javax.swing.JToggleButton jB72;/*
    private javax.swing.JButton jB72;
    **/
    private javax.swing.JToggleButton jB73;/*
    private javax.swing.JButton jB73;
    */
    private javax.swing.JToggleButton jB74;/*
    private javax.swing.JButton jB74;
    */
    private javax.swing.JToggleButton jB75;/*
    private javax.swing.JButton jB75;
    */
    private javax.swing.JToggleButton jB76;/*
    private javax.swing.JButton jB76;
    */
    private javax.swing.JToggleButton jB77;/*
    private javax.swing.JButton jB77;
    */
    private javax.swing.JToggleButton jB78;/*
    private javax.swing.JButton jB78;
    */
    private javax.swing.JToggleButton jB79;/*
    private javax.swing.JButton jB79;
    */
    private javax.swing.JToggleButton jB8;/*
    private javax.swing.JButton jB8;
    */
    private javax.swing.JToggleButton jB80;/*
    private javax.swing.JButton jB80;
    */
    private javax.swing.JToggleButton jB81;/*
    private javax.swing.JButton jB81;
    */
    private javax.swing.JToggleButton jB9;/*
    private javax.swing.JButton jB9;
    */
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField time;
    private javax.swing.JLabel usernamePlays;
    // End of variables declaration//GEN-END:variables
}
