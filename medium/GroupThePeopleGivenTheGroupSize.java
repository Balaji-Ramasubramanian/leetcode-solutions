import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Problem URL: https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
public class GroupThePeopleGivenTheGroupSize {

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> finalList = new ArrayList();

        // Add each groupSize as hashmap's key & the elements as arraylist in value
        HashMap<Integer, ArrayList> groups = new HashMap();
        for(int i = 0; i < groupSizes.length; i++){
            Integer key = groupSizes[i];
            if(groups.containsKey(key)){
                ArrayList<Integer> existingValues = groups.get(key);
                existingValues.add(i);
            } else {
                ArrayList<Integer> values = new ArrayList();
                values.add(i);
                groups.put(groupSizes[i], values);
            }
        }

        // Iterate through the hashmap,
        // If the key == value arrayList's size, then add the whole arrayList into finalList
        // else, number of groups = elements.size()/groupSize; iterate and add those as individual groups.
        for(Integer key: groups.keySet()){
            Integer groupSize = key;
            ArrayList<Integer> elements = groups.get(key);
            if( groupSize == elements.size()){
                finalList.add(elements);
            }
            if(elements.size() > groupSize){
                int numOfGroups = elements.size()/groupSize;
                int iterator = 0;
                for(int i = 0; i< numOfGroups; i++){
                    ArrayList<Integer> values = new ArrayList<>();
                    for(int j=0;j<groupSize; j++){
                        values.add(elements.get(iterator++));
                    }
                    finalList.add(values);
                }
            }
        }

        return finalList;
    }
}
