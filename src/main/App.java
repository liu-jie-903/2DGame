package main;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel); // GamePanelをJFrameに追加

        window.pack(); // GamePanelのサイズに合わせてJFrameを調整
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread(); // スレッドを開始
    }
}
