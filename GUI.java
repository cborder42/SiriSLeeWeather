import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private static JFrame frame;
    private static JTextField cityText;
    private static JLabel directionLabel;
    private static JLabel optionLabel;
    private static JLabel cityTemperature;
    private static JLabel cityCondition;
    private static JLabel cityHumidity;
    private static JLabel cityWindSpeed;
    private static JButton displayButton;

    GUI () {

    }

    public static void main(String[] args) {
        frame = new JFrame("Weather App");
        cityText = new JTextField(12);
        directionLabel = new JLabel("Enter a city");
        optionLabel = new JLabel("Weather Info: ");
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
        panel.add(cityTemperature);
        panel.add(cityCondition);
        panel.add(cityHumidity);
        panel.add(cityWindSpeed);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String city = e.getActionCommand();

        if (city.equals("Submit")) {

            try {
                String[] weatherInfo = new String[4];
                if (weatherInfo[0] == null) {
                    cityTemperature.setText("That city does not exist");
                }
                for (int i = 0; i < 4; i++) {
                    weatherInfo[i] = GetWeather.getWeather(cityText.getText())[i];
                }
                optionLabel.setText(cityText.getText() + "'s Weather Info: ");
                cityTemperature.setText("It is " + weatherInfo[0]);
                cityCondition.setText("The condition is " + weatherInfo[1]);
                cityHumidity.setText("The humidity is " + weatherInfo[2] + "%");
                cityWindSpeed.setText("The wind speed is " + weatherInfo[3] + "mph");

            } catch (Exception exception) {
                exception.printStackTrace();
            }

            cityText.setText("");

        }
    }

}
