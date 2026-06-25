import javax.swing.*;
import java.awt.*;

public class StatisticsFrame extends JFrame {
    public StatisticsFrame(Player player) {
        PlayerService playerService = new PlayerService();
        Player refreshed = playerService.refreshPlayer(player);

        setTitle("My Statistics");
        setSize(300, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 8, 12));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Username:"));
        panel.add(new JLabel(refreshed.getUsername()));
        panel.add(new JLabel("Wins:"));
        panel.add(new JLabel(String.valueOf(refreshed.getWins())));
        panel.add(new JLabel("Losses:"));
        panel.add(new JLabel(String.valueOf(refreshed.getLosses())));
        panel.add(new JLabel("Draws:"));
        panel.add(new JLabel(String.valueOf(refreshed.getDraws())));
        panel.add(new JLabel("Score:"));
        panel.add(new JLabel(String.valueOf(refreshed.getScore())));

        add(panel);
    }
}
