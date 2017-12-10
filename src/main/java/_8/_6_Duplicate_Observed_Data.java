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

    String getEnd() {
        return subject.getEnd();
    }

    String getStart() {
        return subject.getStart();
    }

    String getLength() {
        return subject.getLength();
    }

    void setEnd(String end) {
        subject.setEnd(end);
    }

    void setStart(String start) {
        subject.setStart(start);
    }

    void setLength(String length) {
        subject.setLength(length);
    }

    public void update(Observable o, Object arg) {
        endField.setText(subject.getEnd());
        startField.setText(subject.getStart());
        lengthField.setText(subject.getLength());
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
            if(isNotInteger(getStart()))
                setStart("0");
            calculateLength();
        }

        void EndField_FocusLost(FocusEvent event){
            if (isNotInteger(getEnd()))
                setEnd("0");
            calculateLength();
        }

        void LengthField_FocusLost(FocusEvent event) {
            if(isNotInteger(getLength()))
                setLength("0");
            calculateLength();
        }

        private boolean isNotInteger(String str) {
            try {
                Integer.valueOf(str);
            } catch (Exception e) {
                return true;
            }
            return false;
        }

        void calculateLength() {
            try {
                int start = Integer.parseInt(getStart());
                int end = Integer.parseInt(getEnd());
                int length = end - start;
                setLength(String.valueOf(length));
            } catch ( NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }


        void calculateEnd() {
            try {
                int start = Integer.parseInt(getStart());
                int length = Integer.parseInt(getLength());
                int end = start + length;
                setEnd(String.valueOf(end));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }

        String getEnd() {
            return endField.getText();
        }

        void setEnd(String arg) {
            endField.setText(arg);
        }

        String getStart() {
            return startField.getText();
        }

        void setStart(String start) {
            startField.setText(start);
        }

        String getLength() {
            return lengthField.getText();
        }

        void setLength(String length) {
            lengthField.setText(length);
        }

    }
}

class Interval extends Observable {

    private String end = "0";
    private String start = "0";
    private String length = "0";

    String getEnd() {
        return end;
    }

    void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
        setChanged();
        notifyObservers();
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
        setChanged();
        notifyObservers();
    }

}