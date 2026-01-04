package Model;

import java.util.ArrayList;

import Logic.Utilities;
import Logic.Utilities.*;

public class Recorder extends ArrayList<int[]> {

    private final int size;
    private int lastIndex = -1;

    public Recorder(int size){
        super(size);
        this.size = size;
    }

    public void record(int[] a){
        this.add(a);
        lastIndex++;
    }
    public long memorySizeInBytes(){
        if(this.isEmpty()) return 0;
        int elementLength = this.get(0).length;
        return (long) elementLength * 4 * (lastIndex + 1) + 16;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("RECORD HISTORY\n");
        for(int i = 0; i < size; i++){
            result.append("=");
        }
        result.append("\n");
        for(int[] a : this){
            result.append(Utilities.toStringArray(a)).append("\n");
        }
        for(int i = 0; i < size; i++){
            result.append("=");
        }
        return result.toString();
    }





}
