package _8;

import com.sun.istack.internal.Nullable;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * 复制“被监视数据”
 * */
public class _6_Duplicate_Observed_Data {

}

class IntervalWindow extends Frame implements Observer{

    TextField startField;
    TextField endField;
    TextField lengthField;
    private Interval subject;

    public IntervalWindow () {
        subject = new Interval();
        subject.addObserver(this);
        update(subject, null);
    }

    public void update(Observable o, Object arg) {

    }

    class SymFocus extends FocusAdapter {

        public void focusLost(FocusEvent event) {
            Object object = event.getSource();
            if(object == startField)
                StartField_FocusLost(event);
            else if(object == endField)
                EndField_FocusLost(event);
            else if (object == lengthField)
                LengthField_FocusLost(event);
        }

        void StartField_FocusLost(FocusEvent event) {
            if(isNotInteger(startField.getText()))
                startField.setText("0");
            calculateLength();
        }

        void EndField_FocusLost(FocusEvent event){
            if (isNotInteger(endField.getText()))
                endField.setText("0");
            calculateLength();
        }

        void LengthField_FocusLost(FocusEvent event) {
            if(isNotInteger(lengthField.getText()))
                lengthField.setText("0");
            calculateLength();
        }

        private boolean isNotInteger(String str) {
            try {
                int i = Integer.valueOf(str);
            } catch (Exception e) {
                return true;
            }
            return false;
        }

        void calculateLength() {
            try {
                int start = Integer.parseInt(startField.getText());
                int end = Integer.parseInt(endField.getText());
                int length = end - start;
                lengthField.setText(String.valueOf(length));
            } catch ( NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }

        void calculateEnd() {
            try {
                int start = Integer.parseInt(startField.getText());
                int length = Integer.parseInt(lengthField.getText());
                int end = start + length;
                endField.setText(String.valueOf(end));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }
    }
}

class Interval extends Observable {

}