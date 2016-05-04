import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class HumanRightsForm extends JDialog {
    private JPanel panel1;
    private JTextArea textArea1HumanRights;
    private JTextArea textArea2AboutCountry;
    private JComboBox comboBox1Country;
    private JLabel CountryFlag;
    private JLabel ProjectLogo;
    private JLabel Source1;
    private JLabel Source2;
    private JScrollPane ispodCountry;
    private JScrollPane ispodHR;
    private JButton openButton;
    private JButton openButton1;

    public String readFile(String filename) throws IOException {
        String content = null;
        File file = new File(filename); //for ex foo.txt
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader !=null){reader.close();}
        }
        return content;
    }
    public HumanRightsForm () {
        setContentPane(panel1);
        setModal(true);

        JFrame f = new JFrame();
        JTextArea aboutCountry = new JTextArea(200,30);
        JScrollPane ispodCountry = new JScrollPane(aboutCountry); // JTextArea is placed in a JScrollPane
        ispodCountry.setBounds(3,3,400,400);
        f.getContentPane().add(ispodCountry);

        JTextArea humanRights = new JTextArea(200,30);
        JScrollPane ispodHR = new JScrollPane(humanRights);
        //JFrame  = new JFrame();
        f.getContentPane().add(ispodHR);
       // textArea2AboutCountry.setSize(50,50);
       // textArea2AboutCountry.setSize(50,50);

        aboutCountry.setWrapStyleWord(true);
        aboutCountry.setLineWrap(true);
        humanRights.setWrapStyleWord(true);
        humanRights.setLineWrap(true);

        CountryFlag.setIcon(new ImageIcon("images/BiH.jpg"));
        ProjectLogo.setIcon(new ImageIcon("images/logo1.jpg"));
        Source1.setText("Source: https://www.cia.gov/library/publications/the-world-factbook/geos/bk.html");
        Source2.setText("Source: https://www.amnesty.org/en/countries/europe-and-central-asia/bosnia-and-herzegovina/report-bosnia-and-herzegovina/");


        try {
            String aboutCountryStr = readFile("texts/Bosnia-AboutTheCountry.txt");
            textArea2AboutCountry.setText(aboutCountryStr);
            String humanRightsStr = readFile ("texts/Bosnia-HR.txt");
            textArea1HumanRights.setText(humanRightsStr);
        } catch (IOException g) {
            g.printStackTrace();
        }


        comboBox1Country.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object obj = e.getItem();
                String selected = comboBox1Country.getSelectedItem().toString();

                if (selected == "Bosnia and Herzegovina") {

                    try {
                        String aboutCountryStr = readFile("texts/Bosnia-AboutTheCountry.txt");
                        aboutCountry.setText(aboutCountryStr);
                    } catch (IOException g) {
                        g.printStackTrace();}
                    try {
                        String aboutCountryStr = readFile("texts/Bosnia-HR.txt");
                        humanRights.setText(aboutCountryStr);
                    } catch (IOException g) {
                        g.printStackTrace();}
                    CountryFlag.setIcon(new ImageIcon("images/BiH1.jpg"));
                    ProjectLogo.setIcon(new ImageIcon("images/logo1.jpg"));
                    Source1.setText("Source:https://www.cia.gov/library/publications/the-world-factbook/geos/bk.html");
                    Source2.setText("Source: https://www.amnesty.org/en/countries/europe-and-central-asia/bosnia-and-herzegovina/report-bosnia-and-herzegovina/");

                } else if (selected == "Germany") {

                    try {
                        String aboutCountryStr = readFile("texts/Germany-AboutTheCountry.txt");
                        aboutCountry.setText(aboutCountryStr);
                    } catch (IOException g) {
                        g.printStackTrace();}
                    try {
                        String aboutCountryStr = readFile("texts/Germany-HR.txt");
                        humanRights.setText(aboutCountryStr);
                    } catch (IOException g) {
                        g.printStackTrace();}
                    CountryFlag.setIcon(new ImageIcon("images/Germany.jpg"));
                    ProjectLogo.setIcon(new ImageIcon("images/logo1.jpg"));
                    Source1.setText("Source:https://www.cia.gov/library/publications/the-world-factbook/geos/gm.html");
                    Source2.setText("Source:https://www.amnesty.org/en/countries/europe-and-central-asia/germany/report-germany/");

                } else {
                    try {
                        String aboutCountryStr = readFile("texts/Russia-AboutTheCountry.txt");
                        aboutCountry.setText(aboutCountryStr);
                    } catch (IOException g) {
                        g.printStackTrace();
                    }
                    try {
                        String aboutCountryStr = readFile("texts/Russia-HR.txt");
                        humanRights.setText(aboutCountryStr);
                    } catch (IOException g) {
                        g.printStackTrace();
                    }


                    CountryFlag.setIcon(new ImageIcon("images/Russia.jpg"));
                    ProjectLogo.setIcon(new ImageIcon("images/logo1.jpg"));
                    Source1.setText("Source:https://www.cia.gov/library/publications/the-world-factbook/geos/rs.html");
                    Source2.setText("Source:https://www.amnesty.org/en/countries/europe-and-central-asia/russian-federation/");
                }

            }
        });


        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String url = "https://www.cia.gov/library/publications/the-world-factbook/geos/rs.html";
                String url = Source1.getText();
                //Source: address
                OpenBrowser.openURL(url.substring(7, url.length()).trim());
            }
        });
        openButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = Source2.getText();
                //Source: address
                OpenBrowser.openURL(url.substring(7, url.length()).trim());
            }
        });
    }

    public static void main(String[] args) {


        HumanRightsForm dialog = new HumanRightsForm();
        dialog.setSize(800, 1000); //first number being width, and second height
        dialog.setResizable(false);
        //dialog.pack();
        dialog.setVisible(true);
        System.exit(0);


    }





    private void createUIComponents() {
        // TODO: place custom component creation code here


    }}



