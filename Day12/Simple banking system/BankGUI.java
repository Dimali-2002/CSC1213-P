import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class Bank{
    static int nextAccNo = 1000;
    static final int maxAccNo = 100;
    static int count = 0;
	
	String[][] accountsArray;
	
	Scanner sc = new Scanner(System.in);
	}

public class BankGUI extends Bank {
	
    public BankGUI() {
		accountsArray = new String[maxAccNo][3];
        JFrame frame = new JFrame("Bank Management System");
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1, 10, 10));

        JButton createBtn = new JButton("Create Account");
        JButton deleteBtn = new JButton("Delete Account");
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton balanceBtn = new JButton("Check Balance");
        JButton exitBtn = new JButton("Exit");

        frame.add(createBtn);
        frame.add(deleteBtn);
        frame.add(depositBtn);
        frame.add(withdrawBtn);
        frame.add(balanceBtn);
        frame.add(exitBtn);

        // Action Listeners
        createBtn.addActionListener(e -> createAccount());
        deleteBtn.addActionListener(e -> deleteAccount());
        depositBtn.addActionListener(e -> deposit());
        withdrawBtn.addActionListener(e -> withdraw());
        balanceBtn.addActionListener(e -> checkBalance());
        exitBtn.addActionListener(e -> System.exit(0));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createAccount() {
        String name = JOptionPane.showInputDialog("Enter account holder's name:");
        if (name != null && !name.isEmpty()) {
            sc = new Scanner(System.in); // Just in case old scanner used
            accountsArray[count][0] = name;
            String accNo = String.valueOf(nextAccNo + 1);
            accountsArray[count][1] = accNo;
            accountsArray[count][2] = "0.0";
            nextAccNo++;
            count++;
            JOptionPane.showMessageDialog(null, "Account created successfully.\nAccount No: " + accNo);
        }
    }

    private void deleteAccount() {
        String accNo = JOptionPane.showInputDialog("Enter account number to delete:");
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (accountsArray[i][1].equals(accNo)) {
                for (int j = i; j < count - 1; j++) {
                    accountsArray[j][0] = accountsArray[j + 1][0];
                    accountsArray[j][1] = accountsArray[j + 1][1];
                    accountsArray[j][2] = accountsArray[j + 1][2];
                }
                count = count - 1;
                accountsArray[count][0] = null;
                accountsArray[count][1] = null;
                accountsArray[count][2] = null;
                found = true;
                JOptionPane.showMessageDialog(null,"Account Deleted Succesfully!");
                return;
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }
    }
    

    private void deposit() {
        String accNo = JOptionPane.showInputDialog("Enter Account Number:");
        try {
            for (int i = 0; i < count; i++) {
                if (accountsArray[i][1].equals(accNo)) {
                    double bal = Double.parseDouble(accountsArray[i][2]);
					String amountStr = JOptionPane.showInputDialog("Enter Deposit Amount:");
					double amount = Double.parseDouble(amountStr);
                    bal += amount;
                    accountsArray[i][2] = String.valueOf(bal);
                    JOptionPane.showMessageDialog(null, "Deposit successful.\nNew Balance: " + bal);
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Account not found.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
        }
    }

    private void withdraw() {
        String accNo = JOptionPane.showInputDialog("Enter Account Number:");
        try {
            for (int i = 0; i < count; i++) {
                if (accountsArray[i][1].equals(accNo)) {
                    double bal = Double.parseDouble(accountsArray[i][2]);
					String amountStr = JOptionPane.showInputDialog("Enter Amount to Withdraw:");
					double amount = Double.parseDouble(amountStr);
                    if (amount <= bal) {
                        bal -= amount;
                        accountsArray[i][2] = String.valueOf(bal);
                        JOptionPane.showMessageDialog(null, "Withdrawn: " + amount + "\nNew Balance: " + bal);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient balance.");
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Account not found.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
        }
    }

    private void checkBalance() {
        String accNo = JOptionPane.showInputDialog("Enter Account Number:");
        for (int i = 0; i < count; i++) {
            if (accountsArray[i][1].equals(accNo)) {
                JOptionPane.showMessageDialog(null,
                        "Account Holder: " + accountsArray[i][0] +
                        "\nBalance: " + accountsArray[i][2]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Account not found.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BankGUI());
    }
}
