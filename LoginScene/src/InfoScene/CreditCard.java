/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoScene;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Predator
 */
public class CreditCard {
    private String serial;
    private String ccv;
    private String name;
    private String surname;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private String type;
    private String tier;
    private String moneyBoundary;
    private String state;
    
    private double paid=0,balance;

    public CreditCard() {
    }

    public CreditCard(String serial, String name, String surname, LocalDate issueDate, LocalDate expiryDate, String type, String tier, String moneyBoundary, String state) {
        this.serial = serial;
        this.ccv = RandomString.getAlphaNumericString(3);
        this.name = name;
        this.surname = surname;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.type = type;
        this.tier = tier;
        this.moneyBoundary = moneyBoundary;
        this.state = state;
        this.balance = Integer.parseInt(moneyBoundary);
    }

    public CreditCard(String serial, String ccv, String name, String surname, LocalDate issueDate, LocalDate expiryDate, String type, String tier, String moneyBoundary, String state) {
        this.serial = serial;
        this.ccv = ccv;
        this.name = name;
        this.surname = surname;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.type = type;
        this.tier = tier;
        this.moneyBoundary = moneyBoundary;
        this.state = state;
        this.balance = Integer.parseInt(moneyBoundary);
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial() throws FileNotFoundException, IOException {

        System.out.println("Randomize New Card Number.");

        String randomStringNum = RandomStringNumber.getAlphaNumericString(16);
        boolean checkRandomPass = false;

        String path = Utils.fileLocation;

        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();

        } else {

            try (BufferedReader brCheck = new BufferedReader(new FileReader(file))) {

                String line;

                do {
                    brCheck.mark(1);
                    System.out.println("Start Checking.");
                    while ((line = brCheck.readLine()) != null) {

                        String[] arr = line.split(",");
                        System.out.println(arr[0]);
                        if (randomStringNum.equals(arr[0])) {
                            randomStringNum = RandomStringNumber.getAlphaNumericString(16);
                            checkRandomPass = false;
                            System.out.println("Error : Detect Same Card Number , Try To Random New Card Number.");

                            brCheck.reset();
                            break;
                        } else {
                            checkRandomPass = true;
                        }
                    }

                } while (checkRandomPass == false);

            }

        }
        System.out.println("Done Checking.");
        this.serial = randomStringNum;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv() {
        this.ccv = RandomString.getAlphaNumericString(3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getMoneyBoundary() {
        return moneyBoundary;
    }

    public double getBalance() {
        return balance;
    }

    public double getPaid() {
        return paid;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public void setMoneyBoundary(String moneyBoundary) {
        this.moneyBoundary = moneyBoundary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void readAndPrintAll() {
        List<CreditCard> cards = CSVReaderInJava.readCardsFromCSV(Utils.fileLocation);

        // let's print all the person read from CSV file
        for (CreditCard c : cards) {
            System.out.println(c);
        }
    }

    public static CreditCard readSpecific(int row) {
        List<CreditCard> cards = CSVReaderInJava.readCardsFromCSV(Utils.fileLocation);
        int index = row-1;
        return cards.get(index);
    }

    public static List<CreditCard> searchSpecificFor(String search) {
        List<CreditCard> cards = CSVReaderInJava.readCardsFromCSV(Utils.fileLocation);
        List<CreditCard> foundCard = new ArrayList<CreditCard>();

        for (CreditCard c : cards) {
            if (c.getName() != null && c.getName().contains(search)) {
                foundCard.add(c);
            } else if (c.getSurname() != null && c.getSurname().contains(search)) {
                foundCard.add(c);
            } else if (c.getSerial() != null && c.getSerial().contains(search)) {
                foundCard.add(c);
            } else if (c.getExpiryDate() != null && c.getExpiryDate().format(DateTimeFormatter.ISO_DATE).contains(search)) {
                foundCard.add(c);
            } else if (c.getIssueDate() != null && c.getIssueDate().format(DateTimeFormatter.ISO_DATE).contains(search)) {
                foundCard.add(c);
            } else if (c.getState() != null && c.getState().contains(search)) {
                foundCard.add(c);
            } else if (c.getTier() != null && c.getTier().contains(search)) {
                foundCard.add(c);
            } else if (c.getType() != null && c.getType().contains(search)) {
                foundCard.add(c);
            }
        }
        return foundCard;
    }

    public void addCardButtonClick() throws IOException {
        String bufferName = null;
        String bufferSurname= null;
        String bufferType= null;
        String bufferTier= null;
        String bufferMoneyBoundary= null;
    }

    public static void confirmCreateCard() throws IOException {

        String path = Utils.fileLocation;

        File file = new File(path);
        FileWriter writer;

        LocalDate today = LocalDate.now(); // DATE CARD CREATED
        LocalDate expiry = today.plusYears(6); // DATE CARD EXPIRE

        CreditCard bufferCard = new CreditCard();
        bufferCard.setSerial();
        bufferCard.setCcv();
        bufferCard.setName("John");
        bufferCard.setSurname("Eastwood");
        bufferCard.setIssueDate(today);
        bufferCard.setExpiryDate(expiry);
        bufferCard.setType("Credit");
        bufferCard.setTier("Gold");
        bufferCard.setMoneyBoundary("1000");
        bufferCard.setState("OK");

        try {

            writer = new FileWriter(file, StandardCharsets.UTF_8, true);
            writer.write(bufferCard.getSerial() + "," + bufferCard.getCcv() + "," + bufferCard.getName() + ","
                    + bufferCard.getSurname() + "," + bufferCard.getIssueDate()
                    + "," + bufferCard.getExpiryDate() + "," + bufferCard.getType() + ","
                    + bufferCard.getTier() + "," + bufferCard.getMoneyBoundary() + "," + bufferCard.getState() + "\r\n");
            writer.close();

          // try (BufferedReader br = new BufferedReader(new FileReader(file))) {
         try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"))) {
                String line;

                while ((line = br.readLine()) != null) {

                    String[] arr = line.split(",");
                    System.out.print(arr[0]);
                    System.out.print(" - ");
                    System.out.print(arr[1]);
                    System.out.print(" - ");
                    System.out.print(arr[2]);
                    System.out.print(" - ");
                    System.out.print(arr[3]);
                    System.out.print(" - ");
                    System.out.print(arr[4]);
                    System.out.print(" - ");
                    System.out.print(arr[5]);
                    System.out.print(" - ");
                    System.out.print(arr[6]);
                    System.out.print(" - ");
                    System.out.print(arr[7]);
                    System.out.print(" - ");
                    System.out.print(arr[8]);
                    System.out.print(" - ");
                    System.out.print(arr[9]);
                    System.out.println("\n");

                }
                br.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" + "serial=" + serial + ", ccv=" + ccv + ", name=" + name + ", surname=" + surname + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", type=" + type + ", tier=" + tier + ", moneyBoundary=" + moneyBoundary + ", state=" + state + ", paid=" + paid + ", balance=" + balance + '}';
    }

    
}

class RandomStringNumber { 
  
    // function to generate a random string of length n 
    static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "0123456789"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
}

class RandomString { 
  
    // function to generate a random string of length n 
    static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
}

class CSVReaderInJava {

    static List<CreditCard> readCardsFromCSV(String fileName) {
        List<CreditCard> cards = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                CreditCard card = createCard(attributes);

                // adding book into ArrayList
                cards.add(card);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return cards;
    }

    private static CreditCard createCard(String[] metadata) {
        String serial = metadata[0];
        String ccv = metadata[1];
        String name = metadata[2];
        String surname = metadata[3];
        LocalDate issueDate = LocalDate.parse(metadata[4]);
        LocalDate expiryDate = LocalDate.parse(metadata[5]);
        String type = metadata[6];
        String tier = metadata[7];
        String moneyBoundary = metadata[8];
        String state = metadata[9];

        // create and return book of this metadata
        return new CreditCard(serial, ccv, name,surname,issueDate,expiryDate,type,tier,moneyBoundary,state);
    }
    
}

class Utils {

    static String fileLocation = "list.csv";
    
    public static String capitalizedFirstChar(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String removeAllNonNumeric(String s) {
        return s.replaceAll("[\\D]", "");
    }
}
