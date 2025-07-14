import javax.swing.SwingUtilities;
public class Main {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Admin frameAdmin = new Admin();
                User frameUser = new User();

                frameAdmin.setUserFrame(frameUser);
                frameUser.setAdminFrame(frameAdmin);

                frameAdmin.setLocation(50, 100);
                frameUser.setLocation(900, 100);

                frameAdmin.setVisible(true);
                frameUser.setVisible(true);
            }
        });
    }
}
