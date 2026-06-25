import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TopScorersFrame extends JFrame {
    public TopScorersFrame() {
        PlayerService playerService = new PlayerService();

        setTitle("Top 5 Scorers");
        setSize(450, 250);
        setLocationRelativeTo(null);

        String[] columns = {"Username", "Wins", "Losses", "Draws", "Score"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        List<Player> topPlayers = playerService.getTopFiveScorers();
        for (Player p : topPlayers) {
            Object[] row = {p.getUsername(), p.getWins(), p.getLosses(), p.getDraws(), p.getScore()};
            model.addRow(row);
        }

        JTable table = new JTable(model);
        add(new JScrollPane(table));
    }
}
