package homework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Sales {

	private JFrame frame;
	private JTextField itemInput;
	private JTextField priceInput;
	private JTextField quantityInput;
	JTextArea listOutput = new JTextArea();
	JTextArea totalOutput = new JTextArea();
	SalesSlip groceries = new SalesSlip();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales window = new Sales();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sales() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		itemInput = new JTextField();
		itemInput.setBounds(111, 20, 289, 26);
		frame.getContentPane().add(itemInput);
		itemInput.setColumns(10);

		priceInput = new JTextField();
		priceInput.setBounds(111, 56, 289, 26);
		frame.getContentPane().add(priceInput);
		priceInput.setColumns(10);

		quantityInput = new JTextField();
		quantityInput.setBounds(111, 91, 289, 26);
		frame.getContentPane().add(quantityInput);
		quantityInput.setColumns(10);

		JButton addBtn = new JButton("Add Item");
		addBtn.setBounds(150, 122, 117, 29);
		frame.getContentPane().add(addBtn);
		addBtn.addActionListener(e -> add());

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 171, 352, 35);
		frame.getContentPane().add(scrollPane);

		scrollPane.setViewportView(listOutput);

		totalOutput.setBounds(111, 229, 289, 16);
		frame.getContentPane().add(totalOutput);

		JLabel lblNewLabel = new JLabel("Item:");
		lblNewLabel.setBounds(38, 25, 61, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Price:");
		lblNewLabel_1.setBounds(38, 61, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Quantity:");
		lblNewLabel_2.setBounds(38, 96, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Total:");
		lblNewLabel_3.setBounds(38, 229, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
	}

	public void add() {
		// code to get user input
		String item = itemInput.getText();
		double price = Double.parseDouble(priceInput.getText());
		int quantity = Integer.parseInt(quantityInput.getText());

		SalesItem groceryItem = new SalesItem(item, price, quantity);

		// call method
		groceries.add(groceryItem);

		// update text boxes
		listOutput.setText(groceries.toString());
		double cost = groceries.cost();
		// System.out.println(cost);
		// System.out.println(printableList);
		totalOutput.setText(String.format("%,.2f", cost));
	}
}
