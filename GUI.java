import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private static JFrame frame;
    private static JTextField cityText;
    private static JLabel directionLabel;
    private static JLabel optionLabel;
    private static JLabel optionLabel2;
    private static JLabel cityTemperature;
    private static JLabel cityCondition;
    private static JLabel cityHumidity;
    private static JLabel cityWindSpeed;
    private static JButton displayButton;

    GUI () {

    }

    public static void main(String[] args) {

        frame = new JFrame("SiriSLeeWeather");
        cityText = new JTextField(16);
        directionLabel = new JLabel("Enter a city");
        optionLabel = new JLabel("");
        optionLabel2 = new JLabel("");
        cityTemperature = new JLabel("");
        cityCondition = new JLabel("");
        cityHumidity= new JLabel("");
        cityWindSpeed = new JLabel("");
        displayButton = new JButton("Submit");
        GUI graphicInterface = new GUI();

        displayButton.addActionListener(graphicInterface);

        JPanel panel = new JPanel();
        panel.add(cityText);
        panel.add(directionLabel);
        panel.add(displayButton);
        panel.add(optionLabel);
        panel.add(optionLabel2);
        panel.add(cityTemperature);
        panel.add(cityCondition);
        panel.add(cityHumidity);
        panel.add(cityWindSpeed);
        frame.add(panel);
        frame.setSize(450, 500);
        frame.show();

    }

    public void actionPerformed(ActionEvent e) {
        String city = e.getActionCommand();

        if (city.equals("Submit")) {

            try {
                //optionLabel.setText("A for temperature, B for condition");
                //optionLabel2.setText("C for Humidity, and D for Wind Speed");
                cityTemperature.setText(GetWeather.getWeather(cityText.getText())[0]);
                cityCondition.setText(GetWeather.getWeather(cityText.getText())[1]);
                cityHumidity.setText(GetWeather.getWeather(cityText.getText())[2]);
                cityWindSpeed.setText(GetWeather.getWeather(cityText.getText())[3]);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

            cityText.setText("");

        }
    }

}
