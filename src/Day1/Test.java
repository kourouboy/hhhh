package Day1;

import com.sun.glass.ui.View;

import javax.sound.midi.Soundbank;

public class Test {
    public static void main(String[] args) {
        //Sequence sequence = new SequenceArrayImpl(2);
        Sequence sequence = new DoubleLinked();
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(4);
        sequence.add(5);
        Object[] data = sequence.toArray();
        for(Object o: data){
            System.out.print(o+"、");
        }
        System.out.println(sequence.remove(2));
        System.out.println(sequence.get(1));
        sequence.set(1,22);
        System.out.println(sequence.get(1));
        sequence.clear();
        System.out.print(sequence.size());
    }
}
