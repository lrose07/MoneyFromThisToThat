import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyView extends JFrame {
    private final JTextField inputCurrencyValue;
    private final JLabel convertedValue;
    private final JButton convertButton;

    MoneyView() {
        super("Money Converter");
        this.setMinimumSize(new Dimension(300, 300));
        this.setPreferredSize(new Dimension(300, 300));

        JPanel moneyPanel = new JPanel(new GridLayout(3, 2));

        // box to type an amount
        inputCurrencyValue = new JTextField("How much are you converting?");
        // two currency selectors
        // submit button
        convertButton = new JButton("Convert!");
        convertButton.addActionListener(e -> convertButtonPressed());
        // output label to display value
        convertedValue = new JLabel();

        moneyPanel.add(inputCurrencyValue);
        moneyPanel.add(convertButton);
        moneyPanel.add(convertedValue);

        this.add(moneyPanel);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void convertButtonPressed() {
        String text = inputCurrencyValue.getText();
        convertedValue.setText(text);
    }
}
