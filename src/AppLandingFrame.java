import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 *
 * @author Kenny Park
 * @version 
 */
public class AppLandingFrame extends JFrame {
    Container content;

    public AppLandingFrame() {
        setTitle("login");
        setSize(300, 300);
        setLocationRelativeTo(null);
        content = getContentPane();
        content.setLayout(new BorderLayout());

        landing();
    }

    private void landing() {
        SwingUtilities.updateComponentTreeUI(content);
        content.removeAll();

        // Panel
        JPanel panel = new JPanel();
        panel.setBorder(Style.PADDING_SUBMENU);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(Box.createRigidArea(new Dimension(0, 70)));

        // Title label
        JLabel titleLabel = new JLabel("V O I D");
        titleLabel.setFont(Style.FONT_TITLE);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titleLabel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        Dimension buttonSize = new Dimension(90, 24);

        // Sign up button
        JButton signUpButton = new JButton("sign up");
        signUpButton.setFont(Style.FONT_SMALL);
        signUpButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        Style.styleButton(signUpButton);
        signUpButton.setMargin(null);
        signUpButton.setMaximumSize(buttonSize);
        panel.add(signUpButton);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signUp();
            }
        });

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Log in button
        JButton logInButton = new JButton("log in");
        logInButton.setFont(Style.FONT_SMALL);
        logInButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        Style.styleButton(logInButton);
        logInButton.setMargin(null);
        logInButton.setMaximumSize(buttonSize);
        panel.add(logInButton);
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        content.add(panel, BorderLayout.CENTER);

        // Version text
        JLabel infoText = new JLabel(" ver 0.1");
        infoText.setFont(Style.FONT_SMALL);
        content.add(infoText, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void signUp() {
        SwingUtilities.updateComponentTreeUI(content);
        content.removeAll();

        // Panel
        JPanel panel = new JPanel();
        panel.setBorder(Style.PADDING_SUBMENU);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Title label
        JLabel titleLabel = new JLabel("sign up");
        titleLabel.setFont(Style.FONT_HEADER);
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(titleLabel);

        // Identifier label
        JLabel identifierLabel = new JLabel("identifier");
        identifierLabel.setFont(Style.FONT_SMALL);
        identifierLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(identifierLabel);

        // Identifier field
        JTextField identifierField = new JTextField();
        identifierField.setFont(Style.FONT_NORMAL);
        identifierField.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(identifierField);

        // Password label
        JLabel passwordLabel = new JLabel("password");
        passwordLabel.setFont(Style.FONT_SMALL);
        passwordLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(passwordLabel);

        // Password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(Style.FONT_NORMAL);
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(passwordField);

        // Muffin label
        JLabel muffinLabel = new JLabel("favorite type of breakfast muffin");
        muffinLabel.setFont(Style.FONT_SMALL);
        muffinLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(muffinLabel);

        // Muffin dropdown
        JComboBox muffinBox = new JComboBox(Muffin.getMuffinLabels());
        muffinBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        muffinBox.setFont(Style.FONT_NORMAL);
        panel.add(muffinBox);

        content.add(panel, BorderLayout.NORTH);

        // Bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));

        // Back button
        JButton backButton = new JButton("back");
        backButton.setFont(Style.FONT_SMALL);
        Style.styleButton(backButton);
        backButton.setMargin(null);
        bottomPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                landing();
            }
        });

        // Sign up button
        JButton signUpButton = new JButton("sign up");
        signUpButton.setFont(Style.FONT_SMALL);
        Style.styleButton(signUpButton);
        signUpButton.setMargin(null);
        bottomPanel.add(signUpButton);

        content.add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void login() {
        SwingUtilities.updateComponentTreeUI(content);
        content.removeAll();

        // Panel
        JPanel panel = new JPanel();
        panel.setBorder(Style.PADDING_SUBMENU);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Title label
        JLabel titleLabel = new JLabel("log in");
        titleLabel.setFont(Style.FONT_HEADER);
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(titleLabel);

        // Identifier label
        JLabel identifierLabel = new JLabel("identifier");
        identifierLabel.setFont(Style.FONT_SMALL);
        identifierLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(identifierLabel);

        // Identifier field
        JTextField identifierField = new JTextField();
        identifierField.setFont(Style.FONT_NORMAL);
        identifierField.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(identifierField);

        // Password label
        JLabel passwordLabel = new JLabel("password");
        passwordLabel.setFont(Style.FONT_SMALL);
        passwordLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(passwordLabel);

        // Password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(Style.FONT_NORMAL);
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(passwordField);

        content.add(panel, BorderLayout.NORTH);

        // Bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));

        // Back button
        JButton backButton = new JButton("back");
        backButton.setFont(Style.FONT_SMALL);
        Style.styleButton(backButton);
        backButton.setMargin(null);
        bottomPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                landing();
            }
        });

        // Log in button
        JButton loginButton = new JButton("log in");
        loginButton.setFont(Style.FONT_SMALL);
        Style.styleButton(loginButton);
        loginButton.setMargin(null);
        bottomPanel.add(loginButton);

        content.add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}