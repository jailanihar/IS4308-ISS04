package week04.slot01;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculationHandler implements EventHandler<ActionEvent> {

	private Label calculationLabel;
	
	public CalculationHandler(Label calculationLabel) {
		this.calculationLabel = calculationLabel;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		Button button = (Button) arg0.getSource();
		if(button.getText().equals("C")) {
			calculationLabel.setText("");
		} else if(button.getText().equals("=")) {
			if(calculationLabel.getText().contains("/")) {
				String[] values = calculationLabel.getText().split("/");
				Double value1 = Double.parseDouble(values[0]);
				Double value2 = Double.parseDouble(values[1]);
				Double result = value1 / value2;
				calculationLabel.setText("" + result);
			} else if(calculationLabel.getText().contains("*")) {
				String[] values = calculationLabel.getText().split("\\*");
				Double value1 = Double.parseDouble(values[0]);
				Double value2 = Double.parseDouble(values[1]);
				Double result = value1 * value2;
				calculationLabel.setText("" + result);
			} else if(calculationLabel.getText().contains("+")) {
				String[] values = calculationLabel.getText().split("\\+");
				Double value1 = Double.parseDouble(values[0]);
				Double value2 = Double.parseDouble(values[1]);
				Double result = value1 + value2;
				calculationLabel.setText("" + result);
			} else if(calculationLabel.getText().contains("-")) {
				String[] values = calculationLabel.getText().split("-");
				Double value1 = Double.parseDouble(values[0]);
				Double value2 = Double.parseDouble(values[1]);
				Double result = value1 - value2;
				calculationLabel.setText("" + result);
			}
		} else {
			String currentValue = calculationLabel.getText();
			String updatedValue = currentValue + button.getText();
			calculationLabel.setText(updatedValue);
		}
	}

}





