package Day1;

import com.sun.glass.ui.View;

import javax.sound.midi.Soundbank;

public class Test {
    public static void main(String[] args) {
        Sequence sequence = new SequenceArrayImpl(2);
        //Sequence sequence = new SequenceLinkedImpl();
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(null);
        System.out.println(sequence.remove(2));
        System.out.println(sequence.get(2));

    }
}
