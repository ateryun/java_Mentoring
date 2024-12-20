import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sorter {
    private Comparable compare;

    public Sorter(Comparable compare) {
        this.compare = compare;
    }

    void bubbleSortInts(Integer[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) { // swap
                    Integer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSortDates(Date[] data3) {
        for (int i = 0; i < data3.length - 1; i++) {
            for (int j = 0; j < data3.length - i - 1; j++) {
                if (data3[j].compareTo(data3[j + 1]) > 0) { // swap
                    Date temp = data3[j];
                    data3[j] = data3[j + 1];
                    data3[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSortStrings(String[] data2) {
        for (int i = 0; i < data2.length - 1; i++) {
            for (int j = 0; j < data2.length - i - 1; j++) {
                if (data2[j].compareTo(data2[j + 1]) > 0) { // swap
                    String temp = data2[j];
                    data2[j] = data2[j + 1];
                    data2[j + 1] = temp;
                }
            }
        }
    }
    public void bubbleSort(Object[] objs) {
        for(int i = 0; i <objs.length -1; i ++) {
            for (int j = 0; j < objs.length - i - 1; j++) {
                        if (compare.compareTo(objs[j], objs[j + 1]) > 0) {
                            Object temp = objs[j];
                            objs[j] = objs[j + 1];
                            objs[j + 1] = temp;
                        }
            }
        }
    }


    void setComparable(Comparable comparable){
        this.compare = comparable;
    }

}


