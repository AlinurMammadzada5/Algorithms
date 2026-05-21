package Hash;

import java.util.*;

//Has two arrays has a common element
public class InterviewQuestion {
    public static boolean twoArrayContainsDuplicate(int[] arr1, int[] arr2) {

        HashMap<Integer, Boolean> myHash = new HashMap<>();

        for (int i : arr1) {
            myHash.put(i, true);
        }

        for (int j : arr2) {
            if (myHash.get(j) != null) {
                return true;
            }
        }

        return false;
    }


    public static List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> myHash = new HashMap<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int i : arr) {
            myHash.put(i, myHash.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : myHash.entrySet()) {
            if (entry.getValue() != 1) {
                arr2.add(entry.getKey());
            }
        }
        return arr2;

    }

    public static Character firstNonRepeatingChar(String s) {
        HashMap<Character, Integer> myHash = new LinkedHashMap<>();
        if (s.isEmpty() || s.equals(" ")) {
            return '-';
        }

        for (int i = 0; i < s.length(); i++) {
            myHash.put(s.charAt(i), myHash.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (char x : s.toCharArray()) {
            if (myHash.get(x) == 1) {
                return x;
            }
        }

        return '-';
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> newList = new ArrayList<>();
        HashMap<String, List<String>> myHash = new HashMap<>();

        for (String s : strings) {
            System.out.println("Normal Word: " + s);
            char[] sortedChars = s.toCharArray();
            Arrays.sort(sortedChars);
            String newString = new String(sortedChars);
            System.out.println("Sorted Word: " + newString);

            //  myHash.put(s,myHash.getOrDefault(s,List.of())+1);
            myHash.computeIfAbsent(newString, k -> new ArrayList<>()).add(s);

        }


        newList = myHash.values().stream().toList();
        return newList;


    }


    public static int[] twoSum(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{};
        }

        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            myHashMap.put(nums[i], i);

            if (myHashMap.containsKey(target - nums[i])) {
                return new int[]{myHashMap.get(target - nums[i]), i};
            }
        }
        return new int[]{};
    }


    public static int[] subarraySum(int[] nums, int target) {

        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        myHashMap.put(0, -1);
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (myHashMap.containsKey(currentSum - target)) {
                return new int[]{myHashMap.get(currentSum - target) + 1, i};
            } else {
                myHashMap.put(currentSum, i);
            }


        }

        return new int[]{};
    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> mySet = new HashSet<>();
        Set<int[]> mySet1 = new HashSet<>();

        //1,2,3,4,5
        for (int element : arr1) {
            mySet.add(element);
        }
        //2,4,6,8,10
        for (int element : arr2) {
            if (mySet.contains(target - element)) {
                mySet1.add(new int[]{target - element, element});
            }
        }

        //return myList;
        return List.copyOf(mySet1);
    }

    public static boolean hasUniqueChars(String string) {
        Set<Character> mySet = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            if (mySet.contains(string.charAt(i))) {
                return false;
            } else {
                mySet.add(string.charAt(i));
            }
        }
           return true;
    }

    public static int longestConsecutiveSequence(int[] nums){

        if(nums.length==0){return 0;}

        Set<Integer> mySet = new HashSet<>();

        for(int element : nums){
            mySet.add(element);
        }
        int longestStreak=1;
        int currentStreak=1;

        for(int element : mySet){
            if(mySet.contains(element-1)){
                continue;
            }

            int temp = element;
            while(mySet.contains(temp+1)){
                if(mySet.contains(temp+1)){
                    currentStreak++;
                    temp++;
                } else{
                    break;
                }
            }

            if(currentStreak>longestStreak){
                longestStreak = currentStreak;
            }
            currentStreak = 1;
        }

        return longestStreak;

    }


    public static List<Integer> removeDuplicates(List<Integer> myList){
            Set<Integer> mySet = new HashSet<>(myList);
            return mySet.stream().toList();

        }


    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};
        System.out.println("Longest Sequence : "+longestConsecutiveSequence(nums));
//        int[] nums2 = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(subarraySum(nums2, 9)));
//        int[] nums = {2, 11, 7, 15};
//        System.out.println(Arrays.toString(twoSum(nums, 5)));
//        int[] arr1 = {1,3,5};
//        int[] arr2 = {2,4,5};
//        System.out.println(twoArrayContainsDuplicate(arr1,arr2));
//
//        int[] duplicate = {4,3,2,7,8,2,3,1};
//        System.out.println(findDuplicates(duplicate));
//        String[] tests = {
//                "aabccdeff",
//                "aabbcc",
//                "swiss",
//                "",
//                "a",
//                "aabbccddee",
//                "alphabet"
//        };
//
//        for (String s : tests) {
//            char result = firstNonRepeatingChar(s);
//            System.out.println("Input: \"" + s + "\" -> " + result);
//            System.out.println("-------------------------------");
//        }

//        char[] sortedChars ="ate".toCharArray();
//        Arrays.sort(sortedChars);
//        String newString = new String(sortedChars);
//        System.out.println(newString);

//        HashMap<String,List<String>> myHash = new HashMap<>();
////        myHash.put("ate",myHash.computeIfAbsent("ate",k-> new ArrayList<>()).add("Welcome"));
//        myHash.computeIfAbsent("ate", k -> new ArrayList<>())
//                .add("New Word");

//        String[] string = {
//                "eat",
//                "tea",
//                "tan",
//                "ate",
//                "nat",
//                "bat"
//        };
//
//        System.out.println(groupAnagrams(string).toString());
//
//    }
    }
}
