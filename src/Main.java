import javax.swing.SwingUtilities;
public class Main {
    
    public static void main(String[] args) {
        // Menjalankan pembuatan GUI di thread yang benar (Event Dispatch Thread)
        // Ini adalah praktik terbaik untuk aplikasi Swing.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // 1. Buat instance dari kedua frame/jendela
                Admin frameAdmin = new Admin();
                User frameUser = new User();

                // 2. Atur komunikasi antar frame.
                //    Ini seperti "mengenalkan" admin ke user dan sebaliknya.
                frameAdmin.setUserFrame(frameUser);
                frameUser.setAdminFrame(frameAdmin);

                // 3. Atur posisi jendela agar tidak saling menimpa saat pertama kali muncul
                frameAdmin.setLocation(50, 100);  // Jendela Admin sedikit ke kiri
                frameUser.setLocation(900, 100); // Jendela User sedikit ke kanan

                // 4. Tampilkan kedua jendela
                frameAdmin.setVisible(true);
                frameUser.setVisible(true);
            }
        });
    }
}
