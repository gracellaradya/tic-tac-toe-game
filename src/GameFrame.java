import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private Player currentPlayer;
    private PlayerService playerService;
    private GameLogic gameLogic;
    private JButton[] buttons;
    private JLabel lblStatus;
    private boolean gameOver = false;

    public GameFrame(Player player) {
        this.currentPlayer = player;
        this.playerService = new PlayerService();
        this.gameLogic = new GameLogic();

        setTitle("Game - Tic Tac Toe");
        setSize(400, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        lblStatus = new JLabel("Giliran kamu (X)", SwingConstants.CENTER);
        lblStatus.setFont(new Font("Arial", Font.BOLD, 16));
        lblStatus.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(lblStatus, BorderLayout.NORTH);

        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(3, 3, 5, 5));
        boardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        buttons = new JButton[9];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
            boardPanel.add(buttons[i]);

            final int index = i;
            buttons[i].addActionListener(e -> handlePlayerMove(index));
        }

        add(boardPanel, BorderLayout.CENTER);

        JButton btnBack = new JButton("Back to Menu");
        btnBack.addActionListener(e -> {
            MainMenuFrame menuFrame = new MainMenuFrame(currentPlayer);
            menuFrame.setVisible(true);
            this.dispose();
        });
        add(btnBack, BorderLayout.SOUTH);
    }

    private void handlePlayerMove(int index) {
        if (gameOver) {
            return;
        }

        boolean moved = gameLogic.makeMove(index, 'X');
        if (!moved) {
            return;
        }
        buttons[index].setText("X");
        buttons[index].setForeground(Color.RED);

        if (gameLogic.checkWinner('X')) {
            endGame("WIN", "Kamu menang!");
            return;
        }
        if (gameLogic.isDraw()) {
            endGame("DRAW", "Permainan seri!");
            return;
        }

        int compIndex = gameLogic.computerMove();
        if (compIndex != -1) {
            gameLogic.makeMove(compIndex, 'O');
            buttons[compIndex].setText("O");
            buttons[compIndex].setForeground(Color.BLUE);
        }

        if (gameLogic.checkWinner('O')) {
            endGame("LOSE", "Yah, kamu kalah!");
            return;
        }
        if (gameLogic.isDraw()) {
            endGame("DRAW", "Permainan seri!");
            return;
        }

        lblStatus.setText("Giliran kamu (X)");
    }

    private void endGame(String result, String message) {
        gameOver = true;
        lblStatus.setText(message);

        playerService.updateStatistics(currentPlayer, result);

        JOptionPane.showMessageDialog(this, "Hasil: " + message);

        MainMenuFrame menuFrame = new MainMenuFrame(currentPlayer);
        menuFrame.setVisible(true);
        this.dispose();
    }
}