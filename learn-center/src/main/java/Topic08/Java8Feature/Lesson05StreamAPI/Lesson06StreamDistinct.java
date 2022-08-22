package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson06StreamDistinct {
    public static void main(String[] args) {

       //Remove Duplicate Elements using distinct()
        List<Integer> list = List.of(1, 2, 3, 4, 3, 2, 1);
        System.out.println(list);

        List<Integer> distinctInts = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctInts);

        //Processing only Unique Elements using Stream distinct() and forEach()
        list.stream().distinct().forEach(x -> System.out.println("Processing " + x));

        //Stream distinct() with custom objects
        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data(10));
        dataList.add(new Data(20));
        dataList.add(new Data(10));
        dataList.add(new Data(20));

        System.out.println("Data List = "+dataList);

        List<Data> uniqueDataList = dataList.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique Data List = "+uniqueDataList);
    }

}

class Data {
    private int id;

    Data(int i) {
        this.setId(i);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Data[%d]", this.id);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Data equals method");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Data other = (Data) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
